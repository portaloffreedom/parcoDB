-- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- --
-- Trigger che limita il massimo di tappe in un Sentiero a 10
CREATE OR REPLACE FUNCTION num_tappe_proc_trig() RETURNS trigger AS $num_tappe_proc_trig$
  DECLARE
    contatore INTEGER := 0;
  BEGIN
    SELECT INTO contatore COUNT(*) 
        FROM Composto
        WHERE NEW.sentiero = sentiero;
    IF (10 < contatore) THEN
      RAISE EXCEPTION 'Troppe tappe per il sentiero';
    ELSE
      RETURN NEW;
    END IF;
  END;
$num_tappe_proc_trig$ LANGUAGE plpgsql;

-- Trigger che fa fallire un sentiero ci sono troppe tappe
CREATE TRIGGER numero_tappe AFTER INSERT ON Composto
  FOR each ROW 
  EXECUTE PROCEDURE num_tappe_proc_trig();

-- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- --
-- Trigger che fa fallire se la sequenza delle tappe non è rispettata
CREATE OR REPLACE FUNCTION seq_sent_proc_trig() RETURNS trigger AS $seq_sent_proc_trig$ 
  DECLARE
    _fine CHARACTER(64) := 0;
    contatoreTappe INTEGER :=0;
    test_ripetizione INTEGER :=0;
  BEGIN
    IF (TG_OP = 'INSERT') THEN
        BEGIN
        SELECT INTO contatoreTappe COUNT(*)
            FROM Composto
            WHERE sentiero = NEW.sentiero;
        IF(contatoreTappe != NEW.numero_tappa) THEN
            raise exception 'nuova tappa non sequenziale alle precedenti ( % <> % )', contatoreTappe+1, New.numero_tappa;
        ELSE
            BEGIN
            SELECT INTO _fine fine 
                FROM Composto 
                WHERE sentiero = NEW.sentiero 
                AND numero_tappa+1 = NEW.numero_tappa;
            IF (_fine = null OR NEW.inizio != _fine) THEN
                BEGIN
                raise exception 'Sentiero non inseribile: fine (%) e inizio (%) non coincidono',_fine,New.inizio;
                return null;
                END;
            ELSE
                return NEW;
            END IF;
            END;
        END IF;
        SELECT INTO test_ripetizione COUNT(*)
            FROM Composto as C
            WHERE C.sentiero = NEW.sentiero
            AND C.inizio= NEW.inzio
            AND C.fine = NEW.fine;
        IF(test_ripetizione > 0) THEN
            BEGIN
            raise exception 'Sentiero non inseribile: tappa (% - %) ripetuta',NEW.inzio,NEW.fine;
            return null;
            END;
        END IF;
        END;
    ELSEIF (TG_OP = 'UPDATE') THEN
        raise exception 'sostituzione impossibile';
    ELSEIF (TG_OP = 'DELETE') THEN
        BEGIN
        SELECT INTO contatoreTappe COUNT(*)
            FROM Composto
            WHERE sentiero = OLD.sentiero;
        IF (OLD.numero_tappa != contatoreTappe+1) THEN
            raise exception 'puoi cancellare solo l`ultima tappa del sentiero';
        END IF;
        RETURN OLD;
        END;
    ELSE
        raise exception 'WTF?????? non stai ne inserendo, ne aggiornando, ne cancellando (Composto). come è possibile che tu sia arrivato qui?';
    END IF;
  END;
$seq_sent_proc_trig$ LANGUAGE plpgsql;


CREATE TRIGGER sequenza_sentiero after INSERT OR DELETE OR UPDATE ON Composto
  FOR each ROW EXECUTE PROCEDURE seq_sent_proc_trig();

-- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- --
-- Trigger che aggiorna la lunghezza del sentiero ogni aggiornamento sulla
--  tabella `Composto` 
CREATE OR REPLACE FUNCTION lunghezza_sentiero_ins_upd() RETURNS trigger AS $lunghezza_sentiero_ins_upd$
  BEGIN
    UPDATE Sentiero
    SET (lunghezza,tempo) = ((SELECT SUM(Tappa.lunghezza) FROM Tappa,Composto,Sentiero
                    WHERE Composto.sentiero = Sentiero.numero_sentiero AND
                          Composto.inizio = Tappa.inizio AND
                          Composto.fine = Tappa.fine),
                             (SELECT SUM(Tappa.tempo) FROM Tappa,Composto,Sentiero
                    WHERE Composto.sentiero = Sentiero.numero_sentiero AND
                          Composto.inizio = Tappa.inizio AND
                          Composto.fine = Tappa.fine))
    WHERE NEW.sentiero=numero_sentiero;
    RETURN NEW;
  END;
$lunghezza_sentiero_ins_upd$ LANGUAGE plpgsql;

CREATE TRIGGER lunghezza_sentiero after INSERT OR UPDATE ON Composto
  FOR each ROW EXECUTE PROCEDURE lunghezza_sentiero_ins_upd();

-- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- --

CREATE OR REPLACE FUNCTION lunghezza_sentiero_del() RETURNS trigger AS $lunghezza_sentiero_del$
  BEGIN
    UPDATE Sentiero
    SET (lunghezza,tempo) = ((SELECT SUM(Tappa.lunghezza) FROM Tappa,Composto,Sentiero
                    WHERE Composto.sentiero = Sentiero.numero_sentiero AND
                          Composto.inizio = Tappa.inizio AND
                          Composto.fine = Tappa.fine),
                             (SELECT SUM(Tappa.tempo) FROM Tappa,Composto,Sentiero
                    WHERE Composto.sentiero = Sentiero.numero_sentiero AND
                          Composto.inizio = Tappa.inizio AND
                          Composto.fine = Tappa.fine))
    WHERE OLD.sentiero=numero_sentiero;
    RETURN OLD;
  END;
$lunghezza_sentiero_del$ LANGUAGE plpgsql;

CREATE TRIGGER lunghezza_sentiero_del after DELETE ON Composto
  FOR each ROW EXECUTE PROCEDURE lunghezza_sentiero_del();

-- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- --
-- Trigger che controlla che il valore di difficoltà del sentiero sia compreso
-- tra 1 e 5
CREATE OR REPLACE FUNCTION difficolta_sentiero_ins_upd() RETURNS trigger AS $difficolta_sentiero_ins_upd$
  BEGIN
    IF ( NEW.difficolta < 1 OR NEW.difficolta >5 ) THEN
      BEGIN
      raise exception 'Sentiero non inseribile: valore di difficolta (%) non valido',NEW.difficolta;
      return null;
      END;
    END IF;
    RETURN NEW;
  END;
$difficolta_sentiero_ins_upd$ LANGUAGE plpgsql;

CREATE TRIGGER difficolta_sentiero AFTER INSERT OR UPDATE ON sentiero 
  FOR EACH ROW EXECUTE PROCEDURE difficolta_sentiero_ins_upd()

-- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- --
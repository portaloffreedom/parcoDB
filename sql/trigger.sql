CREATE OR REPLACE FUNCTION num_tappe_proc_trig() RETURNS trigger AS $num_tappe_proc_trig$
  BEGIN
    IF (10 < ANY (SELECT COUNT(*) FROM Composto
                  WHERE Composto.sentiero = NEW.sentiero
                  GROUP BY sentiero)) THEN
      RAISE EXCEPTION 'Troppe tappe per il sentiero';
    END IF;
  END;
$num_tappe_proc_trig$ LANGUAGE plpgsql;

-- Trigger che fa fallire un sentiero ci sono troppe tappe
CREATE TRIGGER numero_tappe BEFORE INSERT OR UPDATE ON Composto
  FOR each STATEMENT 
  EXECUTE PROCEDURE num_tappe_proc_trig();

-- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- --
-- Trigger che fa fallire se la sequenza delle tappe non è rispettata
CREATE OR REPLACE FUNCTION seq_sent_proc_trig() RETURNS trigger AS $seq_sent_proc_trig$
  BEGIN
    IF inserting THEN
      --TODO <blocco PL/SQL>
    END IF;
    IF updating THEN
      --TODO <blocco PL/SQL>
    END IF;
    IF deleting THEN
      --TODO <blocco PL/SQL>
    END IF;
  END;
$seq_sent_proc_trig$ LANGUAGE plpgsql;


CREATE TRIGGER sequenza_sentiero before INSERT OR DELETE OR UPDATE ON Composto
  FOR each ROW EXECUTE PROCEDURE seq_sent_proc_trig();

-- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- --
-- Trigger che aggiorna la lunghezza del sentiero ogni aggiornamento sulla
--  tabella `Composto` 
CREATE OR REPLACE FUNCTION lun_sent_proc_trig() RETURNS trigger AS $lun_sent_proc_trig$
  BEGIN
    UPDATE Sentiero
    SET lunghezza= (SELECT SUM(Tappa.lunghezza) FROM Tappa,Composto,Sentiero
                    WHERE Composto.sentiero = Sentiero.numero_sentiero AND
                          Composto.inizio = Tappa.inizio AND
                          Composto.fine = Tappa.fine)
    WHERE NEW.sentiero=numero_sentiero;
  END;
$lun_sent_proc_trig$ LANGUAGE plpgsql;

CREATE TRIGGER lunghezza_sentiero after INSERT ON Composto
  FOR each ROW EXECUTE PROCEDURE lun_sent_proc_trig();

-- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- --


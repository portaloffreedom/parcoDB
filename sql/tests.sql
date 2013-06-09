-- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- --
-- TEST --> Trigger che limita il massimo di tappe in un Sentiero a 10

-- TODO


-- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- --
-- TEST --> Trigger che fa fallire se la sequenza delle tappe non è rispettata

-- TODO

-- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- --
-- TEST --> Trigger che aggiorna la lunghezza del sentiero ogni aggiornamento 
--          sulla tabella `Composto` 

-- TODO

-- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- --
-- Trigger che aggiorna la lunghezza del sentiero ogni aggiornamento sulla
--  tabella `Tappa` 

UPDATE Tappa
SET (tempo,lunghezza) = (42.2,4200000.2)
WHERE inizio = 'goma' 
AND fine = 'Caduti in terra'

-- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- --
-- TEST --> Trigger che controlla che il valore di difficoltà del sentiero sia 
--          compreso tra 1 e 5

UPDATE Sentiero
SET difficolta=6
WHERE numero_sentiero=1;

UPDATE Sentiero
SET difficolta=0
WHERE numero_sentiero=1;

-- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- --
-- query SQL per vedere tutte le tappe del percorso 2
select numero_tappa,tappa.inizio,tappa.fine,lunghezza,tempo,tipo from tappa,composto
where tappa.inizio=composto.inizio
and tappa.fine=composto.fine
and composto.sentiero=2
order by composto.numero_tappa;

-- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- --
-- query SQL per aggiornare tutti i tempi delle tappe
CREATE OR REPLACE FUNCTION update_tappe() RETURNS boolean
AS $update_tappe$
  DECLARE
    tappa_mod RECORD;
begin
FOR tappa_mod in 
    SELECT * FROM Tappa
LOOP 
    BEGIN
    update tappa
    set tempo = lunghezza/10
    where tappa_mod.inizio = inizio and tappa_mod.fine = fine;
    END;
END LOOP;
return TRUE;
end;
$update_tappe$ LANGUAGE plpgsql;
-----
SELECT update_tappe();
-----
drop function update_tappe();

-- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- --
-- query SQL per aggiornare tutti le tipologie delle tappe
CREATE OR REPLACE FUNCTION update_tappe() RETURNS boolean
AS $update_tappe$
  DECLARE
    tappa_mod RECORD;
begin
FOR tappa_mod in 
    SELECT * FROM Tappa
LOOP 
    BEGIN
    update tappa
    set tipo = 'palustre'
    where tappa_mod.inizio = inizio and tappa_mod.fine = fine;
    END;
END LOOP;
return TRUE;
end;
$update_tappe$ LANGUAGE plpgsql;
-----
SELECT update_tappe();
-----
drop function update_tappe();

------------------------------------------------------------------
-- Gli alberghi vicino ai monti con una categoria maggiore di 4

select albergo.nome, albergo.categoria, monte.nome
from albergo,struttura,monte,vicino
where categoria > 4
and albergo.nome = struttura.nome
and 
( ( struttura.localizzazione = vicino.nomeA
AND vicino.nomeB = monte.nome
) OR (
struttura.localizzazione = vicino.nomeB
AND vicino.nomeA = monte.nome
))
INSERT INTO Comune (nome, provincia, superficie) 
VALUES ( 'il mio comune' , 'la mia provincia' , ? );

INSERT INTO Clima (comune, provincia, mese, pioggia, temperatura, umidita) 
VALUES ( 'il mio comune' , 'la mia provincia' , ? , ? , ? , ? );

------------------------------------------------------------------

INSERT INTO Zona (nome) 
VALUES ( ? );

INSERT INTO Caratteristica (nome)
VALUES ( ? );

INSERT INTO Paese (nome, abitanti, cap) 
VALUES ( ? , ? , ? );

------------------------------------------------------------------

INSERT INTO Zona (nome) 
VALUES ( 'alberghino' );

INSERT INTO Struttura (nome, indirizzo, orario_apertura, periodo_inizio, periodo_fine, localizzazione)
VALUES ( 'alberghino' , ? , ? , ? , ? , 'un paese' );

INSERT INTO Albergo (nome, categoria, numero_posti, telefono)
VALUES ( 'alberghino' , ? , ? , ? );

------------------------------------------------------------------

INSERT INTO Tappa (inizio, fine, lunghezza, tempo, tipo)
VALUES ( ? , ? , ? , ? , ? );

------------------------------------------------------------------

INSERT INTO Sentiero (numero_sentiero, lunghezza, tempo, difficolta)
VALUES ( ? , ? , ? , ? );

INSERT INTO Composto (inizio, fine, sentiero, numero_tappa)
VALUES ( ? , ? , ? , ? );

------------------------------------------------------------------

INSERT INTO Iniziativa (paese, settimana, tipo, nome, dettagli)
VALUES ( ? , ? , ? , ? , ? );

------------------------------------------------------------------

INSERT INTO Interesse (caratteristica, tappa_inizio, tappa_fine)
VALUES ( ? , ? , ? );

------------------------------------------------------------------

INSERT INTO Vicino (nomeA, nomeB) 
VALUES ( ? , ? );
               
------------------------------------------------------------------
------------------------------------------------------------------
------------------------------------------------------------------
------------------------------------------------------------------
------------------------------------------------------------------
------------------------------------------------------------------
------------------------------------------------------------------
------------------------------------------------------------------
------------------------------------------------------------------
------------------------------------------------------------------
------------------------------------------------------------------
------------------------------------------------------------------
------------------------------------------------------------------
------------------------------------------------------------------
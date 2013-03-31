CREATE TABLE Zona (
	nome char(64),
PRIMARY KEY (nome)
);

CREATE TABLE Tappa (
 	inizio char(64),
 	fine   char(64),
 	lunghezza float,
PRIMARY KEY(inizio,fine),
FOREIGN KEY(inizio) REFERENCES Zona(nome),
FOREIGN KEY(fine) REFERENCES Zona(nome)
);

CREATE TABLE Sentiero (
	numero_sentiero int,
	lunghezza float,
PRIMARY KEY (numero_sentiero)
);

CREATE TABLE Composto (
	inizio char(64),
	fine   char(64),
	sentiero int    REFERENCES Sentiero(numero_sentiero),
	numero_tappa int,
FOREIGN KEY (inizio,fine) REFERENCES Tappa(inizio,fine),
	PRIMARY KEY (inizio,fine,sentiero)
);

CREATE TABLE Caratteristica (
nome char(64),
PRIMARY KEY (nome),
FOREIGN KEY (nome) REFERENCES Zona(nome)
);

CREATE TABLE Paese (
	nome char(64),
abitanti int,
cap int,
PRIMARY KEY (nome),
FOREIGN KEY (nome) REFERENCES Caratteristica(nome)
);

CREATE TABLE Monte (
	nome char(64),
altitudine float,
PRIMARY KEY (nome),
FOREIGN KEY (nome) REFERENCES Caratteristica(nome)
);

CREATE TABLE Fiume (
	nome char(64),
	lunghezza float,
navigabile boolean,
PRIMARY KEY (nome),
FOREIGN KEY (nome) REFERENCES Caratteristica(nome)
);

CREATE TABLE Lago (
	nome char(64),
estensione float,
PRIMARY KEY (nome),
FOREIGN KEY (nome) REFERENCES Caratteristica(nome)
);

CREATE TABLE Struttura (
	nome	char(64),
	indirizzo text,
	orario_apertura text,
	periodo_inizio date,
	periodo_fine date,
	localizzazione char(64),
	PRIMARY KEY (nome),
	FOREIGN KEY (nome) REFERENCES Zona(nome),
	FOREIGN KEY (localizzazione) REFERENCES Paese(nome)
);

CREATE TABLE ImpiantiRisalita (
	nome char(64),
	tipologia char(64),
	capacita int,
PRIMARY KEY (nome),
FOREIGN KEY (nome) REFERENCES Struttura(nome)

);


CREATE TABLE UfficioInformazioni (
	nome char(64),
	numero int NOT NULL UNIQUE,
	telefono char(16),
PRIMARY KEY (nome),
FOREIGN KEY (nome) REFERENCES Struttura(nome)
);

CREATE TABLE Museo (
	nome char(64),
	descrizione text,
	telefono char(16),
PRIMARY KEY (nome),
FOREIGN KEY (nome) REFERENCES Struttura(nome)

);

CREATE TABLE Monumento (
	nome char(64),
	anno int,
	descrizione text,
PRIMARY KEY (nome),
FOREIGN KEY (nome) REFERENCES Struttura(nome)
);

CREATE TABLE Albergo (
	nome char(64),
	categoria char(64),
	numero_posti int,
	telefono char(16),
PRIMARY KEY (nome),
FOREIGN KEY (nome) REFERENCES Struttura(nome)

);

CREATE TABLE Iniziativa (
	paese     	char(64),
	settimana 	int,
	tipo		char(64),
	nome		char(64),
	dettagli	text,
	PRIMARY KEY (paese,settimana,tipo),
	FOREIGN KEY (paese) REFERENCES Paese(nome)
);


CREATE TABLE Interesse (
caratteristica	char(64),
tappa_inizio	char(64),
tappa_fine		char(64),
FOREIGN KEY (tappa_inizio,tappa_fine) REFERENCES Tappa(inizio,fine),
PRIMARY KEY (caratteristica,tappa_inizio,tappa_fine),
FOREIGN KEY (caratteristica) REFERENCES Caratteristica(nome)
);

CREATE TABLE Vicino (
nomeA		char(64),
nomeB		char(64),
PRIMARY KEY (nomeA,nomeB),
FOREIGN KEY (nomeA) REFERENCES Caratteristica(nome),
FOREIGN KEY (nomeB) REFERENCES Caratteristica(nome)

);


CREATE TABLE Comune (
	nome		char(64),
	provincia	char(64),
	superficie float,
	PRIMARY KEY (nome,provincia)
);

CREATE TABLE Appartiene (
caratteristica	char(64),
comune 		char(64),
provincia 		char(64),
FOREIGN KEY (comune,provincia) REFERENCES Comune(nome,provincia),
PRIMARY KEY (caratteristica,comune,provincia),
FOREIGN KEY (caratteristica) REFERENCES Caratteristica(nome)
);

CREATE TABLE Clima (
	comune	char(64),
	provincia	char(64),
	mese		int,
	pioggia	float,
	temperatura float,
	umidita	float,
	FOREIGN KEY (comune,provincia) REFERENCES Comune(nome,provincia),
	PRIMARY KEY (comune,provincia,mese)
);



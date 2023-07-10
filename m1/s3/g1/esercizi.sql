CREATE TABLE clienti (
	NumeroCliente SERIAL PRIMARY KEY,
	nome VARCHAR NOT NULL,
	cognome VARCHAR NOT NULL,
	dataNascita DATE NOT NULL,
	regioneDiResidenza VARCHAR NOT NULL
);

CREATE TABLE prodotti(
	idProdotto SERIAL PRIMARY KEY ,
	descrizione VARCHAR NOT NULL,
	inProduzione BOOLEAN NOT NULL,
	inCommercio BOOLEAN NOT NULL,
	DataAttivazione DATE NOT NULL,
	DataDisattivazione DATE NOT NULL
);
CREATE TABLE fornitori(
	NumeroFornitore SERIAL PRIMARY KEY,
	Denominazione VARCHAR NOT NULL,
	RegioneResidenza VARCHAR NOT NULL
);
CREATE TABLE fatture (
	NumeroFattura SERIAL PRIMARY KEY,
	dataFattura DATE NOT NULL,
	tipologia VARCHAR NOT NULL,
	importo INTEGER NOT NULL,
	iva INTEGER NOT NULL,
	idCliente INTEGER NOT NULL,
	NumeroFornitore INTEGER,
	CONSTRAINT idCliente_FK FOREIGN KEY (idCliente) REFERENCES clienti (NumeroCliente),
	CONSTRAINT nFornitore_FK FOREIGN KEY (NumeroFornitore) REFERENCES fornitori(NumeroFornitore)
);
INSERT INTO clienti (nome, cognome, dataNascita, regioneDiResidenza) VALUES ('Ciccio','Caputo','1993-06-12','Sicilia');
INSERT INTO clienti (nome, cognome, dataNascita, regioneDiResidenza) VALUES ('Alessio','Bottarolo','1982-02-10','Veneto');
INSERT INTO clienti (nome, cognome, dataNascita, regioneDiResidenza) VALUES ('Obelix','Cicco','1883-09-02','Sardegna' );
--prodotti
INSERT INTO prodotti (descrizione, inProduzione, inCommercio, DataAttivazione,DataDisattivazione ) 
VALUES ('Prodotto A', true, true, '2022-01-01', '2023-12-31');
INSERT INTO prodotti (descrizione, inProduzione, inCommercio, DataAttivazione, DataDisattivazione)
VALUES ('Prodotto B', false, true, '2021-05-10', '2022-11-30');
INSERT INTO prodotti (descrizione, inProduzione, inCommercio, DataAttivazione, DataDisattivazione)
VALUES ('Prodotto C', true, false, '2023-02-15', '2024-06-30');
--fornitori
INSERT INTO fornitori (Denominazione, RegioneResidenza)
VALUES ('Fornitore A', 'Lombardia');
INSERT INTO fornitori (Denominazione, RegioneResidenza)
VALUES ('Fornitore B', 'Emilia-Romagna');
INSERT INTO fornitori (Denominazione, RegioneResidenza)
VALUES ('Fornitore C', 'Piemonte');
--fatture
INSERT INTO fatture (dataFattura, tipologia, importo, iva, idCliente, NumeroFornitore)
VALUES ('2022-01-01','Fattura A', 100, 22, 1, 1);
INSERT INTO fatture (dataFattura, tipologia, importo, iva, idCliente, NumeroFornitore)
VALUES ('2022-01-01','Fattura B', 200, 20, 2, 2);
INSERT INTO fatture (dataFattura, tipologia, importo, iva, idCliente, NumeroFornitore)
VALUES ('2022-01-01','Fattura C', 150, 17, 1, 3);
INSERT INTO fatture (dataFattura, tipologia, importo, iva, idCliente, NumeroFornitore)
VALUES ('2022-01-01','Fattura D', 300, 22, 3, 2);


SELECT nome,cognome FROM clienti WHERE EXTRACT(YEAR FROM dataNascita) = 1982;
SELECT NumeroFattura FROM fatture WHERE iva = 20;
SELECT EXTRACT(YEAR FROM dataFattura) AS anno, COUNT (NumeroFattura) AS totaleFatture, SUM(importo) AS  totaleImporti
FROM fatture GROUP BY EXTRACT(YEAR FROM dataFattura);
SELECT * FROM prodotti WHERE EXTRACT (YEAR FROM DataAttivazione) = 2021 AND (inProduzione = true OR inCommercio = true);					 

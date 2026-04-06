-- SQL (Structured Query Language) è il linguaggio standard per i database relazionali.
-- Si divide in DDL (definisce la struttura) e DML (manipola i dati).

-- DDL -------------------------------------------------------

CREATE TABLE Studente (
    Matricola     INT          PRIMARY KEY,  -- chiave primaria, unica e non nulla
    Nome          VARCHAR(50)  NOT NULL,
    Cognome       VARCHAR(50)  NOT NULL,
    Età           INT,
    CorsoDiLaurea VARCHAR(100) DEFAULT 'Non specificato'
);

ALTER TABLE Studente ADD Email VARCHAR(100);  -- aggiunge una colonna

DROP TABLE Studente;  -- elimina la tabella

-- DML -------------------------------------------------------

INSERT INTO Studente VALUES (1, 'Mario', 'Rossi', 22, 'Informatica', 'mario@mail.it');
INSERT INTO Studente VALUES (2, 'Laura', 'Bianchi', 24, 'Matematica', 'laura@mail.it');

UPDATE Studente SET Età = 23 WHERE Matricola = 1;

DELETE FROM Studente WHERE Matricola = 2;

SELECT * FROM Studente;
SELECT Nome, Cognome FROM Studente WHERE Età > 22 ORDER BY Cognome;
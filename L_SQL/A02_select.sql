-- SELECT recupera dati da una tabella.
-- Sintassi base: SELECT colonne FROM tabella WHERE condizione ORDER BY colonna;

CREATE TABLE Dipendente (
    ID        INT          PRIMARY KEY,
    Nome      VARCHAR(50)  NOT NULL,
    Cognome   VARCHAR(50)  NOT NULL,
    Reparto   VARCHAR(50),
    Stipendio DECIMAL(10,2),
    AnnoAssunzione INT
);

INSERT INTO Dipendente VALUES (1, 'Giorgio', 'Ferrari',   'IT',        2800.00, 2019);
INSERT INTO Dipendente VALUES (2, 'Sara',    'Conti',     'Marketing', 2200.00, 2021);
INSERT INTO Dipendente VALUES (3, 'Paolo',   'Ricci',     'IT',        3100.00, 2017);
INSERT INTO Dipendente VALUES (4, 'Elena',   'Gallo',     'HR',        2500.00, 2020);
INSERT INTO Dipendente VALUES (5, 'Marco',   'Lombardi',  'Marketing', 2400.00, 2022);

SELECT * FROM Dipendente;
SELECT Nome, Cognome, Stipendio FROM Dipendente;
SELECT Nome AS 'Nome', Stipendio AS 'Stipendio (€)' FROM Dipendente;
SELECT DISTINCT Reparto FROM Dipendente;
SELECT * FROM Dipendente WHERE Stipendio > 2500;
SELECT * FROM Dipendente WHERE Reparto = 'IT' AND AnnoAssunzione > 2018;
SELECT * FROM Dipendente WHERE Reparto = 'HR' OR Reparto = 'Marketing';
SELECT * FROM Dipendente ORDER BY Stipendio DESC;
SELECT * FROM Dipendente ORDER BY Cognome ASC;
SELECT * FROM Dipendente ORDER BY Stipendio DESC LIMIT 3;
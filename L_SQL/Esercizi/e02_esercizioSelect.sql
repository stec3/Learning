-- Esercizi su SELECT

CREATE TABLE Libro (
    ISBN      INT          PRIMARY KEY,
    Titolo    VARCHAR(100) NOT NULL,
    Autore    VARCHAR(50),
    Genere    VARCHAR(50),
    Prezzo    DECIMAL(10,2),
    AnnoUscita INT
);

INSERT INTO Libro VALUES (1, 'Il Nome della Rosa',    'Eco',       'Storico',  12.99, 1980);
INSERT INTO Libro VALUES (2, 'Harry Potter',          'Rowling',   'Fantasy',   9.99, 1997);
INSERT INTO Libro VALUES (3, '1984',                  'Orwell',    'Distopia',  8.50, 1949);
INSERT INTO Libro VALUES (4, 'Dune',                  'Herbert',   'Fantasy',  11.00, 1965);
INSERT INTO Libro VALUES (5, 'Il Piccolo Principe',   'Saint-Exupéry', 'Romanzo', 6.99, 1943);
INSERT INTO Libro VALUES (6, 'Fondazione',            'Asimov',    'Fantascienza', 10.50, 1951);

SELECT * FROM Libro;
SELECT Titolo, Autore FROM Libro;
SELECT Titolo AS 'Nome del Libro', Prezzo AS 'Costo (€)' FROM Libro;
SELECT DISTINCT Genere FROM Libro;
SELECT * FROM Libro WHERE Prezzo > 10;
SELECT * FROM Libro WHERE Genere = 'Fantasy' AND AnnoUscita > 1990;
SELECT * FROM Libro WHERE Autore = 'Orwell' OR Autore = 'Asimov';
SELECT * FROM Libro ORDER BY Prezzo ASC;
SELECT * FROM Libro ORDER BY AnnoUscita ASC LIMIT 3;

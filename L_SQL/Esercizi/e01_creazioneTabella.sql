-- Creazione tabella Prodotto

CREATE TABLE Prodotto (
    Codice    INT PRIMARY KEY,
    Nome      VARCHAR(50) NOT NULL,
    Categoria VARCHAR(50),
    Prezzo    DECIMAL(10,2),
    Scorte    INT
);

INSERT INTO Prodotto VALUES (1, 'Laptop', 'Elettronica', 899.99, 15);
INSERT INTO Prodotto VALUES (2, 'Sedia', 'Arredamento', 129.50, 40);
INSERT INTO Prodotto VALUES (3, 'Monitor', 'Elettronica', 299.00, 22);
INSERT INTO Prodotto VALUES (4, 'Scrivania', 'Arredamento', 349.00, 8);

SELECT * FROM Prodotto;
SELECT Nome, Prezzo FROM Prodotto;
SELECT * FROM Prodotto WHERE Categoria = 'Elettronica';
SELECT * FROM Prodotto WHERE Prezzo > 200;
SELECT * FROM Prodotto ORDER BY Prezzo;
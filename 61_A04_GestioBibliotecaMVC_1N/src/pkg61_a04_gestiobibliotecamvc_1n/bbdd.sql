DROP DATABASE IF EXISTS biblioteca_db;
CREATE DATABASE IF NOT EXISTS biblioteca_db;

USE biblioteca_db;

CREATE TABLE llibres(
	id INT PRIMARY KEY AUTO_INCREMENT,
    ISBN VARCHAR(13) UNIQUE,
	titol VARCHAR(255),
    autor VARCHAR(255),
    pagines INT
);

CREATE TABLE editorials (
    id INT AUTO_INCREMENT PRIMARY KEY,
    nom VARCHAR(255) NOT NULL UNIQUE,
    pais VARCHAR(100)
);

ALTER TABLE llibres 
ADD COLUMN id_editorial INT,
ADD CONSTRAINT fk_llibre_editorial 
FOREIGN KEY (id_editorial) REFERENCES editorials(id) ON DELETE RESTRICT;

SELECT * FROM llibres;
SELECT * FROM editorials;

CREATE DATABASE concecionario_en;

USE concecionario_en;
CREATE TABLE coches (
    id INT AUTO_INCREMENT PRIMARY KEY,
    nombre VARCHAR(255) NOT NULL,
    descripcion TEXT,
    precio DECIMAL(10, 2) NOT NULL,
    stock INT NOT NULL
);

INSERT INTO coches (nombre, descripcion, precio, stock) VALUES
('Peugeot', '2008', 5.1, 100),
('Citroen', 'Xantia', 8.8, 80),
('Opel', 'vectra', 5.2, 40);

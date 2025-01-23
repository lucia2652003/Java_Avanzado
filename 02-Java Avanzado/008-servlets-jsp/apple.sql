-- Crear la base de datos
CREATE DATABASE apple_db;
USE apple_db;

-- Crear la tabla persona
CREATE TABLE persona (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    nombre VARCHAR(50) NOT NULL,
    apellido VARCHAR(50) NOT NULL
);

-- Crear la tabla tarjetas para la relación uno a muchos
CREATE TABLE tarjeta (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    tipo ENUM('debito', 'credito') NOT NULL,
    persona_id BIGINT NOT NULL,
    FOREIGN KEY (persona_id) REFERENCES persona(id) ON DELETE CASCADE
);

-- Crear la tabla productos para la relación muchos a muchos
CREATE TABLE producto (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    nombre VARCHAR(100) NOT NULL,
    precio DECIMAL(10, 2) NOT NULL
);

-- Crear la tabla intermedia para la relación muchos a muchos entre persona y productos
CREATE TABLE persona_producto (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    persona_id BIGINT NOT NULL,
    producto_id BIGINT NOT NULL,
    FOREIGN KEY (persona_id) REFERENCES persona(id) ON DELETE CASCADE,
    FOREIGN KEY (producto_id) REFERENCES producto(id) ON DELETE CASCADE
);

-- Insertar registros en la tabla persona
INSERT INTO persona (nombre, apellido) VALUES
('Juan', 'Perez'),
('Maria', 'Gomez'),
('Carlos', 'Lopez'),
('Ana', 'Martinez'),
('Luis', 'Garcia'),
('Elena', 'Sanchez'),
('Fernando', 'Diaz'),
('Lucia', 'Ramirez'),
('Sofia', 'Torres'),
('Miguel', 'Hernandez');

-- Insertar registros en la tabla tarjetas
INSERT INTO tarjeta (tipo, persona_id) VALUES
('debito', 1),
('credito', 1),
('debito', 2),
('credito', 2),
('debito', 3),
('credito', 3),
('debito', 4),
('credito', 4),
('debito', 5),
('credito', 5),
('debito', 6),
('credito', 6),
('debito', 7),
('credito', 7),
('debito', 8),
('credito', 8),
('debito', 9),
('credito', 9),
('debito', 10),
('credito', 10);

-- Insertar registros en la tabla productos
INSERT INTO producto (nombre, precio) VALUES
('iPhone 15 Pro Max', 1500.50),
('AirPods Pro ', 200.75),
('Apple Watch Series 9', 300.00),
('iPad Pro 12.9" ', 400.25),
('MacBook Air M2 (2023)', 1500.99);

-- Insertar registros en la tabla intermedia persona_productos
INSERT INTO persona_producto (persona_id, producto_id) VALUES
(1, 1),
(1, 2),
(2, 3),
(2, 4),
(3, 5),
(4, 1),
(5, 2),
(6, 3),
(7, 4),
(8, 5),
(9, 1),
(10, 2);

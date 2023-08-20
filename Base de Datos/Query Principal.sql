-- Crear la base de datos
CREATE DATABASE Farmacia;

-- Usar la base de datos recién creada
USE Farmacia;

-- Crear la tabla Usuarios
CREATE TABLE Usuarios (
    id INT PRIMARY KEY AUTO_INCREMENT,
    nombre VARCHAR(255) NOT NULL,
    usuario VARCHAR(50) NOT NULL UNIQUE,
    contraseña VARCHAR(255) NOT NULL,
    tipo ENUM('admin', 'cajero') NOT NULL
);

-- Crear la tabla Productos
CREATE TABLE Productos (
    id INT PRIMARY KEY AUTO_INCREMENT,
    nombre VARCHAR(255) NOT NULL,
    precio DECIMAL(10, 2) NOT NULL,
    stock INT NOT NULL
);

-- Crear la tabla Transacciones
CREATE TABLE Transacciones (
    id INT PRIMARY KEY AUTO_INCREMENT,
    id_cajero INT NOT NULL,
    fecha TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    FOREIGN KEY (id_cajero) REFERENCES Usuarios(id)
);

-- Crear la tabla DetallesTransaccion
CREATE TABLE DetallesTransaccion (
    id INT PRIMARY KEY AUTO_INCREMENT,
    id_transaccion INT NOT NULL,
    id_producto INT NOT NULL,
    cantidad INT NOT NULL,
    FOREIGN KEY (id_transaccion) REFERENCES Transacciones(id),
    FOREIGN KEY (id_producto) REFERENCES Productos(id)
);

-- Crear la tabla Ventas
CREATE TABLE Ventas (
    id INT PRIMARY KEY AUTO_INCREMENT,
    id_cajero INT NOT NULL,
    id_producto INT NOT NULL,
    fecha TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    FOREIGN KEY (id_cajero) REFERENCES Usuarios(id),
    FOREIGN KEY (id_producto) REFERENCES Productos(id)
);

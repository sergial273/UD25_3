-- Elimina las tablas si existen
DROP TABLE IF EXISTS `Cajas`;
DROP TABLE IF EXISTS `Almacenes`;


-- Crea la tabla `Almacenes`
CREATE TABLE `Almacenes` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `lugar` varchar(250) DEFAULT NULL,
  `capacidad` int(250) DEFAULT NULL,
  PRIMARY KEY (`id`)
);

-- Crea la tabla `Cajas`
CREATE TABLE `Cajas` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `contenido` varchar(250) DEFAULT NULL,
  `valor` int(11) DEFAULT NULL,
  `almacen` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`),
  CONSTRAINT `almacen_fk` FOREIGN KEY (`almacen`) REFERENCES `Almacenes` (`id`) ON DELETE CASCADE ON UPDATE CASCADE
);

-- Inserta datos en la tabla `Almacenes`
INSERT INTO `Almacenes` (lugar, capacidad) VALUES
('Almacen 1', 5000),
('Almacen 2', 8000),
('Almacen 3', 6000),
('Almacen 4', 10000),
('Almacen 5', 9000);

-- Inserta datos en la tabla `Cajas`
INSERT INTO `Cajas` (contenido, valor, almacen) VALUES
('Contenido 1', 100, 1),
('Contenido 2', 200, 2),
('Contenido 3', 150, 3),
('Contenido 4', 300, 4),
('Contenido 5', 250, 5);






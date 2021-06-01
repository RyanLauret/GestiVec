-- Adminer 4.8.0 MySQL 8.0.21 dump

SET NAMES utf8;
SET time_zone = '+00:00';
SET foreign_key_checks = 0;
SET sql_mode = 'NO_AUTO_VALUE_ON_ZERO';

DROP TABLE IF EXISTS `couleur`;
CREATE TABLE `couleur` (
  `idCouleur` int NOT NULL AUTO_INCREMENT,
  `nomCouleur` varchar(15) COLLATE utf8_unicode_ci NOT NULL,
  PRIMARY KEY (`idCouleur`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

INSERT INTO `couleur` (`idCouleur`, `nomCouleur`) VALUES
(6,	'bleu'),
(7,	'rouge'),
(8,	'vert'),
(9,	'noir'),
(10,	'gris'),
(11,	'blanc'),
(12,	'jaune'),
(13,	'orange');

DROP TABLE IF EXISTS `moteur`;
CREATE TABLE `moteur` (
  `idMoteur` int NOT NULL AUTO_INCREMENT,
  `carburant` varchar(10) COLLATE utf8_unicode_ci NOT NULL,
  `puissanceFiscale` int NOT NULL,
  `boiteVitesse` varchar(16) CHARACTER SET utf8 COLLATE utf8_unicode_ci NOT NULL,
  PRIMARY KEY (`idMoteur`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

INSERT INTO `moteur` (`idMoteur`, `carburant`, `puissanceFiscale`, `boiteVitesse`) VALUES
(2,	'Essence',	115,	'Mécanique'),
(3,	'Essence',	115,	'Mécanique'),
(4,	'Diesel',	110,	'Mécanique'),
(5,	'Diesel',	115,	'Mécanique'),
(7,	'Diesel',	110,	'Mécanique'),
(8,	'Hybride',	100,	'Automatique'),
(9,	'Diesel',	90,	'Mécanique'),
(10,	'Diesel',	150,	'Mécanique'),
(11,	'Diesel',	115,	'Mécanique'),
(12,	'Essence',	125,	'Mécanique'),
(13,	'Diesel',	286,	'Automatique'),
(14,	'Essence',	360,	'Automatique'),
(15,	'Essence',	200,	'Automatique');

DROP TABLE IF EXISTS `vehicule`;
CREATE TABLE `vehicule` (
  `idVehicule` int NOT NULL AUTO_INCREMENT,
  `marque` varchar(20) CHARACTER SET utf8 COLLATE utf8_unicode_ci NOT NULL,
  `modele` varchar(20) COLLATE utf8_unicode_ci NOT NULL,
  `kilometrage` int NOT NULL,
  `nbrePortes` int NOT NULL,
  `anneeSortie` int NOT NULL,
  `prixAchat` double NOT NULL,
  `idMoteur` int NOT NULL,
  `idCouleur` int NOT NULL,
  PRIMARY KEY (`idVehicule`),
  KEY `idCouleur` (`idCouleur`),
  KEY `idMoteur` (`idMoteur`),
  CONSTRAINT `vehicule_ibfk_1` FOREIGN KEY (`idCouleur`) REFERENCES `couleur` (`idCouleur`),
  CONSTRAINT `vehicule_ibfk_2` FOREIGN KEY (`idMoteur`) REFERENCES `moteur` (`idMoteur`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

INSERT INTO `vehicule` (`idVehicule`, `marque`, `modele`, `kilometrage`, `nbrePortes`, `anneeSortie`, `prixAchat`, `idMoteur`, `idCouleur`) VALUES
(1,	'Nissan',	'Qashqaï',	20000,	5,	2016,	15000,	2,	9),
(2,	'Renault',	'Captur',	24000,	5,	2019,	22000,	3,	13),
(3,	'Peugeot',	'307',	192000,	5,	2008,	4460,	4,	10),
(4,	'Mitsubishi',	'Asx',	90000,	5,	2015,	15000,	5,	10),
(5,	'Volkswagen',	'Polo',	12000,	5,	2019,	16800,	15,	7),
(6,	'Mazda',	'3',	145000,	5,	2008,	5400,	7,	13),
(7,	'Toyota',	'Yaris',	79000,	5,	2016,	11000,	8,	6),
(8,	'Dacia',	'Sandero',	210000,	5,	2012,	7590,	9,	10),
(9,	'Subaru',	'Outback',	23000,	5,	2009,	49990,	10,	6),
(10,	'Alfa Roméo',	'147',	240000,	3,	2004,	4900,	11,	9),
(14,	'Audi',	'A1',	46000,	5,	2015,	16500,	12,	8),
(15,	'BMW',	'X6',	78000,	5,	2013,	34000,	13,	11),
(16,	'Mercedes',	'Class A 3 AMG',	17000,	5,	2015,	40900,	14,	7);

-- 2021-06-01 11:49:26

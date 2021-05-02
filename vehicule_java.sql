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
  `refMoteur` varchar(20) CHARACTER SET utf8 COLLATE utf8_unicode_ci NOT NULL,
  `carburant` varchar(10) COLLATE utf8_unicode_ci NOT NULL,
  `puissanceFiscale` int NOT NULL,
  `boiteVitesse` varchar(10) COLLATE utf8_unicode_ci NOT NULL,
  PRIMARY KEY (`idMoteur`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

INSERT INTO `moteur` (`idMoteur`, `refMoteur`, `carburant`, `puissanceFiscale`, `boiteVitesse`) VALUES
(2,	'1.2 DIG-T',	'Essence',	115,	'Mécanique'),
(3,	'1.3 TCE',	'Essence',	115,	'Mécanique'),
(4,	'1.6 HDI',	'Diesel',	110,	'Mécanique'),
(5,	'1.8 DI-D',	'Diesel',	115,	'Mécanique'),
(7,	'1.6 MZ-CD',	'Diesel',	110,	'Mécanique'),
(8,	'100H',	'Hybride',	100,	'Automatiqu'),
(9,	'1.5 DCI',	'Diesel',	90,	'Mécanique'),
(10,	'2.0 D',	'Diesel',	150,	'Mécanique'),
(11,	'1.9 JTD',	'Diesel',	115,	'Mécanique'),
(12,	'1.4 TFSI',	'Essence',	125,	'Mécanique'),
(13,	'6 cylindre en ligne ',	'Diesel',	286,	'Automatiqu'),
(14,	'4 cylindres en ligne',	'Essence',	360,	'Automatiqu'),
(15,	'2.0 TSI',	'Essence',	200,	'Automatiqu');

DROP TABLE IF EXISTS `vehicule`;
CREATE TABLE `vehicule` (
  `idVehicule` int NOT NULL AUTO_INCREMENT,
  `marque` varchar(20) CHARACTER SET utf8 COLLATE utf8_unicode_ci NOT NULL,
  `modele` varchar(20) COLLATE utf8_unicode_ci NOT NULL,
  `img` varchar(125) CHARACTER SET utf8 COLLATE utf8_unicode_ci NOT NULL,
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

INSERT INTO `vehicule` (`idVehicule`, `marque`, `modele`, `img`, `kilometrage`, `nbrePortes`, `anneeSortie`, `prixAchat`, `idMoteur`, `idCouleur`) VALUES
(1,	'Nissan',	'Qashqaï',	'C:\\Users\\ASUS\\Desktop\\Travails\\NetBeansProjects\\Vehicule\\cars_pictures\\nissan-qashqai-gamme-2016-d8dd768ea340bb948ee0fe08f9a3',	20000,	5,	2016,	15000,	2,	9),
(2,	'Renault',	'Captur',	'C:\\Users\\ASUS\\Desktop\\Travails\\NetBeansProjects\\Vehicule\\cars_pictures\\renault-captur-2019-d9bf5.jpg',	24000,	5,	2019,	22000,	3,	13),
(3,	'Peugeot',	'307',	'C:\\Users\\ASUS\\Desktop\\Travails\\NetBeansProjects\\Vehicule\\cars_pictures\\une-peugeot-307-hdi-2001-2008.jpg',	192000,	5,	2008,	4460,	4,	10),
(4,	'Mitsubishi',	'Asx',	'C:\\Users\\ASUS\\Desktop\\Travails\\NetBeansProjects\\Vehicule\\cars_pictures\\mitsubishi-asx-2015-recall-768x454.jpg',	90000,	5,	2015,	15000,	5,	10),
(5,	'Volkswagen',	'Polo',	'C:\\Users\\ASUS\\Desktop\\Travails\\NetBeansProjects\\Vehicule\\cars_pictures\\Volkswagen_Polo_GTI_MD_1.jpg',	12000,	5,	2019,	16800,	15,	7),
(6,	'Mazda',	'3',	'C:\\Users\\ASUS\\Desktop\\Travails\\NetBeansProjects\\Vehicule\\cars_pictures\\S7-modele--mazda-3.jpg',	145000,	5,	2008,	5400,	7,	13),
(7,	'Toyota',	'Yaris',	'C:\\Users\\ASUS\\Desktop\\Travails\\NetBeansProjects\\Vehicule\\cars_pictures\\076632_2016_toyota_Yaris.jpg',	79000,	5,	2016,	11000,	8,	6),
(8,	'Dacia',	'Sandero',	'C:\\Users\\ASUS\\Desktop\\Travails\\NetBeansProjects\\Vehicule\\cars_pictures\\S7-modele--dacia-sandero.jpg',	210000,	5,	2012,	7590,	9,	10),
(9,	'Subaru',	'Outback',	'C:\\Users\\ASUS\\Desktop\\Travails\\NetBeansProjects\\Vehicule\\cars_pictures\\SUBARUOutback-1699_11.jpg',	23000,	5,	2009,	49990,	10,	6),
(10,	'Alfa Roméo',	'147',	'C:\\Users\\ASUS\\Desktop\\Travails\\NetBeansProjects\\Vehicule\\cars_pictures\\cda64f59-a2dc-4081-bae3-b584cc0b26c1.jpg',	240000,	3,	2004,	4900,	11,	9),
(14,	'Audi',	'A1',	'C:\\Users\\ASUS\\Desktop\\Travails\\NetBeansProjects\\Vehicule\\cars_pictures\\S7-modele--audi-a1-sportback.jpg',	46000,	5,	2015,	16500,	12,	8),
(15,	'BMW',	'X6',	'C:\\Users\\ASUS\\Desktop\\Travails\\NetBeansProjects\\Vehicule\\cars_pictures\\50283.jpg',	78000,	5,	2013,	34000,	13,	11),
(16,	'Mercedes',	'Class A 3 AMG',	'C:\\Users\\ASUS\\Desktop\\Travails\\NetBeansProjects\\Vehicule\\cars_pictures\\nouvelle-mercedes-classe-a-45-amg-2015-381-ch-10.jpg',	17000,	5,	2015,	40900,	14,	7);

-- 2021-05-02 16:23:18

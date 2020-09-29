-- MySQL dump 10.13  Distrib 8.0.20, for macos10.15 (x86_64)
--
-- Host: 127.0.0.1    Database: customerdb
-- ------------------------------------------------------
-- Server version	8.0.20
--
-- Table structure for table `customer`
--

DROP TABLE IF EXISTS `customer`;
CREATE TABLE `customer` (
  `id` int NOT NULL AUTO_INCREMENT,
  `name` varchar(45) DEFAULT NULL,
  `age` int DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

--
-- Dumping data for table `customer`
--

LOCK TABLES `customer` WRITE;
INSERT INTO `customer` VALUES (1,'John',30),(2,'Maria',29),(3,'Halime',25);
UNLOCK TABLES;

-- Dump completed on 2020-09-29 22:39:55

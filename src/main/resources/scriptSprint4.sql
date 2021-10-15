CREATE DATABASE  IF NOT EXISTS `proyectospring` /*!40100 DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci */ /*!80016 DEFAULT ENCRYPTION='N' */;
USE `proyectospring`;
-- MySQL dump 10.13  Distrib 8.0.26, for Win64 (x86_64)
--
-- Host: 127.0.0.1    Database: proyectospring
-- ------------------------------------------------------
-- Server version	8.0.26

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `color`
--

DROP TABLE IF EXISTS `color`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `color` (
                         `idcolor` int NOT NULL AUTO_INCREMENT,
                         `nombre_color` varchar(45) NOT NULL,
                         PRIMARY KEY (`idcolor`)
) ENGINE=InnoDB AUTO_INCREMENT=10 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `color`
--

LOCK TABLES `color` WRITE;
/*!40000 ALTER TABLE `color` DISABLE KEYS */;
INSERT INTO `color` VALUES (1,'Negro'),(2,'Azul'),(3,'Amarillo'),(4,'Beige'),(5,'Rojo'),(6,'Marron'),(7,'Rosa'),(8,'Verde'),(9,'Mostaza');
/*!40000 ALTER TABLE `color` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `estado`
--

DROP TABLE IF EXISTS `estado`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `estado` (
                          `id_estado` int NOT NULL AUTO_INCREMENT,
                          `porcentaje` varchar(45) NOT NULL,
                          PRIMARY KEY (`id_estado`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `estado`
--

LOCK TABLES `estado` WRITE;
/*!40000 ALTER TABLE `estado` DISABLE KEYS */;
INSERT INTO `estado` VALUES (1,'60'),(2,'70'),(3,'80'),(4,'90'),(5,'100');
/*!40000 ALTER TABLE `estado` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `linea_zapato`
--

DROP TABLE IF EXISTS `linea_zapato`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `linea_zapato` (
                                `id_linea` int NOT NULL,
                                `nombre_linea` varchar(45) NOT NULL,
                                PRIMARY KEY (`id_linea`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `linea_zapato`
--

LOCK TABLES `linea_zapato` WRITE;
/*!40000 ALTER TABLE `linea_zapato` DISABLE KEYS */;
INSERT INTO `linea_zapato` VALUES (1,'Hombres'),(2,'Mujer'),(3,'Unisex');
/*!40000 ALTER TABLE `linea_zapato` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `marca`
--

DROP TABLE IF EXISTS `marca`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `marca` (
                         `idmarca` int NOT NULL AUTO_INCREMENT,
                         `nombre_marca` varchar(45) NOT NULL,
                         PRIMARY KEY (`idmarca`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `marca`
--

LOCK TABLES `marca` WRITE;
/*!40000 ALTER TABLE `marca` DISABLE KEYS */;
INSERT INTO `marca` VALUES (1,'Rebook'),(2,'Velez'),(3,'Bosi'),(4,'New Balance');
/*!40000 ALTER TABLE `marca` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `pais`
--

DROP TABLE IF EXISTS `pais`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `pais` (
                        `idpais` int NOT NULL AUTO_INCREMENT,
                        `nombre_pais` varchar(45) NOT NULL,
                        PRIMARY KEY (`idpais`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `pais`
--

LOCK TABLES `pais` WRITE;
/*!40000 ALTER TABLE `pais` DISABLE KEYS */;
INSERT INTO `pais` VALUES (1,'Brasil'),(2,'Colombia');
/*!40000 ALTER TABLE `pais` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tipo_zapato`
--

DROP TABLE IF EXISTS `tipo_zapato`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `tipo_zapato` (
                               `id_tipo_zapato` int NOT NULL AUTO_INCREMENT,
                               `tipo_zapato` varchar(45) NOT NULL,
                               PRIMARY KEY (`id_tipo_zapato`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tipo_zapato`
--

LOCK TABLES `tipo_zapato` WRITE;
/*!40000 ALTER TABLE `tipo_zapato` DISABLE KEYS */;
INSERT INTO `tipo_zapato` VALUES (1,'Casual'),(2,'Deportivo'),(3,'Formal'),(4,'Sandalias'),(5,'Tacones'),(6,'Plataformas');
/*!40000 ALTER TABLE `tipo_zapato` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `usuarios`
--

DROP TABLE IF EXISTS `usuarios`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `usuarios` (
                            `cedula` int auto_increment NOT NULL,
                            `nombres` varchar(45) NOT NULL,
                            `apellidos` varchar(45) NOT NULL,
                            `email` varchar(45) NOT NULL,
                            `username` varchar(45) NOT NULL,
                            `password` varchar(45) NOT NULL,
                            `id_pais` int,
                            PRIMARY KEY (`cedula`),
                            KEY `pais_origen_idx` (`id_pais`),
                            CONSTRAINT `pais_origen` FOREIGN KEY (`id_pais`) REFERENCES `pais` (`idpais`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `usuarios`
--

LOCK TABLES `usuarios` WRITE;
/*!40000 ALTER TABLE `usuarios` DISABLE KEYS */;
INSERT INTO `usuarios` VALUES (1050,'Herly','Castillo','herly25@h,com','herlyn25','1234',1),(1078,'Salem','Castillo','salem23@gmail.com','salem23','1357',2);
/*!40000 ALTER TABLE `usuarios` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `zapato`
--

DROP TABLE IF EXISTS `zapato`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `zapato` (
                          `idzapato` int NOT NULL AUTO_INCREMENT,
                          `precio` int NOT NULL,
                          `talla` varchar(45) NOT NULL,
                          `tipo_zapato` int NOT NULL,
                          `cedula_usuario` int NOT NULL,
                          `id_linea_zapato` int NOT NULL,
                          `color` int NOT NULL,
                          `estado_zapato` int NOT NULL,
                          `id_marca` int NOT NULL,
                          PRIMARY KEY (`idzapato`),
                          KEY `tipo_linea_key_idx` (`id_linea_zapato`),
                          KEY `cedula_usuario_idx` (`cedula_usuario`),
                          KEY `color_zapato_key_idx` (`color`),
                          KEY `tipo_zapato_key_idx` (`tipo_zapato`),
                          KEY `estado_zapato_key_idx` (`estado_zapato`),
                          KEY `id_marca_idx` (`id_marca`),

                          CONSTRAINT `color_zapato_key` FOREIGN KEY (`color`) REFERENCES `color` (`idcolor`),
                          CONSTRAINT `estado_zapato_key` FOREIGN KEY (`estado_zapato`) REFERENCES `estado` (`id_estado`),
                          CONSTRAINT `id_marca` FOREIGN KEY (`id_marca`) REFERENCES `marca` (`idmarca`),
                          CONSTRAINT `tipo_linea_key` FOREIGN KEY (`id_linea_zapato`) REFERENCES `linea_zapato` (`id_linea`),
                          CONSTRAINT `tipo_zapato_key` FOREIGN KEY (`tipo_zapato`) REFERENCES `tipo_zapato` (`id_tipo_zapato`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `zapato`
--

LOCK TABLES `zapato` WRITE;
/*!40000 ALTER TABLE `zapato` DISABLE KEYS */;
INSERT INTO `zapato` VALUES (1,200,'34',1,1050,1,1,1,1),(2,400,'35',2,1078,2,2,2,2);
/*!40000 ALTER TABLE `zapato` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2021-10-04 22:29:24

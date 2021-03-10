-- MySQL dump 10.13  Distrib 5.7.17, for Win64 (x86_64)
--
-- Host: localhost    Database: personal_blog2
-- ------------------------------------------------------
-- Server version	5.7.21

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `user`
--

DROP TABLE IF EXISTS `user`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `user` (
  `USERNAME` varchar(45) COLLATE utf8_czech_ci NOT NULL,
  `PASSWORD` varchar(45) COLLATE utf8_czech_ci NOT NULL,
  `PERMISSION` varchar(10) COLLATE utf8_czech_ci DEFAULT 'guest',
  `EMAIL` varchar(45) COLLATE utf8_czech_ci DEFAULT NULL,
  `LAST_NAME` varchar(45) COLLATE utf8_czech_ci DEFAULT NULL,
  `FIRST_NAME` varchar(45) COLLATE utf8_czech_ci DEFAULT NULL,
  `ADDRESS` varchar(100) COLLATE utf8_czech_ci DEFAULT NULL,
  `CITY` varchar(45) COLLATE utf8_czech_ci DEFAULT NULL,
  `STREET` varchar(45) COLLATE utf8_czech_ci DEFAULT NULL,
  `POSTAL_CODE` varchar(45) COLLATE utf8_czech_ci DEFAULT NULL,
  `INTRODUCTION` tinytext COLLATE utf8_czech_ci,
  `PHOTO_PATH` varchar(90) COLLATE utf8_czech_ci DEFAULT 'D:\\temp-rainy',
  `PHOTO_FILE_NAME` varchar(45) COLLATE utf8_czech_ci DEFAULT 'mysterion.png',
  `PHOTO_CONTENT_TYPE` varchar(10) COLLATE utf8_czech_ci DEFAULT '.PNG',
  PRIMARY KEY (`USERNAME`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_czech_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `user`
--

LOCK TABLES `user` WRITE;
/*!40000 ALTER TABLE `user` DISABLE KEYS */;
INSERT INTO `user` VALUES ('root','123456','admin','jnoideal@gmail.com','CC','HH','xxxxxxx','北京','xx街','121000','我是一名应届生','D://temp-rainy//','1fb85320-25bf-4af1-91a2-b38acb8b8021.png','.png'),('root1','zxcvbn','guest','sada@asad.com','asdas','wa','daaa','sad','asdas','dsad','sad','D:\\temp-rainy','mysterion.png','.PNG'),('root2','qwe321456','guest',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,'D:\\temp-rainy','mysterion.png','.PNG');
/*!40000 ALTER TABLE `user` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2020-06-09 13:38:31

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
-- Table structure for table `comment`
--

DROP TABLE IF EXISTS `comment`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `comment` (
  `CID` int(11) NOT NULL AUTO_INCREMENT,
  `ARTICLE_ID` int(11) NOT NULL,
  `USERNAME` varchar(45) COLLATE utf8_czech_ci NOT NULL,
  `CCONTENT` text COLLATE utf8_czech_ci NOT NULL,
  `RELEASE_TIME` datetime DEFAULT CURRENT_TIMESTAMP,
  `LIKE_NUM` int(11) DEFAULT '0',
  PRIMARY KEY (`CID`),
  KEY `user_idx` (`USERNAME`),
  KEY `comment_article_idx` (`ARTICLE_ID`),
  CONSTRAINT `comment_article` FOREIGN KEY (`ARTICLE_ID`) REFERENCES `article` (`AID`) ON DELETE CASCADE ON UPDATE NO ACTION,
  CONSTRAINT `comment_user` FOREIGN KEY (`USERNAME`) REFERENCES `user` (`USERNAME`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=20 DEFAULT CHARSET=utf8 COLLATE=utf8_czech_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `comment`
--

LOCK TABLES `comment` WRITE;
/*!40000 ALTER TABLE `comment` DISABLE KEYS */;
INSERT INTO `comment` VALUES (1,23,'root','123456','2020-03-25 15:14:09',0),(2,23,'root','fdfdsgergtjy','2020-03-26 11:20:25',0),(3,23,'root','haha','2020-03-26 11:20:30',0),(4,23,'root','fedw','2020-03-26 11:20:33',0),(9,23,'root','aaaa','2020-04-14 15:44:01',0),(10,23,'root','dsadsa','2020-04-14 15:44:05',0),(11,23,'root','aaaaaa','2020-04-14 15:44:15',0),(12,23,'root','aaaaaa','2020-04-14 15:44:18',0),(13,23,'root','aaaaaa','2020-04-14 15:44:18',0),(14,23,'root','aaaaaa','2020-04-14 15:44:18',0),(15,23,'root','aaaaaa','2020-04-14 15:44:23',0),(16,39,'root','hahahahaha','2020-05-11 19:21:51',0),(17,39,'root','hahahahaha','2020-05-11 19:22:21',0),(18,40,'root','aaa','2020-05-11 21:47:55',0),(19,23,'root','fmsdifopi','2020-06-08 21:04:45',0);
/*!40000 ALTER TABLE `comment` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2020-06-09 13:38:30

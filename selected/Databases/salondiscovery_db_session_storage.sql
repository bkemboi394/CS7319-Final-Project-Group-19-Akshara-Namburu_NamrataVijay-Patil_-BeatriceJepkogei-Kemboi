-- MySQL dump 10.13  Distrib 8.0.32, for Win64 (x86_64)
--
-- Host: localhost    Database: salondiscovery_db
-- ------------------------------------------------------
-- Server version	8.3.0

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
-- Table structure for table `session_storage`
--

DROP TABLE IF EXISTS `session_storage`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `session_storage` (
  `id` bigint NOT NULL AUTO_INCREMENT,
  `selected_services` varchar(10000) DEFAULT NULL,
  `session_id` varchar(36) DEFAULT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `UK_tdd1hy5l2w0qaqtj958lm7849` (`session_id`)
) ENGINE=InnoDB AUTO_INCREMENT=14 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `session_storage`
--

LOCK TABLES `session_storage` WRITE;
/*!40000 ALTER TABLE `session_storage` DISABLE KEYS */;
INSERT INTO `session_storage` VALUES (1,'{\"selectedServices\":[\"7\"]}',''),(2,'[3,5]','ss-yf1cwvpta'),(3,'[2,4]','ss-lgs6gpvbf'),(4,'[4]','ss-wm7e5cj1a'),(5,'[7]','ss-ufrx9ikgt'),(6,'[7]','ss-v3u22x8pb'),(7,'[3,5]','ss-a1kwqzv42'),(8,'[7]','ss-urq1nqocc'),(9,'[7]','ss-hq9kdoh91'),(10,'[2,4]','ss-nyi87yvju'),(11,'[2,4]','ss-j6cvh592n'),(12,'[2,4]','ss-0rx2ffm05'),(13,'[2,4]','ss-l6qx6w700');
/*!40000 ALTER TABLE `session_storage` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2024-04-08 17:26:58

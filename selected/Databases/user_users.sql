-- MySQL dump 10.13  Distrib 8.0.32, for Win64 (x86_64)
--
-- Host: localhost    Database: user
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
-- Table structure for table `users`
--

DROP TABLE IF EXISTS `users`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `users` (
  `id` bigint NOT NULL,
  `email` varchar(255) DEFAULT NULL,
  `fullname` varchar(255) DEFAULT NULL,
  `password` varchar(255) DEFAULT NULL,
  `role` varchar(255) DEFAULT NULL,
  `address` varchar(255) DEFAULT NULL,
  `zipcode` varchar(255) DEFAULT NULL,
  `contact` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `UK6dotkott2kjsp8vw4d0m25fb7` (`email`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `users`
--

LOCK TABLES `users` WRITE;
/*!40000 ALTER TABLE `users` DISABLE KEYS */;
INSERT INTO `users` VALUES (1,'akshara.namburu@gmail.com','akshara','akshara98',NULL,NULL,NULL,NULL),(102,'7yashwanth7@gmail.com','yashwanth','$2a$10$1NpGw7LsK9aavEoK8GTZN.rp6FAVyn9IqMiKuuBoZ02piN0jeni3S',NULL,NULL,NULL,NULL),(152,'suntiha@uiic.co.in','sunitha','$2a$10$T0Pi1b03EYyyy1xaZWQnNenzuh8SF3LhQs53Y5NKLVgC99yb29gUS',NULL,NULL,NULL,NULL),(202,'aadhira@gmail.com','aadhira','$2a$10$jp20psPAAZzT5jZRrLmUv.5/9UJPEgEA/azl/iaGrfe.4PIiHQUmW',NULL,NULL,NULL,NULL),(252,'sunitha@gmail.com','sunitha','$2a$10$ngLc0gsyCliycli3FdhbDeBZXp0nwrFdAT6gqDxjhDTXB13oHBp4O',NULL,NULL,NULL,NULL),(302,'yashwanth@gmail.com','Yashwanth Loganathan','$2a$10$5nI0dVHlcxDbg/rIXTUDvuECFMPaQz16wJJKhyeYiQZ2QrwZGB3xm',NULL,'680 Executive Drive','75074','9176624721'),(352,'namrata@gmail.com','namrata','$2a$10$L07xOpLX96bEJqVONPAv/OFgYrwwvzJPB/ewhCjv1zvtw0acfq7O.',NULL,'123 main street','75074','123345667'),(402,'akshara@email.com','akshara','$2a$10$hNCE7SC72IlZjp6Bwgt4EeTMtXw8t6qzr42fxA.KT8NRRBDXRDBAy',NULL,'123 main streeet','98762','9176624721'),(452,'aadhira@email.com','aadhira','$2a$10$oA0fBSgXOYE6G0IODOzI2OomMzMd345rteOSKkrMUiNoABhzg0/hK',NULL,'123 main street','75074','9884024721'),(453,'beatrice@gmail.com','Beatrice','$2a$10$w7r.qL2FXQdI5vesIZ1YSuAmOzFAde7xAjMEh.CU7DpcZyJRsB4XO',NULL,'1233 main street','75084','1234568901'),(454,'john@gmail.com','john','$2a$10$B5B.ELtOH7YwHdQNC1om1exGJbYBnQ1Mn6T4iVef6qqW7g2p6SBza',NULL,'123 main street','76085','9884024721'),(455,'namburu@gmail.com','akshara namburu','$2a$10$zNwIv6F2ahzDOUajXwryG.sH4g5fwDCOwgoc06sRAoxYiQ3/RhPnC',NULL,'123 main street','123457','9176624721'),(456,'jack@gmail.com','Jack Miller','$2a$10$ANCLT85Ij91EqI2a.OJQPeRMXCqrzC.3.88I98pWEdh6O2Jp2wEeW',NULL,'1234 Main Street','75074','9884024721'),(457,'miller@gmail.com','jack miller ','$2a$10$xZLQOsSr6CfhYCZH.1kz4OChsRrnnAy.AhsPU8cTjHSB/XAl/MOJm',NULL,'1234@main street','75074','9884024721'),(458,'sam@gmail.com','Sam','$2a$10$igMWVPJgR3b.PrhBg.ppwOp6qWdZpdVQsBw33S.dWlnGzYXJg6rYu',NULL,'123 main street','75074','9884024721');
/*!40000 ALTER TABLE `users` ENABLE KEYS */;
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

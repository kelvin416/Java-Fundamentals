-- MySQL dump 10.13  Distrib 8.0.33, for Linux (x86_64)
--
-- Host: localhost    Database: FlightManager
-- ------------------------------------------------------
-- Server version	8.0.33-0ubuntu0.22.04.2

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8mb4 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `destination`
--

DROP TABLE IF EXISTS `destination`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `destination` (
  `destination_id` int NOT NULL AUTO_INCREMENT,
  `country_name` varchar(100) NOT NULL,
  `city` varchar(100) NOT NULL,
  `airport_name` varchar(100) NOT NULL,
  PRIMARY KEY (`destination_id`)
) ENGINE=InnoDB AUTO_INCREMENT=22 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `destination`
--

LOCK TABLES `destination` WRITE;
/*!40000 ALTER TABLE `destination` DISABLE KEYS */;
INSERT INTO `destination` VALUES (1,'Kenya','Nairobi','JKIA'),(2,'Germany','Munich','Munich Airport'),(3,'Germany','Frankfurt','Frankfurt Airport'),(4,'Germany','Friedrichshafen','Bodensee-Airport Friedrichshafen'),(5,'Germany','Augsburg','Augsburg Airport'),(6,'Uganda','Entebbe','Entebbe International Airport'),(7,'UAE','Abu Dhabi','Abu Dhabi International Airport'),(8,'UAE','Dubai','Dubai International Airport'),(9,'Saudi Arabia','Jeddah','King Abdulaziz International Airport'),(10,'England','London','Heathrow International Airport'),(11,'England','London','London City Airport'),(12,'Singapore','Singapore','Changai Airport'),(13,'Singapore','Singapore','Seletar City Airport'),(14,'Malaysia','Kuala Lumpur','Kuala Lumpur International Airport'),(15,'India','Jaipur','Jaipur International Airport'),(16,'India','Chennai','Chennai International Airport'),(17,'USA','Chicago','Midway International Airport'),(18,'USA','Denver','Denver International Airport'),(19,'Netherlands','Amsterdam','Amsterdam Airport Schiphol'),(20,'Netherlands','Rotterdam','Rotterdam The Hague Airport'),(21,'Kenya','Mombasa','Moi International Airport');
/*!40000 ALTER TABLE `destination` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `flight_attendant`
--

DROP TABLE IF EXISTS `flight_attendant`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `flight_attendant` (
  `attendant_id` int NOT NULL AUTO_INCREMENT,
  `plane_id` int NOT NULL,
  `first_name` varchar(100) NOT NULL,
  `last_name` varchar(100) NOT NULL,
  `date_employed` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  PRIMARY KEY (`attendant_id`),
  KEY `attendant_plane_id_idx` (`plane_id`),
  CONSTRAINT `attendant_plane_id` FOREIGN KEY (`plane_id`) REFERENCES `plane` (`plane_id`)
) ENGINE=InnoDB AUTO_INCREMENT=75 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `flight_attendant`
--

LOCK TABLES `flight_attendant` WRITE;
/*!40000 ALTER TABLE `flight_attendant` DISABLE KEYS */;
INSERT INTO `flight_attendant` VALUES (1,1,'Abdulah','Thibadeau','2023-07-24 18:39:34'),(2,2,'Adas','Nastansky','2023-07-24 18:39:34'),(3,3,'Sumali','Fargier','2023-07-24 18:39:34'),(4,4,'Nigel','Aloisi','2023-07-24 18:39:34'),(5,5,'Khedija','Mitsuhashi','2023-07-24 18:39:34'),(6,6,'Serif','Buescher','2023-07-24 18:39:34'),(7,7,'Debatosh','Khasidashvili','2023-07-24 18:39:35'),(8,8,'Hairong','Mellouli','2023-07-24 18:39:35'),(9,9,'Florina','Eugenio','2023-07-24 18:39:35'),(10,10,'Karsten','Szmurlo','2023-07-24 18:39:35'),(11,11,'Jagoda','Braunmuhl','2023-07-24 18:39:35'),(12,12,'Miyeon','Macedo','2023-07-24 18:39:36'),(13,13,'Samphel','Siegrist','2023-07-24 18:39:36'),(14,14,'Duangkaew','Rassart','2023-07-24 18:39:36'),(15,15,'Dharmaraja','Stassinopoulos','2023-07-24 18:39:36'),(16,16,'Sampalli','Snedden','2023-07-24 18:39:36'),(17,17,'Kasturi','Jenevein','2023-07-24 18:39:37'),(18,1,'Herbert','Trachtenberg','2023-07-24 18:39:37'),(19,2,'Shigeu','Matzen','2023-07-24 18:39:37'),(20,3,'Shrikanth','Mahmud','2023-07-24 18:39:37'),(21,4,'Badri','Furudate','2023-07-24 18:39:38'),(22,5,'Aleksandar','Ananiadou','2023-07-24 18:39:38'),(23,6,'Brendon','Lenart','2023-07-24 18:39:38'),(24,7,'Pragnesh','Iisaka','2023-07-24 18:39:38'),(25,8,'Valery','Litvinov','2023-07-24 18:39:38'),(26,9,'Deniz','Duclos','2023-07-24 18:39:39'),(27,10,'Shaw','Wendorf','2023-07-24 18:39:39'),(28,11,'Sibyl','Nooteboom','2023-07-24 18:39:39'),(29,12,'Moriyoshi','Merey','2023-07-24 18:39:39'),(30,13,'Mechthild','Bonifati','2023-07-24 18:39:39'),(31,14,'Mihalis','Lowrie','2023-07-24 18:39:39'),(32,15,'Duro','Sidhu','2023-07-24 18:39:40'),(33,16,'Shigehito','Kropatsch','2023-07-24 18:39:40'),(34,17,'Tommaso','Narwekar','2023-07-24 18:39:40'),(35,1,'Christ','Muchinsky','2023-07-24 18:39:40'),(36,2,'Khalid','Erva','2023-07-24 18:39:40'),(37,3,'Arve','Fairtlough','2023-07-24 18:39:40'),(38,4,'Zdislav','Nastansky','2023-07-24 18:39:40'),(39,5,'Mohua','Falck','2023-07-24 18:39:40'),(40,6,'Masaru','Cheshire','2023-07-24 18:39:40'),(41,7,'Josyula','Hofmeyr','2023-07-24 18:39:40'),(42,8,'Annemarie','Redmiles','2023-07-24 18:39:41'),(43,9,'Marc','Hellwagner','2023-07-24 18:39:41'),(44,10,'Kasidit','Krzyzanowski','2023-07-24 18:39:41'),(45,11,'Pranav','Furedi','2023-07-24 18:39:41'),(46,12,'Kazuhisa','Ranta','2023-07-24 18:39:41'),(47,13,'Vidya','Awdeh','2023-07-24 18:39:41'),(48,14,'Idoia','Kavraki','2023-07-24 18:39:41'),(49,15,'Greger','Lichtner','2023-07-24 18:39:41'),(50,16,'Steen','Escriba','2023-07-24 18:39:41'),(51,17,'Nevio','Ritcey','2023-07-24 18:39:42'),(52,1,'Mabhin','Leijenhorst','2023-07-24 18:39:42'),(53,2,'Alassane','Iwayama','2023-07-24 18:39:42'),(54,3,'Girolamo','Anandan','2023-07-24 18:39:42'),(55,4,'Xiping','Klerer','2023-07-24 18:39:42'),(56,5,'Yolla','Ellozy','2023-07-24 18:39:42'),(57,6,'Yuping','Alpin','2023-07-24 18:39:42'),(58,7,'Vishu','Strehl','2023-07-24 18:39:42'),(59,8,'Divier','Esteva','2023-07-24 18:39:42'),(60,9,'Jackson','Kakkad','2023-07-24 18:39:42'),(61,10,'Tadahiko','Ciolek','2023-07-24 18:39:43'),(62,11,'Xiaobin','Duclos','2023-07-24 18:39:43'),(63,12,'Amstein','Ghemri','2023-07-24 18:39:43'),(64,13,'Yongmin','Roison','2023-07-24 18:39:43'),(65,14,'Zhenhua','Magalhaes','2023-07-24 18:39:43'),(66,15,'Genta','Kolvik','2023-07-24 18:39:43'),(67,16,'Kish','Fasbender','2023-07-24 18:39:43'),(68,17,'Yucai','Granlund','2023-07-24 18:39:43'),(69,1,'Tze','Nourani','2023-07-24 18:39:43'),(70,2,'Carrsten','Schmiedel','2023-07-24 18:39:43'),(71,3,'Leon','Trogemann','2023-07-24 18:39:44'),(72,4,'Kellie','Chinen','2023-07-24 18:39:44'),(73,5,'Xinglin','Plessier','2023-07-24 18:39:44'),(74,6,'Anneli','Kaiser','2023-07-24 18:39:45');
/*!40000 ALTER TABLE `flight_attendant` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `passenger`
--

DROP TABLE IF EXISTS `passenger`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `passenger` (
  `passenger_id` int NOT NULL AUTO_INCREMENT,
  `first_name` varchar(100) NOT NULL,
  `last_name` varchar(100) NOT NULL,
  `email` varchar(100) NOT NULL,
  `age` int NOT NULL,
  `date_registered` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  PRIMARY KEY (`passenger_id`)
) ENGINE=InnoDB AUTO_INCREMENT=36 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `passenger`
--

LOCK TABLES `passenger` WRITE;
/*!40000 ALTER TABLE `passenger` DISABLE KEYS */;
INSERT INTO `passenger` VALUES (1,'CAROLYN','PEREZ','CAROLYN.PEREZ@sakilacustomer.org',28,'2023-07-24 16:35:18'),(2,'CHRISTINE','ROBERTS','CHRISTINE.ROBERTS@sakilacustomer.org',29,'2023-07-24 16:35:18'),(3,'ESTHER','CRAWFORD','ESTHER.CRAWFORD@sakilacustomer.org',42,'2023-07-24 16:35:18'),(4,'FAITH','PEREZ','CAROLYN.PEREZ@sakilacustomer.org',28,'2023-07-24 16:42:38'),(5,'JENNIFER','DAVIS','JENNIFER.DAVIS@sakilacustomer.org',34,'2023-07-24 16:50:10'),(6,'LISA','ANDERSON','LISA.ANDERSON@sakilacustomer.org',40,'2023-07-24 16:50:10'),(7,'KAREN','JACKSON','KAREN.JACKSON@sakilacustomer.org',40,'2023-07-24 16:50:10'),(8,'BETTY','WHITE','BETTY.WHITE@sakilacustomer.org',40,'2023-07-24 16:50:10'),(9,'SANDRA','MARTIN','SANDRA.MARTIN@sakilacustomer.org',40,'2023-07-24 16:50:10'),(10,'CAROL','GARCIA','CAROL.GARCIA@sakilacustomer.org',40,'2023-07-24 16:50:11'),(11,'SHARON','ROBINSON','SHARON.ROBINSON@sakilacustomer.org',26,'2023-07-24 16:50:11'),(12,'SARAH','LEWIS','SARAH.LEWIS@sakilacustomer.org',26,'2023-07-24 16:50:11'),(13,'KIMBERLY','LEE','KIMBERLY.LEE@sakilacustomer.org',26,'2023-07-24 16:50:11'),(14,'JESSICA','HALL','JESSICA.HALL@sakilacustomer.org',26,'2023-07-24 16:50:12'),(15,'SHIRLEY','ALLEN','SHIRLEY.ALLEN@sakilacustomer.org',26,'2023-07-24 16:50:12'),(16,'ANGELA','HERNANDEZ','ANGELA.HERNANDEZ@sakilacustomer.org',28,'2023-07-24 16:50:12'),(17,'BRENDA','WRIGHT','BRENDA.WRIGHT@sakilacustomer.org',28,'2023-07-24 16:50:12'),(18,'ANNA','HILL','ANNA.HILL@sakilacustomer.org',28,'2023-07-24 16:50:12'),(19,'REBECCA','SCOTT','REBECCA.SCOTT@sakilacustomer.org',28,'2023-07-24 16:50:12'),(20,'VIRGINIA','GREEN','VIRGINIA.GREEN@sakilacustomer.org',28,'2023-07-24 16:50:13'),(21,'KATHLEEN','ADAMS','KATHLEEN.ADAMS@sakilacustomer.org',28,'2023-07-24 16:50:13'),(22,'AMANDA','CARTER','AMANDA.CARTER@sakilacustomer.org',26,'2023-07-27 08:07:57'),(23,'FAITH','PEREZ','CAROLYN.PEREZ@sakilacustomer.org',28,'2023-07-24 16:50:13'),(24,'CHRISTINE','ROBERTS','CHRISTINE.ROBERTS@sakilacustomer.org',29,'2023-07-24 16:50:13'),(25,'JOANNE','ROBERTSON','JOANNE.ROBERTSON@sakilacustomer.org',42,'2023-07-24 16:50:13'),(26,'DANIELLE','DANIELS','DANIELLE.DANIELS@sakilacustomer.org',19,'2023-07-24 16:50:13'),(27,'MEGAN','PALMER','MEGAN.PALMER@sakilacustomer.org',19,'2023-07-24 16:50:14'),(28,'SUZANNE','NICHOLS','SUZANNE.NICHOLS@sakilacustomer.org',19,'2023-07-24 16:50:14'),(29,'MICHELE','GRANT','MICHELE.GRANT@sakilacustomer.org',19,'2023-07-24 16:50:14'),(30,'DARLENE','ROSE','DARLENE.ROSE@sakilacustomer.org',19,'2023-07-24 16:50:14'),(31,'ERIN','DUNN','ERIN.DUNN@sakilacustomer.org',19,'2023-07-24 16:50:14'),(32,'LAUREN','HUDSON','LAUREN.HUDSON@sakilacustomer.org',22,'2023-07-24 16:50:14'),(33,'JOANN','GARDNER','JOANN.GARDNER@sakilacustomer.org',22,'2023-07-24 16:50:14'),(34,'LORRAINE','STEPHENS','LORRAINE.STEPHENS@sakilacustomer.org',22,'2023-07-24 16:50:17');
/*!40000 ALTER TABLE `passenger` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `pilot`
--

DROP TABLE IF EXISTS `pilot`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `pilot` (
  `pilot_id` int NOT NULL AUTO_INCREMENT,
  `plane_id` int NOT NULL,
  `first_name` varchar(100) NOT NULL,
  `last_name` varchar(100) NOT NULL,
  `flight_hours` int NOT NULL,
  PRIMARY KEY (`pilot_id`),
  KEY `pilot_plane_id_idx` (`plane_id`),
  CONSTRAINT `pilot_plane_id` FOREIGN KEY (`plane_id`) REFERENCES `plane` (`plane_id`)
) ENGINE=InnoDB AUTO_INCREMENT=38 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `pilot`
--

LOCK TABLES `pilot` WRITE;
/*!40000 ALTER TABLE `pilot` DISABLE KEYS */;
INSERT INTO `pilot` VALUES (1,1,'Georgi','Facello',2001),(2,2,'Bezalel','Simmel',4002),(3,3,'Parto','Bamford',1003),(4,4,'Chirstian','Koblick',100),(5,5,'Kyoichi','Maliniak',105),(6,6,'Anneke','Preusig',1006),(7,7,'Tzvetan','Zielinski',700),(8,8,'Saniya','Kalloufi',1000),(9,9,'Sumant','Peac',1000),(10,10,'Duangkaew','Piveteau',1001),(11,11,'Mary','Sluis',1001),(12,12,'Patricio','Bridgland',1001),(13,13,'Eberhardt','Terkki',1001),(14,14,'Berni','Genin',1001),(15,15,'Guoxiang','Nooteboom',1001),(16,16,'Kazuhito','Cappelletti',1001),(17,17,'Cristinel','Bouloucos',1001),(18,1,'Kazuhide','Peha',800),(19,2,'Lillian','Haddadi',800),(20,3,'Mayuko','Warwick',800),(21,4,'Ramzi','Erde',800),(22,5,'Shahaf','Famili',800),(23,6,'Bojan','Montemayor',900),(24,7,'Suzette','Pettey',900),(25,8,'Prasadram','Heyers',900),(26,9,'Yongqiao','Berztiss',900),(27,10,'Divier','Reistad',900),(28,11,'Domenick','Tempesti',500),(29,12,'Otmar','Herbst',500),(30,13,'Elvis','Demeyer',500),(31,14,'Karsten','Joslin',500),(32,15,'Jeong','Reistad',500),(33,16,'Arif','Merlo',500),(34,17,'Bader','Swan',500),(35,2,'Alain','Chappelet',600),(36,6,'Adamantios','Portugali',600),(37,9,'Pradeep','Makrucki',600);
/*!40000 ALTER TABLE `pilot` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `plane`
--

DROP TABLE IF EXISTS `plane`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `plane` (
  `plane_id` int NOT NULL AUTO_INCREMENT,
  `airline_name` varchar(100) NOT NULL,
  `plane_capacity` int NOT NULL,
  PRIMARY KEY (`plane_id`)
) ENGINE=InnoDB AUTO_INCREMENT=19 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `plane`
--

LOCK TABLES `plane` WRITE;
/*!40000 ALTER TABLE `plane` DISABLE KEYS */;
INSERT INTO `plane` VALUES (1,'Cathay Pacific',300),(2,'Ethihad Airlines',550),(3,'Qatar Airlines',700),(4,'Singapore Airways',360),(5,'British Airways',300),(6,'Virgin Atlantic',250),(7,'Lufthansia Airlines',550),(8,'KLM',400),(9,'Turkish Airlines',750),(10,'Emirates',750),(11,'Korean Air',350),(12,'Finnair',350),(13,'Air France',450),(14,'Delta Airlines',450),(15,'American Airlines',650),(16,'Air New Zealand',350),(17,'Kenya Airways',300),(18,'China Southern',500);
/*!40000 ALTER TABLE `plane` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `ticket`
--

DROP TABLE IF EXISTS `ticket`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `ticket` (
  `ticket_id` int NOT NULL AUTO_INCREMENT,
  `ticket_no` varchar(100) NOT NULL,
  `plane_id` int NOT NULL,
  `passenger_id` int NOT NULL,
  `current_country` varchar(100) NOT NULL,
  `destination` varchar(100) NOT NULL,
  `departure` date NOT NULL,
  `arrival` date NOT NULL,
  `max_weight` double NOT NULL,
  `price` double NOT NULL,
  PRIMARY KEY (`ticket_id`),
  KEY `ticket_plane_id_idx` (`plane_id`),
  KEY `ticket_passenger_id_idx` (`passenger_id`),
  CONSTRAINT `ticket_passenger_id` FOREIGN KEY (`passenger_id`) REFERENCES `passenger` (`passenger_id`),
  CONSTRAINT `ticket_plane_id` FOREIGN KEY (`plane_id`) REFERENCES `plane` (`plane_id`)
) ENGINE=InnoDB AUTO_INCREMENT=60 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `ticket`
--

LOCK TABLES `ticket` WRITE;
/*!40000 ALTER TABLE `ticket` DISABLE KEYS */;
INSERT INTO `ticket` VALUES (1,'001A',1,1,'Germany','Kenya','2023-07-25','2023-07-25',23,400),(2,'002A',1,2,'Germany','Kenya','2023-07-25','2023-07-25',23.99,499.99),(27,'003B',2,3,'Brazil','Kenya','2023-07-25','2023-07-25',23.99,499.99),(28,'0011C',11,4,'Ukrain','Germany','2023-07-25','2023-07-25',23.99,999.99),(29,'0012C',2,5,'Portugal','Germany','2023-07-25','2023-07-25',46,899.99),(30,'0013C',3,6,'Kenya','Germany','2023-07-25','2023-07-25',23.99,799.99),(31,'0014C',4,7,'Kenya','Germany','2023-07-25','2023-07-25',23.99,999.99),(32,'0015C',5,8,'Porugal','Uganda','2023-07-25','2023-07-25',23.99,499.99),(33,'0016C',6,9,'Argentina','UAE','2023-07-25','2023-07-25',23.99,499.99),(34,'0017D',7,10,'Argentina','UAE','2023-07-25','2023-07-25',23.99,450.99),(35,'0018D',8,11,'Spain','Saudi Arabia','2023-07-25','2023-07-25',23.99,450.99),(36,'0019D',9,12,'Portugal','England','2023-07-25','2023-07-25',23.99,450.99),(37,'0027D',10,13,'Sweden','England','2023-07-25','2023-07-25',23.99,450.99),(38,'0028D',11,14,'Sweden','Singapore','2023-07-25','2023-07-25',23.99,450.99),(39,'0029D',12,15,'India','Singapore','2023-07-25','2023-07-25',23.99,450.99),(40,'0030E',13,16,'India','Malaysia','2023-07-25','2023-07-25',23.99,570.99),(41,'0031E',14,17,'Indonesia','India','2023-07-25','2023-07-25',23.99,570.99),(42,'0032E',15,18,'Netherlands','India','2023-07-25','2023-07-25',23.99,570.99),(43,'0033E',16,19,'Netherlands','USA','2023-07-25','2023-07-25',23.99,570.99),(44,'0034E',17,20,'Kenya','USA','2023-07-25','2023-07-25',23.99,570.99),(45,'00114E',17,21,'Kenya','Netherlands','2023-07-25','2023-07-25',23.99,687.99),(46,'0011G',10,30,'Tanzania','UAE','2023-07-25','2023-07-25',23.99,299.99),(47,'0012G',11,31,'Uganda','Saudi Arabia','2023-07-25','2023-07-25',23.99,299.99),(48,'0013G',12,32,'Ethiopia','England','2023-07-25','2023-07-25',23.99,299.99),(49,'0014G',13,33,'Nigeria','England','2023-07-25','2023-07-25',23.99,299.99),(50,'0015B',14,34,'Brazil','Singapore','2023-07-25','2023-07-25',23.99,299.99),(51,'00122F',2,22,'USA','Netherlands','2023-07-25','2023-07-25',23.99,687.99),(52,'00132F',3,23,'USA','Kenya','2023-07-25','2023-07-25',23.99,687.99),(53,'00142F',4,24,'USA','Germany','2023-07-25','2023-07-25',23.99,687.99),(54,'00152F',5,25,'USA','Germany','2023-07-25','2023-07-25',23.99,687.99),(55,'00162F',6,26,'Canada','Germany','2023-07-25','2023-07-25',23.99,687.99),(56,'00172F',7,27,'Canada','Germany','2023-07-25','2023-07-25',23.99,687.99),(57,'00182G',8,28,'Canada','Uganda','2023-07-25','2023-07-25',23.99,499.99),(58,'00192G',9,29,'Saudi Arabia','UAE','2023-07-25','2023-07-25',23.99,200.99),(59,'022AC',15,6,'Egypt','Kenya','2023-05-23','2023-05-26',23,250);
/*!40000 ALTER TABLE `ticket` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2023-07-27 20:26:47

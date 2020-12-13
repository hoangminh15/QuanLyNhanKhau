-- MySQL dump 10.13  Distrib 8.0.22, for Linux (x86_64)
--
-- Host: localhost    Database: QuanLyNhanKhau
-- ------------------------------------------------------
-- Server version	8.0.22-0ubuntu0.20.04.3

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
-- Table structure for table `tieu_su`
--

DROP TABLE IF EXISTS `tieu_su`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `tieu_su` (
  `ID` int NOT NULL AUTO_INCREMENT,
  `idNhanKhau` int DEFAULT NULL,
  `tuNgay` date DEFAULT NULL,
  `denNgay` date DEFAULT NULL,
  `diaChi` varchar(100) CHARACTER SET utf8 COLLATE utf8_unicode_ci DEFAULT NULL,
  `ngheNghiep` varchar(100) CHARACTER SET utf8 COLLATE utf8_unicode_ci DEFAULT NULL,
  `noiLamViec` varchar(100) CHARACTER SET utf8 COLLATE utf8_unicode_ci DEFAULT NULL,
  PRIMARY KEY (`ID`),
  KEY `idNhanKhau` (`idNhanKhau`),
  CONSTRAINT `tieu_su_ibfk_1` FOREIGN KEY (`idNhanKhau`) REFERENCES `nhan_khau` (`ID`)
) ENGINE=InnoDB AUTO_INCREMENT=13 DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tieu_su`
--

LOCK TABLES `tieu_su` WRITE;
/*!40000 ALTER TABLE `tieu_su` DISABLE KEYS */;
INSERT INTO `tieu_su` VALUES (2,27,'2015-09-05','2015-09-05','Số 45, ngõ 56, Nguyễn Khang, Cầu Giấy, Hà Nội','Sinh Viên','Đại học Thương mại'),(3,28,'2012-09-05','2017-09-05','556 La Thành, Hà Nội','Sinh Viên','Đại học Bách khoa Hà Nội'),(4,29,'1989-05-10','2000-08-25','Số 5 Nguyễn Khuyến, Hà Nội','Quản lý nhận sự','Công ty BCC'),(5,30,'1987-05-23','1997-03-01','Số 3 Tạ Quang Bửu, quận Hai Bà Trưng, Hà Nội','Nhân viên văn phòng','Công ty Zezs'),(6,31,'2008-09-05','2013-09-05','Số 3 Tạ Quang Bửu, quận Hai Bà Trưng, Hà Nội','Sinh viên','Đại học Bách khoa Hà Nội'),(7,32,'2015-09-05','2019-09-05','Số 3 Tạ Quang Bửu, quận Hai Bà Trưng, Hà Nội','Sinh viên','Đại học Luật Hà Nội'),(8,33,'1998-09-05','2003-09-05','Số 66, ngõ 445 Nguyễn Khang, Cầu Giấy, Hà Nội','Sinh Vvên','Đại học Bách khoa Hà Nội'),(9,33,'2003-10-03','2018-08-06','Số 4 Tạ Quang Bửu, quận Hai Bà Trưng, Hà Nội','Giảng viên','Đại học Công ngiệp Hà Nội'),(10,34,'2003-09-05','2011-09-05','Số 8 Tôn Thất Tùng, Hà Nội','Sinh viên','Đại học Y Hà Nội'),(11,34,'2011-10-03','2015-08-09','Số 8 Tôn Thất Tùng, Hà Nội','Bác sĩ nội trú','Bệnh viện Bạch Mai'),(12,37,'1961-01-01','1963-01-01','Không rõ','Bộ đội','Hà Nội');
/*!40000 ALTER TABLE `tieu_su` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2020-12-13 11:26:06

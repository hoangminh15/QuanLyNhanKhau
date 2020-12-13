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
-- Table structure for table `gia_dinh`
--

DROP TABLE IF EXISTS `gia_dinh`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `gia_dinh` (
  `ID` int NOT NULL AUTO_INCREMENT,
  `idNhanKhau` int DEFAULT NULL,
  `hoTen` varchar(100) CHARACTER SET utf8 COLLATE utf8_unicode_ci DEFAULT NULL,
  `namSinh` date DEFAULT NULL,
  `gioiTinh` varchar(100) CHARACTER SET utf8 COLLATE utf8_unicode_ci DEFAULT NULL,
  `quanHeVoiNhanKhau` varchar(100) CHARACTER SET utf8 COLLATE utf8_unicode_ci DEFAULT NULL,
  `ngheNghiep` varchar(100) CHARACTER SET utf8 COLLATE utf8_unicode_ci DEFAULT NULL,
  `diaChiHienTai` varchar(100) CHARACTER SET utf8 COLLATE utf8_unicode_ci DEFAULT NULL,
  PRIMARY KEY (`ID`),
  KEY `idNhanKhau` (`idNhanKhau`),
  CONSTRAINT `gia_dinh_ibfk_1` FOREIGN KEY (`idNhanKhau`) REFERENCES `nhan_khau` (`ID`)
) ENGINE=InnoDB AUTO_INCREMENT=34 DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `gia_dinh`
--

LOCK TABLES `gia_dinh` WRITE;
/*!40000 ALTER TABLE `gia_dinh` DISABLE KEYS */;
INSERT INTO `gia_dinh` VALUES (2,27,'Nguyễn Minh Quân','1995-05-31','Nam','Chồng','Kỹ sư','Số 2 Tạ Quang Bửu, Hai Bà Trưng, Hà Nội'),(3,28,'Trần Thanh Duyên','1997-12-23','Nữ','Vợ','Nhân viên văn phòng','Số 2 Tạ Quang Bửu, quận Hai Bà Trưng, Hà Nội'),(4,29,'Vũ Mỹ Linh','1965-12-06','Nữ','Vợ','Nội trợ','Số 3 Tạ Quang Bửu, quận Hai Bà Trưng, Hà Nội'),(5,29,'Nguyễn Tiến Đạt','1990-09-09','Nam','Con trai','Kỹ sư điện','Số 3 Tạ Quang Bửu, quận Hai Bà Trưng, Hà Nội'),(6,29,'Nguyễn Trà My','1997-12-12','Nữ','Con gái','Luật sư','Số 3 Tạ Quang Bửu, quận Hai Bà Trưng, Hà Nội'),(7,30,'Nguyễn Tiến Dũng','1964-06-03','Nam','Chồng','Phó giám đốc','Số 3 Tạ Quang Bửu, quận Hai Bà Trưng, Hà Nội'),(8,30,'Nguyễn Tiến Đạt','1990-09-09','Nam','Con trai','Kỹ sư điện','Số 3 Tạ Quang Bửu, quận Hai Bà Trưng, Hà Nội'),(9,30,'Nguyễn Trà My','1997-12-12','Nữ','Con Gái','Luật sư',''),(10,31,'Nguyễn Tiến Dũng','1964-06-03','Nam','Bố','Phó giám đốc','Số 3 Tạ Quang Bửu, quận Hai Bà Trưng, Hà Nội'),(11,31,'Vũ Mỹ Linh','1965-12-06','Nữ','Mẹ','Nội trợ','Số 3 Tạ Quang Bửu, quận Hai Bà Trưng, Hà Nội'),(12,31,'Nguyễn Trà My','1997-12-12','Nữ','Em gái','Luật sư','Số 3 Tạ Quang Bửu, quận Hai Bà Trưng, Hà Nội'),(13,32,'Nguyễn Tiến Dũng','1964-06-03','Nam','Bố','Phó giám đốc','Số 3 Tạ Quang Bửu, quận Hai Bà Trưng, Hà Nội'),(14,32,'Vũ Mỹ Linh','1965-12-06','Nữ','Mẹ','Nội trợ','Số 3 Tạ Quang Bửu, quận Hai Bà Trưng, Hà Nội'),(15,32,'Nguyễn Tiến Đạt','1990-09-09','Nam','Anh trai','Kỹ sư điện','Số 3 Tạ Quang Bửu, quận Hai Bà Trưng, Hà Nội'),(16,33,'Nguyễn Minh Tuyết','1985-09-02','Nữ','Vợ','Bác sĩ','Số 4 Tạ Quang Bửu, quận Hai Bà Trưng, Hà Nội'),(17,33,'Trần Trung Kiên','2008-12-25','Nam','Con trai','Học sinh','Số 4 Tạ Quang Bửu, quận Hai Bà Trưng, Hà Nội'),(18,33,'Trần Thúy Ngọc','2013-01-15','Nữ','Con gái','Học sinh','Số 4 Tạ Quang Bửu, quận Hai Bà Trưng, Hà Nội'),(19,34,'Trần Trung Kiên','2008-12-25','Nam','Con trai','Học sinh','Số 4 Tạ Quang Bửu, quận Hai Bà Trưng, Hà Nội'),(20,34,'Trần Thúy Ngọc','2013-01-15','Nữ','Con gái','Học sinh','Số 4 Tạ Quang Bửu, quận Hai Bà Trưng, Hà Nội'),(21,34,'Trần Văn Nam','1980-07-09','Nam','Chồng','Giảng viên đại học','Số 4 Tạ Quang Bửu, quận Hai Bà Trưng, Hà Nội'),(22,35,'Trần Văn Nam','1980-07-09','Nam','Bố','Giảng viên đại học','Số 4 Tạ Quang Bửu, quận Hai Bà Trưng, Hà Nội'),(23,35,'Nguyễn Minh Tuyết','1985-09-02','Nữ','Mẹ','Bác sĩ','Số 4 Tạ Quang Bửu, quận Hai Bà Trưng, Hà Nội'),(24,35,'Trần Thúy Ngọc','2013-01-15','Nữ','Em gái','Học sinh','Số 4 Tạ Quang Bửu, quận Hai Bà Trưng, Hà Nội'),(25,36,'Trần Văn Nam','1980-07-09','Nam','Bố','Giảng viên đại học','Số 4 Tạ Quang Bửu, quận Hai Bà Trưng, Hà Nội'),(26,36,'Nguyễn Minh Tuyết','1985-09-02','Nữ ','Mẹ','Bác sĩ','Số 4 Tạ Quang Bửu, quận Hai Bà Trưng, Hà Nội'),(27,36,'Trần Trung Kiên','2008-12-25','Nam','Anh trai','Học sinh','Số 4 Tạ Quang Bửu, quận Hai Bà Trưng, Hà Nội'),(28,37,'Bùi Thị Hà','1948-02-03','Nữ','Vợ','Nội trợ','Số 5 Tạ Quang Bửu, quận Hai Bà Trưng, Hà Nội'),(29,37,'Lý Thành Nam','1968-06-12','Nam','Con Trai','Công nhân','Số 89, ngõ 98 Trường Chinh, Hà Nội'),(30,37,'Lý Thu Thủy','1971-03-05','Nữ','Con Gái','Nhân viên văn phòng','Số 3, ngõ 568 Đường Láng, Hà Nội'),(31,38,'Lý Văn Công','1945-06-04','Nam','Chồng','Bộ đội về hưu','Số 5 Tạ Quang Bửu, quận Hai Bà Trưng, Hà Nội'),(32,38,'Lý Thành Nam','1968-06-12','Nam','Con trai','Công nhân','Số 89, ngõ 98 Trường Chinh, Hà Nội'),(33,38,'Lý Thu Thủy','1971-03-05','Nữ','Con gái','Nhân viên văn phòng','Số 3, ngõ 568 Đường Láng, Hà Nội');
/*!40000 ALTER TABLE `gia_dinh` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2020-12-13 11:26:05

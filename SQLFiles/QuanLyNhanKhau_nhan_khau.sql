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
-- Table structure for table `nhan_khau`
--

DROP TABLE IF EXISTS `nhan_khau`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `nhan_khau` (
  `ID` int NOT NULL AUTO_INCREMENT,
  `maNhanKhau` varchar(100) CHARACTER SET utf8 COLLATE utf8_unicode_ci DEFAULT NULL,
  `hoTen` varchar(100) CHARACTER SET utf8 COLLATE utf8_unicode_ci DEFAULT NULL,
  `bietDanh` varchar(100) CHARACTER SET utf8 COLLATE utf8_unicode_ci DEFAULT NULL,
  `namSinh` date DEFAULT NULL,
  `gioiTinh` varchar(100) CHARACTER SET utf8 COLLATE utf8_unicode_ci DEFAULT NULL,
  `noiSinh` varchar(100) CHARACTER SET utf8 COLLATE utf8_unicode_ci DEFAULT NULL,
  `nguyenQuan` varchar(100) CHARACTER SET utf8 COLLATE utf8_unicode_ci DEFAULT NULL,
  `danToc` varchar(100) CHARACTER SET utf8 COLLATE utf8_unicode_ci DEFAULT NULL,
  `tonGiao` varchar(100) CHARACTER SET utf8 COLLATE utf8_unicode_ci DEFAULT NULL,
  `quocTich` varchar(100) CHARACTER SET utf8 COLLATE utf8_unicode_ci DEFAULT NULL,
  `soHoChieu` varchar(100) CHARACTER SET utf8 COLLATE utf8_unicode_ci DEFAULT NULL,
  `noiThuongTru` varchar(100) CHARACTER SET utf8 COLLATE utf8_unicode_ci DEFAULT NULL,
  `diaChiHienNay` varchar(100) CHARACTER SET utf8 COLLATE utf8_unicode_ci DEFAULT NULL,
  `trinhDoHocVan` varchar(100) CHARACTER SET utf8 COLLATE utf8_unicode_ci DEFAULT NULL,
  `TrinhDoChuyenMon` varchar(100) CHARACTER SET utf8 COLLATE utf8_unicode_ci DEFAULT NULL,
  `bietTiengDanToc` varchar(100) CHARACTER SET utf8 COLLATE utf8_unicode_ci DEFAULT NULL,
  `trinhDoNgoaiNgu` varchar(100) CHARACTER SET utf8 COLLATE utf8_unicode_ci DEFAULT NULL,
  `ngheNghiep` varchar(100) CHARACTER SET utf8 COLLATE utf8_unicode_ci DEFAULT NULL,
  `noiLamViec` varchar(100) CHARACTER SET utf8 COLLATE utf8_unicode_ci DEFAULT NULL,
  `tienAn` varchar(100) CHARACTER SET utf8 COLLATE utf8_unicode_ci DEFAULT NULL,
  `ngayChuyenDen` date DEFAULT NULL,
  `lyDoChuyenDen` varchar(100) CHARACTER SET utf8 COLLATE utf8_unicode_ci DEFAULT NULL,
  `ngayChuyenDi` date DEFAULT NULL,
  `lyDoChuyenDi` varchar(100) CHARACTER SET utf8 COLLATE utf8_unicode_ci DEFAULT NULL,
  `diaChiMoi` varchar(100) CHARACTER SET utf8 COLLATE utf8_unicode_ci DEFAULT NULL,
  `ngayTao` date DEFAULT NULL,
  `idNguoiTao` int DEFAULT NULL,
  `ngayXoa` date DEFAULT NULL,
  `idNguoiXoa` int DEFAULT NULL,
  `lyDoXoa` varchar(100) CHARACTER SET utf8 COLLATE utf8_unicode_ci DEFAULT NULL,
  `ghiChu` varchar(100) CHARACTER SET utf8 COLLATE utf8_unicode_ci DEFAULT NULL,
  PRIMARY KEY (`ID`),
  KEY `idNguoiTao` (`idNguoiTao`),
  KEY `idNguoiXoa` (`idNguoiXoa`),
  FULLTEXT KEY `hoTen` (`hoTen`,`bietDanh`),
  CONSTRAINT `nhan_khau_ibfk_1` FOREIGN KEY (`idNguoiTao`) REFERENCES `users` (`ID`),
  CONSTRAINT `nhan_khau_ibfk_2` FOREIGN KEY (`idNguoiXoa`) REFERENCES `users` (`ID`)
) ENGINE=InnoDB AUTO_INCREMENT=62 DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `nhan_khau`
--

LOCK TABLES `nhan_khau` WRITE;
/*!40000 ALTER TABLE `nhan_khau` DISABLE KEYS */;
INSERT INTO `nhan_khau` VALUES (26,NULL,'Trinh Văn An','','1990-12-07','Nam',NULL,'Hà Nội','Kinh','Không','Việt Nam','','Số 1 Tạ Quang Bưu, Hai Bà Trưng, Hà Nội','Số 1 Tạ Quang Bưu, Hai Bà Trưng, Hà Nội','12/12 chính quy','Thạc sĩ','Không','Anh trình đọ B','Giáo Viên','Trường THCS Chu Văn An',NULL,NULL,NULL,NULL,NULL,NULL,'2019-12-08',1,NULL,NULL,NULL,NULL),(27,NULL,'Trần Thanh Duyên','','1997-12-23','Nữ',NULL,'Hải Phòng','Kinh','Không','Việt Nam','','Số 3, đường Đình Đông, phường Đình Đông, quận Ngô Quyền, Hải Phòng','Số 2 Tạ Quang Bửu, quận Hai Bà Trưng, Hà Nội','12/12 chính quy','Thạc sĩ','Không','Anh trình độ D','Nhân viên văn phòng','Công ty ABC',NULL,NULL,NULL,NULL,NULL,NULL,'2019-12-08',1,NULL,NULL,NULL,NULL),(28,NULL,'Nguyễn Minh Quân','','1995-05-31','Nam',NULL,'Hà Nội','Kinh','Không','Việt Nam','','Số 2 Tạ Quang Bửu, quận Hai Bà Trưng, Hà Nội','Số 2 Tạ Quang Bửu, quận Hai Bà Trưng, Hà Nội','12/12 chính quy','Thạc sĩ','Không','Anh trình độ D','Kỹ sư','Viettel',NULL,NULL,NULL,NULL,NULL,NULL,'2019-12-08',1,NULL,NULL,NULL,NULL),(29,NULL,'Nguyễn Tiến Dũng','','1964-06-03','Nam',NULL,'Hải Dương','Kinh','Thiên chúa giáo','Việt Nam','','Số 3 Tạ Quang Bửu, quận Hai Bà Trưng, Hà Nội','Số 4 Tạ Quang Bửu, quận Hai Bà Trưng, Hà Nội','12/12 chính quy','Kỹ sư','Không','Không','Phó giám đốc','Công ty EXE',NULL,NULL,NULL,NULL,NULL,NULL,'2019-12-08',1,NULL,NULL,NULL,NULL),(30,NULL,'Vũ Mỹ Linh','','1965-12-06','Nữ',NULL,'Hà Nội','Kinh','Không','Việt Nam','','Số 3 Tạ Quang Bửu, quận Hai Bà Trưng, Hà Nội','Số 3 Tạ Quang Bửu, quận Hai Bà Trưng, Hà Nội','12/12','Cử Nhân','Không','Không','Nội trợ','Tại nhà',NULL,NULL,NULL,NULL,NULL,NULL,'2019-12-08',1,NULL,NULL,NULL,NULL),(31,NULL,'Nguyễn Tiến Đạt','','1990-09-09','Nam',NULL,'Hải Dương','Kinh','Thiên chúa giáo','Việt Nam','','Số 3 Tạ Quang Bửu, quận Hai Bà Trưng, Hà Nội','Số 3 Tạ Quang Bửu, quận Hai Bà Trưng, Hà Nội','12/12 chính quy','Kỹ sư','không','Anh trình độ C','Kỹ sư điện','Công ty điện EVN',NULL,NULL,NULL,NULL,NULL,NULL,'2019-12-08',1,NULL,NULL,NULL,NULL),(32,NULL,'Nguyễn Trà My','','1997-12-12','Nữ',NULL,'Hải Dương','Kinh','Thiên chúa giáo','Việt Nam','','Số 3 Tạ Quang Bửu, quận Hai Bà Trưng, Hà Nội','Số 3 Tạ Quang Bửu, quận Hai Bà Trưng, Hà Nội','12/12 chính quy','Thạc sĩ','không','Anh trình đố D','Luật sư','Văn phòng luật sư 123',NULL,NULL,NULL,NULL,NULL,NULL,'2019-12-08',1,NULL,NULL,NULL,NULL),(33,NULL,'Trần Văn Nam','','1980-07-09','Nam',NULL,'Hà Nội','Kinh','Không','Việt Nam','','Số 4 Tạ Quang Bửu, quận Hai Bà Trưng, Hà Nội','Số 4 Tạ Quang Bửu, quận Hai Bà Trưng, Hà Nội','12/12 chính quy','Tiến sĩ','Không','Anh trình độ D','Giảng viên đại học','Đại học Bách khoa Hà Nội',NULL,NULL,NULL,NULL,NULL,NULL,'2019-12-08',1,NULL,NULL,NULL,NULL),(34,NULL,'Nguyễn Minh Tuyết','','1985-09-02','Nữ',NULL,'Nam Định','Kinh','Không','Việt Nam','','Số 4 Tạ Quang Bửu, quận Hai Bà Trưng, Hà Nội','Số 4 Tạ Quang Bửu, quận Hai Bà Trưng, Hà Nội','12/12 chính quy','Thạc sĩ','Không','Anh trình độ D','Bác sĩ','Bệnh viện quốc tế HJK',NULL,NULL,NULL,NULL,NULL,NULL,'2019-12-08',1,NULL,NULL,NULL,NULL),(35,NULL,'Trần Trung Kiên','','2008-12-25','Nam',NULL,'Hà Nội','Kinh','Không','Việt Nam','','Số 4 Tạ Quang Bửu, quận Hai Bà Trưng, Hà Nội','Số 4 Tạ Quang Bửu, quận Hai Bà Trưng, Hà Nội','6/12 chính quy','Không','Không','Không','Học sinh','Trường THCS Chu Văn An',NULL,NULL,NULL,NULL,NULL,NULL,'2019-12-08',1,NULL,NULL,NULL,NULL),(36,NULL,'Trần Thúy Ngọc','','2013-01-15','Nữ',NULL,'Hà Nội','Kinh','Không','Việt Nam','','Số 4 Tạ Quang Bửu, quận Hai Bà Trưng, Hà Nội','Số 4 Tạ Quang Bửu, quận Hai Bà Trưng, Hà Nội','1/12 chính quy','Không','Không','Không','Học sinh','Trường tiểu học Chu Văn An',NULL,NULL,NULL,NULL,NULL,NULL,'2019-12-08',1,NULL,NULL,NULL,NULL),(37,NULL,'Lý Văn Công','','1945-06-04','Nam',NULL,'Hà Nội','Kinh','Không','Việt Nam','','Số 5 Tạ Quang Bửu, quận Hai Bà Trưng, Hà Nội','Số 5 Tạ Quang Bửu, quận Hai Bà Trưng, Hà Nội','10/12 chính quy','Không','Không','Không','Về hưu','Không',NULL,NULL,NULL,NULL,NULL,NULL,'2019-12-08',1,NULL,NULL,NULL,NULL),(38,NULL,'Bùi Thị Hà','','1948-02-03','Nữ',NULL,'Hải Phòng','Kinh','Không','Việt Nam','','Số 5 Tạ Quang Bửu, quận Hai Bà Trưng, Hà Nội','Số 5 Tạ Quang Bửu, quận Hai Bà Trưng, Hà Nội','10/12','Không','Không','Không','Nội trợ','Tại nhà',NULL,NULL,NULL,NULL,NULL,NULL,'2019-12-08',1,NULL,NULL,NULL,NULL),(39,NULL,'Minh','a','2020-12-15','Nam',NULL,'Doan Tung','a','a','a','','a','a','a','a','a','aa','a','a',NULL,NULL,NULL,NULL,NULL,NULL,'2020-12-09',1,NULL,NULL,NULL,NULL),(40,NULL,'hon','a','2020-12-02','Nam',NULL,'d','d','a','a','a','a','a','a','a','a','a','a','a',NULL,NULL,NULL,NULL,NULL,NULL,'2020-12-09',1,NULL,NULL,NULL,NULL),(43,NULL,'a','a','2020-12-02','Nam',NULL,'a','a','a','a','a','a','a','a','a','a','a','a','a',NULL,NULL,NULL,NULL,NULL,NULL,'2020-12-09',1,NULL,NULL,NULL,NULL),(44,NULL,'a','a','2020-12-03','Nam',NULL,'a','a','a','a','a','a','a','a','aa','a','a','a','a',NULL,NULL,NULL,NULL,NULL,NULL,'2020-12-09',1,NULL,NULL,NULL,NULL),(45,NULL,'a','b','2020-12-01','Nam',NULL,'a','a','b','b','b','b','b','b','b','b','b','b','b',NULL,NULL,NULL,NULL,NULL,NULL,'2020-12-09',1,NULL,NULL,NULL,NULL),(46,NULL,'b','b','2020-12-01','Nam',NULL,'a','a','b','b','b','b','b','b','b','b','b','b','b',NULL,NULL,NULL,NULL,NULL,NULL,'2020-12-09',1,NULL,NULL,NULL,NULL),(47,NULL,'b','b','2020-12-01','Nam',NULL,'a','a','b','b','b','b','b','b','b','b','b','b','b',NULL,NULL,NULL,NULL,NULL,NULL,'2020-12-09',1,NULL,NULL,NULL,NULL),(48,NULL,'a','a','2020-11-30','Nữ',NULL,'a','s','a','a','a','a','a','a','a','a','a','a','a',NULL,NULL,NULL,NULL,NULL,NULL,'2020-12-09',1,NULL,NULL,NULL,NULL),(49,NULL,'a','b','2020-12-02','Nữ',NULL,'a','a','b','b','b','a','b','b','b','b','b','bb','b',NULL,NULL,NULL,NULL,NULL,NULL,'2020-12-09',1,NULL,NULL,NULL,NULL),(50,NULL,'a','c','2020-12-01','Nam',NULL,'c','c','c','c','c','cc','c','cc','c','c','c','c','c',NULL,NULL,NULL,NULL,NULL,NULL,'2020-12-09',1,NULL,NULL,NULL,NULL),(51,NULL,'Minh','f','2020-11-30','Nữ',NULL,'d','d','d','b','cd','a','d','a','d','d','a','a','e',NULL,NULL,NULL,NULL,NULL,NULL,'2020-12-09',1,NULL,NULL,NULL,NULL),(52,NULL,'test','d','2020-11-30','Nữ',NULL,'a','a','e','f','g','a','h','b','e','a','c','a','b',NULL,NULL,NULL,NULL,NULL,NULL,'2020-12-09',1,NULL,NULL,NULL,NULL),(53,NULL,'xxx','a','2020-11-30','Nam',NULL,'a','a','a','a','a','a','a','a','a','a','a','a','a',NULL,NULL,NULL,NULL,NULL,NULL,'2020-12-09',1,NULL,NULL,NULL,NULL),(54,NULL,'testView','a','2020-12-02','Nữ',NULL,'a','a','a','a','a','a','a','a','a','a','a','a','a',NULL,NULL,NULL,NULL,NULL,NULL,'2020-12-09',1,NULL,NULL,NULL,NULL),(55,NULL,'stupidTest','a','2020-12-01','Nữ',NULL,'a','a','a','a','a','a','a','a','a','a','a','a','a',NULL,NULL,NULL,NULL,NULL,NULL,'2020-12-09',1,NULL,NULL,NULL,NULL),(56,NULL,'testLanThuN','g','2020-12-02','Nữ',NULL,'d','d','d','h','e','a','w','b','y','q','c','e','bn',NULL,NULL,NULL,NULL,NULL,NULL,'2020-12-09',1,NULL,NULL,NULL,NULL),(57,NULL,'a','d','2020-12-02','Nam',NULL,'d','d','d','d','d','a','dd','a','d','d','a','b','d',NULL,NULL,NULL,NULL,NULL,NULL,'2020-12-09',1,NULL,NULL,NULL,NULL),(58,NULL,'testN+1','a','2020-11-30','Nam',NULL,'a','a','a','a','a','a','a','a','ab','b','a','a','b',NULL,NULL,NULL,NULL,NULL,NULL,'2020-12-09',1,NULL,NULL,NULL,NULL),(59,NULL,'fuckThisTest','e','2020-11-30','Nam',NULL,'d','b','d','b','c','a','d','a','d','c','b','d','b',NULL,NULL,NULL,NULL,NULL,NULL,'2020-12-09',1,NULL,NULL,NULL,NULL),(60,NULL,'aww','a','2020-12-02','Nam',NULL,'s','d','a','aa','a','a','d','a','b','c','a','a','d',NULL,NULL,NULL,NULL,NULL,NULL,'2020-12-09',1,NULL,NULL,NULL,NULL),(61,NULL,'checkError','b','2020-12-10','Nam',NULL,'b','b','b','b','b','b','b','b','b','bb','b','b','b',NULL,NULL,NULL,NULL,NULL,NULL,'2020-12-11',1,NULL,NULL,NULL,NULL);
/*!40000 ALTER TABLE `nhan_khau` ENABLE KEYS */;
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

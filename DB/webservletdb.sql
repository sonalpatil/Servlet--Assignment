-- MySQL Administrator dump 1.4
--
-- ------------------------------------------------------
-- Server version	5.0.67-0ubuntu6


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;


--
-- Create schema Employee
--

CREATE DATABASE IF NOT EXISTS Employee;
USE Employee;

--
-- Definition of table `Employee`.`Account`
--

DROP TABLE IF EXISTS `Employee`.`Account`;
CREATE TABLE  `Employee`.`Account` (
  `First_name` varchar(50) character set utf8 NOT NULL,
  `Last_name` varchar(50) character set utf8 NOT NULL,
  `Email_id` varchar(50) character set utf8 NOT NULL,
  `User_name` varchar(50) character set utf8 NOT NULL,
  `Password` varchar(50) character set utf8 NOT NULL,
  `Re_password` varchar(50) character set utf8 NOT NULL,
  `Question` varchar(50) character set utf8 NOT NULL,
  `Answer` varchar(50) character set utf8 NOT NULL,
  `Sec_email` varchar(50) character set utf8 NOT NULL,
  `Location` varchar(50) character set utf8 NOT NULL,
  PRIMARY KEY  (`User_name`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1 COMMENT='Store all information of gmail users';

--
-- Dumping data for table `Employee`.`Account`
--

/*!40000 ALTER TABLE `Account` DISABLE KEYS */;
LOCK TABLES `Account` WRITE;
INSERT INTO `Employee`.`Account` VALUES  ('Sonal','Patil','sonal@gmail.com','sonal','ssss','ssss','First','658930','soni@yahoo.com','India'),
 ('rupeshit','patekar','null@gmail.com','r','rrr','rrr','First phone','2465454','r@gmail.com','India');
UNLOCK TABLES;
/*!40000 ALTER TABLE `Account` ENABLE KEYS */;


--
-- Definition of table `Employee`.`Emp`
--

DROP TABLE IF EXISTS `Employee`.`Emp`;
CREATE TABLE  `Employee`.`Emp` (
  `Emp_id` int(11) NOT NULL auto_increment COMMENT 'Employee unique identifier',
  `Emp_name` varchar(50) NOT NULL COMMENT 'Employee name',
  `Emp_add` varchar(50) NOT NULL COMMENT 'Employee address',
  `Emp_phno` int(11) NOT NULL COMMENT 'Employee phone number',
  `Emp_DOB` date NOT NULL COMMENT 'Employee date of birth',
  PRIMARY KEY  (`Emp_id`)
) ENGINE=MyISAM AUTO_INCREMENT=7 DEFAULT CHARSET=latin1 COMMENT='Store employee details';

--
-- Dumping data for table `Employee`.`Emp`
--

/*!40000 ALTER TABLE `Emp` DISABLE KEYS */;
LOCK TABLES `Emp` WRITE;
INSERT INTO `Employee`.`Emp` VALUES  (1,'Shahrukh','Mumbai',98457790,'1976-11-02'),
 (2,'Abhishek','Mumbai',2147483647,'1979-02-05'),
 (6,'Ajay','Mumbai',98907867,'1976-04-02'),
 (5,'Shahid','Mumbai',989094567,'1982-02-25');
UNLOCK TABLES;
/*!40000 ALTER TABLE `Emp` ENABLE KEYS */;


--
-- Definition of table `Employee`.`Google`
--

DROP TABLE IF EXISTS `Employee`.`Google`;
CREATE TABLE  `Employee`.`Google` (
  `First_name` varchar(50) default NULL,
  `Last_name` varchar(50) default NULL,
  `Email_id` varchar(50) default NULL,
  `User_name` varchar(50) NOT NULL,
  `Password` varchar(50) default NULL,
  `Re_password` varchar(50) default NULL,
  PRIMARY KEY  (`User_name`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1 COMMENT='records all information of google user ';

--
-- Dumping data for table `Employee`.`Google`
--

/*!40000 ALTER TABLE `Google` DISABLE KEYS */;
LOCK TABLES `Google` WRITE;
INSERT INTO `Employee`.`Google` VALUES  ('Sonal','Patil','patilsonal516@gmail.com','patilsonal516',NULL,'12345'),
 ('Niru','Patil','niru@gmail.com','niru',NULL,'12345'),
 ('Shahrukh','Khan','SRK@gmail.com','SRK',NULL,'12345'),
 ('Shahid','Kapoor','SHK@gmail.com','shahid',NULL,'12345'),
 ('rupeshi','patekar','rupeshit@gmail.com','rtgr','rrr','rrr'),
 ('Rahul','Dravid','rahul@gmail.com','rahul','12345','12345');
UNLOCK TABLES;
/*!40000 ALTER TABLE `Google` ENABLE KEYS */;




/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;

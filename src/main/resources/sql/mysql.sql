/*
Navicat MySQL Data Transfer

Source Server         : MySQL
Source Server Version : 50640
Source Host           : localhost:3306
Source Database       : examonlinedb

Target Server Type    : MYSQL
Target Server Version : 50640
File Encoding         : 65001

Date: 2018-11-09 17:28:42
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for student
-- ----------------------------
DROP TABLE IF EXISTS `student`;
CREATE TABLE `student` (
  `sysid` varchar(255) NOT NULL,
  `studentId` varchar(11) DEFAULT NULL,
  `password` varchar(255) DEFAULT NULL,
  `studentName` varchar(255) DEFAULT NULL,
  `result` int(11) DEFAULT NULL,
  `sclass` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`sysid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of student
-- ----------------------------
/*
Navicat MySQL Data Transfer

Source Server         : MySQL
Source Server Version : 50640
Source Host           : localhost:3306
Source Database       : examonlinedb

Target Server Type    : MYSQL
Target Server Version : 50640
File Encoding         : 65001

Date: 2018-11-09 17:29:09
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for subject
-- ----------------------------
DROP TABLE IF EXISTS `subject`;
CREATE TABLE `subject` (
  `stid` int(11) NOT NULL,
  `stTitle` varchar(255) DEFAULT NULL,
  `stOptionA` varchar(255) DEFAULT NULL,
  `stOptionB` varchar(255) DEFAULT NULL,
  `stOptionC` varchar(255) DEFAULT NULL,
  `stOptionD` varchar(255) DEFAULT NULL,
  `stAnswer` varchar(255) DEFAULT NULL,
  `stParse` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`stid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of subject
-- ----------------------------
/*
Navicat MySQL Data Transfer

Source Server         : MySQL
Source Server Version : 50640
Source Host           : localhost:3306
Source Database       : examonlinedb

Target Server Type    : MYSQL
Target Server Version : 50640
File Encoding         : 65001

Date: 2018-11-09 17:29:17
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for teacher
-- ----------------------------
DROP TABLE IF EXISTS `teacher`;
CREATE TABLE `teacher` (
  `sysid` varchar(255) NOT NULL,
  `teacherId` varchar(255) DEFAULT NULL,
  `password` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`sysid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of teacher
-- ----------------------------
/*
Navicat MySQL Data Transfer

Source Server         : MySQL
Source Server Version : 50640
Source Host           : localhost:3306
Source Database       : examonlinedb

Target Server Type    : MYSQL
Target Server Version : 50640
File Encoding         : 65001

Date: 2018-11-09 17:29:24
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for manager
-- ----------------------------
DROP TABLE IF EXISTS `manager`;
CREATE TABLE `manager` (
  `sysid` varchar(255) NOT NULL,
  `managerid` varchar(255) DEFAULT NULL,
  `managername` varchar(255) DEFAULT NULL,
  `managerpasswrod` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`sysid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of manager
-- ----------------------------

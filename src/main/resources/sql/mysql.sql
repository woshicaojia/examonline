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
INSERT INTO `student` VALUES ('3hrjk2h4kh24kjh2jkh3jk', '5', '始皇', 'shihuang1', 1, '1班');
INSERT INTO `student` VALUES ('67df6d78sa8f6sa8fs8a6f8saf', '9', '三藏', 'sanzang', 1, '2班');
INSERT INTO `student` VALUES ('6d87f7sa8f687asf678saf67sa', '8', '沙僧', 'laosha', 2, '2班');
INSERT INTO `student` VALUES ('7d89f79sa7fsa9fd89sa', '1', '张三', 'zhangsan1', 1, '1班');
INSERT INTO `student` VALUES ('7fds7f897d89f7f8d99d8', '2', '李四', 'lisi2', 1, '1班');
INSERT INTO `student` VALUES ('df7asd6f7dsa6f78sa6f87as', '10', '如来', 'fozu', 2, '3班');
INSERT INTO `student` VALUES ('f798ds7f9sa7f8asfd7s8a9fa', '4', '赵六', 'zhaoliu', 1, '1班');
INSERT INTO `student` VALUES ('f7df7sf7as67dfas7asfa', '6', '悟空', 'wukong', 1, '2班');
INSERT INTO `student` VALUES ('fd6s78f678as6f8as', '3', '王麻子', 'wanwu3', 2, '1班');
INSERT INTO `student` VALUES ('h45jk43h25kh234kj5', '7', '八戒', 'bajie', 3, '2班');
/*
Navicat MySQL Data Transfer

Source Server         : localhost_3306
Source Server Version : 50622
Source Host           : localhost:3306
Source Database       : mystore

Target Server Type    : MYSQL
Target Server Version : 50622
File Encoding         : 65001

Date: 2016-03-21 21:47:11
*/

SET FOREIGN_KEY_CHECKS=0;
-- ----------------------------
-- Table structure for `goods`
-- ----------------------------
DROP TABLE IF EXISTS `goods`;
CREATE TABLE `goods` (
  `goodsid` int(11) NOT NULL AUTO_INCREMENT,
  `goodsname` varchar(255) CHARACTER SET latin1 NOT NULL,
  `goodsdescription` text CHARACTER SET latin1 NOT NULL,
  `price` int(255) NOT NULL,
  `quality` varchar(255) CHARACTER SET latin1 NOT NULL,
  `tradingposition` varchar(255) CHARACTER SET latin1 NOT NULL,
  `contactinformation` varchar(255) CHARACTER SET latin1 NOT NULL,
  `businessdeal` varchar(255) CHARACTER SET latin1 NOT NULL,
  `createtime` datetime NOT NULL,
  `typeid` int(255) NOT NULL,
  PRIMARY KEY (`goodsid`),
  KEY `typeid` (`typeid`),
  CONSTRAINT `goods_ibfk_1` FOREIGN KEY (`typeid`) REFERENCES `type` (`typeid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of goods
-- ----------------------------

-- ----------------------------
-- Table structure for `goodsaccesslog`
-- ----------------------------
DROP TABLE IF EXISTS `goodsaccesslog`;
CREATE TABLE `goodsaccesslog` (
  `logid` int(11) NOT NULL AUTO_INCREMENT,
  `userid` int(255) NOT NULL,
  `goodsid` int(255) NOT NULL,
  `createtime` datetime NOT NULL,
  PRIMARY KEY (`logid`),
  KEY `userid` (`userid`),
  KEY `goodsid` (`goodsid`),
  CONSTRAINT `goodsaccesslog_ibfk_1` FOREIGN KEY (`userid`) REFERENCES `user` (`userid`),
  CONSTRAINT `goodsaccesslog_ibfk_2` FOREIGN KEY (`goodsid`) REFERENCES `goods` (`goodsid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of goodsaccesslog
-- ----------------------------

-- ----------------------------
-- Table structure for `goodsmessage`
-- ----------------------------
DROP TABLE IF EXISTS `goodsmessage`;
CREATE TABLE `goodsmessage` (
  `goodsmessageid` int(11) NOT NULL AUTO_INCREMENT,
  `fathermessageid` int(255) DEFAULT NULL,
  `message` varchar(255) CHARACTER SET latin1 NOT NULL,
  `createtime` datetime NOT NULL,
  `userid` int(255) NOT NULL,
  `goodsid` int(255) NOT NULL,
  PRIMARY KEY (`goodsmessageid`),
  KEY `fathermessageid` (`fathermessageid`),
  KEY `userid` (`userid`),
  KEY `goodsid` (`goodsid`),
  CONSTRAINT `goodsmessage_ibfk_1` FOREIGN KEY (`fathermessageid`) REFERENCES `goodsmessage` (`goodsmessageid`),
  CONSTRAINT `goodsmessage_ibfk_2` FOREIGN KEY (`userid`) REFERENCES `user` (`userid`),
  CONSTRAINT `goodsmessage_ibfk_3` FOREIGN KEY (`goodsid`) REFERENCES `goods` (`goodsid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of goodsmessage
-- ----------------------------

-- ----------------------------
-- Table structure for `images`
-- ----------------------------
DROP TABLE IF EXISTS `images`;
CREATE TABLE `images` (
  `imagesid` int(11) NOT NULL AUTO_INCREMENT,
  `imageurl` varchar(255) CHARACTER SET latin1 NOT NULL,
  `goodsid` int(255) NOT NULL,
  PRIMARY KEY (`imagesid`),
  KEY `goodsid` (`goodsid`),
  CONSTRAINT `images_ibfk_1` FOREIGN KEY (`goodsid`) REFERENCES `goods` (`goodsid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of images
-- ----------------------------

-- ----------------------------
-- Table structure for `loginlog`
-- ----------------------------
DROP TABLE IF EXISTS `loginlog`;
CREATE TABLE `loginlog` (
  `logid` int(11) NOT NULL AUTO_INCREMENT,
  `userid` int(255) NOT NULL,
  `ip` varchar(255) CHARACTER SET latin1 NOT NULL,
  `createtime` datetime NOT NULL,
  PRIMARY KEY (`logid`),
  KEY `userid` (`userid`),
  CONSTRAINT `loginlog_ibfk_1` FOREIGN KEY (`userid`) REFERENCES `user` (`userid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of loginlog
-- ----------------------------

-- ----------------------------
-- Table structure for `notice`
-- ----------------------------
DROP TABLE IF EXISTS `notice`;
CREATE TABLE `notice` (
  `noticeid` int(255) NOT NULL,
  `noticetitle` varchar(255) CHARACTER SET latin1 NOT NULL,
  `createtime` datetime NOT NULL,
  `content` varchar(255) CHARACTER SET latin1 NOT NULL,
  PRIMARY KEY (`noticeid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of notice
-- ----------------------------

-- ----------------------------
-- Table structure for `order`
-- ----------------------------
DROP TABLE IF EXISTS `order`;
CREATE TABLE `order` (
  `orderid` int(11) NOT NULL,
  `userid` int(255) NOT NULL,
  `goodsid` int(255) NOT NULL,
  PRIMARY KEY (`orderid`),
  KEY `userid` (`userid`),
  KEY `goodsid` (`goodsid`),
  CONSTRAINT `order_ibfk_1` FOREIGN KEY (`userid`) REFERENCES `user` (`userid`),
  CONSTRAINT `order_ibfk_2` FOREIGN KEY (`goodsid`) REFERENCES `goods` (`goodsid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of order
-- ----------------------------

-- ----------------------------
-- Table structure for `performancelog`
-- ----------------------------
DROP TABLE IF EXISTS `performancelog`;
CREATE TABLE `performancelog` (
  `logid` int(255) NOT NULL AUTO_INCREMENT,
  `functionname` varchar(255) CHARACTER SET latin1 NOT NULL,
  `createtime` datetime NOT NULL,
  `duration` int(255) NOT NULL,
  PRIMARY KEY (`logid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of performancelog
-- ----------------------------

-- ----------------------------
-- Table structure for `role`
-- ----------------------------
DROP TABLE IF EXISTS `role`;
CREATE TABLE `role` (
  `roleid` int(100) NOT NULL AUTO_INCREMENT,
  `rolename` varchar(100) CHARACTER SET latin1 NOT NULL,
  PRIMARY KEY (`roleid`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of role
-- ----------------------------
INSERT INTO `role` VALUES ('1', 'admin');
INSERT INTO `role` VALUES ('2', 'youke');

-- ----------------------------
-- Table structure for `type`
-- ----------------------------
DROP TABLE IF EXISTS `type`;
CREATE TABLE `type` (
  `typeid` int(11) NOT NULL AUTO_INCREMENT,
  `fathertypeid` int(11) DEFAULT NULL,
  `typename` varchar(255) CHARACTER SET latin1 NOT NULL,
  PRIMARY KEY (`typeid`),
  KEY `fathertypeid` (`fathertypeid`),
  CONSTRAINT `type_ibfk_1` FOREIGN KEY (`fathertypeid`) REFERENCES `type` (`typeid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of type
-- ----------------------------

-- ----------------------------
-- Table structure for `user`
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `userid` int(100) NOT NULL AUTO_INCREMENT,
  `username` varchar(100) CHARACTER SET latin1 NOT NULL,
  `password` varchar(100) CHARACTER SET latin1 NOT NULL,
  PRIMARY KEY (`userid`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of user
-- ----------------------------
INSERT INTO `user` VALUES ('1', 'aaa', 'sss');
INSERT INTO `user` VALUES ('2', 'bbb', 'ccc');
INSERT INTO `user` VALUES ('3', '??', 'password');
INSERT INTO `user` VALUES ('4', 'userName', 'password');

-- ----------------------------
-- Table structure for `user_role`
-- ----------------------------
DROP TABLE IF EXISTS `user_role`;
CREATE TABLE `user_role` (
  `userid` int(11) NOT NULL DEFAULT '0',
  `roleid` int(11) NOT NULL DEFAULT '0',
  PRIMARY KEY (`userid`,`roleid`),
  KEY `roleid` (`roleid`),
  CONSTRAINT `user_role_ibfk_1` FOREIGN KEY (`userid`) REFERENCES `user` (`userid`),
  CONSTRAINT `user_role_ibfk_2` FOREIGN KEY (`roleid`) REFERENCES `role` (`roleid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of user_role
-- ----------------------------
INSERT INTO `user_role` VALUES ('1', '1');
INSERT INTO `user_role` VALUES ('1', '2');

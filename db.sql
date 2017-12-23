CREATE DATABASE `tmcloud_mysql`
  DEFAULT CHARACTER SET utf8
  COLLATE utf8_general_ci;

USE tmcloud_mysql;

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
--  Table structure for `S_MusicAblumRelationship`
-- ----------------------------
DROP TABLE IF EXISTS `S_MusicAblumRelationship`;
CREATE TABLE `S_MusicAblumRelationship` (
  `s_aid` int(11) NOT NULL,
  `s_songid` int(11) NOT NULL,
  `update_time` timestamp NULL DEFAULT CURRENT_TIMESTAMP,
  PRIMARY KEY (`s_aid`,`s_songid`),
  KEY `FK_musicAlbumRelationship2` (`s_songid`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8;

-- ----------------------------
--  Table structure for `S_MusicCategory`
-- ----------------------------
DROP TABLE IF EXISTS `S_MusicCategory`;
CREATE TABLE `S_MusicCategory` (
  `s_songid` int(11) NOT NULL,
  `s_stid` int(11) NOT NULL,
  `update_time` timestamp NULL DEFAULT CURRENT_TIMESTAMP,
  PRIMARY KEY (`s_songid`,`s_stid`),
  KEY `FK_S_songcatagory2` (`s_stid`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8;

-- ----------------------------
--  Table structure for `S_albums`
-- ----------------------------
DROP TABLE IF EXISTS `S_albums`;
CREATE TABLE `S_albums` (
  `s_aid` int(11) NOT NULL AUTO_INCREMENT,
  `s_singerid` int(11) NOT NULL,
  `s_atitle` varchar(40) NOT NULL,
  `s_apubTime` date NOT NULL,
  `s_adescp` varchar(500) DEFAULT NULL,
  `s_avisRec` int(11) DEFAULT NULL,
  `s_aCoverUrl` varchar(200) DEFAULT NULL,
  `update_time` timestamp NULL DEFAULT CURRENT_TIMESTAMP,
  PRIMARY KEY (`s_aid`),
  KEY `FK_S_sinngerPublishAlbum` (`s_singerid`)
) ENGINE=MyISAM AUTO_INCREMENT=1001 DEFAULT CHARSET=utf8;

-- ----------------------------
--  Records of `S_albums`
-- ----------------------------
BEGIN;
INSERT INTO `S_albums` VALUES ('1', '1', 'test', '2017-11-12', null, null, null, null);
COMMIT;

-- ----------------------------
--  Table structure for `S_authority`
-- ----------------------------
DROP TABLE IF EXISTS `S_authority`;
CREATE TABLE `S_authority` (
  `s_authid` int(11) NOT NULL AUTO_INCREMENT,
  `s_auleavel` varchar(10) NOT NULL,
  `s_whodid` varchar(50) NOT NULL,
  `update_time` timestamp NULL DEFAULT CURRENT_TIMESTAMP,
  PRIMARY KEY (`s_authid`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8;

-- ----------------------------
--  Table structure for `S_listendRec`
-- ----------------------------
DROP TABLE IF EXISTS `S_listendRec`;
CREATE TABLE `S_listendRec` (
  `s_userid` int(11) NOT NULL,
  `s_songid` int(11) NOT NULL,
  `s_listendRecNum` int(11) DEFAULT NULL,
  `s_userLisetenenDate` date DEFAULT NULL,
  `update_time` timestamp NULL DEFAULT CURRENT_TIMESTAMP,
  PRIMARY KEY (`s_userid`,`s_songid`),
  KEY `FK_S_listendRec2` (`s_songid`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8;

-- ----------------------------
--  Table structure for `S_singer`
-- ----------------------------
DROP TABLE IF EXISTS `S_singer`;
CREATE TABLE `S_singer` (
  `s_singerid` int(11) NOT NULL AUTO_INCREMENT,
  `s_sname` varchar(40) NOT NULL,
  `s_sgender` int(11) NOT NULL,
  `s_singerdescp` varchar(500) DEFAULT NULL,
  `s_svisi` int(11) DEFAULT NULL,
  `s_spic` varchar(200) DEFAULT NULL,
  `update_time` timestamp NULL DEFAULT CURRENT_TIMESTAMP,
  PRIMARY KEY (`s_singerid`)
) ENGINE=MyISAM AUTO_INCREMENT=1001 DEFAULT CHARSET=utf8;

-- ----------------------------
--  Records of `S_singer`
-- ----------------------------
BEGIN;
INSERT INTO `S_singer` VALUES ('1', 'test', '1', 'test', '1', 'test', '2017-11-11 17:59:08');
COMMIT;

-- ----------------------------
--  Table structure for `S_song`
-- ----------------------------
DROP TABLE IF EXISTS `S_song`;
CREATE TABLE `S_song` (
  `s_songid` int(11) NOT NULL AUTO_INCREMENT,
  `s_singerid` int(11) NOT NULL,
  `s_title` varchar(40) NOT NULL,
  `s_surl` varchar(400) NOT NULL,
  `s_visited` int(11) DEFAULT NULL,
  `s_visitedTotal` int(11) DEFAULT NULL,
  `s_dloaded` int(11) DEFAULT NULL,
  `s_scover` varchar(400) DEFAULT NULL,
  `s_smvurl` varchar(400) DEFAULT NULL,
  `s_songdescp` varchar(500) DEFAULT NULL,
  `update_time` timestamp NULL DEFAULT CURRENT_TIMESTAMP,
  PRIMARY KEY (`s_songid`),
  KEY `FK_s_singerPublishMusic` (`s_singerid`)
) ENGINE=MyISAM AUTO_INCREMENT=1001 DEFAULT CHARSET=utf8;

-- ----------------------------
--  Records of `S_song`
-- ----------------------------
BEGIN;
INSERT INTO `S_song` VALUES ('1', '1', 'test', 'test', null, null, null, 'test', null, 'test test.', null);
COMMIT;

-- ----------------------------
--  Table structure for `S_type`
-- ----------------------------
DROP TABLE IF EXISTS `S_type`;
CREATE TABLE `S_type` (
  `s_stid` int(11) NOT NULL AUTO_INCREMENT,
  `s_sttitle` varchar(40) NOT NULL,
  `update_time` timestamp NULL DEFAULT CURRENT_TIMESTAMP,
  PRIMARY KEY (`s_stid`)
) ENGINE=MyISAM AUTO_INCREMENT=1001 DEFAULT CHARSET=utf8;

-- ----------------------------
--  Records of `S_type`
-- ----------------------------
BEGIN;
INSERT INTO `S_type` VALUES ('1', 'test', null);
COMMIT;

-- ----------------------------
--  Table structure for `S_userComment`
-- ----------------------------
DROP TABLE IF EXISTS `S_userComment`;
CREATE TABLE `S_userComment` (
  `s_userid` int(11) NOT NULL,
  `s_songid` int(11) NOT NULL,
  `s_userCommContent` varchar(200) NOT NULL,
  `s_userCommDate` date DEFAULT NULL,
  `update_time` timestamp NULL DEFAULT CURRENT_TIMESTAMP,
  PRIMARY KEY (`s_userid`,`s_songid`),
  KEY `FK_S_userComment2` (`s_songid`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8;

-- ----------------------------
--  Records of `S_userComment`
-- ----------------------------
BEGIN;
INSERT INTO `S_userComment` VALUES ('1', '1', 'test', '2017-11-13', '2017-11-13 22:42:01');
COMMIT;

-- ----------------------------
--  Table structure for `S_userFavAlbum`
-- ----------------------------
DROP TABLE IF EXISTS `S_userFavAlbum`;
CREATE TABLE `S_userFavAlbum` (
  `s_aid` int(11) NOT NULL,
  `s_userid` int(11) NOT NULL,
  `s_uFavAlbumDate` date NOT NULL,
  `update_time` timestamp NULL DEFAULT CURRENT_TIMESTAMP,
  PRIMARY KEY (`s_aid`,`s_userid`),
  KEY `FK_S_userFavAlbum2` (`s_userid`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8;

-- ----------------------------
--  Table structure for `S_userFavSong`
-- ----------------------------
DROP TABLE IF EXISTS `S_userFavSong`;
CREATE TABLE `S_userFavSong` (
  `s_songid` int(11) NOT NULL,
  `s_userid` int(11) NOT NULL,
  `s_uFavSongDate` date NOT NULL,
  `update_time` timestamp NULL DEFAULT CURRENT_TIMESTAMP,
  PRIMARY KEY (`s_songid`,`s_userid`),
  KEY `FK_S_userFavSong2` (`s_userid`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8;

-- ----------------------------
--  Table structure for `S_users`
-- ----------------------------
DROP TABLE IF EXISTS `S_users`;
CREATE TABLE `S_users` (
  `s_userid` int(11) NOT NULL AUTO_INCREMENT,
  `s_uaccount` varchar(50) NOT NULL,
  `s_upwdsalt` varchar(100) NOT NULL,
  `s_upwd` varchar(80) NOT NULL,
  `s_unickname` varchar(50) DEFAULT NULL,
  `s_uemail` varchar(50) DEFAULT NULL,
  `s_unone` varchar(10) DEFAULT NULL,
  `update_time` timestamp NULL DEFAULT CURRENT_TIMESTAMP,
  PRIMARY KEY (`s_userid`)
) ENGINE=MyISAM AUTO_INCREMENT=1006 DEFAULT CHARSET=utf8;

-- ----------------------------
--  Records of `S_users`
-- ----------------------------
BEGIN;
INSERT INTO `S_users` VALUES ('1', 'tanjian', 'tj', 'Tanjian1002', '无糖', 'tanjian20150101@163.com', null, null), ('2', 'tanjian002', 'tj', 'tjtjtj', '无糖111', null, null, '2017-10-24 21:06:47');
COMMIT;

-- ----------------------------
--  Table structure for `adminUser`
-- ----------------------------
DROP TABLE IF EXISTS `adminUser`;
CREATE TABLE `adminUser` (
  `s_adminid` int(11) NOT NULL AUTO_INCREMENT,
  `s_authid` int(11) NOT NULL,
  `s_adminaccount` varchar(60) NOT NULL,
  `s_adminPwd` varchar(50) NOT NULL,
  `s_adminLogininDate` date DEFAULT NULL,
  `update_time` timestamp NULL DEFAULT CURRENT_TIMESTAMP,
  PRIMARY KEY (`s_adminid`),
  KEY `FK_S_adminPermission` (`s_authid`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8;

SET FOREIGN_KEY_CHECKS = 1;

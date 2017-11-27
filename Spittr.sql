/*
 Navicat Premium Data Transfer

 Source Server         : Spittr-DB
 Source Server Type    : MySQL
 Source Server Version : 50719
 Source Host           : 123.207.83.185
 Source Database       : Spittr

 Target Server Type    : MySQL
 Target Server Version : 50719
 File Encoding         : utf-8

 Date: 11/27/2017 16:40:04 PM
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
--  Table structure for `S_MusicAblumRelationship`
-- ----------------------------
DROP TABLE IF EXISTS `S_MusicAblumRelationship`;
CREATE TABLE `S_MusicAblumRelationship` (
  `s_aid` varchar(50) NOT NULL,
  `s_songid` varchar(40) NOT NULL,
  `update_time` timestamp NULL DEFAULT CURRENT_TIMESTAMP,
  PRIMARY KEY (`s_aid`,`s_songid`),
  KEY `FK_musicAlbumRelationship2` (`s_songid`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8;

-- ----------------------------
--  Records of `S_MusicAblumRelationship`
-- ----------------------------
BEGIN;
INSERT INTO `S_MusicAblumRelationship` VALUES ('12422', '37263', '2017-10-16 11:42:32'), ('12422', '4662800974', '2017-10-16 11:42:32'), ('12422', 'd867fb790d4a422c9702c8d333880317', '2017-10-16 11:42:32'), ('12422', 'fd31300bc9ef4411a460a0abd0cee13a', '2017-10-16 11:42:32'), ('1682c3b9e90646cf9742a530aeace4d6', 'fce985f314db4103a4bc0338df7d42e5', '2017-10-16 11:42:32'), ('44255c70776844e8a2b3b52c1323aafb', '4bffe457967541b499eb27bcc07aa351', '2017-10-16 11:42:32'), ('591f525b45244409bd606f5ba8db06c4', '77636673', '2017-10-16 11:42:32'), ('763gd8eh33984s', '99cdfb63635045f4a10f23a79f17a0f5', '2017-10-16 11:42:32'), ('763gd8eh33984s', 'ad4901b5633b4da1bae02b51ec4e2932', '2017-10-16 11:42:32'), ('9683672576gu', '047d6034fd6447bf887144af168df62f', '2017-10-16 11:42:32'), ('9683672576gu', 'f786ae680c4448e18441316b28e4cf96', '2017-10-16 11:42:32'), ('d9269625fe0440e1b5483a745b968479', '12668f0dc68447318dd23db4f0d3eb1a', '2017-10-16 11:42:32'), ('ec9c03fa648a4103be1eaf20c9e206ef', '08bbf3366a85425d90de7aea577f3763', '2017-10-16 11:42:32'), ('ec9c03fa648a4103be1eaf20c9e206ef', '0be7bd0a01e148498f7ce2ed50446ee0', '2017-10-16 11:42:32'), ('ec9c03fa648a4103be1eaf20c9e206ef', '2143094fc23342358766d355a1a3159a', '2017-10-16 11:42:32'), ('ec9c03fa648a4103be1eaf20c9e206ef', '62fbea6ddb824f288035ec130005404e', '2017-10-16 11:42:32'), ('ec9c03fa648a4103be1eaf20c9e206ef', '66492f768d704cd0acb6552a5e6a7cf4', '2017-10-16 11:42:32'), ('ec9c03fa648a4103be1eaf20c9e206ef', '6655764168684c5fbea89256601b8271', '2017-10-16 11:42:32'), ('ec9c03fa648a4103be1eaf20c9e206ef', '75d6819ee9cf4c889a827de11d0fc032', '2017-10-16 11:42:32'), ('ec9c03fa648a4103be1eaf20c9e206ef', '967cc0c3d8514ef0bcbf5a0a4829afdb', '2017-10-16 11:42:32'), ('ec9c03fa648a4103be1eaf20c9e206ef', 'a39c9ff68d604e7784737fab75e948e2', '2017-10-16 11:42:32'), ('ec9c03fa648a4103be1eaf20c9e206ef', 'b6c2dc9c4afd4fe5a747ba58ad1f756d', '2017-10-16 11:42:32'), ('ec9c03fa648a4103be1eaf20c9e206ef', 'c51bb34200a04b16ab4684aba05f0095', '2017-10-16 11:42:32'), ('ec9c03fa648a4103be1eaf20c9e206ef', 'e4ba9967bf8d43ba949856181b31083b', '2017-10-16 11:42:32');
COMMIT;

-- ----------------------------
--  Table structure for `S_MusicCategory`
-- ----------------------------
DROP TABLE IF EXISTS `S_MusicCategory`;
CREATE TABLE `S_MusicCategory` (
  `s_songid` varchar(40) NOT NULL,
  `s_stid` varchar(50) NOT NULL,
  `update_time` timestamp NULL DEFAULT CURRENT_TIMESTAMP,
  PRIMARY KEY (`s_songid`,`s_stid`),
  KEY `FK_S_songcatagory2` (`s_stid`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8;

-- ----------------------------
--  Records of `S_MusicCategory`
-- ----------------------------
BEGIN;
INSERT INTO `S_MusicCategory` VALUES ('039394fa858b4db388e558d6ab66fce3', 'd4432c8675e04893afc236ebd1237522', '2017-10-16 11:42:42'), ('217433e9c45f4bab90014de4c3146077', '560bdd95d88f4e3983b6869e1f416d9d', '2017-10-16 11:42:42'), ('249d66372c724465a0725782596c62f5', '97bbed5b60924808beccd9aefab5410a', '2017-10-16 11:42:42'), ('2591af1810bb47f793afd3b257716c6c', 'c0661098d24b4a87bf8a40b0fbf67988', '2017-10-16 11:42:42'), ('2c6c2a24497f4652ab91fafa82dd9acf', 'b5dca04a7c4b4c0f974697a8dbc8a152', '2017-10-16 11:42:42'), ('35436940113d4f118e29ade39bc07f1d', '9222f0d3187748dd9e91af7d92ec58a3', '2017-10-16 11:42:42'), ('385557a6b97143d6927ce8e1f6539e36', '577fd355d79c4c16a2b697cde10779e0', '2017-10-16 11:42:42'), ('3fa92b16497645729b816ca909ea22d3', '00eb5715988340d5b6feca9ec2da9f76', '2017-10-16 11:42:42'), ('592d7ddb665c429e94c6e1e1d252598a', 'f09011465620494d9ff1952b68b9a09b', '2017-10-16 11:42:42'), ('6c762650e9dd408b9e3b8841a6be9c8b', '4f0ae89847c348138ef52511b13c68d5', '2017-10-16 11:42:42'), ('7bf2eaac47794e969b1b76a9278cf200', '5a7d7b6a39c246b08382aaa8f8e46139', '2017-10-16 11:42:42'), ('872ddc9b60b44be8a7ad82bd7519b143', 'b4e15e41662b41ce9a65f2968c41f0df', '2017-10-16 11:42:42'), ('89e0818951c94e8ab735044455f25593', 'e0da64d6ce7247578d4aac7c7bec35bd', '2017-10-16 11:42:42'), ('9ae702f948e54c74a6283850b7a65126', '493e3c66fb044d8782ca5fceba5860a9', '2017-10-16 11:42:42'), ('a9071abd64864f3eafa64a505e4a16aa', '9ae0680533084df7aaaa8f6d71ec088f', '2017-10-16 11:42:42'), ('acba50c711dc4195bc396b1fd9a7806f', '4f095d5d2e2541618c09907d7d8639b5', '2017-10-16 11:42:42'), ('b2e004d55fff4c489d05e521a144b1c1', '09dc8eff4a56427fba997517eaaf412b', '2017-10-16 11:42:42'), ('b6c9e2aa03004112a8cb89a2a1255f42', '203b9861996248009bc93ceb7308b2e1', '2017-10-16 11:42:42'), ('cddfe27ef7f84f768056a23bc19c5dd8', '0b1565e835134422932565c1ee264160', '2017-10-16 11:42:42'), ('d3569d97fd0245818dd864b08339f854', 'c302cecad68445afbcb45f186912efc5', '2017-10-16 11:42:42'), ('e5fc6ccb70af414584f5d7796a3bb649', '29a9da64ee714ebaa9d3fdf931d9e541', '2017-10-16 11:42:42');
COMMIT;

-- ----------------------------
--  Table structure for `S_albums`
-- ----------------------------
DROP TABLE IF EXISTS `S_albums`;
CREATE TABLE `S_albums` (
  `s_aid` varchar(50) NOT NULL,
  `s_singerid` varchar(50) NOT NULL,
  `s_atitle` varchar(40) NOT NULL,
  `s_apubTime` date NOT NULL,
  `s_adescp` varchar(500) DEFAULT NULL,
  `s_avisRec` int(11) DEFAULT NULL,
  `s_aCoverUrl` varchar(200) DEFAULT NULL,
  `update_time` timestamp NULL DEFAULT CURRENT_TIMESTAMP,
  PRIMARY KEY (`s_aid`),
  KEY `FK_S_sinngerPublishAlbum` (`s_singerid`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8;

-- ----------------------------
--  Records of `S_albums`
-- ----------------------------
BEGIN;
INSERT INTO `S_albums` VALUES ('12422', '3214', 'Battlecry', '2015-04-28', '《Battlecry》专辑由Two Steps From Hell公司制作。专辑共26首曲目。', '133', '123.207.83.185/SpittrResources/MusicLibs/albumCover/Victory.jpg', '2017-10-16 11:41:53'), ('591f525b45244409bd606f5ba8db06c4', '201629739', 'Game Of Thrones', '2016-12-31', '冰与火之歌:权力的游戏 原声带', '23', '123.207.83.185/SpittrResources/MusicLibs/albumCover/Game-of-Thrones.jpg', '2017-10-16 11:41:53'), ('9683672576gu', '201629739', 'Orion', '2013-08-27', '发行公司： Two Steps From Hell', '3', '123.207.83.185/SpittrResources/MusicLibs/albumCover/Orion.jpg', '2017-10-16 11:41:53'), ('763gd8eh33984s', '201629739', 'Vanquish', '2016-02-02', '史诗音乐厂牌Two Steps From Hell 全新专辑《Vanquish》于12月02日发布。', '43', '123.207.83.185/SpittrResources/MusicLibs/albumCover/Vanquish.jpg', '2017-10-16 11:41:53'), ('d9269625fe0440e1b5483a745b968479', '4ff2f3ab0ad645528f969816672963ce', 'Double Live Doggie Style I', '2017-01-08', '发行时间：2005-01-01 发行公司： X-Ray Dog', '43', '123.207.83.185/SpittrResources/MusicLibs/albumCover/Double-Live-Doggie-Style-I.jpg', '2017-10-16 11:41:53'), ('44255c70776844e8a2b3b52c1323aafb', '4ff2f3ab0ad645528f969816672963ce', 'X-Ray Dog', '2017-01-08', '发行时间：2004-01-01 发行公司： X-Ray Dog', '43', '123.207.83.185/SpittrResources/MusicLibs/albumCover/X-RayDog.jpg', '2017-10-16 11:41:53'), ('1682c3b9e90646cf9742a530aeace4d6', '201629739', 'Nero', '2017-01-08', '发行时间：2011-11-21 发行公司： Two Steps From Hell', '63', '123.207.83.185/SpittrResources/MusicLibs/albumCover/Nero.jpg', '2017-10-16 11:41:53'), ('ec9c03fa648a4103be1eaf20c9e206ef', '201629739', 'Legacy', '2017-01-08', '发行时间：2015-01-28 发行公司： Two Steps From Hell', '46', '123.207.83.185/SpittrResources/MusicLibs/albumCover/Legacy.jpg', '2017-10-16 11:41:53');
COMMIT;

-- ----------------------------
--  Table structure for `S_authority`
-- ----------------------------
DROP TABLE IF EXISTS `S_authority`;
CREATE TABLE `S_authority` (
  `s_authid` int(11) NOT NULL,
  `s_auleavel` varchar(10) NOT NULL,
  `s_whodid` varchar(50) NOT NULL,
  `update_time` timestamp NULL DEFAULT CURRENT_TIMESTAMP,
  PRIMARY KEY (`s_authid`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8;

-- ----------------------------
--  Records of `S_authority`
-- ----------------------------
BEGIN;
INSERT INTO `S_authority` VALUES ('1157793070', '8', 'e317252964a04d6eb0d2d58959736734', '2017-10-16 11:42:07'), ('1193959466', '8', '9103406102ee4f0cb0c26d316ad13e24', '2017-10-16 11:42:07'), ('-13', '8', '98558efdd18c4859beb32f0d21ec352d', '2017-10-16 11:42:07'), ('15', '8', '08c11ac1672249c9a883850a26072819', '2017-10-16 11:42:07'), ('8', '8', '3fb164a46da04ff89d2d4e0005ae8edb', '2017-10-16 11:42:07');
COMMIT;

-- ----------------------------
--  Table structure for `S_listendRec`
-- ----------------------------
DROP TABLE IF EXISTS `S_listendRec`;
CREATE TABLE `S_listendRec` (
  `s_userid` varchar(50) NOT NULL,
  `s_songid` varchar(40) NOT NULL,
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
  `s_singerid` varchar(50) NOT NULL,
  `s_sname` varchar(40) NOT NULL,
  `s_sgender` int(11) NOT NULL,
  `s_singerdescp` varchar(500) DEFAULT NULL,
  `s_svisi` int(11) DEFAULT NULL,
  `s_spic` varchar(200) DEFAULT NULL,
  `update_time` timestamp NULL DEFAULT CURRENT_TIMESTAMP,
  PRIMARY KEY (`s_singerid`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8;

-- ----------------------------
--  Records of `S_singer`
-- ----------------------------
BEGIN;
INSERT INTO `S_singer` VALUES ('201629739', 'Two Steps From Hell', '1', 'Two Steps from Hell / 两步逃离地狱（又名 地狱边缘、地狱咫尺、两步逃离地狱、逃陷地域）成立于2006年3月，总部设于美国加州洛杉矶，是一家专业的音乐制作公司，Two Steps from Hell (以下简称TSFH) 是由尼克·菲尼克斯和托马斯·J·柏格森共同创办，他们创作的音乐类型属于SOUND TRACK（原声配乐），而现在此公司属于HANS ZIMMER (汉斯季莫) 旗下的RC公司所拥有。', '123', '123.207.83.185/SpittrResources/Singer_CoverImg/Two-Steps-From-Hell.jpg', '2017-10-16 11:42:53'), ('4ff2f3ab0ad645528f969816672963ce', 'X-Ray Dog', '3', 'X-Ray Dog是一个专门为好莱坞电影预告配乐的音乐工作室。他们的作品几乎不针对一般消费者，网上也很少或者几乎没有他们的配乐作品下载。他们的作品对口直接输送到了数字影视后期制作公司。约六成以上的好莱坞强片的预告片配乐都出自他们名下！像是神鬼奇航系列、魔戒系列、黄金罗盘、那尼亚传奇、金刚、X-man系列、变形金刚、凡赫辛等等，只要是气势磅礴的动作片、史诗巨片几乎都是一致选用口碑甚佳的X-Ray Dog！', '23', '123.207.83.185/SpittrResources/MusicLibs/musicCover/X-Ray-Dog.jpg', '2017-10-16 11:42:53');
COMMIT;

-- ----------------------------
--  Table structure for `S_song`
-- ----------------------------
DROP TABLE IF EXISTS `S_song`;
CREATE TABLE `S_song` (
  `s_songid` varchar(40) NOT NULL,
  `s_singerid` varchar(50) NOT NULL,
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
) ENGINE=MyISAM DEFAULT CHARSET=utf8;

-- ----------------------------
--  Records of `S_song`
-- ----------------------------
BEGIN;
INSERT INTO `S_song` VALUES ('37263', '201629739', 'Victory', 'http://oolw6on5m.bkt.clouddn.com/Victory.mp3', '221', '755', '23', 'http://oolx3565r.bkt.clouddn.com/Victory.jpg', 'http://ooluf1hbr.bkt.clouddn.com/Victory.mp4', '《victory》是Two Steps From Hell (地狱咫尺)为《霍比特人3五军之战》的配乐，单曲收录《Battlecry》专辑。', '2017-10-16 12:15:27'), ('99cdfb63635045f4a10f23a79f17a0f5', '201629739', 'Fall of the Fountain World', 'http://oolw6on5m.bkt.clouddn.com/Fall-of-the-Fountain-World.mp3', '43', '43', '1', 'http://oolx3565r.bkt.clouddn.com/Vanquish.jpg', 'http://ooluf1hbr.bkt.clouddn.com/Fall-of-the-Fountain-World.mp4', '', null), ('6655764168684c5fbea89256601b8271', '201629739', 'Jump!', 'http://oolw6on5m.bkt.clouddn.com/Jump.mp3', '111', '220', '1', 'http://oolx3565r.bkt.clouddn.com/jump.jpeg', '', '', null), ('f786ae680c4448e18441316b28e4cf96', '201629739', 'Rain Of Light', 'http://oolw6on5m.bkt.clouddn.com/Rain-Of-Light.mp3', '62', '62', '1', 'http://oolx3565r.bkt.clouddn.com/Orion.jpg', '', '', null), ('047d6034fd6447bf887144af168df62f', '201629739', 'Orion', 'http://oolw6on5m.bkt.clouddn.com/Orion.mp3', '4', '4', '1', 'http://oolx3565r.bkt.clouddn.com/Orion.jpg', '', '', null), ('12668f0dc68447318dd23db4f0d3eb1a', '4ff2f3ab0ad645528f969816672963ce', 'Time Will Tell', 'http://oolw6on5m.bkt.clouddn.com/Time-Will-Tell.mp3', '80', '80', '1', 'http://oolx3565r.bkt.clouddn.com/X-RayDog.jpg', '', '', null), ('4bffe457967541b499eb27bcc07aa351', '4ff2f3ab0ad645528f969816672963ce', 'Hey Let\'s Go', 'http://oolw6on5m.bkt.clouddn.com/He-Lets-Go.mp3', '5', '5', '1', 'http://oolx3565r.bkt.clouddn.com/1654764999813134.jpeg', '', '', null), ('fce985f314db4103a4bc0338df7d42e5', '201629739', 'Strength Of A Thousand Men', 'http://oolw6on5m.bkt.clouddn.com/Strength-Of-A-Thousand-Men.mp3', '16', '16', '1', 'http://oolx3565r.bkt.clouddn.com/Nero.jpg', '', '', null), ('d867fb790d4a422c9702c8d333880317', '201629739', 'Star Sky', 'http://oolw6on5m.bkt.clouddn.com/Star-Sky.mp3', '54', '54', '1', 'http://oolx3565r.bkt.clouddn.com/Victory.jpg', '', '', null), ('fd31300bc9ef4411a460a0abd0cee13a', '201629739', 'Never Back Down', 'http://oolw6on5m.bkt.clouddn.com/Never-Back-Down.mp3', '111', '111', '1', 'http://oolx3565r.bkt.clouddn.com/Victory.jpg', 'http://ooluf1hbr.bkt.clouddn.com/Never_Back_Down.mp4', '', null), ('77636673', '201629739', 'Game of Thrones', 'http://oolw6on5m.bkt.clouddn.com/Game-of-Thrones.mp3', '196', '282', '10', 'http://oolx3565r.bkt.clouddn.com/Game-of-Thrones.jpg', 'http://ooluf1hbr.bkt.clouddn.com/8dfdaab8151680e3f6fa0dd56dcd7b05.mp4', null, null), ('ad4901b5633b4da1bae02b51ec4e2932', '201629739', 'High C\'s', 'http://oolw6on5m.bkt.clouddn.com/High-Cs.mp3', '10', '10', '1', 'http://oolx3565r.bkt.clouddn.com/X-RayDog.jpg', 'http://ooluf1hbr.bkt.clouddn.com/High-C%27s.mp4', '', null), ('47ea0927b1334b198682c09bbf79c6be', '4ff2f3ab0ad645528f969816672963ce', 'Time Will Tell', 'http://oolw6on5m.bkt.clouddn.com/Time-Will-Tell.mp3', '1', '1', '1', 'http://oolx3565r.bkt.clouddn.com/1654764999813134.jpeg', '', '', null);
COMMIT;

-- ----------------------------
--  Table structure for `S_type`
-- ----------------------------
DROP TABLE IF EXISTS `S_type`;
CREATE TABLE `S_type` (
  `s_stid` varchar(50) NOT NULL,
  `s_sttitle` varchar(40) NOT NULL,
  `update_time` timestamp NULL DEFAULT CURRENT_TIMESTAMP,
  PRIMARY KEY (`s_stid`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8;

-- ----------------------------
--  Records of `S_type`
-- ----------------------------
BEGIN;
INSERT INTO `S_type` VALUES ('2341', 'electronic music', '2017-10-16 11:43:05'), ('3213', 'Folk music', '2017-10-16 11:43:05'), ('182374', 'soft music', '2017-10-16 11:43:05');
COMMIT;

-- ----------------------------
--  Table structure for `S_userComment`
-- ----------------------------
DROP TABLE IF EXISTS `S_userComment`;
CREATE TABLE `S_userComment` (
  `s_userid` varchar(50) NOT NULL,
  `s_songid` varchar(40) NOT NULL,
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
INSERT INTO `S_userComment` VALUES ('13221', '37263', 'Junit单元测试插入值', '2017-01-01', '2017-10-16 11:43:15'), ('13221', '47193aa6518c4f1fbce3351d029e2492', 'Junit单元测试插入值', '2017-01-01', '2017-10-16 11:43:15'), ('13221', '82f354b0a4fa4d06aa65fd952552ef00', 'Junit单元测试插入值', '2017-01-01', '2017-10-16 11:43:15'), ('13221', '889040325ea8423aa5276e5d923bb6e8', 'Junit单元测试插入值', '2017-01-01', '2017-10-16 11:43:15'), ('13221', '9ff5a4cd9f2d4d5893e11d9701c27067', 'Junit单元测试插入值', '2017-01-01', '2017-10-16 11:43:15'), ('13221', '01a79f59072d43d898871a7be7123dc2', 'Junit单元测试插入值', '2017-01-01', '2017-10-16 11:43:15'), ('13221', 'aa8bfa5193ca45af968cc64f0931abb9', 'Junit单元测试插入值', '2017-01-01', '2017-10-16 11:43:15'), ('13221', 'd3ed56f4eda44af78db51db1eb8485f3', 'Junit单元测试插入值', '2017-01-01', '2017-10-16 11:43:15'), ('13221', 'a49660c29c9c4ca1a217da9a8ca66d0b', 'Junit单元测试插入值', '2017-01-01', '2017-10-16 11:43:15'), ('13221', '5d3a00e167164ffc8add5f7cbcae0581', 'Junit单元测试插入值', '2017-01-09', '2017-10-16 11:43:15'), ('13221', '141b3fd7c38545c7b356cdbedc772c2f', 'Junit单元测试插入值', '2017-01-09', '2017-10-16 11:43:15'), ('13221', 'e9ae775549d6491eb4cc0be542a92b56', 'Junit单元测试插入值', '2017-01-09', '2017-10-16 11:43:15'), ('13221', '495beafea56e435a8e0cd40d8cd3b21c', 'Junit单元测试插入值', '2017-01-12', '2017-10-16 11:43:15'), ('13221', 'e1d5bc38dbaa4ff1ba66a129eabe8fd9', 'Junit单元测试插入值', '2017-01-12', '2017-10-16 11:43:15'), ('13221', 'edc4665d64304ea786ec53a7ddacc92a', 'Junit单元测试插入值', '2017-01-12', '2017-10-16 11:43:15'), ('13221', '7c2329bd7c1e4a799927fab0e4434513', 'Junit单元测试插入值', '2017-01-12', '2017-10-16 11:43:15'), ('13221', 'da414f96815c4e0da43d3ee1ca663ea1', 'Junit单元测试插入值', '2017-01-12', '2017-10-16 11:43:15'), ('13221', '24d9796df5b742de9ec0e786fa61399d', 'Junit单元测试插入值', '2017-01-12', '2017-10-16 11:43:15'), ('13221', '00f12a3ebbdc452aa0b77e024f74bb67', 'Junit单元测试插入值', '2017-01-12', '2017-10-16 11:43:15'), ('13221', 'beb512b799074b439390a1cec8d45c77', 'Junit单元测试插入值', '2017-01-12', '2017-10-16 11:43:15'), ('13221', '5083227d27d042fba769d9c0c1ecb159', 'Junit单元测试插入值', '2017-01-12', '2017-10-16 11:43:15'), ('13221', '79979d8c9c484cf4ab77648ef68fd628', 'Junit单元测试插入值', '2017-01-12', '2017-10-16 11:43:15'), ('13221', 'd670119637b5417ea14f49733900e409', 'Junit单元测试插入值', '2017-01-12', '2017-10-16 11:43:15');
COMMIT;

-- ----------------------------
--  Table structure for `S_userFavAlbum`
-- ----------------------------
DROP TABLE IF EXISTS `S_userFavAlbum`;
CREATE TABLE `S_userFavAlbum` (
  `s_aid` varchar(50) NOT NULL,
  `s_userid` varchar(50) NOT NULL,
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
  `s_songid` varchar(40) NOT NULL,
  `s_userid` varchar(50) NOT NULL,
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
  `s_userid` varchar(50) NOT NULL,
  `s_uaccount` varchar(50) NOT NULL,
  `s_upwdsalt` varchar(100) NOT NULL,
  `s_upwd` varchar(80) NOT NULL,
  `s_unickname` varchar(50) DEFAULT NULL,
  `s_uemail` varchar(50) DEFAULT NULL,
  `s_unone` varchar(10) DEFAULT NULL,
  `update_time` timestamp NULL DEFAULT CURRENT_TIMESTAMP,
  PRIMARY KEY (`s_userid`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8;

-- ----------------------------
--  Records of `S_users`
-- ----------------------------
BEGIN;
INSERT INTO `S_users` VALUES ('a81318bebd16447db8fb479245f011b1', 'tanjian', 'tanjian', 'fe7ed0503509d1a190aadb3b7fb9fbf26c201bb49e123e3e3be3d0ab35be62f8', '谭建', '', '', '2017-10-16 11:43:46');
COMMIT;

-- ----------------------------
--  Table structure for `adminUser`
-- ----------------------------
DROP TABLE IF EXISTS `adminUser`;
CREATE TABLE `adminUser` (
  `s_adminid` varchar(50) NOT NULL,
  `s_authid` int(11) NOT NULL,
  `s_adminaccount` varchar(60) NOT NULL,
  `s_adminPwd` varchar(50) NOT NULL,
  `s_adminLogininDate` date DEFAULT NULL,
  `update_time` timestamp NULL DEFAULT CURRENT_TIMESTAMP,
  PRIMARY KEY (`s_adminid`),
  KEY `FK_S_adminPermission` (`s_authid`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8;

-- ----------------------------
--  Records of `adminUser`
-- ----------------------------
BEGIN;
INSERT INTO `adminUser` VALUES ('20161231', '10', 'admin', 'admin', '2016-12-31', '2017-10-16 11:41:36');
COMMIT;

SET FOREIGN_KEY_CHECKS = 1;

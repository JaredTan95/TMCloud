/*
 Navicat Premium Data Transfer

 Source Server         : local
 Source Server Type    : MySQL
 Source Server Version : 50719
 Source Host           : localhost
 Source Database       : TMCloud

 Target Server Type    : MySQL
 Target Server Version : 50719
 File Encoding         : utf-8

 Date: 12/23/2017 14:46:06 PM
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
--  Table structure for `song`
-- ----------------------------
DROP TABLE IF EXISTS `singer`;
CREATE TABLE `singer` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '歌手id',
  `singer_name` varchar(200) NOT NULL COMMENT '歌手名称',
  `gender` int(1) DEFAULT '0' NOT NULL COMMENT '歌手性别',
  `visited_total` int(11) DEFAULT NULL COMMENT '访问量',
  `picture` varchar(400) NOT NULL COMMENT '歌手封面',
  `description` varchar(500) DEFAULT NULL COMMENT '歌手描述',
  `update_time` timestamp NULL DEFAULT CURRENT_TIMESTAMP not null on update CURRENT_TIMESTAMP COMMENT '更新时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

SET FOREIGN_KEY_CHECKS = 1;

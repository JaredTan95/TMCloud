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
DROP TABLE IF EXISTS `song`;
CREATE TABLE `song` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '歌曲id',
  `singer_id` int(11) NOT NULL COMMENT '歌手id',
  `title` varchar(200) NOT NULL COMMENT '歌曲名称',
  `url` varchar(400) NOT NULL COMMENT '歌曲url',
  `visited_total` int(11) DEFAULT NULL COMMENT '访问量',
  `fav_num` int(11) DEFAULT NULL COMMENT '收藏量',
  `dloaded` int(11) DEFAULT NULL COMMENT '下载量',
  `cover` varchar(400) NOT NULL COMMENT '歌曲封面',
  `mv_url` varchar(400) DEFAULT NULL COMMENT 'mvurl',
  `description` varchar(500) DEFAULT NULL COMMENT '歌曲描述',
  `is_deleted` int(1) default '0' null,
  `update_time` timestamp NULL DEFAULT CURRENT_TIMESTAMP not null on update CURRENT_TIMESTAMP COMMENT '更新时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

SET FOREIGN_KEY_CHECKS = 1;

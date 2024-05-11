/*
 Navicat Premium Data Transfer

 Source Server         : localhost
 Source Server Type    : MySQL
 Source Server Version : 50741
 Source Host           : localhost:3306
 Source Schema         : mybatis

 Target Server Type    : MySQL
 Target Server Version : 50741
 File Encoding         : 65001

 Date: 07/12/2023 08:38:38
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for monster
-- ----------------------------
DROP TABLE IF EXISTS `monster`;
CREATE TABLE `monster`  (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `age` int(11) NOT NULL,
  `birthday` date NULL DEFAULT NULL,
  `email` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `gender` tinyint(4) NOT NULL,
  `name` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `salary` double NOT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 8 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of monster
-- ----------------------------
INSERT INTO `monster` VALUES (3, 18, '2023-09-08', 'a@qq.com', 1, 'zk', 1000);
INSERT INTO `monster` VALUES (4, 3333, '2023-09-17', 'a@qq.com', 1, 'zk', 1000);
INSERT INTO `monster` VALUES (5, 11, '2023-09-07', 'a@qq.com', 1, 'zk', 1000);
INSERT INTO `monster` VALUES (6, 999, '2023-09-18', 'a@qq.com', 1, 'zk999', 1000);
INSERT INTO `monster` VALUES (7, 999, '2023-09-18', 'a@qq.com', 1, 'zk999', 1000);

SET FOREIGN_KEY_CHECKS = 1;

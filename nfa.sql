/*
Navicat MySQL Data Transfer

Source Server         : cqmysql
Source Server Version : 80022
Source Host           : localhost:3306
Source Database       : nfa

Target Server Type    : MYSQL
Target Server Version : 80022
File Encoding         : 65001

Date: 2021-06-02 08:23:43
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for element
-- ----------------------------
DROP TABLE IF EXISTS `element`;
CREATE TABLE `element` (
  `element_id` smallint NOT NULL,
  `class_id` char(1) DEFAULT NULL,
  `name` char(1) DEFAULT NULL,
  `remark` varchar(32) DEFAULT NULL,
  PRIMARY KEY (`element_id`),
  CONSTRAINT `element_chk_1` CHECK ((`class_id` in (_utf8mb4'c',_utf8mb4'v')))
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- ----------------------------
-- Records of element
-- ----------------------------
INSERT INTO `element` VALUES ('0', 'c', '0', '目标语言字符');
INSERT INTO `element` VALUES ('1', 'c', '1', '目标语言字符');
INSERT INTO `element` VALUES ('2', 'c', '2', '目标语言字符');
INSERT INTO `element` VALUES ('3', 'c', '3', '目标语言字符');
INSERT INTO `element` VALUES ('4', 'c', '4', '目标语言字符');
INSERT INTO `element` VALUES ('5', 'c', '5', '目标语言字符');
INSERT INTO `element` VALUES ('6', 'c', '6', '目标语言字符');
INSERT INTO `element` VALUES ('7', 'c', '7', '目标语言字符');
INSERT INTO `element` VALUES ('8', 'c', '8', '目标语言字符');
INSERT INTO `element` VALUES ('9', 'c', '9', '目标语言字符');
INSERT INTO `element` VALUES ('10', 'c', 'a', '目标语言字符');
INSERT INTO `element` VALUES ('11', 'c', 'b', '目标语言字符');
INSERT INTO `element` VALUES ('12', 'c', 'c', '目标语言字符');
INSERT INTO `element` VALUES ('13', 'c', 'd', '目标语言字符');
INSERT INTO `element` VALUES ('14', 'c', 'e', '目标语言字符');
INSERT INTO `element` VALUES ('15', 'c', 'f', '目标语言字符');
INSERT INTO `element` VALUES ('16', 'c', 'g', '目标语言字符');
INSERT INTO `element` VALUES ('17', 'c', 'h', '目标语言字符');
INSERT INTO `element` VALUES ('18', 'c', 'i', '目标语言字符');
INSERT INTO `element` VALUES ('19', 'c', 'j', '目标语言字符');
INSERT INTO `element` VALUES ('20', 'c', 'k', '目标语言字符');
INSERT INTO `element` VALUES ('21', 'c', 'l', '目标语言字符');
INSERT INTO `element` VALUES ('22', 'c', 'm', '目标语言字符');
INSERT INTO `element` VALUES ('23', 'c', 'n', '目标语言字符');
INSERT INTO `element` VALUES ('24', 'c', 'o', '目标语言字符');
INSERT INTO `element` VALUES ('25', 'c', 'p', '目标语言字符');
INSERT INTO `element` VALUES ('26', 'c', 'q', '目标语言字符');
INSERT INTO `element` VALUES ('27', 'c', 'r', '目标语言字符');
INSERT INTO `element` VALUES ('28', 'c', 's', '目标语言字符');
INSERT INTO `element` VALUES ('29', 'c', 't', '目标语言字符');
INSERT INTO `element` VALUES ('30', 'c', 'u', '目标语言字符');
INSERT INTO `element` VALUES ('31', 'c', 'v', '目标语言字符');
INSERT INTO `element` VALUES ('32', 'c', 'w', '目标语言字符');
INSERT INTO `element` VALUES ('33', 'c', 'x', '目标语言字符');
INSERT INTO `element` VALUES ('34', 'c', 'y', '目标语言字符');
INSERT INTO `element` VALUES ('35', 'c', 'z', '目标语言字符');
INSERT INTO `element` VALUES ('36', 'c', 'A', '目标语言字符');
INSERT INTO `element` VALUES ('37', 'c', 'B', '目标语言字符');
INSERT INTO `element` VALUES ('38', 'c', 'C', '目标语言字符');
INSERT INTO `element` VALUES ('39', 'c', 'D', '目标语言字符');
INSERT INTO `element` VALUES ('40', 'c', 'E', '目标语言字符');
INSERT INTO `element` VALUES ('41', 'c', 'F', '目标语言字符');
INSERT INTO `element` VALUES ('42', 'c', 'G', '目标语言字符');
INSERT INTO `element` VALUES ('43', 'c', 'H', '目标语言字符');
INSERT INTO `element` VALUES ('44', 'c', 'I', '目标语言字符');
INSERT INTO `element` VALUES ('45', 'c', 'J', '目标语言字符');
INSERT INTO `element` VALUES ('46', 'c', 'K', '目标语言字符');
INSERT INTO `element` VALUES ('47', 'c', 'L', '目标语言字符');
INSERT INTO `element` VALUES ('48', 'c', 'M', '目标语言字符');
INSERT INTO `element` VALUES ('49', 'c', 'N', '目标语言字符');
INSERT INTO `element` VALUES ('50', 'c', 'O', '目标语言字符');
INSERT INTO `element` VALUES ('51', 'c', 'P', '目标语言字符');
INSERT INTO `element` VALUES ('52', 'c', 'Q', '目标语言字符');
INSERT INTO `element` VALUES ('53', 'c', 'R', '目标语言字符');
INSERT INTO `element` VALUES ('54', 'c', 'S', '目标语言字符');
INSERT INTO `element` VALUES ('55', 'c', 'T', '目标语言字符');
INSERT INTO `element` VALUES ('56', 'c', 'U', '目标语言字符');
INSERT INTO `element` VALUES ('57', 'c', 'V', '目标语言字符');
INSERT INTO `element` VALUES ('58', 'c', 'W', '目标语言字符');
INSERT INTO `element` VALUES ('59', 'c', 'X', '目标语言字符');
INSERT INTO `element` VALUES ('60', 'c', 'Y', '目标语言字符');
INSERT INTO `element` VALUES ('61', 'c', 'Z', '目标语言字符');
INSERT INTO `element` VALUES ('62', 'v', 'n', '整数常量');
INSERT INTO `element` VALUES ('63', 'v', 'i', '变量');
INSERT INTO `element` VALUES ('64', 'v', 'k', '保留字');

-- ----------------------------
-- Table structure for graph_edge
-- ----------------------------
DROP TABLE IF EXISTS `graph_edge`;
CREATE TABLE `graph_edge` (
  `graph_id` smallint NOT NULL,
  `state` smallint NOT NULL,
  `driver_char_element_id` smallint NOT NULL,
  `next_state` smallint NOT NULL,
  PRIMARY KEY (`graph_id`,`state`,`driver_char_element_id`,`next_state`),
  CONSTRAINT `graph_edge_ibfk_1` FOREIGN KEY (`graph_id`) REFERENCES `state_transition_graph` (`graph_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- ----------------------------
-- Records of graph_edge
-- ----------------------------

-- ----------------------------
-- Table structure for lrtable
-- ----------------------------
DROP TABLE IF EXISTS `lrtable`;
CREATE TABLE `lrtable` (
  `state` int NOT NULL DEFAULT '0',
  `opt` varchar(255) NOT NULL,
  `actionType` char(255) DEFAULT NULL,
  `actionID` int DEFAULT NULL,
  `GotoID` int DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- ----------------------------
-- Records of lrtable
-- ----------------------------
INSERT INTO `lrtable` VALUES ('0', 'id', 's', '3', null);

-- ----------------------------
-- Table structure for regular_expression
-- ----------------------------
DROP TABLE IF EXISTS `regular_expression`;
CREATE TABLE `regular_expression` (
  `head_element_id` smallint NOT NULL,
  `expression` varchar(64) DEFAULT NULL,
  `lexcial_class` char(1) DEFAULT NULL,
  `remark` varchar(32) DEFAULT NULL,
  PRIMARY KEY (`head_element_id`),
  CONSTRAINT `regular_expression_chk_1` CHECK ((`lexcial_class` in (_utf8mb4'i',_utf8mb4'n',_utf8mb4'r')))
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- ----------------------------
-- Records of regular_expression
-- ----------------------------

-- ----------------------------
-- Table structure for state_transition_graph
-- ----------------------------
DROP TABLE IF EXISTS `state_transition_graph`;
CREATE TABLE `state_transition_graph` (
  `graph_id` smallint NOT NULL,
  `start_state` smallint DEFAULT NULL,
  `end_state` smallint DEFAULT NULL,
  `end_state_type` char(1) DEFAULT NULL,
  `end_state_class` char(1) DEFAULT NULL,
  PRIMARY KEY (`graph_id`),
  CONSTRAINT `state_transition_graph_chk_1` CHECK ((`end_state_type` in (_utf8mb4'E',_utf8mb4'I'))),
  CONSTRAINT `state_transition_graph_chk_2` CHECK ((`end_state_class` in (_utf8mb4'i',_utf8mb4'n',_utf8mb4'r')))
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- ----------------------------
-- Records of state_transition_graph
-- ----------------------------

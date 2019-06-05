SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `articles`
-- ----------------------------
DROP TABLE IF EXISTS `articles`;
CREATE TABLE `articles` (
  `id` varchar(32) NOT NULL DEFAULT 'abc' COMMENT '主键id',
  `title` varchar(32) DEFAULT NULL COMMENT '文章标题',
  `content` text DEFAULT NULL COMMENT '文章内容',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=28 DEFAULT CHARSET=utf8;

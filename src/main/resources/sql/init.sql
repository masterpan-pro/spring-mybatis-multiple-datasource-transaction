CREATE TABLE `user` (
  `id` bigint(15) NOT NULL AUTO_INCREMENT COMMENT 'id',
  `user_name` varchar(50) NOT NULL DEFAULT '' COMMENT 'userName',
  `password` varchar(50) NOT NULL DEFAULT '' COMMENT 'password',
  `birthday` datetime NOT NULL DEFAULT '1000-01-01 00:00:00' COMMENT 'birthday',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=22 DEFAULT CHARSET=utf8mb4 COMMENT='user';

CREATE TABLE `t_dict_sensitive_words` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '关键字ID',
  `word` varchar(50) DEFAULT NULL COMMENT '关键字',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8 COMMENT='敏感词库信息表';

CREATE TABLE `user` (
   `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '用户id',
   `username` varchar(50) DEFAULT NULL,
   `password` varchar(50) DEFAULT NULL COMMENT '密码',
   `email` varchar(50) DEFAULT NULL COMMENT '邮箱',
   `phoneno` varchar(50) DEFAULT NULL COMMENT '手机号',
   `sex` char(2)  DEFAULT NULL COMMENT '性别',
   `salt` varchar(50) DEFAULT NULL COMMENT '密码盐值',
   `cretetime` date DEFAULT NULL COMMENT '创建时间',
   `lastloginDate` date DEFAULT NULL COMMENT '上次登录时间',
   `lastloginIP` varchar(50)  DEFAULT NULL COMMENT '上次登录IP',
   `lastlogineMac` varchar(50)  DEFAULT NULL COMMENT '上次登录设备号MAC',
   PRIMARY KEY (`id`)
 ) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='用户表'
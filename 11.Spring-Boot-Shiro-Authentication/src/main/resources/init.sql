-- ----------------------------
-- Table structure for T_USER
-- ----------------------------
CREATE TABLE T_USER (
   ID integer primary key NOT NULL ,
   USERNAME VARCHAR(20) NOT NULL comment '用户名',
   PASSWD VARCHAR(128) NOT NULL comment '密码',
   CREATE_TIME DATE NULL comment '创建时间',
   STATUS CHAR(1) NOT NULL comment '是否有效 1：有效  0：锁定'
);

-- ----------------------------
-- Records of T_USER
-- ----------------------------
INSERT INTO T_USER VALUES ('2', 'test', '7a38c13ec5e9310aed731de58bbc4214', str_to_date('2017-11-19 17:20:21', 'YYYY-MM-DD HH:MM:SS'), '0');
INSERT INTO T_USER VALUES ('1', 'mrbird', '42ee25d1e43e9f57119a00d0a39e5250', str_to_date('2017-11-19 10:52:48', 'YYYY-MM-DD HH:MM:SS'), '1');

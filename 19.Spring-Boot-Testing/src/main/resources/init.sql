-- ----------------------------
-- Table structure for T_USER
-- ----------------------------
CREATE TABLE T_USER (
   ID INT NOT NULL ,
   USERNAME VARCHAR(20) NOT NULL COMMENT '用户名',
   PASSWD VARCHAR(128) NOT NULL COMMENT '密码',
   CREATE_TIME DATE NULL COMMENT '创建时间',
   STATUS CHAR(1) NOT NULL COMMENT '是否有效 1：有效  0：锁定'
);
-- ----------------------------
-- Records of T_USER
-- ----------------------------
INSERT INTO T_USER VALUES ('2', 'tester', '243e29429b340192700677d48c09d992', str_to_date('2017-12-11 17:20:21', 'YYYY-MM-DD HH24:MI:SS'), '1');
INSERT INTO T_USER VALUES ('1', 'mrbird', '42ee25d1e43e9f57119a00d0a39e5250', str_to_date('2017-12-11 10:52:48', 'YYYY-MM-DD HH24:MI:SS'), '1');

# create sequence seq_user start with 1 INCREMENT by 1;
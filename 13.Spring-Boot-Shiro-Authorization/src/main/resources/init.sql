-- ----------------------------
-- Table structure for T_PERMISSION
-- ----------------------------
CREATE TABLE if not exists T_PERMISSION (
   ID INTEGER NOT NULL,
   URL VARCHAR(256) NULL comment 'url地址',
   NAME VARCHAR(64) NULL comment 'url描述'
);

-- ----------------------------
-- Records of T_PERMISSION
-- ----------------------------
INSERT INTO T_PERMISSION VALUES ('1', '/user', 'user:user');
INSERT INTO T_PERMISSION VALUES ('2', '/user/add', 'user:add');
INSERT INTO T_PERMISSION VALUES ('3', '/user/delete', 'user:delete');
-- ----------------------------
-- Table structure for T_ROLE
-- ----------------------------
CREATE TABLE if not exists T_ROLE (
   ID INTEGER NOT NULL ,
   NAME VARCHAR(32) NULL comment '角色名称',
   MEMO VARCHAR(32) NULL comment '角色描述'
);
-- ----------------------------
-- Records of T_ROLE
-- ----------------------------
INSERT INTO T_ROLE VALUES ('1', 'admin', '超级管理员');
INSERT INTO T_ROLE VALUES ('2', 'test', '测试账户');
-- ----------------------------
-- Table structure for T_ROLE_PERMISSION
-- ----------------------------
CREATE TABLE if not exists T_ROLE_PERMISSION (
   RID INTEGER NULL comment '角色id',
   PID INTEGER NULL comment '权限id'
);
-- ----------------------------
-- Records of T_ROLE_PERMISSION
-- ----------------------------
INSERT INTO T_ROLE_PERMISSION VALUES ('1', '2');
INSERT INTO T_ROLE_PERMISSION VALUES ('1', '3');
INSERT INTO T_ROLE_PERMISSION VALUES ('2', '1');
INSERT INTO T_ROLE_PERMISSION VALUES ('1', '1');
-- ----------------------------
-- Table structure for T_USER
-- ----------------------------
CREATE TABLE if not exists T_USER (
   ID INTEGER NOT NULL ,
   USERNAME VARCHAR(20) NOT NULL comment '用户名',
   PASSWD VARCHAR(128) NOT NULL comment '密码',
   CREATE_TIME DATE NULL comment '创建时间',
   STATUS CHAR(1) NOT NULL comment '是否有效 1：有效  0：锁定'
);
-- ----------------------------
-- Records of T_USER
-- ----------------------------
delete from T_USER WHERE ID = 2;
INSERT INTO T_USER VALUES ('2', 'tester', '243e29429b340192700677d48c09d992', str_to_date('2017-12-11 17:20:21', '%Y-%m-%d %H:%i:%s'), '1');

delete from T_USER WHERE ID = 1;
INSERT INTO T_USER VALUES ('1', 'mrbird', '42ee25d1e43e9f57119a00d0a39e5250', str_to_date('2017-12-11 10:52:48', '%Y-%m-%d %H:%i:%s'), '1');
# if not exists(select id from T_USER where id=2) then
# end if;
-- ----------------------------
-- Table structure for T_USER_ROLE
-- ----------------------------
CREATE TABLE if not exists T_USER_ROLE (
   USER_ID INTEGER(10) NULL comment '用户id',
   RID INTEGER(10) NULL comment '用户id'
);
-- ----------------------------
-- Records of T_USER_ROLE
-- ----------------------------
INSERT INTO T_USER_ROLE VALUES ('1', '1');
INSERT INTO T_USER_ROLE VALUES ('2', '2');
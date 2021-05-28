CREATE DATABASE `mybatisplus`;

DROP TABLE IF EXISTS `tbl_employee`;

CREATE TABLE `tbl_employee` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `last_name` varchar(255) DEFAULT NULL,
  `email` varchar(255) DEFAULT NULL,
  `gender` char(1) DEFAULT NULL,
  `age` int(11) DEFAULT NULL,
  `gmt_create` datetime NOT NULL,
  `gmt_modified` datetime NOT NULL,
  `is_deleted` tinyint(4) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=20
;
-- insert  into `tbl_employee`(`id`,`last_name`,`email`,`gender`,`age`) values (1,'jack','jack@qq.com','1',35),(2,'tom','tom@qq.com','1',30),(3,'jerry','jerry@qq.com','1',40);

-- alter table tbl_employee add column gmt_create datetime not null;
-- alter table tbl_employee add column gmt_modified datetime not null;
-- alter table tbl_employee add column is_deleted tinyint not null;

DROP TABLE IF EXISTS `shop`;
create table shop(
 id bigint(20) not null auto_increment,
  name varchar(30) not null,
  price int(11) default 0,
  version int(11) default 1,
  primary key(id)
);

insert into shop(id,name,price) values(1,'笔记本电脑',8000);

DROP TABLE IF EXISTS `student`;
create table student(
 id bigint(20) not null auto_increment,
  name varchar(30) not null,
  studentClassId bigint(20) default null,
  primary key(id)
);

DROP TABLE IF EXISTS `student_class`;
create table student_class(
 id bigint(20) not null auto_increment,
  class_name varchar(30) not null,
  primary key(id)
);

INSERT INTO `student_class` (`id`, `class_name`) VALUES ('1', '1');

DROP TABLE IF EXISTS `user_group`;
create table user_group(
 id bigint(20) not null auto_increment,
  groupName varchar(30) not null,
  primary key(id)
);
INSERT INTO `user_group` (`id`, `groupName`) VALUES ('1', '用户组');

DROP TABLE IF EXISTS `user`;
create table user(
 id bigint(20) not null auto_increment,
 user_group_id bigint(20) not null,
  name varchar(30) not null,
  primary key(id)
);
INSERT INTO `user` (`id`, `user_group_id`, `name`) VALUES ('1', '1', '11');
INSERT INTO `user` (`id`, `user_group_id`, `name`) VALUES ('2', '1', '22');

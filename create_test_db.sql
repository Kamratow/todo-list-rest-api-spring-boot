DROP DATABASE IF EXISTS `sql_todo_list`;
CREATE DATABASE `sql_todo_list`; 
USE `sql_todo_list`;

CREATE TABLE `task` (
  `id` int NOT NULL AUTO_INCREMENT,
  `name` varchar(70) NOT NULL,
  `description` varchar(250) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
INSERT INTO `task` (`name`, `description`) VALUES ('first task', 'this is some task description');
INSERT INTO `task` (`name`, `description`) VALUES ('second task', 'again some task description');
INSERT INTO `task` (`name`, `description`) VALUES ('another task', 'remember to finish this one');
INSERT INTO `task` (`name`, `description`) VALUES ('testing task', 'very important task here');

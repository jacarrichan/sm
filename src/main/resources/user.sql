DROP TABLE IF EXISTS `muser`;
CREATE TABLE `muser` (
  `id` varchar(50) NOT NULL,
  `name` varchar(50) DEFAULT NULL,
  `age` int(11) DEFAULT NULL,
  `address` varchar(30) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
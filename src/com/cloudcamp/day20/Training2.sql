-- CLINIC -- FINDER

CREATE SCHEMA `FINDER` ;

-- Create table Clinic

use FINDER;
CREATE TABLE `clinic` (
  `id` INT,
  `name` VARCHAR(45),
  `license_number` INT,
  `specialized` ENUM('HEAD', 'KNEE'));
  
-- insert data

INSERT INTO `FINDER`.`clinic`
(`id`,
`name`,
`license_number`,
`specialized`)
VALUES
(1, 'apollo', 0000, 'KNEE');

select * from clinic;

INSERT INTO `FINDER`.`clinic`
(`id`,
`name`,
`license_number`,
`specialized`)
VALUES
(2, 'medplus', 1111, 'HEAD');


select * from clinic;

INSERT INTO `FINDER`.`clinic`
(`id`,
`name`,
`license_number`,
`specialized`)
VALUES
(2, 'medplus', 1111, 'HEAD');

select * from clinic;

DROP TABLE clinic; -- dropping table because data is corrupted


-- Create table using  key (primary key)

CREATE TABLE `clinic` (
  `id` INT PRIMARY KEY, -- please note we want id column as primary key
  `name` VARCHAR(45),
  `license_number` INT,
  `specialized` ENUM('HEAD', 'KNEE'));

select * from clinic;

INSERT INTO `FINDER`.`clinic`
(`id`,
`name`,
`license_number`,
`specialized`)
VALUES
(1, 'apollo', 0000, 'KNEE');

select * from clinic;

INSERT INTO `FINDER`.`clinic`
(`id`,
`name`,
`license_number`,
`specialized`)
VALUES
(1, 'apollo', 0000, 'KNEE'); --  notice error Error Code: 1062. Duplicate entry '1' for key 'PRIMARY'

-- use different key to insert

INSERT INTO `FINDER`.`clinic`
(`id`,
`name`,
`license_number`,
`specialized`)
VALUES
(2, 'apollo', 0000, 'KNEE');  -- success but data is exactly same and duplicates

select * from clinic;

DROP TABLE clinic;

-- recreate using 2 primary keys

CREATE TABLE `clinic` (
  `id` INT PRIMARY KEY,
  `name` VARCHAR(45),
  `license_number` INT PRIMARY KEY,
  `specialized` ENUM('HEAD', 'KNEE')); -- error multiple primary key defined

-- solution for id and license number to be distinct

DROP TABLE clinic;

CREATE TABLE `clinic` (
  `id` INT PRIMARY KEY,
  `name` VARCHAR(45),
  `license_number` INT UNIQUE,
  `specialized` ENUM('HEAD', 'KNEE')); -- error multiple primary key defined
  
 -- insert data 
INSERT INTO `FINDER`.`clinic`
(`id`,
`name`,
`license_number`,
`specialized`)
VALUES
(1, 'apollo', 1111, 'KNEE');

select * from clinic;

INSERT INTO `FINDER`.`clinic`
(`id`,
`name`,
`license_number`,
`specialized`)
VALUES
(1, 'apollo', 1111, 'KNEE'); -- error for id 1

INSERT INTO `FINDER`.`clinic`
(`id`,
`name`,
`license_number`,
`specialized`)
VALUES
(2, 'apollo', 1111, 'KNEE'); -- error for license number 1111

INSERT INTO `FINDER`.`clinic`
(`id`,
`name`,
`license_number`,
`specialized`)
VALUES
(2, 'apollo', 2222, 'KNEE'); -- success

select * from clinic;


-- CREATE DELETE - schema
-- CREATE SELECT UPDATE DELETE - table

-- CREATE TABLE
	-- data types 
    -- primary key
    -- UNIQUE

-- https://www.w3schools.com/MySQL/mysql_sql.asp
-- https://www.w3schools.com/MySQL/trymysql.asp?filename=trysql_select_all

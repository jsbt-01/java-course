 -- Install 2
  --    Java install - not a server
  --    Intellij / eclipse
 -- Install 2
  --    MySQL server - server
   --   Mysql workbench - tool


CREATE SCHEMA `TrainingDatabase` ; -- Creating  asume file - Database 

DROP SCHEMA `TrainingDatabase` ; -- Deleting

-- ArrayList 
	-- CREATE   -> CREATE TABLE
    -- ADD.    -> INSERT INTO
    -- PRINTALL -> SELECT * FROM TABLE
	-- SEARCH -> SELECT * FROM TABLE 'table name'  WHERE 
	-- UPDATE -> UPDATE
    -- DELETE  -> DELETE FROM 'table name'


use TrainingDatabase;
    
-- CREATE

CREATE TABLE `TrainingDatabase`.`Array` (
	position INT, -- int position
    value VARCHAR(255) -- String in JAVA
);

-- INSERT / ADD

INSERT INTO `TrainingDatabase`.`Array` (position, value) values (0, 'Sai');
INSERT INTO `TrainingDatabase`.`Array` (position, value) values (1, 'Teja');
INSERT INTO `TrainingDatabase`.`Array` (position, value) values (2, 'Rama');

-- PRINT ALL / SELECT ALL

SELECT position, value FROM `TrainingDatabase`.`Array`;

SELECT value FROM `TrainingDatabase`.`Array`;

SELECT position FROM `TrainingDatabase`.`Array`;

SELECT * FROM `TrainingDatabase`.`Array`;

-- FIND / SEARCH 

use TrainingDatabase;
SELECT * FROM Array WHERE value = 'Teja';
SELECT * FROM Array WHERE position = 2;
SELECT * FROM Array WHERE position > 0;
SELECT * FROM ARray WHERE position <> 2;

-- Update 

UPDATE Array SET value = 'Krishna';

-- Turn off safe update mode
SET SQL_SAFE_UPDATES = 0;

-- lets see the result and notice all the records updated
select * from Array;

UPDATE Array SET value = 'Hari' WHERE position = 1;
select * from Array;

UPDATE Array SET value = 'Sai' WHERE position = 0;
select * from Array;

-- DELETE

DELETE FROM Array where position = 1;
select * from Array;

DELETE FROM Array; --  Guess? all the records will be deleted
select * from Array;

DROP TABLE Array;
DROP SCHEMA `TrainingDatabase` ;



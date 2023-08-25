use EducationalInstitute;

CREATE TABLE Students(

student_id INT PRIMARY KEY,
first_name VARCHAR(255) ,
last_name VARCHAR(255) ,
age INT,
course_id INT
);

CREATE TABLE Course(

course_id INT PRIMARY KEY,
course_name VARCHAR(255)
);

INSERT INTO `EducationalInstitute`.`Students`
(`student_id`,
`first_name`,
`last_name`,
`age`,
`course_id`)
VALUES
(6, 'tej', 'p', 24, null);

select * from Students;

INSERT INTO `EducationalInstitute`.`Course`
(`course_id`,
`course_name`)
VALUES
(107, 'physics');

select * from Course;

-- student name , course name

select first_name, last_name, course_id from Students;
-- select first_name, last_name, Course.course_name from students;

-- get results only if a student is registered atleast in one valid course
select students.first_name, course.course_name
	from Students students INNER JOIN Course course ON students.course_id = course.course_id; -- inner join

select * from students;

select students.first_name, course.course_name
	from Students students LEFT JOIN Course course ON students.course_id = course.course_id;

-- UNION

-- INDEX

-- PRIMARY KEY
select * from Students where student_id = 4;

-- Primary key index

select * from Students where first_name = 'tej'; -- in production 1 millions records

-- SOlution? PRIMARY key

ALTER TABLE Students
ADD INDEX idx_on_first_name (first_name); -- INDEX

ALTER TABLE Students
ADD INDEX idx_on_last_name (last_name);

select * from Students where first_name = 'tej';

select * from Students where first_name = '' and course_id = 11;

ALTER TABLE Students
ADD INDEX idx_on_first_name_course (first_name, course_id);

-- FOREIGN KEY
-- SELF JOIN


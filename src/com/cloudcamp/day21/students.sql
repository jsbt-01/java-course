create table students (
	id int primary key,
	rollNumber varchar(10) not null unique,
	`name` varchar(50) not null,
	branch ENUM('CSE', 'ECE', 'EEE') not null,
	yearOfJoining int not null,
	marks int,
	place varchar(100) not null
);
drop table students;

describe students;

insert into students (id, rollNumber, name, branch, yearOfJoining,
marks, place)
values
(1, '10A01', 'Sanjay', 'CSE', 2022, 56, 'Hyderabad'),
(2, '10A02', 'Kumar', 'ECE', 2023, 67, 'Secunderabad'),
(3, '10A03', 'Mohan', 'EEE', 2020, 87, 'Hyderabad'),
(4, '10A04', 'Karan', 'ECE', 2023, 22, 'Secunderabad'),
(5, '10A05', 'Ramesh', 'CSE', 2022, 31, 'Hyderabad'),
(6, '10A06', 'Suresh', 'ECE', 2020, 92, 'Hyderabad'),
(7, '10A07', 'Babu', 'CSE', 2021, 99, 'Secunderabad');

insert into students (id, rollNumber, name, branch, yearOfJoining,
marks, place)
values
(8, '10A08', 'Ram', 'EEE', 2022, null, 'Hyderabad');

selecT * FROm students;
selecT * FROm students limit 3;

selecT * FROm students where id = 1;
selecT * FROm students where rollNumber = '10A00';
selecT * FROm students where branch = 'ECE';

update students set rollNumber = '10A01' where id = 1;

selecT * FROm students order by yearOfJoining;
selecT * FROm students order by yearOfJoining desc;

select max(marks) as maximumMarks from students;
select min(marks) from students;
select sum(marks) from students;

-- Aggregate functions
select max(marks), min(marks), sum(marks) as maximumMarks from students;

-- Projection
select id, place from students;

select distinct place from students;

selecT * FROm students order by branch;
select * FROM students order by branch, marks;
select * FROM students order by branch, marks desc;

select * from students where branch = 'CSE' and place = 'Hyderabad';
select * from students where branch = 'CSE' or branch = 'ECE';
select * from students where branch in ('CSE', 'ECE');

select * from students where marks >= 35;
select * from students where marks < 35;
select * from students where marks is null; -- Students absent for exam
select * from students where marks is not null; -- Students who attended exam

select * from students where marks >= 50 and marks <= 70;
select * from students where marks between 60 and 70;

select * from students;
select * from students where `name` = 'Ramesh';
select * from students where `name` like '%sh';
select * from students where `name` like 'k%';
select * from students where `name` like '%u%';




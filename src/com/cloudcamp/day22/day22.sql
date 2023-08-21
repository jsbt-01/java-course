drop table students;

create table students (
	id int primary key,
    name varchar(255) not null,
    marks int,
    place varchar(100) not null
);

describe students;
insert into students (id, name, marks, place) values 
(3, 'Ramesh', 50, 'Koti');

select * from students;

alter table students add column email varchar(255);
describe students;
select * from students;

insert into students (id, name, marks, place, email) values 
(4, 'Rajesh', 60, 'Madhapur', 'rajesh@gmail.com');
select * from students;

update students set email = 'kumar@gmail.com' where id = 2;
select * from students;

update students set email = 'sanjay@gmail.com';
select * from students;

alter table students drop column place;
select * from students;

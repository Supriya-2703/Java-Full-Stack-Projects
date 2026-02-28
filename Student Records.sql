create database Student_db;

use Student_db;

create table Students( Student_id int primary key, Name varchar(50), Course varchar(50),Marks int,City varchar(50));

insert into Students values (1, "Aditi", "Java", 85, "Pune"),(2, "Rohan", "Pyhton", 72, "Mumbai"),(3, "Neha", "Java", null, "Pune"),(4, "Aman", "Python", 90, "Delhi"),(5, "Kunal", "Java", 60, null);

select * from Students;

select * 
from Students
where Course = "Java";

select *
from Students
where City = "Pune";

select *
from Students 
where Marks > 75;

select * 
from Students
where City is null;

select avg(Marks) as Avg_Marks
from Students;

select min(Marks) as Lowest_Marks
from Students;

select count(*) as Student_count
from Students;

select * 
from Students
order by Marks desc;

select * 
from Students
where Name like "A%";

select Student_id, Name, coalesce(Marks, 0) as Marks
from Students;

select Course, count(*) as Total_Students
from Students
group by Course;
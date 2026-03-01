create database Orders_DB;
use Orders_DB;

create table Orders (
    Order_id int primary key,
    Customer_name varchar(50),
    Amount decimal(10,2),
    Status varchar(20),
    Order_date date
);

insert into Orders values
(1, 'Priya', 1200, 'Delivered', '2025-01-05'),
(2, 'Amit', 800, 'Cancelled', '2025-02-10'),
(3, 'Pooja', 1500, 'Delivered', '2025-01-15'),
(4, 'Rahul', 600, 'Pending', '2025-03-12'),
(5, 'Peter', 2000, 'Delivered', '2025-04-01'),
(6, 'Neha', 1000, 'Cancelled', '2025-01-25');

select * 
from Orders
where Status = "Delivered";

select * 
from Orders
where Amount > (select avg(Amount) from Orders);

select distinct Customer_name
from Orders
where month(Order_date) = 1;

delete from Orders
where Status = "Cancelled";

select * 
from Orders
where Status = "Cancelled";

update Orders
set Amount = Amount * 1.10
where Status = "Delivered";

select * 
from Orders
where Customer_name like "P%";

alter table Orders
add constraint Chk_Status
check (Status in("Delivered","Pending","Cancelled"));
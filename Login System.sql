create database User_DB;
Use User_DB;

create table User (
User_id int primary key,
User_name varchar(50),
Password varchar(50),
Last_Login date
);

insert into User value
(1, 'Admin', 'admin123', '2024-02-01'),
(2, 'UserA', 'pass123', null),
(3, 'UserB', 'hello123', '2024-02-01'),
(4, 'UserC', 'test123', '2024-03-05'),
(5, 'Guest', 'guest123', null);

SELECT * FROM User
WHERE Last_Login IS NULL;

UPDATE User
SET Password = 'newpass123'
WHERE Last_Login IS NULL;

SELECT * FROM User
WHERE Last_Login = '2024-02-01';

SELECT * FROM User
WHERE User_name LIKE 'User%';

SELECT * FROM User
WHERE User_name <> 'Admin'
AND Last_Login IS NOT NULL;
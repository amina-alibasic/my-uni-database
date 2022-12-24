insert into enu_user_type(id, short_code, description) values
(1,'ADMN', 'Admin'),
(2,'PROF', 'Professor'),
(3,'STDN', 'Student')
;

insert into users(id,first_name,last_name, date_of_birth,user_type_id,is_admin) values
(1,'Admin','Admin','1999-01-22',1,1),
(2,'Professor','Test','1986-07-05',2,0),
(3,'Student','Test','2003-11-17',3,0),
(4,'Professor','Test 2','1971-08-27',2,0),
(5,'Student','Test 2','2000-02-04',3,0)
;

insert into enu_employment_type(id, description) values
(1,'Full-time'),
(2,'Part-time'),
(3,'Three classes a week'),
(4,'One class a week')
;

insert into departments(id,name) values
(1,'Engineering'),
(2,'Natural sciences'),
(3,'Medicine'),
(4,'Economics')
;

insert into professors(id,user_id) values
(1,2),
(2,2),
(3,4),
(4,4)
;

insert into classes(id,name,department_id,professor_id) values
(1,'Mathematics',1,1),
(2,'Physics',1,1),
(3,'Object-oriented programming',1,1),
(4,'Software Programming',1,1),
(5,'Databases',1,1),
(6,'Intelligent systems',1,1),
(7,'Mechatronics',1,1),
(8,'Theoretical biology',2,1),
(9,'Applied biology',2,1),
(10,'Chemistry',2,1),
(11,'Anatomy',3,1),
(12,'Histology',3,1),
(13,'Statistics',4,1),
(14,'Mathematical economics',4,1),
(15,'Management',4,1),
(16,'Informatics',4,1)
;

insert into students(id,user_id,department_id,enu_degree_type_id) values
(1,3,1,1),
(2,5,3,1)
;

insert into employments(id,professor_id,department_id,employment_type_id) values
(1,1,1,1),
(2,2,2,3),
(3,2,3,2)
;

insert into enrollments(id,class_id,student_id,grade) values
(1,1,1,NULL),
(2,2,2,7)
;

insert into enu_degree_type(id,short_code,description) values
(1,'BCH','Bachelor'),
(2,'MST','Master')
;
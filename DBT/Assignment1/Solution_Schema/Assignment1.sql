#1
#-> Go to bin folder of MySQL setup that is C:\Program Files\MySQL\MySQL Server 8.0\bin
#-> Enter CMD from the bin folder
#-> Login using the command "mysql.exe -u root -p" and then enter the set root password to login to MySQL shell prompt.

#2
show databases;

#3
use humanresource;

#4
show tables;

#5
use otherdatabase;

#6
# Use the command: source <PATH OF hrschema.sql file>
source F:\CDAC Course\Assignments\CDAC_Assignments\DBT\Assignment1\hrschema.sql

#7
show tables;

#8
DESC countries;
desc departments;
desc emp_details_view;
desc employees;
desc job_history;
desc jobs;
desc locations;
desc regions;


#9
select * from countries;
select * from departments;
select * from emp_details_view;
select * from employees;
select * from job_history;
select * from jobs;
select * from locations;
select * from regions; 

#10
#-> Open MySQL Workbench
#-> Click on the desired user and then login using the set password.
#-> Input your queries to test

#11
#system cls

#12
SELECT CURRENT_USER();
#root@localhost

#13
SELECT current_date(); # Date
SELECT current_time(); # Time
SELECT current_timestamp(); # Date with timestamp

#14
#Null means no data which shows a null field with null column
SELECT NULL;


#15
CREATE DATABASE ASSIGNMENT_FIRST;

USE ASSIGNMENT_FIRST;

CREATE TABLE STUDENT_DETAILS 
				(
				STUDENTNAME varchar(30),
				COURSE varchar(15),
				MARKS int,
				DOB datetime
				);
                
INSERT INTO STUDENT_DETAILS VALUES('SHUBHAM','EDAC',85,'1995-12-21 05:12:12');

INSERT INTO STUDENT_DETAILS VALUES('RAJU','EDAC',75,'1997-11-21 05:12:00');
                
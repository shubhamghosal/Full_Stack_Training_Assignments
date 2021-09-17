USE hrschema;

#1
SELECT E.first_name , E.last_name , E.department_id , D.department_name 
FROM employees E 
JOIN departments D 
ON E.department_id = D.department_id;

#2
SELECT E.first_name,E.last_name, D.department_name, L.city, L.state_province
FROM employees E 
JOIN departments D  
ON E.department_id = D.department_id  
JOIN locations L
ON D.location_id = L.location_id;

#3
SELECT E.first_name, E.last_name, E.salary, J.grade_level
FROM employees E 
JOIN job_grades J
ON E.salary BETWEEN J.lowest_sal AND J.highest_sal;

#4
SELECT E.first_name , E.last_name , E.department_id ,  D.department_name 
FROM employees E 
JOIN departments D 
ON E.department_id = D.department_id 
AND E.department_id IN (80 , 40)
ORDER BY E.last_name;

#5
SELECT E.first_name, E.last_name, D.department_name, L.city, L.state_province
FROM employees E
JOIN departments D
ON E.department_id = D.department_id
JOIN locations L
ON D.location_id = L.location_id
WHERE E.first_name LIKE '%z%';

#6
SELECT E.first_name, E.last_name, D.department_id, D.department_name 
FROM employees E 
RIGHT OUTER JOIN departments D
ON E.department_id = D.department_id;

#7
SELECT E.first_name, E.last_name, E.salary 
FROM employees E 
JOIN employees S
ON E.salary < S.salary 
AND S.employee_id = 182;

#8
SELECT E.first_name AS "Employee Name", M.first_name AS "Manager"
FROM employees E 
JOIN employees M
ON E.manager_id = M.employee_id;

#9
SELECT D.department_name , L.city , L.state_province
FROM  departments D 
JOIN locations L 
ON  D.location_id = L.location_id;

#10
SELECT E.first_name, E.last_name, E.department_id, D.department_name 
FROM employees E 
LEFT OUTER JOIN departments D 
ON E.department_id = D.department_id;

#11
SELECT E.first_name AS "Employee Name", M.first_name AS "Manager"
FROM employees E 
LEFT OUTER JOIN employees M
ON E.manager_id = M.employee_id;

#12
SELECT E.first_name, E.last_name, E.department_id 
FROM employees E 
JOIN employees S
ON E.department_id = S.department_id
AND S.last_name = 'Taylor';

#13
SELECT job_title, department_name, first_name || ' ' || last_name AS Employee_name, start_date 
FROM job_history 
JOIN jobs USING (job_id) 
JOIN departments USING (department_id) 
JOIN  employees USING (employee_id) 
WHERE start_date>='1993-01-01' AND start_date<='1997-08-31';

#14
SELECT job_title, first_name || ' ' || last_name AS Employee_name, max_salary-salary AS salary_difference 
FROM employees 
NATURAL JOIN jobs;

#15
SELECT department_name, AVG(salary), COUNT(commission_pct) 
FROM departments 
JOIN employees USING (department_id) 
GROUP BY department_name;

#16
SELECT job_title, first_name || ' ' || last_name AS Employee_name, max_salary-salary AS salary_difference
FROM employees 
NATURAL JOIN jobs 
WHERE department_id  = 80;

#17
SELECT country_name,city, department_name 
FROM countries 
JOIN locations USING (country_id) 
JOIN departments USING (location_id);

#18
SELECT department_name, first_name || ' ' || last_name AS name_of_manager
FROM departments D 
JOIN employees E 
ON (D.manager_id=E.employee_id);
       
#19
SELECT job_title, AVG(salary) 
FROM employees 
NATURAL JOIN jobs 
GROUP BY job_title;

#20
SELECT a.*
FROM  job_history a 
JOIN employees m 
ON (a.employee_id = m.employee_id)
WHERE salary >= 12000;

#21
SELECT country_name,city, COUNT(department_id)
FROM countries 
JOIN locations USING (country_id) 
JOIN departments USING (location_id) 
WHERE department_id IN 
    (SELECT department_id 
		FROM employees 
	 GROUP BY department_id 
	 HAVING COUNT(department_id)>=2)
GROUP BY country_name,city;

#22
SELECT department_name, first_name || ' ' || last_name AS name_of_manager, city 
FROM departments D 
JOIN employees E 
ON (D.manager_id=E.employee_id) 
JOIN locations L USING (location_id);

#23
SELECT employee_id, job_title, end_date-start_date DAYS 
FROM job_history 
NATURAL JOIN jobs 
WHERE department_id=80;

#24
SELECT first_name || ' ' || last_name AS Employee_name, salary
FROM employees 
JOIN departments USING (department_id) 
JOIN  locations USING (location_id) 
WHERE  city = 'London';

#25
SELECT CONCAT(e.first_name, ' ', e.last_name) AS Employee_name,
       j.job_title,
       h.*
FROM employees e
JOIN
  (SELECT MAX(start_date),
          MAX(end_date),
          employee_id
   FROM job_history
   GROUP BY employee_id) h ON e.employee_id=h.employee_id
JOIN jobs j ON j.job_id=e.job_id
WHERE e.commission_pct = 0;

#26
SELECT d.department_name,
       e.*
FROM departments d
JOIN
  (SELECT count(employee_id),
          department_id
   FROM employees
   GROUP BY department_id) e USING (department_id);
   
#27
SELECT first_name || ' ' || last_name AS Employee_name, 
	employee_id, country_name 
		FROM employees 
			JOIN departments USING(department_id) 
JOIN locations USING( location_id) 
JOIN countries USING ( country_id);
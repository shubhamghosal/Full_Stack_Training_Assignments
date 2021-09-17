use scott;

#1
select * from emp as e, 
(select deptno,avg(sal) as avg_sal from emp group by deptno) as avrg
where e.deptno = avrg.deptno and e.sal > avrg.avg_sal;
#2
select * from emp where length(ename) = 5;
#3
select * from emp where ename like 'J%S';
#4
select * from emp where deptno not in (10,20,40);
#5
select * from emp where job not in ('president', 'manager');
#6
select * from emp where length(sal) = 3;
#7
select * from emp where comm is null;
#8
select * from emp where ename like '_L%';

#9
select max(sal) from emp;
select min(sal) from emp;
#10
select deptno,count(*) as c from emp group by deptno having c=3;
#11
select lpad(' ',level|12)+ename from emp connect by prior empno = mgr start with mgr is null
#12
select dname,b.deptno, ename,sal from emp a, dept b where a.deptno(+) = b.deptno;
select dname,b.deptno, ename,sal from emp a right outer join dept b on a.deptno = b.deptno;
#13
select dname,b.deptno, ename,sal from emp a, dept b where a.deptno = b.deptno(+);
select dname,b.deptno, ename,sal from emp a left outer join dept b on a.deptno = b.deptno;
#14
select dname,b.deptno, ename,sal from emp a full outer join dept b on a.deptno = b.deptno
#15
select * from emp,dept;
#16
select deptno from dept where deptno not in
(select deptno from emp);
#17
select deptno from dept where deptno in
(select deptno from emp);
#18
select * from emp where job not in ('manager');
#19
select concat(ename, ' belongs to ', deptno) from emp;
#20
select
count(decode(to_char(hiredate,'YYYY'), 1980,hiredate)) total_hire_1980,
count(decode(to_char(hiredate,'YYYY'), 1981,hiredate)) total_hire_1981,
count(decode(to_char(hiredate,'YYYY'), 1982,hiredate)) total_hire_1982
from emp
#21
select ename,deptno, (case deptno
when 10 then 'Ten'
when 20 then 'Twenty'
when 30 then 'Thirty'
when 40 then 'fourty'
else 'others' end) as dept
from emp
#22
select lower(ename) as ename, initcap(job) as job from emp
#23
select * from emp where to_char(hiredate,'W') = 1;
#24
select * from emp where to_char(hiredate,'WW') = 49;
#25
SELECT empno,
ename,
job,
sal,
LAG(sal, 1, 0) OVER (ORDER BY sal) AS sal_prev,
sal - LAG(sal, 1, 0) OVER (ORDER BY sal) AS sal_diff
FROM emp;
#26
Create table emp1 as select * from emp where deptno=10
#27
create table emp2 as select * from emp where 1=2
#28
insert into emp1 values(9999,'PAUL','MANAGER',7839,SYSDATE,8900,NULL,10);
MERGE
INTO emp tgt
USING emp1 src
ON ( src.empno = tgt.empno )
WHEN MATCHED
THEN
UPDATE
SET tgt.ename = src.ename,
tgt.job = src.job,
tgt.mgr = src.mgr,
tgt.hiredate = src.hiredate,
tgt.sal = src.sal,
tgt.deptno = src.deptno
WHEN NOT MATCHED
THEN
Insert(
Tgt.empno,
Tgt.Ename,
Tgt.Job,
Tgt.Mgr,
Tgt.Hiredate,
Tgt.Sal,
Tgt.Comm,
Tgt.Deptno)
values (src.empno,
src.ename,
src.job,
src.mgr,
src.hiredate,
src.sal,
src.comm,
src.deptno);
#29
select * from emp where deptno in(select deptno from emp where ename = 'JAMES')
#30
select * from emp where sal <= (select sal from emp where ename='ADAMS')
#31
select * from emp where hiredate < (select hiredate from emp where ename='WARD')
#32
Select ename from emp where mgr = (select empno from emp where ename='BLAKE')
#33
select ename from emp start with empno = (select empno from emp where ename='BLAKE')
connect by prior empno = mgr
#34
select * from emp where deptno in(select deptno from emp where job= (select job from emp where ename = 'KING'))
#36
select * from emp where to_char(hiredate,'YYYY') = 1981 and job = 'MANAGER';
#37
select * from emp where comm = (select max(comm) from emp);
#38
select * from emp where trunc(sysdate-hiredate)/365 = (select max(trunc(sysdate-hiredate)/365) from emp);
select * from emp where hiredate =(select min(hiredate) from emp)
#39
select * from emp where trunc(sysdate-hiredate)/365 = (select min(trunc(sysdate-hiredate)/365) from emp);
select * from emp where hiredate =(select max(hiredate) from emp)
#40
select empno,ename,b.deptno,dname,grade from
emp a,dept b, salgrade c
where a.deptno = b.deptno
and sal between losal and hisal;
#41
SELECT emp.ename, emp.JOB, emp.deptno
FROM emp
WHERE EXISTS
(SELECT 'x'
FROM dept d
WHERE d.DEPTNO = emp.DEPTNO
AND d.LOC = 'DALLAS') ;
select emp.ename, emp.job, emp.deptno
from emp
where deptno in(select deptno from dept where loc='DALLAS');
#42
SELECT emp.ename,
emp.JOB,
emp.deptno,
dnames.dname
FROM emp
JOIN (select dname, deptno
from dept ) dnames ON emp.deptno = dnames.deptno
#43
select ename, job, sal, dname
from emp, dept
where emp.deptno = dept.deptno
and not exists
(select ‘x’ from salgrade
where emp.sal between losal and hisal);
#44
empno,ename,sal from both tables inluding duplicates.
select empno, ename, sal from emp
union all
select empno, ename, sal from emp1
#45
select * from emp where empno in(select empno from emp where ename in(select ename from emp where JOB = 'PRESIDENT'));
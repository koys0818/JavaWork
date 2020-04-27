-- 산술연산자

SELECT ename, sal, SAL * 1.1
FROM T_EMP;

SELECT ENAME, SAL, COMM, SAL + COMM --null과의 산술연간은 무조건 null이 나온다
FROM T_EMP;

--WHERE 조건절
SELECT * FROM T_EMP WHERE job = 'SALESMAN';

SELECT ename, sal, deptno FROM t_emp WHERE deptno = 10;

SELECT ename,JOB ,sal FROM t_emp WHERE sal > 2000;

SELECT ename, empno, sal FROM t_emp WHERE ename = 'SCOTT';

SELECT NAME, GRADE  FROM T_STUDENT WHERE GRADE BETWEEN 1 AND 2;

SELECT name, grade  FROM t_student WHERE grade = 2 OR grade = 3;
SELECT name, grade  FROM t_student WHERE grade IN (2,3);
SELECT name, grade  FROM t_student WHERE grade = 2 OR grade = 3;

SELECT NAME , PAY , "POSITION" 
FROM T_PROFESSOR WHERE "POSITION" = '정교수' AND PAY >300

SELECT * 
FROM T_PROFESSOR;

SELECT NAME , "POSITION" 
FROM T_PROFESSOR WHERE BONUS IS NULL ;

SELECT name , "POSITION" 
FROM T_PROFESSOR WHERE name LIKE '김%';

SELECT ename
FROM T_EMP WHERE ENAME LIKE '%NE%';

---------------------------------------------
--order by
SELECT ename FROM T_EMP WHERE ENAME LIKE '%L%'
ORDER BY ename ;

SELECT ename, job, sal FROM T_EMP
ORDER BY JOB DESC, SAL ASC ;

SELECT NAME , GRADE , HEIGHT 
FROM T_STUDENT ORDER BY GRADE ASC , HEIGHT DESC;


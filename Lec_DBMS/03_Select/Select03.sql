
----------1번
SELECT NAME ,HEIGHT 
FROM T_STUDENT WHERE HEIGHT >= 180; 

----------2번
SELECT name, WEIGHT 
FROM T_STUDENT WHERE WEIGHT BETWEEN 60 AND 80;

----------3번
SELECT NAME ,DEPTNO1 
FROM T_STUDENT WHERE DEPTNO1 in(101,201); 

----------4번
SELECT name 
FROM T_STUDENT WHERE name LIKE '김%';

----------5번
SELECT NAME , GRADE , HEIGHT 
FROM T_STUDENT WHERE GRADE = 4 AND HEIGHT >= 170;

----------6번
SELECT NAME , GRADE , WEIGHT 
FROM T_STUDENT WHERE GRADE = 1 OR WEIGHT >= 80;

----------7번
SELECT NAME , GRADE , HEIGHT , WEIGHT 
FROM T_STUDENT WHERE GRADE = 2 AND HEIGHT >= 180 AND WEIGHT >= 70;

----------8번
SELECT NAME ,GRADE ,HEIGHT ,WEIGHT 
FROM T_STUDENT WHERE GRADE = 2 AND HEIGHT >= 180 OR GRADE = 2 AND WEIGHT >= 70;

----------9번
SELECT ENAME , HIREDATE 
FROM T_EMP WHERE HIREDATE < TO_DATE('19220101','YYYYMMDD'); 

----------10번
SELECT NAME , BIRTHDAY , HEIGHT , WEIGHT 
FROM T_STUDENT WHERE GRADE = 1 ORDER BY BIRTHDAY ASC; 

----------11번
SELECT NAME 이름 , HEIGHT 키 
FROM T_STUDENT WHERE GRADE = 1 ORDER BY name ASC;

----------12번
SELECT NAME BIRTHDAY 
FROM T_EMP2 WHERE BIRTHDAY BETWEEN 19800101 AND 19891231;
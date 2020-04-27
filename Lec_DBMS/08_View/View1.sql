--view 생성시 별도의 컬럼이름을 지정해줄수있다
CREATE OR REPLACE VIEW v_prof(가,나,다,라)
AS
SELECT profno,name,email,hpage FROM T_PROFESSOR;

SELECT * FROM v_prof

SELECT tname FROM tab;	--view 확인 가능

CREATE OR REPLACE VIEW v_prof_dept
AS
SELECT p.PROFNO , p.NAME , d.DNAME FROM T_PROFESSOR p , T_DEPARTMENT d;

SELECT * FROM v_prof_dept;

SELECT 
	d.dname "학과명", 
	s.max_height "최대키", 
	s.max_weight "최대몸무게"
FROM 
	( SELECT deptno1, MAX(height) max_height, MAX(weight) max_weight
	FROM t_student
	GROUP BY deptno1 ) s , 
	t_department d
WHERE 
	s.deptno1 = d.deptno;
	

SELECT d.DNAME , a.max_height , s.NAME , s.HEIGHT 
from
	(SELECT deptno1 , max(HEIGHT ) max_height FROM T_STUDENT GROUP BY deptno1) a,
	t_student s , t_department d
WHERE 
	s.DEPTNO1 = a.deptno1 AND s.HEIGHT = a.max_height
	AND s.DEPTNO1 = d.DEPTNO 
;

SELECT a.GRADE , b.NAME , b.HEIGHT , a.avg
FROM
	(SELECT GRADE , avg(HEIGHT) avg FROM T_STUDENT GROUP BY GRADE) a,
	t_student b
WHERE
	a.avg < b.HEIGHT AND a.grade = b.GRADE 
	;
	




-- 비등가 조인 (Non-Equi Join)

SELECT * FROM t_customer;
SELECT * FROM t_gift;

-- #6201) 
-- t_customer 테이블, t_gift 테이블을 join 하여  
-- 고객의 마일리지 포인트별로 받을수 있는 상품을 조회하여 
-- 고객의 '이름(c_name)'과 포인트(c_point) 상품명(g_name)을 출력하세요
-- BETWEEN ~ AND ~ 사용
-- ORACLE
SELECT c.c_name "고객명", c.c_point "POINT", g.g_name "상품명"
FROM t_customer c, t_gift g
WHERE c.c_point BETWEEN g.g_start AND g.g_end
;

-- ANSI
SELECT c.c_name "고객명", c.c_point "POINT", g.g_name "상품명"
FROM t_customer c JOIN t_gift g
	ON c.c_point BETWEEN g.g_start AND g.g_end
;

--  #6202) 연습 
-- 앞 예제에서 조회한 상품의 이름(gname)과 필요수량이 몇개인지 조회하세요
-- (그룹함수 동원되어야 한다)
SELECT g.g_name "상품명", count(*) "상품수량"
FROM t_customer c, t_gift g
WHERE c.c_point BETWEEN g.g_start AND g.g_end
GROUP BY g.g_name;
;

-- ANSI
SELECT g.g_name "상품명", count(*) "상품수량"
FROM t_customer c JOIN t_gift g
	ON c.c_point BETWEEN g.g_start AND g.g_end
GROUP BY g.g_name;


-- #6203) 연습
-- t_student 테이블과 t_exam01 시험성적 테이블, t_credit 학점 테이블을 조회하여 
-- 학생들의 이름과 점수와 학점을 출력하세요

SELECT * FROM t_student;  -- 20개
SELECT * FROM t_exam01;  -- 20개
SELECT * FROM t_credit;  -- 7개
-- ORACLE
SELECT s.name "학생이름",	e.total "점수", c.grade "학점"
FROM t_student s, t_exam01 e, t_credit c
WHERE s.studno = e.STUDNO  AND e.total BETWEEN c.MIN_POINT AND c.MAX_POINT 
;
-- ANSI
SELECT s.name "학생이름",	e.total "점수", c.grade "학점"
FROM t_student s 
	JOIN t_exam01 e ON s.studno = e.STUDNO
	JOIN t_credit c ON e.total BETWEEN c.MIN_POINT AND c.MAX_POINT
;

SELECT c.c_name "고객명", c.c_point "POINT", g.g_name "상품명"
FROM t_customer c, t_gift g
WHERE c.c_point BETWEEN 400000 AND 10000000 AND g.G_NAME = '산악용자전거'
;

SELECT e.NAME 이름, round(TO_CHAR((SYSDATE- e.BIRTHDAY + 1))/365) 나이, nvl(e.POST,' ') 현재직급, p.POST 예상직급
FROM T_EMP2 e, T_POST p
WHERE round(TO_CHAR((SYSDATE- e.BIRTHDAY + 1))/365) BETWEEN p.S_AGE AND p.E_AGE
;
SELECT * FROM T_POST;



SELECT s.NAME , p.NAME 
FROM T_STUDENT s FULL OUTER JOIN T_PROFESSOR p
ON s.PROFNO = p.PROFNO 

SELECT d1.DNAME , d2.DNAME 
FROM T_DEPT2 d1, T_DEPT2  d2
where d1.PDEPT = d2.DCODE 

SELECT p1.PROFNO ,p1.NAME , p1.HIREDATE ,COUNT(p2.PROFNO) 
FROM T_PROFESSOR p1 LEFT OUTER JOIN  T_PROFESSOR p2
on p1.HIREDATE  > p2.HIREDATE 
GROUP BY p1.PROFNO , p1.NAME , p1.HIREDATE 
ORDER BY count(p2.PROFNO) asc

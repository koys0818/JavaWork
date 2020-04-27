
-- * 모든 컬럼
SELECT * FROM T_EMP;

-- 원하는 컬럼만 조회
SELECT Empno FROM T_EMP;
SELECT EMPNO ENAME 
FROM T_EMP;

SELECT * FROM T_PROFESSOR;
SELECT NAME, BONUS 
FROM T_PROFESSOR; 

SELECT '안녕하세요' FROM T_PROFESSOR;

--컬럼 별명 (alias) 사용한 출력
SELECT STUDNO 학번, NAME 이름 
FROM t_student;


SELECT STUDNO "학번", NAME AS 이름
FROM T_STUDENT; 

SELECT STUDNO 학번, NAME 이름 
FROM t_student;

SELECT EMPNO 사원번호, ENAME 사원이름, JOB 직업
FROM T_EMP;

SELECT DEPTNO "부서#", DNAME 부서명,LOC 위치
FROM T_DEPT;

--DISTINCT
SELECT * FROM T_EMP;

SELECT DEPTNO
FROM T_EMP;
SELECT DISTINCT deptno FROM T_EMP;

SELECT DISTINCT DEPTNO1 
FROM T_STUDENT;

SELECT DISTINCT JOB 
FROM T_EMP;

-- || : 필드,문자열 연결 연산
SELECT * FROM T_PROFESSOR 

SELECT name || '-' || POSITION AS 교수님명단
FROM T_PROFESSOR;

SELECT name || '의 키는 ' || HEIGHT ||'cm, 몸무게는 ' || WEIGHT || 'kg 입니다' AS "학생의 키와 몸무게"
FROM T_STUDENT;

SELECT * FROM T_STUDENT;
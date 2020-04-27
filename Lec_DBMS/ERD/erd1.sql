
/* Drop Tables */

DROP TABLE register CASCADE CONSTRAINTS;
DROP TABLE student CASCADE CONSTRAINTS;
DROP TABLE subject CASCADE CONSTRAINTS;
DROP TABLE professor CASCADE CONSTRAINTS;




/* Create Tables */

CREATE TABLE professor
(
	profno number NOT NULL,
	name varchar2(10) NOT NULL,
	deptno number,
	PRIMARY KEY (profno)
);


CREATE TABLE register
(
	studno number NOT NULL,
	subjno number NOT NULL
);


CREATE TABLE student
(
	studno number NOT NULL,
	name varchar2(10) NOT NULL,
	profno number NOT NULL,
	deptno number,
	PRIMARY KEY (studno)
);


CREATE TABLE subject
(
	subjno number NOT NULL,
	name varchar2(10) NOT NULL,
	profno number NOT NULL,
	PRIMARY KEY (subjno)
);



/* Create Foreign Keys */

ALTER TABLE student
	ADD FOREIGN KEY (profno)
	REFERENCES professor (profno)
;


ALTER TABLE subject
	ADD FOREIGN KEY (profno)
	REFERENCES professor (profno)
;


ALTER TABLE register
	ADD FOREIGN KEY (studno)
	REFERENCES student (studno)
;


ALTER TABLE register
	ADD FOREIGN KEY (subjno)
	REFERENCES subject (subjno)
;

SELECT * FROM T_STUDENT 

DELETE FROM T_STUDENT WHERE GRADE = 4;

ROLLBACK;

SELECT NAME 이름, PAY * 12 연봉
FROM T_PROFESSOR 
WHERE pay * 12 > 5000;

CREATE INDEX idx_student_name ON t_student(name);

SELECT * FROM USER_INDEXES;

SELECT  p.NAME "교수님 성함", d.DNAME "소속 학과명" 
FROM T_PROFESSOR p JOIN T_DEPARTMENT d
ON p.DEPTNO = d.DEPTNO;

SELECT  s.NAME 학생이름, d.DNAME 학과명 
FROM T_STUDENT s, T_DEPARTMENT d
WHERE s.DEPTNO1 = (SELECT DEPTNO1 FROM T_STUDENT WHERE NAME = '이윤나')AND s.DEPTNO1 = d.DEPTNO;


SELECT *
FROM T_STUDENT; 

CREATE VIEW v_stud_info(sname, dname, pname)
AS
SELECT s.NAME 학생이름, d.DNAME 학생학과이름, p.NAME "담당교수님 이름"
FROM T_STUDENT s, T_PROFESSOR p, T_DEPARTMENT d
WHERE s.PROFNO = p.PROFNO AND s.DEPTNO1 = d.DEPTNO;

GRANT connect, resource TO SCOTT;

CREATE TABLE T_MEMBER5(
	mb_uid NUMBER PRIMARY KEY,
	mb_name varchar2(20) NOT NULL,
	mb_jumin char(13) UNIQUE,
	mb_age NUMBER  CHECK (mb_age > 0),
	mb_dept NUMBER
	CONSTRAINT mb_code FOREIGN KEY(DCODE)
		REFERENCES t_dept(DCODE)
);



CREATE TABLE parentTable(
 
      parentPk NUMBER PRIMARY KEY
 
);
 
 
 CREATE TABLE consTest(
 
       parentPk NUMBER,
 
      pkCol1 CHAR(8),
 
      CONSTRAINT fk_code FOREIGN KEY(parentPk)
         REFERENCES parentTable(parentPk) ON DELETE CASCADE
 
 );






CREATE USER scott IDENTIFIED BY tiger;
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

ALTER TABLE T_STUDENT
 (
	BIRTHA date
);

select sum(bytes) from dba_data_files;

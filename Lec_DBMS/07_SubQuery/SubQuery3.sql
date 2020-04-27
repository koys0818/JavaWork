CREATE TABLE test_emp_a(
	emp_id number,
	emp_name varchar(100)
);

CREATE TABLE test_emp_b(
	emp_id number,
	emp_name varchar(100)
	);
	
DELETE FROM test_emp_a;
DELETE FROM test_emp_b;

INSERT INTO TEST_EMP_A values(101, '장윤성');
INSERT INTO TEST_EMP_B values(201, '고유성');

SELECT * FROM test_emp_a;
SELECT * FROM test_emp_b;

INSERT ALL 
INTO TEST_EMP_A values(102,'조현주');
INTO TEST_EMP_b values(202,'최현주');
SELECT * FROM dual; 
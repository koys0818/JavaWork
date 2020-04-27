--Round()

SELECT round(12.34),
	   round(12.543),
	   round(12.352124,2),
	   round(12.352124,2),
	   round(12.352124,-1)
FROM dual;

-- TRUNC() 함수
SELECT
	'TRUNC',
	TRUNC(12.345) "(12.345)",         -- 소수점 자름 (디폴트)
	TRUNC(12.345, 2) "(12.345, 2)",   -- 소수점 3자리부터 자름
	TRUNC(12.345, -1) "(12.345, -1)"  -- 1의 자리부터 자름
FROM
	dual;


SELECT
	'12.5'  "12.5",
	ROUND(12.5)	"ROUND",
	TRUNC(12.5) "TRUNC",
	CEIL(12.5) "CEIL",
	FLOOR(12.5) "FLOOR"
FROM
	dual;

SELECT 
MOD(10,4)
FROM dual;







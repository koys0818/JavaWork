SELECT name, PAY ,BONUS 
FROM T_PROFESSOR;

--NULL 값과의 연산 결과는 null이다

--그룹함수에서의 동작		null은 연산에서 제외되서 동작
SELECT sum(pay), sum(bonus)
FROM T_PROFESSOR ;

--nvl() 함수
SELECT NAME, PAY , BONUS , PAY + BONUS , pay + nvl(BONUS,0) 
FROM T_PROFESSOR;

--#4201
SELECT NAME, PAY , BONUS , pay * 12 + nvl(BONUS,0) 연봉 
FROM T_PROFESSOR;

--#4202
SELECT NAME, PAY , NVL2(BONUS, BONUS ,0) BONUS ,NVL2(BONUS,pay * 12 + BONUS , pay * 12) 
FROM T_PROFESSOR;
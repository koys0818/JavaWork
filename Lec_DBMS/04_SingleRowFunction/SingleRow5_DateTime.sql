SELECT SYSDATE FROM dual;

--기본적인 날짜 연산
SELECT  SYSDATE "오늘"
		,SYSDATE + 1
		FROM DUAL;
	
SELECT SYSDATE,
		TO_DATE('2020-03-16 09:00:00', ' YYYY-MM-DD hh:mi:ss'),
		SYSDATE- TO_DATE('2020-03-16 09:00:00', ' YYYY-MM-DD hh:mi:ss')
FROM dual;

SELECT 
NAME 이름, SYSDATE 오늘, HIREDATE 입사일, ROUND((MONTHS_BETWEEN(SYSDATE,HIREDATE ))/12) 근속년수 
, round(MONTHS_BETWEEN(SYSDATE,HIREDATE ),1) 근속개월,
round(SYSDATE - HIREDATE,1) 근속일
FROM T_PROFESSOR;

SELECT 
SYSDATE,
LAST_DAY(SYSDATE)
FROM dual;

-- 날짜의 ROUND() 함수  ,  하루의 반은 정오 12:00:00 이다. 이를 넘어서면 다음 날짜
-- 날짜의 TRUNC() 함수,  무조건 당일 출력.
-- 원서 접수나 상품 주문 등에서 오전까지 접수된 건은 당일 접수 처리. 오후접수는 익일 처리 등에서 사용.


SELECT SYSDATe,
ROUND(SYSDATE),
trunc(sysdate)
FROM dual;

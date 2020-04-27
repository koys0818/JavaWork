SELECT * FROM T_DEPT2;

SELECT lpad(dname, 10, '*') 부서명 FROM T_DEPT2;


SELECT dname, LEVEL 
FROM T_DEPT2 
CONNECT BY PRIOR DCODE = PDEPT
START WITH DCODE = 0001;

/* 해설
 * LEVEL 은 오라클에서 계속 사용할 수 있는 것으로
 * 해당 데이터가 몇번째 단계 이냐를 의미하는 것.
 * 
 * CONNECT BY PRIOR  :  각 row 들이 어떻게 연결되어야 하는지 조건 지정
 * PRIOR를 어느쪽에 주느냐가 중요!
 */

SELECT dcode, dname, PDEPT, LEVEL 
FROM T_DEPT2 
CONNECT BY DCODE = PRIOR PDEPT
START WITH DCODE = 1011;

SELECT DATETIME 
FROM ANIMAL_OUTS
CONNECT BY datetime = PRIOR DATETIME + 1
START WITH DATETIME = 0;




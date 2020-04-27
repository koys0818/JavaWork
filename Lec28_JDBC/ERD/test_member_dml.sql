SELECT * FROM test_MEMBER;

INSERT INTO test_member VALUES(10,'남윤주',sysdate);

SELECT * FROM TEST_MEMBER;

INSERT INTO TEST_MEMBER VALUES(22,'이승환',sysdate); 
INSERT INTO TEST_MEMBER VALUES(17,'윤종섭',sysdate); 
INSERT INTO TEST_MEMBER VALUES('','이예지',''); --비어있는 ''를 insert하면 null로 들어감

--dbeaver은 오토커밋이 된다


/* Drop Tables */

DROP TABLE test_member CASCADE CONSTRAINTS;




/* Create Tables */

CREATE TABLE test_member
(
	mb_no number,
	mb_name varchar2(40) NOT NULL,
	mb_birthdate date
);

---시퀀스
DROP SEQUENCE test_member_seq;
CREATE SEQUENCE test_member_seq;


# 부서정보 입력
INSERT INTO dept VALUES(10, 'ACCOUNTING', 'NEW YORK');
INSERT INTO dept VALUES(20, 'RESEARCH', 'DALLAS');
INSERT INTO dept VALUES(30, 'SALES', 'CHICAGO');
INSERT INTO dept VALUES(40, 'OPERATIONS', 'BOSTON');
 
# 사원정보 입력 (자바에서 객체 생성한다고 보면됨)
INSERT INTO emp
VALUES(
 7839, 'KING', 'PRESIDENT', null,
 STR_TO_DATE('17-11-1981','%d-%m-%Y'), #데이트 타입은 이런식으로 입력함, 테이블에 있는 DATE 타입에 맞게 저장하려면 STR_TO_DATE 함수를 사용한다
 5000, null, 10
);

INSERT INTO emp
VALUES(
 7698, 'BLAKE', 'MANAGER', 7839,
 STR_TO_DATE('1-5-1981','%d-%m-%Y'),
 2850, null, 30
);

INSERT INTO emp
VALUES(
 7782, 'CLARK', 'MANAGER', 7839,
 STR_TO_DATE('9-6-1981','%d-%m-%Y'),
 2450, null, 10
);

INSERT INTO emp
VALUES(
 7566, 'JONES', 'MANAGER', 7839,
 STR_TO_DATE('2-4-1981','%d-%m-%Y'),
 2975, null, 20
);

INSERT INTO emp
VALUES(
 7788, 'SCOTT', 'ANALYST', 7566,
 STR_TO_DATE('13-7-1987','%d-%m-%Y'),
 3000, null, 20
);

INSERT INTO emp
VALUES(
 7902, 'FORD', 'ANALYST', 7566,
 STR_TO_DATE('3-12-1981','%d-%m-%Y'),
 3000, null, 20
);

INSERT INTO emp
VALUES(
 7369, 'SMITH', 'CLERK', 7902,
 STR_TO_DATE('17-12-1980','%d-%m-%Y'),
 800, null, 20
);

INSERT INTO emp
VALUES(
 7499, 'ALLEN', 'SALESMAN', 7698,
 STR_TO_DATE('20-2-1981','%d-%m-%Y'),
 1600, 300, 30
);

INSERT INTO emp
VALUES(
 7521, 'WARD', 'SALESMAN', 7698,
 STR_TO_DATE('22-2-1981','%d-%m-%Y'),
 1250, 500, 30
);

INSERT INTO emp
VALUES(
 7654, 'MARTIN', 'SALESMAN', 7698,
 STR_TO_DATE('28-9-1981','%d-%m-%Y'),
 1250, 1400, 30
);

INSERT INTO emp
VALUES(
 7844, 'TURNER', 'SALESMAN', 7698,
 STR_TO_DATE('8-9-1981','%d-%m-%Y'),
 1500, 0, 30
);

INSERT INTO emp
VALUES(
 7876, 'ADAMS', 'CLERK', 7788,
 STR_TO_DATE('13-7-1987', '%d-%m-%Y'),
 1100, null, 20
);

INSERT INTO emp
VALUES(
 7900, 'JAMES', 'CLERK', 7698,
 STR_TO_DATE('3-12-1981','%d-%m-%Y'),
 950, null, 30
);

INSERT INTO emp
VALUES(
 7934, 'MILLER', 'CLERK', 7782,
 STR_TO_DATE('23-1-1982','%d-%m-%Y'),
 1300, null, 10
);
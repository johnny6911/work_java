DROP TABLE emp;
DROP TABLE dept;

# dept 테이블 (부서) 부서정보를 나타네는 테이블
# deptno: 부서번호
# dname: 부서명
# loc: 지역
# 기본키 : deptno
CREATE TABLE dept(
  deptno INT(2),
  dname  VARCHAR(14),
  loc    VARCHAR(13),
  PRIMARY KEY (deptno)
);
 
# emp 테이블 (사원정보)
# empno: 사원번호 (기본키)
# ename: 사원명
# job: 직책
# mgr: 매니저
# hiredate: 입사일
# sal: 급여
# comn : 성과금
# deptno : 부서번호 (외래키)
CREATE TABLE emp(
  empno    INT(4),
  ename    VARCHAR(10),
  job      VARCHAR(9),
  mgr      INT(4),
  hiredate DATE,
  sal      INT(7),
  comm     INT(7),
  deptno   INT(2),
  PRIMARY KEY (empno),
  FOREIGN KEY (deptno) REFERENCES dept (deptno) #dept의 deptno(기본키)를 참조함
);
# 사용자, 권한, 롤 관리
## 15-1~15-3 사용자, 권한, 롤 관리
### SYSTEM
> 11G까지는 SYSTEM 에서 CREATE USER ORACLSTUDY IDENTIFIED BY ORACLE;하면 사용자가 생성된다.
> 12C 이상부턴 오류가 발생한다
+ 해결방법
```
-- 방법 1. ALTER SESSION SET "_ORACLE_SCRIPT"= TRUE;
ALTER SESSION SET "_ORACLE_SCRIPT"= TRUE;
CREATE USER ORACLSTUDY IDENTIFIED BY ORACLE;

-- 방법 2. C##
CREATE USER C##ORACLSTUDY IDENTIFIED BY ORACLE;

-- 사용자 삭제
DROP USER C##ORACLSTUDY;

-- 예시
ALTER SESSION SET "_ORACLE_SCRIPT"=TRUE;

CREATE USER SUN IDENTIFIED BY 1234;
CREATE USER C##ORACLSTUDY IDENTIFIED BY PASSWORD2;

- - 사용자에게 권한 부여하기 (세션, 로그인 접속)
GRANT CREATE SESSION TO SUN;

-- 권한 관리
GRANT RESOURCE, CREATE SESSION, CREATE TABLE TO SUN;

-- 사용자 삭제
DROP USER SUN;


-- 롤관리

CREATE ROLE MYROLE;
GRANT RESOURCE, CREATE SESSION, CREATE TABLE TO MYROLE;

CREATE USER SUN2 IDENTIFUED BY 1234;
GRANT MYROLE TO SUN2;

```
+ 사용자 롤 생성과 권한 부여
```
-- 오라클 12c로 넘어오면서 계정이름 앞에 c##을 붙여줘야 공통 사용자를 생성가능 하다.
-- 유저 할당 OK, 접속권한은 없음
create user c##orclstudy identified by oracle; 
-- 비밀번호 변경
alter user c##orclstudy identified by oracle1;
-- 권한 부여
grant create session to c##orclstudy;
grant resource, create session, create table to c##orclstudy;
-- 롤 생성
create role c##myrole;
-- 롤 권한 부여
grant resource, create session, create table to c##myrole;

-- 연습하기
create user c##myuser2 identified by oracel2;
grant c##myrole to c##myuser2;
select * from all_users;
```

### 19C (SCOTT)
>  SUN 계정에 EMP 테이블 접근 권한을 줌

```
GRANT SELECT ON EMP TO SUN;
GRANT SELECT ON DEPT TO SUN;

GRANT INSERT ON DEPT TO SUN;
GRANT DELETE ON DEPT TO SUN;
```
### SUN

```
CREATE TABLE T1(
COL1 NUMBER
);

SELECT * FROM SCOTT.EMP;
SELECT * FROM SCOTT.DEPT;

INSERT INTO SCOTT.DEPT VALUES ('70', 'DATABASE', 'SEOUL');

DELETE FROM SCOTT.DEPT WHERE DEPTNO = 70;
```

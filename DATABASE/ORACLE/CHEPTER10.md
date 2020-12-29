# 테이터를 추가, 수정, 삭제하는 데이터 조작어
## 테이블 생성하기
```
CREATE TABLE DEPT_TEMP AS SELECT * FROM DEPT;
SELECT * FROM DEPT_TEMP;
DESC DEPT_TEMP;
```
### 1. 데이터를 ROW에 삽입하는 방법
> 데이터 순서, 타입이 동일해야한다.

```
INSERT INTO DEPT_TEMP (DEPTNO, DNAME, LOC) VALUES (50, 'database', 'seoul');
```
> COLUMN이 생략 가능해서 더 간략하게 표현 가능하다.
```
INSERT INTO DEPT_TEMP VALUES (60,'network', 'busan');
```

+ 특정한 값이 없을 때 NULL값을 넣을 수 있다 
> 이때 테이블에 NULLABLE이 YES로 되어있어야 한다.

```
INSERT INTO DEPT_TEMP VALUES (70, 'web', null);
INSERT INTO DEPT_TEMP VALUES (80, 'mobile', '');
INSERT INTO DEPT_TEMP (DEPTNO, LOC) VALUES (90, 'incheon');
```

+ 테이블에 날짜 데이터 입력하기
```
CREATE TABLE EMP_TEMP AS SELECT * FROM EMP;
SELECT * FROM EMP_TEMP;
INSERT INTO EMP_TEMP VALUES(1111, 'KIM1', 'MANAGER', 7839, '2020-12-28', 2000, NULL, 20);
INSERT INTO EMP_TEMP VALUES(1112, 'KIM2', 'SALESMAN', 7839, TO_DATE('07/01/2020', 'MM/DD/YYYY'), 2000, NULL, 20);
INSERT INTO EMP_TEMP VALUES(1113, 'KIM3', 'MANAGER', 7839, SYSDATE, 4000, NULL, 30);
```

+ 서브쿼리를 사용하여 한 번에 여러 데이터 추가하기
```
INSERT INTO EMP_TEMP SELECT EMPNO, ENAME, JOB, MGR, HIREDATE, SAL, COMM, DEPTNO
FROM EMP JOIN SALGRADE
ON SAL BETWEEN LOSAL AND HISAL
WHERE GRADE = 1;
```

### 2. 테이블에 있는 데이터 수정하기
```
SELECT * FROM DEPT_TEMP;
UPDATE DEPT_TEMP SET LOC = 'SEOUL';
UPDATE DEPT_TEMP SET DNAME = 'DATABASE', LOC = 'SEOUL'
WHERE DEPTNO = 40;
UPDATE DEPT_TEMP SET LOC = 'DAEGU'
WHERE DEPNO = 70;
UPDATE DEPT_TEMP SET DNAME = 'OP', LOC = 'BO' WHERE DEPTNO = 40;
```

+ 수정한 내용을 되돌리고 싶을 때
```
ROLLBACK;
```
+ 수정한 내용값을 고정하고 싶을 때 커밋후 롤백해도 이전 데이터값으로 되돌릴 수 없다.
```
COMMIT;
```
+ 서브쿼리를 통해 데이터 값 변경
```
UPDATE dept_temp SET (DNAME, LOC) = (SELECT DNAME, LOC
FROM DEPT WHERE DEPTNO = 40)
WHERE DEPTNO = 40;
```

+ 서브쿼리로 데이터 일부분 수정하기
```
UPDATE DEPT_TEMP SET DNAME = (SELECT DNAME FROM DEPT WHERE DEPTNO = 40), LOC = (SELECT LOC FROM DEPT WHERE DEPTNO = 40)
WHERE DEPTNO = 40;
/* UPDATE문의 WHERE절에 서브쿼리 사용하기 */
UPDATE DEPT_TEMP SET LOC = 'SEOUL2'
WHERE DEPTNO = (SELECT DEPTNO FROM DEPT_TEMP WHERE DNAME = 'DATABASE');
```

### 3. 테이블에 있는 데이터 삭제하기
```
SELECT * FROM DEPT_TEMP;
ROLLBACK;
DELETE FROM DEPT_TEMP WHERE DEPTNO = 40;
```
+ 데이터 일부분만 삭제하기
```
SELECT * FROM EMP_TEMP;

DELETE FROM EMP_TEMP
WHERE JOB = 'MANAGER';

DELETE FROM EMP_TEMP WHERE EMPNO IN (SELECT EMPNO FROM EMP JOIN SALGRADE 
ON SAL BETWEEN LOSAL AND HISAL
WHERE GRADE = 3 AND DEPTNO = 30);
```
+ 테이블 데이터 삭제
```
DELETE FROM EMP_TEMP;
TRUNCATE TABLE EMP_TEMP;
```
+ 테이블 완전 삭제
> 테이블의 모든 데이터 및 구조를 삭제한다
```
DROP TABLE EMP_TEMP2; 
```
### 4. 수정 중인 데이터 접근을 막는 LOCK
> 트랜젝션과 세션을 이해후 LOCK 개념을 잘 알아 두어야 한다.
> 특정 세션에서 조작중인 데이터는 트랜잭션이 완료(COMMIT, ROLLBACK)되기 전까지 다른 세션에서 조작할 수 없는 상태가 된다.
> 특정 세션에서 데이터 조작이 완료될 때까지 다른 세션에서 해당 데이터 조작을 기다리는 현상을 HANG(행)이라고 한다.

```
CREATE TABLE DEPT_TCL AS SELECT * FROM DEPT;
SELECT * FROM DEPT_TCL;

/* INSERT , UPDATE, DELETE 실행하기 */
INSERT INTO dept_tcl VALUES (50,'DATABASE','SEOUL');
UPDATE dept_tcl SET LOC = 'BUSAN' WHERE DEPTNO = 40;
DELETE dept_tcl WHERE DNAME = 'RESEARCH';
SELECT * FROM dept_tcl;

/*INSERT , UPDATE, DELETE를 동시에 실행 후 롤백을 하면 INSERT , UPDATE, DELETE, SELECT 전체 값이 수정전으로 되돌아간다.*/
ROLLBACK;

/*INSERT , UPDATE를 먼저 실행 후 DELETE를 하면 ROLLBACK, COMMIT시 DELETE는 수정전으로 되돌아가고 INSERT , UPDATE는 영구히 저장된다. */
DELETE dept_tcl WHERE deptno = 50;

/* 
    다른 세션에 변경된 값을 반영하려면 COMMIT을 꼭 해야한다 
    다른 사용자가 변경된 내용을 확인하려면 먼저 실행한 세션에서 COMMIT을 꼭 해줘야 한다.
*/
COMMIT;

/*
    실행한 세션에서 UPDATE DEPT_TCL SET LOC = 'SEOUL2' WHERE DEPTNO = 30;을 실행하면 LOCK이 걸리고
    다른 세션들은 작업을 할 수 없게 된다. 이때 COMMIT을 해야만 ROCK이 풀린다.
*/

UPDATE DEPT_TCL SET LOC = 'SEOUL2' WHERE DEPTNO = 30;
COMMIT;
```
### 테이블처럼 사용하는 뷰
> SCOTT 계정은 뷰 생성 권한이 없으므로 SYSTEM 계정으로 접속한 후 다음 명령어를 사용하여 SCOTT 계정에 권한을 부여해야 한다.
```
GRANT CREATE VIEW TO SCOTT;
```
흔히 가상 테이블로 부르는 뷰는 하나 이상의 테이블을 조회하는 SELECT문을 저장한 객체를 뜻한다.
```
CREATE VIEW EMP_VIEW AS
SELECT EMPNO, ENAME, JOB, DEPTNO FROM EMP WHERE DEPTNO = 20;
-- 생성한 뷰 조회하기
SELECT * FROM EMP_VIEW;
-- 뷰 삭제
DROP VIEW EMP_VIEW;
```
+ 인라인 뷰
```
SELECT ROWNUM, E.* FROM EMP E;

SELECT ROWNUM, E.* FROM (SELECT * FROM EMP ORDER BY SAL DESC) E;

WITH E AS (SELECT * FROM EMP ORDER BY SAL DESC)
SELECT ROWNUM, E.* FROM E;

WITH EMP_VIEW2 AS (SELECT EMPNO, ENAME, JOB, DEPTNO FROM EMP WHERE DEPTNO = 20)
SELECT * FROM EMP_VIEW2;

SELECT ROWNUM, E.* FROM (SELECT * FROM EMP ORDER BY SAL DESC) E
WHERE ROWNUM <= 3;

WITH E AS (SELECT * FROM EMP ORDER BY SAL DESC)
SELECT ROWNUM, E.* FROM E
WHERE ROWNUM <= 3;
```


# *Reference
+ [오라클로 배우는 데이터베이스 입문](http://www.yes24.com/Product/Goods/65849798)


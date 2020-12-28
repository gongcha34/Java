# 테이터를 추가, 수정, 삭제하는 데이터 조작어
## 테이블 생성하기
```
CREATE TABLE DEPT_TEMP AS SELECT * FROM DEPT;
SELECT * FROM DEPT_TEMP;
DESC DEPT_TEMP;
```
## 데이터를 ROW에 삽입하는 방법
> 데이터 순서, 타입이 동일해야한다.

```
INSERT INTO DEPT_TEMP (DEPTNO, DNAME, LOC) VALUES (50, 'database', 'seoul');
```
### column이 생략 가능해서 더 간략하게 표현 가능
```
INSERT INTO DEPT_TEMP VALUES (60,'network', 'busan');
```

### 특정한 값이 없을 때 NULL값을 넣을 수 있다 
> 이때 테이블에 NULLABLE이 YES로 되어있어야 한다.

```
INSERT INTO DEPT_TEMP VALUES (70, 'web', null);
INSERT INTO DEPT_TEMP VALUES (80, 'mobile', '');
INSERT INTO DEPT_TEMP (DEPTNO, LOC) VALUES (90, 'incheon');
```

### 테이블에 날짜 데이터 입력하기
```
CREATE TABLE EMP_TEMP AS SELECT * FROM EMP;
SELECT * FROM EMP_TEMP;
INSERT INTO EMP_TEMP VALUES(1111, 'KIM1', 'MANAGER', 7839, '2020-12-28', 2000, NULL, 20);
INSERT INTO EMP_TEMP VALUES(1112, 'KIM2', 'SALESMAN', 7839, TO_DATE('07/01/2020', 'MM/DD/YYYY'), 2000, NULL, 20);
INSERT INTO EMP_TEMP VALUES(1113, 'KIM3', 'MANAGER', 7839, SYSDATE, 4000, NULL, 30);
```

### 서브쿼리를 사용하여 한 번에 여러 데이터 추가하기
```
INSERT INTO EMP_TEMP SELECT EMPNO, ENAME, JOB, MGR, HIREDATE, SAL, COMM, DEPTNO
FROM EMP JOIN SALGRADE
ON SAL BETWEEN LOSAL AND HISAL
WHERE GRADE = 1;
```

# *Reference
+ []()



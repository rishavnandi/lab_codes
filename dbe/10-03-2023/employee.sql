CREATE TABLE EMPLOYEE(
    EMP_ID NUMBER(3),
    EMP_NAME VARCHAR2(20),
    EMP_SALARY NUMBER(7),
    EMP_CITY VARCHAR2(20)
);

INSERT INTO EMPLOYEE VALUES(
    101,
    'Ajay',
    25000,
    'Odisha'
);

INSERT INTO EMPLOYEE VALUES(
    102,
    'Anuj',
    30000,
    'New Delhi'
);

INSERT INTO EMPLOYEE VALUES(
    103,
    'Piyam',
    80000,
    'Goa'
);

INSERT INTO EMPLOYEE VALUES(
    202,
    'Ram',
    29000,
    'Punjab'
);

INSERT INTO EMPLOYEE VALUES(
    203,
    'Sumit',
    40000,
    'Kolkata'
);

INSERT INTO EMPLOYEE VALUES(
    204,
    'Ankit',
    30000,
    'New Delhi'
);

SELECT
    EMP_SALARY + 20000
FROM
    EMPLOYEE;

SELECT
    EMP_SALARY - 4000
FROM
    EMPLOYEE;

SELECT
    EMP_ID*EMP_SALARY
FROM
    EMPLOYEE
WHERE
    EMP_ID=102;

SELECT
    *
FROM
    EMPLOYEE
WHERE
    EMP_SALARY = 30000;

SELECT
    *
FROM
    EMPLOYEE
WHERE
    EMP_SALARY != 45000;

SELECT
    *
FROM
    EMPLOYEE
WHERE
    EMP_ID>202;

SELECT
    *
FROM
    EMPLOYEE
WHERE
    EMP_ID>=202;

SELECT
    *
FROM
    EMPLOYEE
WHERE
    EMP_ID < 204;

SELECT
    *
FROM
    EMPLOYEE
WHERE
    EMP_ID<=203;

SELECT
    *
FROM
    EMPLOYEE
WHERE
    EMP_SALARY=30000
    AND EMP_CITY='New Delhi';

SELECT
    *
FROM
    EMPLOYEE
WHERE
    EMP_SALARY=30000
    AND EMP_CITY='Punjab';

SELECT
    *
FROM
    EMPLOYEE
WHERE
    EMP_SALARY>25000
    AND EMP_SALARY<40000;

SELECT
    *
FROM
    EMPLOYEE
WHERE
    EMP_ID = 202
    OR EMP_ID = 204
    OR EMP_ID = 205;

SELECT
    *
FROM
    EMPLOYEE
WHERE
    EMP_NAME LIKE 'a%';

SELECT
    *
FROM
    EMPLOYEE
WHERE
    EMP_NAME LIKE 'A%';

SELECT
    *
FROM
    EMPLOYEE
WHERE
    EMP_NAME LIKE '%t';

SELECT
    *
FROM
    EMPLOYEE
WHERE
    EMP_NAME LIKE 'A%m';
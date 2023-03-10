CREATE TABLE SALSEMAN(
    CUSTOMER_ID NUMBER(4),
    CUSTOMER_NAME VARCHAR2(20),
    CITY VARCHAR2(20),
    GRADE NUMBER(3),
    SALESMAN_ID NUMBER(4)
);

INSERT INTO SALSEMAN VALUES(
    3002,
    'Ankit',
    'New Delhi',
    100,
    5001
);

INSERT INTO SALSEMAN VALUES(
    3007,
    'Aysuh',
    'London',
    200,
    5001
);

INSERT INTO SALSEMAN VALUES(
    3005,
    'Pritam',
    'Moscow',
    200,
    5002
);

INSERT INTO SALSEMAN VALUES(
    3008,
    'Priya',
    'Malta',
    300,
    5002
);

INSERT INTO SALSEMAN VALUES(
    3004,
    'Pragya',
    'Odisha',
    300,
    5006
);

INSERT INTO SALSEMAN VALUES(
    3009,
    'Raghab',
    'TamilNadu',
    450,
    5003
);

INSERT INTO SALSEMAN VALUES(
    3001,
    'Shyam',
    'Paris',
    100,
    5007
);

INSERT INTO SALSEMAN VALUES(
    3003,
    'Madhu',
    'Moscow',
    200,
    5007
);

INSERT INTO SALSEMAN VALUES(
    3010,
    'Piyush',
    'New Delhi',
    300,
    5005
);

SELECT
    *
FROM
    SALSEMAN
WHERE
    GRADE>250;

SELECT
    *
FROM
    SALSEMAN
WHERE
    GRADE>100
    AND CITY='New Delhi';

UPDATE SALSEMAN
SET
    GRADE=GRADE+50
WHERE
    CUSTOMER_ID=3001;

UPDATE SALSEMAN
SET
    GRADE=GRADE-75;

CREATE TABLE EMPLOYEE(
    EMP_ID NUMBER(3),
    EMP_NAME VARCHAR2(20),
    EMP_SALARY NUMBER(7)
);

INSERT INTO EMPLOYEE VALUES(
    101,
    'Ajay',
    25000
);

INSERT INTO EMPLOYEE VALUES(
    102,
    'Anuj',
    30000
);

INSERT INTO EMPLOYEE VALUES(
    103,
    'Piyam',
    80000
);

UPDATE EMPLOYEE
SET
    EMP_SALARY=EMP_SALARY+20000;

UPDATE EMPLOYEE
SET
    EMP_SALARY=EMP_SALARY-4000;

SELECT
    EMP_ID*EMP_SALARY
FROM
    EMPLOYEE
WHERE
    EMP_ID=102;
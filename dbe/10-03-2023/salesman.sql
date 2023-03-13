CREATE TABLE SALESMAN(
    CUSTOMER_ID NUMBER(4),
    CUSTOMER_NAME VARCHAR2(20),
    EMP_CITY VARCHAR2(20),
    GRADE NUMBER(3),
    SALESMAN_ID NUMBER(4)
);

INSERT INTO SALESMAN VALUES(
    3002,
    'Ankit',
    'New Delhi',
    100,
    5001
);

INSERT INTO SALESMAN VALUES(
    3007,
    'Aysuh',
    'London',
    200,
    5001
);

INSERT INTO SALESMAN VALUES(
    3005,
    'Pritam',
    'Moscow',
    200,
    5002
);

INSERT INTO SALESMAN VALUES(
    3008,
    'Priya',
    'Malta',
    300,
    5002
);

INSERT INTO SALESMAN VALUES(
    3004,
    'Pragya',
    'Odisha',
    300,
    5006
);

INSERT INTO SALESMAN VALUES(
    3009,
    'Raghab',
    'TamilNadu',
    450,
    5003
);

INSERT INTO SALESMAN VALUES(
    3001,
    'Shyam',
    'Paris',
    100,
    5007
);

INSERT INTO SALESMAN VALUES(
    3003,
    'Madhu',
    'Moscow',
    200,
    5007
);

INSERT INTO SALESMAN VALUES(
    3010,
    'Piyush',
    'New Delhi',
    300,
    5005
);

SELECT
    *
FROM
    SALESMAN
WHERE
    GRADE>250;

SELECT
    *
FROM
    SALESMAN
WHERE
    GRADE>100
    AND EMP_CITY='New Delhi';

SELECT
    GRADE+50
FROM
    SALESMAN
WHERE
    CUSTOMER_ID=3001;

SELECT
    GRADE - 75
FROM
    SALESMAN;
-- From question 1

CREATE TABLE STUDENT(
    NAME VARCHAR2(20),
    ROLL_NO NUMBER(4),
    DEPARTMENT VARCHAR(20),
    SEM VARCHAR2(10),
    PH_NO NUMBER(10)
);

INSERT INTO STUDENT VALUES(
    'Abhay',
    1002,
    'BTech',
    '4th',
    123457844
);

INSERT INTO STUDENT VALUES(
    'Harsh',
    1003,
    'Diploma',
    '2nd',
    816546411
);

INSERT INTO STUDENT VALUES(
    'Pandey',
    1007,
    'BTech',
    '3rd',
    789023455
);

SELECT
    *
FROM
    STUDENT
WHERE
    DEPARTMENT='BTech';

SELECT
    *
FROM
    STUDENT
WHERE
    NAME='Abhay'
    AND ROLL_NO=1002;

SELECT
    *
FROM
    STUDENT
WHERE
    SEM='4th'
    AND DEPARTMENT='BTech';

SELECT
    PH_NO
FROM
    STUDENT
WHERE
    SEM='4th';
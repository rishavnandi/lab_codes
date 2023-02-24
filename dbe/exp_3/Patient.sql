CREATE TABLE PATIENT_DETAILS(
    NAME VARCHAR2(20),
    PATIENT_ID NUMBER(3),
    DISEASE VARCHAR2(50),
    GENDER VARCHAR2(1),
    TREATMENT_PERIOD VARCHAR2(20)
);

INSERT INTO PATIENT_DETAILS VALUES(
    'Ram',
    101,
    'Common_cold',
    'M',
    '3 days'
);

INSERT INTO PATIENT_DETAILS VALUES(
    'Hari',
    102,
    'Cancer',
    'M',
    '56 days'
);

INSERT INTO PATIENT_DETAILS VALUES(
    'Priya',
    103,
    'COVID-19',
    'F',
    '84 days'
);

INSERT INTO PATIENT_DETAILS VALUES(
    'Rohit',
    104,
    'COVID-19',
    'M',
    '50 days'
);

INSERT INTO PATIENT_DETAILS VALUES(
    'Priti',
    105,
    'Flu',
    'F',
    '5 days'
);

INSERT INTO PATIENT_DETAILS VALUES(
    'Laxman',
    106,
    'Cancer',
    'M',
    '56 days'
);

INSERT INTO PATIENT_DETAILS VALUES(
    'Hari',
    107,
    'Cancer',
    'M',
    '56 days'
);

INSERT INTO PATIENT_DETAILS VALUES(
    'Sita',
    108,
    'Stomach_Aches',
    'F',
    '10 days'
);

INSERT INTO PATIENT_DETAILS VALUES(
    'Priya',
    109,
    'Allergies',
    'F',
    '2 days'
);

INSERT INTO PATIENT_DETAILS VALUES(
    'Bharat',
    119,
    'ColdandFlu',
    'M',
    '1 day'
);

UPDATE PATIENT_DETAILS
SET
    PATIENT_ID=44
WHERE
    PATIENT_ID=104;

DELETE FROM PATIENT_DETAILS
WHERE
    GENDER='F'
    AND DISEASE='COVID-19';

INSERT INTO PATIENT_DETAILS VALUES(
    'Priya',
    412,
    'COVID-19',
    'F',
    '56 days'
);

DELETE FROM PATIENT_DETAILS
WHERE
    PATIENT_ID=109;

DELETE FROM PATIENT_DETAILS
WHERE
    DISEASE='FLU';

DELETE FROM PATIENT_DETAILS
WHERE
    DISEASE='COVID-19'
    AND GENDER='F';

DELETE FROM PATIENT_DETAILS
WHERE
    NAME='Priya'
    AND TREATMENT_PERIOD='2 days';

DELETE FROM PATIENT_DETAILS
WHERE
    GENDER='M'
    AND PATIENT_ID=107;

SELECT
    *
FROM
    PATIENT_DETAILS;
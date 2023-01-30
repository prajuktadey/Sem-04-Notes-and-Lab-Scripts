SHOW databases;
CREATE database sem4;

USE sem4;
CREATE TABLE DEPOSIT_21052263(
ACTNO VARCHAR(5),
CNAME VARCHAR(20),
BNAME VARCHAR(20),
AMOUNT NUMERIC(8,2),
ADATE DATE
);

DESCRIBE DEPOSIT_21052263;

CREATE TABLE BRANCH_21052263(
BNAME VARCHAR(20),
CITY VARCHAR(20)
);

DESCRIBE BRANCH_21052263;

CREATE TABLE CUSTOMER_21052263(
CNAME VARCHAR(20),
CITY VARCHAR(20)
);

DESCRIBE CUSTOMER_21052263;

CREATE TABLE BORROW_21052263(
LOANNO VARCHAR(5),
CNAME VARCHAR(20),
BNAME VARCHAR(20),
AMOUNT NUMERIC (8,2)
);

DESCRIBE BORROW_21052263;

INSERT INTO DEPOSIT_21052263 VALUES(100, 'ANIL', 'VRCE', 1000.00, '1995-03-01');
INSERT INTO DEPOSIT_21052263 VALUES(101, 'SUNIL', 'AJNI', 5000.00, '1996-01-04');
INSERT INTO DEPOSIT_21052263 VALUES(102, 'RAHUL', 'KAROLBAGH', 3500.00, '1995-11-17');
INSERT INTO DEPOSIT_21052263 VALUES(103, 'MADHURI', 'CHANDNI', 1200.00, '1995-12-17');
INSERT INTO DEPOSIT_21052263 VALUES(104, 'PRAMOD', 'MGROAD', 3000.00, '1996-03-27');
INSERT INTO DEPOSIT_21052263 VALUES(105, 'SANDIP', 'KAROLBAGH', 2000.00, '1996-03-31');

SELECT * FROM DEPOSIT_21052263;

INSERT INTO BRANCH_21052263 VALUES('VRCE', 'NAGPUR');
INSERT INTO BRANCH_21052263 VALUES('AJNI', 'NAGPUR');
INSERT INTO BRANCH_21052263 VALUES('KAROLBAGH', 'DELHI');
INSERT INTO BRANCH_21052263 VALUES('CHANDNI', 'DELHI');
INSERT INTO BRANCH_21052263 VALUES('MGROAD', 'BANGALORE');

SELECT * FROM BRANCH_21052263;

INSERT INTO CUSTOMER_21052263 VALUES('ANIL', 'CALCUTTA');
INSERT INTO CUSTOMER_21052263 VALUES('SUNIL', 'DELHI');
INSERT INTO CUSTOMER_21052263 VALUES('RAHUL', 'BARODA');
INSERT INTO CUSTOMER_21052263 VALUES('MADHURI', 'NAGPUR');
INSERT INTO CUSTOMER_21052263 VALUES('PRAMOD', 'NAGPUR');

SELECT * FROM CUSTOMER_21052263;

INSERT INTO BORROW_21052263 VALUES (201, 'ANIL', 'VRCE', 1000.00);
INSERT INTO BORROW_21052263 VALUES (206, 'RAHUL', 'AJNI', 5000.00);
INSERT INTO BORROW_21052263 VALUES (311, 'SUNIL', 'DHARAMPETH',3000.00);
INSERT INTO BORROW_21052263 VALUES (321, 'MADHURI', 'ANDHERI', 2000.00);
INSERT INTO BORROW_21052263 VALUES (375, 'PRAMOD', 'VIHAR', 8000.00);

SELECT * FROM BORROW_21052263;


USE sem4;

INSERT INTO DEPOSIT_21052263 VALUES(101, 'ANIL', 'VRCE', 1000.00, '1995-03-01', 1);
INSERT INTO DEPOSIT_21052263 VALUES(102, 'SUNIL', 'AJNI', 5000.00, '1996-01-04', 2);
INSERT INTO DEPOSIT_21052263 VALUES(103, 'RAHUL', 'KAROLBAGH', 3500.00, '1995-11-17',3);
INSERT INTO DEPOSIT_21052263 VALUES(104, 'MADHURI', 'CHANDNI', 1200.00, '1995-12-17',4);
INSERT INTO DEPOSIT_21052263 VALUES(105, 'PRAMOD', 'MGROAD', 3000.00, '1996-03-27',5);
INSERT INTO DEPOSIT_21052263 VALUES(106, 'SANDIP', 'KAROLBAGH', 2000.00, '1996-03-31',6);

INSERT INTO BRANCH_21052263 VALUES('VRCE', 'NAGPUR');
INSERT INTO BRANCH_21052263 VALUES('AJNI', 'NAGPUR');
INSERT INTO BRANCH_21052263 VALUES('KAROLBAGH', 'DELHI');
INSERT INTO BRANCH_21052263 VALUES('CHANDNI', 'DELHI');
INSERT INTO BRANCH_21052263 VALUES('MGROAD', 'BANGALORE');

INSERT INTO CUSTOMER_21052263 VALUES('ANIL', 'CALCUTTA');
INSERT INTO CUSTOMER_21052263 VALUES('SUNIL', 'DELHI');
INSERT INTO CUSTOMER_21052263 VALUES('RAHUL', 'BARODA');
INSERT INTO CUSTOMER_21052263 VALUES('MADHURI', 'NAGPUR');
INSERT INTO CUSTOMER_21052263 VALUES('PRAMOD', 'NAGPUR');

INSERT INTO LOAN VALUES (201, 'ANIL', 'VRCE', 1000.00);
INSERT INTO LOAN VALUES (206, 'RAHUL', 'AJNI', 5000.00);
INSERT INTO LOAN VALUES (311, 'SUNIL', 'DHARAMPETH',3000.00);
INSERT INTO LOAN VALUES (321, 'MADHURI', 'ANDHERI', 2000.00);
INSERT INTO LOAN VALUES (375, 'PRAMOD', 'VIHAR', 8000.00);

ALTER TABLE BORROW_21052263_21052263 RENAME TO LOAN; -- rename table name

ALTER TABLE LOAN RENAME COLUMN LOANNO TO L_ID; -- rename column name

ALTER TABLE LOAN MODIFY L_ID INT; -- modify the datatype

ALTER TABLE DEPOSIT_21052263 MODIFY ACTNO VARCHAR(2); -- modify the datatype
ALTER TABLE DEPOSIT_21052263 MODIFY ACTNO INT;

ALTER TABLE DEPOSIT_21052263 MODIFY ACTNO INT NOT NULL; -- set a field to not null

ALTER TABLE LOAN MODIFY L_ID INT NOT NULL UNIQUE; -- set a field to not null and unique

ALTER TABLE DEPOSIT_21052263
ADD D_ID INT;
UPDATE DEPOSIT_21052263 SET D_ID=1 WHERE ACTNO=100;
UPDATE DEPOSIT_21052263 SET D_ID=2 WHERE ACTNO=101;
UPDATE DEPOSIT_21052263 SET D_ID=3 WHERE ACTNO=102;
UPDATE DEPOSIT_21052263 SET D_ID=4 WHERE ACTNO=103;
UPDATE DEPOSIT_21052263 SET D_ID=5 WHERE ACTNO=104;
UPDATE DEPOSIT_21052263 SET D_ID=6 WHERE ACTNO=105; -- add new column

ALTER TABLE DEPOSIT_21052263 MODIFY D_ID INT NOT NULL; -- set a field to not null

ALTER TABLE DEPOSIT_21052263 
ALTER ADATE SET DEFAULT '1990-01-01'; -- default value of date

ALTER TABLE DEPOSIT_21052263 ADD CONSTRAINT A1 CHECK (ACTNO>100); -- add a check

ALTER TABLE LOAN ADD CONSTRAINT A2 CHECK (AMOUNT<10000.00); -- add a check

ALTER TABLE DEPOSIT_21052263 ADD CONSTRAINT A3 CHECK (ADATE > '1990-01-01'); -- add a date constraint

SELECT D_ID FROM DEPOSIT_21052263 WHERE YEAR(ADATE) = 1995; -- use the where claus

SELECT AVG(ACTNO) FROM DEPOSIT_21052263; -- average

SELECT ACTNO, AMOUNT FROM DEPOSIT_21052263 ORDER BY AMOUNT DESC; -- descending order
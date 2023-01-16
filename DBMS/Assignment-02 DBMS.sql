USE assignment1;

INSERT INTO student VALUES(
2263,
'Dey',
'Prajukta',
'KIIT Road',
'BBSR',
'Odisha',
751024,
'2022-01-8',
'2002-09-23',
2001,
'CSE05',
1234);

INSERT INTO student VALUES(
2264,
'Robinson',
'Sarah',
'Wellington Street',
'Kolkata',
'West Bengal',
700002,
'2022-01-8',
'2002-10-27',
2040,
'IT04',
7890);

INSERT INTO student VALUES(
2265,
'Rowling',
'Minerva',
'Avenue 6',
'BBSR',
'Odisha',
751024,
'2022-01-8',
'2004-07-20',
2004,
'ETC08',
3456);

INSERT INTO student VALUES(
2266,
'Brown',
'Dan',
'KIIT Road',
'BBSR',
'Odisha',
751024,
'2022-01-8',
'2003-09-03',
2001,
'CSE05',
6789);

INSERT INTO student VALUES(
2267,
'Sharma',
'Ken',
'Chembur',
'Mumbai',
'Maharashtra',
701024,
'2022-01-8',
'2003-04-20',
2040,
'IT04',
7634);

SELECT * FROM student;

SELECT Zip FROM student WHERE (Zip> 750000 AND Zip<760000);

SELECT StudentId, Last, First FROM student WHERE StudentId=2263 AND not last='aaa';

SELECT StudentId, Last, First FROM student WHERE StudentId=2263 AND last<>'aaa'; -- <> means not equal to

UPDATE student SET Phone=2874 WHERE StudentId=2267; -- for updation





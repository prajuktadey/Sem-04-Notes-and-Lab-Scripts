CREATE DATABASE student_college;
USE student;

CREATE TABLE student_info(
Roll INT,
Name VARCHAR(20),
Phone INT,
CONSTRAINT stinfo_pk PRIMARY KEY(roll)
);

CREATE TABLE student_marks(
Roll INT,
FOREIGN KEY (Roll) REFERENCES student_info(Roll),
Sub1 INT,
Sub2 INT
);

ALTER TABLE student_marks ADD CONSTRAINT ST_FK FOREIGN KEY(Roll) REFERENCES student_info(Roll) ON DELETE CASCADE;

INSERT INTO student_marks VALUES (101, 80, 85);
INSERT INTO student_marks VALUES (102, 70, 75);
INSERT INTO student_marks VALUES (103, 60, NULL);
INSERT INTO student_marks VALUES (104, 60, 90);
INSERT INTO student_marks VALUES (108, 65, NULL);

INSERT INTO student_info VALUES (101, "AAA" , 12345);
INSERT INTO student_info VALUES (102, "BBB", NULL);
INSERT INTO student_info VALUES (103, "CCC" , 23456);
INSERT INTO student_info VALUES (104, "DDD" , NULL);
INSERT INTO student_info VALUES (105, "EEE" , 34567);
INSERT INTO student_info VALUES (106, "FFF" , NULL);
INSERT INTO student_info VALUES (107, "AAA" , 45678);
INSERT INTO student_info VALUES (108, "BBB" , NULL);

SELECT Roll FROM student_marks WHERE Sub1+Sub2>150;

SELECT student_info.Roll, student_info.Name
FROM student_info
LEFT JOIN student_marks ON student_info.Roll=student_marks.Roll
WHERE student_marks.Sub1 + student_marks.Sub2 > 150;

SELECT * FROM student_info WHERE Roll IN(101, 102, 103);

SELECT * FROM student_info WHERE Roll BETWEEN 101 AND 103;

SELECT Name FROM student_info WHERE Roll in (SELECT Roll FROM student_marks WHERE Sub1+Sub2>150);

SELECT student_info.Name FROM student_info, student_marks WHERE student_info.roll = student_marks.roll AND student_marks.Sub1+ student_marks.Sub2>150;

SELECT I.name FROM student_info AS I, student_marks AS M WHERE I.roll = M.roll AND M.Sub1+M.Sub2>150;

SELECT I.name FROM student_info I, student_marks M WHERE I.roll = M.roll AND M.Sub1+M.Sub2>150;

SELECT student_info.Roll, student_info.Name
FROM student_info
INNER JOIN student_marks ON student_info.Roll=student_marks.Roll
WHERE student_marks.Sub1 + student_marks.Sub2 > 150;



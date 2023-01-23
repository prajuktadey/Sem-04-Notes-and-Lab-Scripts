USE assignment2;

RENAME TABLE student_marks TO stu;

ALTER TABLE stu RENAME COLUMN Roll To Roll_No;

ALTER TABLE stu MODIFY Roll_No BIGINT;

ALTER TABLE stu DROP COLUMN Sem1_marks;

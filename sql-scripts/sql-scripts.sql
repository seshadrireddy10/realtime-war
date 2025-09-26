CREATE TABLE student 
  ( 
     student_id      INT PRIMARY KEY auto_increment, 
     first_name      VARCHAR(50), 
     last_name       VARCHAR(50), 
     email_id        VARCHAR(50), 
     password        VARCHAR(50), 
     year_of_passout INT, 
     profile_pic     BLOB 
  ); 
  
CREATE TABLE STUDENTS_COURCES
  (
	COURSE_ID INT, fr
	 STUDENT_ID INT NOT NULL
  );

CREATE TABLE COURSES 
 (
   COURSE_ID INT NOT NULL PRIMARY KEY AUTO_INCREMENT,
   COURSE_NAME VARCHAR(30),
   COURSE_DURATION VARCHAR(100),
   COST int
 ); 
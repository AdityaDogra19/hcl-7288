CREATE DATABASE school_db;
USE school_db;

CREATE TABLE students (
    student_id INT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(50) NOT NULL,
    email VARCHAR(100) UNIQUE,
    age INT CHECK (age >= 5),
    city VARCHAR(50) DEFAULT 'Delhi',
    admission_date DATE
);

CREATE TABLE marks (
    mark_id INT PRIMARY KEY,
    student_id INT,
    subject VARCHAR(30),
    score INT,
    FOREIGN KEY (student_id) REFERENCES students(student_id)
);

ALTER TABLE students
ADD COLUMN phone VARCHAR(20);

ALTER TABLE students
MODIFY COLUMN phone VARCHAR(15);

ALTER TABLE students
RENAME COLUMN city TO hometown;

CREATE INDEX idx_student_name ON students (name);

INSERT INTO students (name, email, age, hometown, admission_date, phone)
VALUES
    ('Priya Verma', 'priya.verma@example.com', 15, 'Delhi', '2024-04-02', '9876543211'),
    ('Rohan Mehta', 'rohan.mehta@example.com', 13, 'Mumbai', '2024-04-03', '9876543212'),
    ('Ananya Gupta', 'ananya.gupta@example.com', 16, 'Delhi', '2024-04-04', '9876543213'),
    ('Vikram Singh', 'vikram.singh@example.com', 14, 'Jaipur', '2024-04-05', '9876543214'),
    ('Neha Kapoor', 'neha.kapoor@example.com', 15, 'Pune', '2024-04-06', '9876543215');

SELECT student_id, name FROM students;

INSERT INTO marks (mark_id, student_id, subject, score)
VALUES
    (1, 1, 'Maths', 88),
    (2, 1, 'Science', 79),
    (3, 1, 'English', 84),
    (4, 2, 'Maths', 65),
    (5, 2, 'Science', 72),
    (6, 3, 'English', 18),
    (7, 3, 'Maths', 91),
    (8, 4, 'Science', 85),
    (9, 4, 'English', 76),
    (10, 5, 'Maths', 15),
    (11, 5, 'Science', 68),
    (12, 5, 'English', 82);

UPDATE marks
SET score = score + 5
WHERE subject = 'Maths';

UPDATE students
SET hometown = 'Noida'
WHERE student_id = 2;

UPDATE students
SET age = age + 1
WHERE hometown = 'Delhi';

DELETE FROM marks WHERE student_id = 6;
DELETE FROM students WHERE student_id = 6;

DELETE FROM marks
WHERE score < 20;

SELECT * FROM students;
SELECT * FROM marks;

SELECT name AS `Student Name`, hometown
FROM students;

SELECT *
FROM students
WHERE age BETWEEN 10 AND 15;

SELECT *
FROM students
WHERE name LIKE 'A%';

SELECT *
FROM students
WHERE hometown IN ('Delhi', 'Noida')
ORDER BY age DESC;

SELECT *
FROM students
ORDER BY age DESC
LIMIT 3;

SELECT DISTINCT hometown
FROM students;

SELECT hometown, count(*) AS total_students
FROM students
GROUP BY hometown;

SELECT subject,
AVG(score) AS Average_score,
MAX(score) AS Maximum_score,
MIN(score) AS Minimum_score
from marks
GROUP BY subject;

SELECT subject,
AVG(score) AS average_score
FROM marks
GROUP BY subject
HAVING AVG(score) > 60;








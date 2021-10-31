DROP DATABASE IF EXISTS examen;
CREATE DATABASE examen;
USE examen;

CREATE TABLE genders(
  id INT PRIMARY KEY NOT NULL AUTO_INCREMENT,
  name VARCHAR(255) NOT NULL
);

CREATE TABLE jobs(
  id INT PRIMARY KEY NOT NULL AUTO_INCREMENT,
  name VARCHAR(255) NOT NULL,
  salary DECIMAL(9, 2) NOT NULL
);

CREATE TABLE employees (
  id INT PRIMARY KEY AUTO_INCREMENT,
  gender_id INT NOT NULL,
  job_id INT NOT NULL,
  name VARCHAR(255) NOT NULL,
  last_name VARCHAR(255) NOT NULL,
  birthdate DATE NOT NULL,
  FOREIGN KEY (gender_id) REFERENCES genders(id),
  FOREIGN KEY (job_id) REFERENCES jobs(id)
);

CREATE TABLE employee_worked_hours (
  id INT PRIMARY KEY NOT NULL AUTO_INCREMENT,
  employee_id INT NOT NULL,
  worked_hours INT NOT NULL,
  worked_date DATE NOT NULL,
  FOREIGN KEY (employee_id) REFERENCES employees(id)
);

INSERT INTO examen.genders (name) VALUES ('MALE'), ('FEMALE');
INSERT INTO examen.jobs (name, salary) VALUES ('PROJECT MANAGER', 197.56), ('ANALYST', 200.87), ('ENGINEER', 150.78);
INSERT INTO examen.employees (gender_id, job_id, name, last_name, birthdate) VALUES
  (2, 1, "MARIANA", "VELAZQUEZ", "1999-02-01"),
  (1, 2, "RICARDO", "ALMAZAN", "1997-05-24"),
  (2, 3, "ADRIANA", "RODRIGUEZ", "1999-09-15");


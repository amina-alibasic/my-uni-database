CREATE TABLE enu_user_type (
      id int NOT NULL PRIMARY KEY,
      short_code varchar(255),
      description varchar(255)
);

CREATE TABLE users (
      id int NOT NULL PRIMARY KEY,
      first_name varchar(255),
      last_name varchar(255),
      date_of_birth date,
      user_type_id int,
      FOREIGN KEY(user_type_id) REFERENCES enu_user_type(id),
      isAdmin boolean
);

CREATE TABLE user_credentials (
      id int NOT NULL PRIMARY KEY,
      username varchar(255),
      password varchar(255),
      email_address varchar(255)
);

CREATE TABLE enu_employment_type (
      id int NOT NULL PRIMARY KEY,
      description varchar(255)
);

CREATE TABLE departments (
      id int NOT NULL PRIMARY KEY,
      name varchar(255)
);

CREATE TABLE professors (
      id int NOT NULL PRIMARY KEY,
      user_id int,
      FOREIGN KEY(user_id) REFERENCES users(id)
);

CREATE TABLE classes (
       id int NOT NULL PRIMARY KEY,
       name varchar(255),
       department_id int,
       professor_id int,
       FOREIGN KEY(department_id) REFERENCES departments(id),
       FOREIGN KEY(professor_id) REFERENCES professors(id)
);

CREATE TABLE students (
      id int NOT NULL PRIMARY KEY,
      user_id int,
      department_id int,
      FOREIGN KEY(user_id) REFERENCES users(id),
      FOREIGN KEY(department_id) REFERENCES departments(id)
);

CREATE TABLE employments (
      id int NOT NULL PRIMARY KEY,
      professor_id int,
      department_id int,
      employment_type_id int,
      FOREIGN KEY(professor_id) REFERENCES professors(id),
      FOREIGN KEY(department_id) REFERENCES departments(id),
      FOREIGN KEY(employment_type_id) REFERENCES enu_employment_type(id)
);

CREATE TABLE enrollments (
      id int NOT NULL PRIMARY KEY,
      class_id int,
      student_id int,
      grade int,
      FOREIGN KEY(class_id) REFERENCES classes(id),
      FOREIGN KEY(student_id) REFERENCES students(id)
);
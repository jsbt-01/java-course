 // package com.cloudcamp.day24.readFromDataBase;

 import java.sql.Connection;
 import java.sql.DriverManager;
 import java.sql.ResultSet;
 import java.sql.SQLException;
 import java.sql.Statement;

 /**
 * -- Connection open MySQL work bench (server? username password)
 * -- statements
 * -- execute
 * -- read results
 */

 /**
  * javac SampleProgramToReadFromDataBase.java
  * java -cp .:mysql-connector-java-8.0.29.jar SampleProgramToReadFromDataBase
  *
  * windows
  * java -cp .;mysql-connector-java-8.0.29.jar SampleProgramToReadFromDataBase
  */
 public class SampleProgramToReadFromDataBase {

  public static void main(String[] args) throws SQLException {
    System.out.println("Hello everyone. let's read from data base");

    // We need below three to talk to MySQL
    Connection connection;
    Statement statement;
    ResultSet resultSet;


    // Let's create and initialize Connection
    connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/educational", "root", "");

    statement = connection.createStatement();

    resultSet = statement.executeQuery("select student_id, first_name, last_name, age from students");

    while (resultSet.next()){
      int studentId =  resultSet.getInt("student_id");
      String firstname = resultSet.getString("first_name");
      String lastname = resultSet.getString("last_name");
      int age = resultSet.getInt("age");

      System.out.println("student id "+ studentId);
      System.out.println("first_name "+ firstname);
      System.out.println("last_name "+ lastname);
      System.out.println("age "+ age);
    }

    int noOfRecordsUpdated = statement.executeUpdate("update students set first_name = 'harinath' where student_id = 6");
    System.out.println("Number of records updated "+ noOfRecordsUpdated);

    // updating the record
    resultSet = statement.executeQuery("select student_id, first_name, last_name, age from students");

    // validating if record is updated
    while (resultSet.next()){
      int studentId =  resultSet.getInt("student_id");
      String firstname = resultSet.getString("first_name");
      String lastname = resultSet.getString("last_name");
      int age = resultSet.getInt("age");

      System.out.println("student id "+ studentId);
      System.out.println("first_name "+ firstname);
      System.out.println("last_name "+ lastname);
      System.out.println("age "+ age);
    }

  }

}







/**
 * use educational;
 *
 * CREATE TABLE students(
 * student_id INT PRIMARY KEY,
 * first_name VARCHAR(255) ,
 * last_name VARCHAR(255) ,
 * age INT,
 * course_id INT
 * );
 *
 * CREATE TABLE course(
 *
 * course_id INT PRIMARY KEY,
 * course_name VARCHAR(255)
 * );
 *
 * INSERT INTO `students`
 * (`student_id`,
 * `first_name`,
 * `last_name`,
 * `age`,
 * `course_id`)
 * VALUES
 * (6, 'Sailendra', 'lagineni', 24, 1001);
 *
 * select * from students;
 * select * from course;
 *
 * -- constraint
 *
 * alter table students
 * add CONSTRAINT randomname
 * FOREIGN KEY (course_id) REFERENCES course(course_id);
 *
 * INSERT INTO course
 * (`course_id`,
 * `course_name`)
 * VALUES
 * (1001, 'Mathematics');
 *
 *
 *
 * -- Connection open MySQL work bench (server? username password)
 * -- statements
 * -- execute
 * -- read results
 */

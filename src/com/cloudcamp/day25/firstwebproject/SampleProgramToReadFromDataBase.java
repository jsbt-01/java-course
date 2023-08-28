// package com.cloudcamp.day25.firstwebproject;

// tomcat server
// http
// web.xml
// servlet

// Sprintboot microservices

// javac -cp .:mysql-connector-java-8.0.29.jar:servlet-api.jar SampleProgramToReadFromDataBase.java Controller.java

// jar -cvf /Users/lsailendra/Downloads/apache-tomcat-9.0.80/webapps/firstwebproject.war *

// run tom cat on mac ./catalina.sh run

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

//    http utl
// tomcat : port
// request path -> service class

public class SampleProgramToReadFromDataBase {

  public static String readStudentName() {

    System.out.println("Hello everyone. We are not in readStudentName method trying to fetch student name");

    String studentName = "EMPTY";

    // We need below three to talk to MySQL
    Connection connection;
    Statement statement;
    ResultSet resultSet;

    try{
      Class.forName("com.mysql.cj.jdbc.Driver");

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

        studentName = firstname + lastname;
      }

    }catch (Exception e){
      System.out.println("Some error occured while reading student. error details are below.");
      System.out.println(e);
    }

    return studentName;
  }

}

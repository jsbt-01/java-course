package com.cloudcamp.day26;

public class StudentServiceTesting extends Thread {

  @Override
  public void run() {
    // StudentService service = new StudentService();

    StudentService service = StudentService.getStudent();
    service.readStudent();
  }
}

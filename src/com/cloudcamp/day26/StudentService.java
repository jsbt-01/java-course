package com.cloudcamp.day26;

public class StudentService { // Singleton

  public static StudentService service=null;

  public StudentService() {
    System.out.println("Student service class object created");
  }

  public static synchronized StudentService getStudent() {
    if(service == null){
      service = new StudentService();
    }
    return service;
  } // 20 days

  public void readStudent()
  {
    //read student
  }
}

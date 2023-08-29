package com.cloudcamp.day26;

public class StudentService { // Singleton

  public static StudentService service=null; // this must be private. but simplicity we didn't discuss

  public StudentService() { // constructor must be private
    System.out.println("Student service class object created");
  }

  public static synchronized StudentService getStudent() { // using synchonized is not recommended
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

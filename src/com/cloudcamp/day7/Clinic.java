package com.cloudcamp.day7;

public class Clinic {

  String name;
  int pinCode;
  String location;

  public Clinic(String name, int pinCode, String location) {
    this.name = name;
    this.pinCode = pinCode;
    this.location = location;
  }

  public void displayClinic(){
    System.out.println("");
    System.out.println("Clinic Name: "+ name);
    System.out.println("Clinic Pin: "+ pinCode);
    System.out.println("Clinic location: "+ location);
    System.out.println("");
  }

}

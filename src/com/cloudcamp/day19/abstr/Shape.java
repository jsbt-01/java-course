package com.cloudcamp.day19.abstr;

public abstract class Shape {

  String name;

  public Shape(String name) {
    this.name = name;
  }

  public abstract int calculateArea();// we don't know complete implementation

  public void displayDetails(){

    System.out.println("--------------------------------------------");
    System.out.println("Shape is "+ name + " area is "+ calculateArea());
  }

}

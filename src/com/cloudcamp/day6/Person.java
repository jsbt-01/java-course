package com.cloudcamp.day6;

public class Person {

  String name;

  public Person(String name) {
    System.out.println("Creating person object...");
    this.name = name;
  }

  void greet() {
    System.out.println("Hello " + name);
  }
}

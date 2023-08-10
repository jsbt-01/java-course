package com.cloudcamp.day17;

public class Person {

  private String name;
  private int age;
  String location;

  private static String planet = "Earth";

  public static String getPlanet() {
    return planet;
  }

//  public static void display() {
//    System.out.println("Name: " + name);
//  }

  public Person(String name, int age) {
    this.name = name;
    this.age = age;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getName() {
    return this.name;
  }

  public void setAge(int age) {
    if (age >= 0) {
      this.age = age;
    }
  }

  public int getAge() {
    return this.age;
  }
}

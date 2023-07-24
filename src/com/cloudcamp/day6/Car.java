package com.cloudcamp.day6;

public class Car {

  String company = "Unknown company";
  String model = "Unknown model";
  int year;

  public Car(String company, String model, int year) {
    System.out.println("Creating the car object...");
    this.company = company;
    this.model = model;
    this.year = year;
  }

  public void displayInfo() {
    System.out.println("Company: " + company);
    System.out.println("Model: " + model);
    System.out.println("Year: " + year);
    System.out.println();
  }
}

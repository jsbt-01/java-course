package com.cloudcamp.day5;

public class Car {
  String company;
  String model;
  int year;
  String fuelType;

  void start() {
    System.out.println("Starting the car...");
    System.out.println("Insert the key");
    System.out.println("Hold clutch");
    System.out.println("Rotate key");
    System.out.println();
  }

  void stop() {
    System.out.println("Stopping the car...");
    System.out.println("Hold clutch & brake");
    System.out.println("Neutral the gear");
    System.out.println("Rotate key");
    System.out.println();
  }

  void lightsOn() {
    System.out.println("Turning on the lights...");
    System.out.println("Press lights on button");
    System.out.println();
  }

  void displayDetails() {
    System.out.println("Company: " + company);
    System.out.println("Model: " + model);
    System.out.println("year: " + year);
    System.out.println("Fuel type: " + fuelType);
  }
}

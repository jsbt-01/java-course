package com.cloudcamp.day5;

public class Example {

  public static void main(String[] args) {

    Car c1 = new Car();
    c1.company = "Tata";
    c1.model = "Nano";
    c1.year = 2015;
    c1.fuelType = "Petrol";

//    c1.start();
//    c1.start();
//    c1.lightsOn();
//    c1.stop();
    c1.displayDetails();

    System.out.println();

    Car c2 = new Car();
    c2.company = "Benz";
    c2.model = "S5";
    c2.year = 2023;
    c2.fuelType = "Petrol";

    c2.displayDetails();
  }
}

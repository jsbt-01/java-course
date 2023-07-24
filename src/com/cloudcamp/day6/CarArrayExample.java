package com.cloudcamp.day6;

public class CarArrayExample {

  public static void main(String[] args) {

    Car c1 = new Car("Tata", "Nexon", 2023);
    Car c2 = new Car("Benz", "S5", 2022);
    Car c3 = new Car("Hundai", "i20", 2021);
    Car c4 = new Car("Audi", "A3", 2020);

    Car[] cars = { c1, c2, c3, c4 };
//    cars[0].displayInfo();
//    cars[1].displayInfo();
//    cars[2].displayInfo();

    for (Car car : cars) { // Enhanced for-loop
      car.displayInfo();
    }

  }
}

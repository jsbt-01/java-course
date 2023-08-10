package com.cloudcamp.day18;

public class TollGate {

  public static void main(String[] args) {

    TollPriceCalculator calculator = new TollPriceCalculator();


    Car car = new Car();
    int price = calculator.calculateTollPrice(car);
    System.out.println("Toll price for car is "+ price);

    Scooter scooter = new Scooter();
    int tollChargeForScooter = calculator.calculateTollPrice(scooter);
    System.out.println("Toll price for scooter is "+ tollChargeForScooter);


    Car car1 = new Car(); // actual class
    Vehicle vehicle = new Car(); // parent class
    MotarizedVehicleWithWheels motarizedVehicleWithWheels = new Car(); // interface

  }

}

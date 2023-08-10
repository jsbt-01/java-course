package com.cloudcamp.day18;

public class Car extends Vehicle implements MotarizedVehicleWithWheels{

  public FUEL_TYPE getFuelType() {
    return FUEL_TYPE.PETROL;
  }

  public int getWheels() {
    return 4;
  }

}

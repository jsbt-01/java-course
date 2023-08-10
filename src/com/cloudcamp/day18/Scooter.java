package com.cloudcamp.day18;

public class Scooter extends Vehicle implements MotarizedVehicleWithWheels{


  public FUEL_TYPE getFuelType() {
    return FUEL_TYPE.PETROL;
  }

  @Override
  public int getWheels() {
    return 2;
  }

}

package com.cloudcamp.day18;

public class TollPriceCalculator {

  public int calculateTollPrice(MotarizedVehicleWithWheels motarizedVehicleWithWheels){

    return motarizedVehicleWithWheels.getFuelType().price * motarizedVehicleWithWheels.getWheels();
  }
}

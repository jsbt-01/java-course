package com.cloudcamp.day18;

public enum FUEL_TYPE {
  PETROL(100), DIESEL(50);

  int price;


  FUEL_TYPE(int i) {
    this.price = i;
  }

  public int getPrice() {
    return price;
  }

  public void setPrice(int price) {
    this.price = price;
  }
}

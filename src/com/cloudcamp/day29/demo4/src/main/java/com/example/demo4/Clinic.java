package com.example.demo4;

public class Clinic {

  private int id;
  private String name;
  private int pinCode;

  public Clinic() {
  }

  public Clinic(int id, String name, int pinCode) {
    this.id = id;
    this.name = name;
    this.pinCode = pinCode;
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getPinCode() {
    return pinCode;
  }

  public void setPinCode(int pinCode) {
    this.pinCode = pinCode;
  }
}

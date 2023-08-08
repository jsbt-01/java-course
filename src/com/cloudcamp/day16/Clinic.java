package com.cloudcamp.day16;


import java.util.Objects;

public class Clinic { // Encapsulation

  private String name;
  private int pinCode;
  private int licenseNumber;

  public Clinic(String name, int pinCode, int licenseNumber) {
    this.name = name;
    this.pinCode = pinCode;
    this.licenseNumber = licenseNumber;
  }


  // Getters
  public int getLicenseNumber() {
    return licenseNumber;
  }

  public String getName() {
    return name;
  }

  public int getPinCode() {
    return pinCode;
  }

  // setters
  public void setName(String name) {
    this.name = name;
  }

  public void setPinCode(int pinCode) {
    this.pinCode = pinCode;
  }

  public void setLicenseNumber(int licenseNumber) {
    this.licenseNumber = licenseNumber;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Clinic clinic = (Clinic) o;
    return pinCode == clinic.pinCode && licenseNumber == clinic.licenseNumber
        && Objects.equals(name, clinic.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, pinCode, licenseNumber);
  }

  @Override
  public String toString() {
    // ANSI escape codes for colors
    String reset = "\u001B[0m";
    String cyan = "\u001B[36m";
    String yellow = "\u001B[33m";

    return cyan + "Clinic{" + reset +
        " " + yellow + "name='" + name + '\'' + reset +
        ", " + yellow + "pinCode=" + pinCode + reset +
        ", " + yellow + "licensedNumber='" + licenseNumber + '\'' + reset +
        cyan + "}" + reset;
  }
}

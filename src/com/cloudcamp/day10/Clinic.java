package com.cloudcamp.day10;

import java.util.Objects;

public class Clinic {

  String name;
  int pinCode;

  public Clinic(String name, int pinCode) {
    this.name = name;
    this.pinCode = pinCode;
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
    return pinCode == clinic.pinCode && Objects.equals(name, clinic.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, pinCode);
  }

  @Override
  public String toString() {
    return "Clinic{" +
        "name='" + name + '\'' +
        ", pinCode=" + pinCode +
        '}';
  }
}

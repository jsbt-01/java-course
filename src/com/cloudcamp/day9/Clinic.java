package day9;

import java.util.Objects;

public class Clinic {

  String name;

  String location;

  int pinCode;

  public Clinic(String name, String location, int pinCode) {
    this.name = name;
    this.location = location;
    this.pinCode = pinCode;
  }

  public boolean equals(Object o) {
    Clinic c = (Clinic) o;
    boolean b = this.name.equals(c.name) && this.location.equals(c.location) && this.pinCode == c.pinCode;
    return b;
  }
}

package com.example.springjpaintro.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "clinics")
@Entity
public class ClinicEntity {

  @Id
  private int id;
  private String name;

  private int pinCode;

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

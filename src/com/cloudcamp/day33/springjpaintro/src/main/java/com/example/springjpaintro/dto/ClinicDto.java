package com.example.springjpaintro.dto;

import java.util.List;

public class ClinicDto {

  private int id;
  private String name;
  private int pinCode;

  List<DoctorDto> doctors;

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

  public List<DoctorDto> getDoctors() {
    return doctors;
  }

  public void setDoctors(List<DoctorDto> doctors) {
    this.doctors = doctors;
  }
}

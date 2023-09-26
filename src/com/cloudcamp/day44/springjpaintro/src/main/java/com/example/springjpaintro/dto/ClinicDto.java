package com.example.springjpaintro.dto;

import com.example.springjpaintro.view.ClinicView;
import com.example.springjpaintro.view.DoctorView;
import com.fasterxml.jackson.annotation.JsonView;
import java.util.List;

public class ClinicDto {

  @JsonView({ClinicView.class, DoctorView.class})
  private int id;

  @JsonView({ClinicView.class, DoctorView.class})
  private String name;

  @JsonView({ClinicView.class, DoctorView.class})
  private int pinCode;

  @JsonView({ClinicView.class})
  private List<DoctorDto> doctors;

  @JsonView({ClinicView.class})
  private ClinicTimingDto clinicTiming;

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

  public ClinicTimingDto getClinicTiming() {
    return clinicTiming;
  }

  public void setClinicTiming(ClinicTimingDto clinicTiming) {
    this.clinicTiming = clinicTiming;
  }
}

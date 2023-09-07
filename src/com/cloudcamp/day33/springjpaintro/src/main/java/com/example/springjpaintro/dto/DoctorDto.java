package com.example.springjpaintro.dto;


import java.util.List;

public class DoctorDto {
  private int id;

  private String name;

  private int experience;

  private ClinicDto clinic;

  private List<SpecialityDto> specialities;

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

  public int getExperience() {
    return experience;
  }

  public void setExperience(int experience) {
    this.experience = experience;
  }

  public ClinicDto getClinic() {
    return clinic;
  }

  public void setClinic(ClinicDto clinic) {
    this.clinic = clinic;
  }

  public List<SpecialityDto> getSpecialities() {
    return specialities;
  }

  public void setSpecialities(List<SpecialityDto> specialities) {
    this.specialities = specialities;
  }
}

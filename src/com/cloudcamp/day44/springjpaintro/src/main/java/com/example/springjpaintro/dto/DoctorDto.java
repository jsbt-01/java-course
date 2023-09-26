package com.example.springjpaintro.dto;


import com.example.springjpaintro.view.ClinicView;
import com.example.springjpaintro.view.DoctorView;
import com.fasterxml.jackson.annotation.JsonView;
import java.util.List;

public class DoctorDto {

  @JsonView({ClinicView.class, DoctorView.class})
  private int id;

  @JsonView({ClinicView.class, DoctorView.class})
  private String name;

  @JsonView({ClinicView.class, DoctorView.class})
  private int experience;

  @JsonView({DoctorView.class})
  private ClinicDto clinic;

  @JsonView({ClinicView.class, DoctorView.class})
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

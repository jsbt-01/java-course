package com.example.springjpaintro.entity;

import com.example.springjpaintro.view.ClinicView;
import com.example.springjpaintro.view.DoctorView;
import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonView;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Table(name = "doctors")
@Entity
public class DoctorEntity {

  @JsonView({ClinicView.class, DoctorView.class})
  @Id
  private int id;

  @JsonView({ClinicView.class, DoctorView.class})
  private String name;

  @JsonView({ClinicView.class, DoctorView.class})
  private int experience;

  @JsonView(DoctorView.class)
  @ManyToOne
  @JoinColumn(name = "clinic_id")
  private ClinicEntity clinic;

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

  public ClinicEntity getClinic() {
    return clinic;
  }

  public void setClinic(ClinicEntity clinic) {
    this.clinic = clinic;
  }
}

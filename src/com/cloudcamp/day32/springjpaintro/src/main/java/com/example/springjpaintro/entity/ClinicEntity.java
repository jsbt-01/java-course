package com.example.springjpaintro.entity;

import com.example.springjpaintro.view.ClinicView;
import com.example.springjpaintro.view.DoctorView;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.fasterxml.jackson.annotation.JsonView;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Table(name = "clinics")
@Entity
public class ClinicEntity {

  @JsonView({ClinicView.class, DoctorView.class})
  @Id
  private int id;

  @JsonView({ClinicView.class, DoctorView.class})
  private String name;

  @JsonView({ClinicView.class, DoctorView.class})
  private int pinCode;

  @JsonView(ClinicView.class)
  @OneToMany(mappedBy = "clinic")
  private List<DoctorEntity> doctors;

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

  public List<DoctorEntity> getDoctors() {
    return doctors;
  }

  public void setDoctors(List<DoctorEntity> doctors) {
    this.doctors = doctors;
  }
}

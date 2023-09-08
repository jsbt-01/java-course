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
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Table(name = "clinics")
@Entity
public class ClinicEntity {

  @Id
  private int id;

  private String name;

  private int pinCode;

  @OneToMany(mappedBy = "clinic")
  private List<DoctorEntity> doctors;

  @OneToOne(mappedBy = "clinic")
  private ClinicTimingEntity clinicTiming;

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

  public ClinicTimingEntity getClinicTiming() {
    return clinicTiming;
  }

  public void setClinicTiming(ClinicTimingEntity clinicTiming) {
    this.clinicTiming = clinicTiming;
  }
}

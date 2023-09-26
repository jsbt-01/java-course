package com.example.springjpaintro.entity;

import com.example.springjpaintro.view.ClinicView;
import com.example.springjpaintro.view.DoctorView;
import com.fasterxml.jackson.annotation.JsonView;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Table(name = "doctors")
@Entity
public class DoctorEntity {

  @Id
  private int id;

  private String name;

  private int experience;

  @ManyToOne
  @JoinColumn(name = "clinic_id")
  private ClinicEntity clinic;

  @ManyToMany
  @JoinTable(name = "doctor_specialities",
      joinColumns = @JoinColumn(name = "doctor_id"),
      inverseJoinColumns = @JoinColumn(name = "speciality_id")
  )
  private List<SpecialityEntity> specialities;

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

  public List<SpecialityEntity> getSpecialities() {
    return specialities;
  }

  public void setSpecialities(
      List<SpecialityEntity> specialities) {
    this.specialities = specialities;
  }
}

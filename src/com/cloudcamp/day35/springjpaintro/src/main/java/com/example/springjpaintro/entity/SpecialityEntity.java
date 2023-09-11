package com.example.springjpaintro.entity;

import com.example.springjpaintro.view.DoctorView;
import com.fasterxml.jackson.annotation.JsonView;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "specialities")
@Entity
public class SpecialityEntity {

  @Id
  private int id;

  private String name;

  private String description;

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

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }
}

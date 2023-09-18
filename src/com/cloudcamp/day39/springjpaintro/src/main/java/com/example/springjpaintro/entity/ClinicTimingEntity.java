package com.example.springjpaintro.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Table(name = "clinic_timings")
@Entity
public class ClinicTimingEntity {

  @Id
  private int id;

  private int openHour;

  private int closeHour;

  @OneToOne
  @JoinColumn(name = "clinic_id")
  private ClinicEntity clinic;

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public int getOpenHour() {
    return openHour;
  }

  public void setOpenHour(int openHour) {
    this.openHour = openHour;
  }

  public int getCloseHour() {
    return closeHour;
  }

  public void setCloseHour(int closeHour) {
    this.closeHour = closeHour;
  }

  public ClinicEntity getClinic() {
    return clinic;
  }

  public void setClinic(ClinicEntity clinic) {
    this.clinic = clinic;
  }
}

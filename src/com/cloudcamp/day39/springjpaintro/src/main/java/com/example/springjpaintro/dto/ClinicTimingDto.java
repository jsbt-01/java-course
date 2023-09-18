package com.example.springjpaintro.dto;

import com.example.springjpaintro.view.ClinicView;
import com.fasterxml.jackson.annotation.JsonView;

@JsonView({ClinicView.class})
public class ClinicTimingDto {

  private int id;

  private int openHour;

  private int closeHour;

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
}

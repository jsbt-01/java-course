package com.example.springjpaintro.dto;

import com.example.springjpaintro.view.ClinicView;
import com.example.springjpaintro.view.DoctorView;
import com.fasterxml.jackson.annotation.JsonView;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@JsonView({ClinicView.class, DoctorView.class})
public class SpecialityDto {

  private Integer id;
  private String name;
  private String description;
}

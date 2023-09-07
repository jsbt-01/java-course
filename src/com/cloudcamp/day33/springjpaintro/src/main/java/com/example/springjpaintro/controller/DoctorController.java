package com.example.springjpaintro.controller;

import com.example.springjpaintro.entity.DoctorEntity;
import com.example.springjpaintro.service.DoctorService;
import com.example.springjpaintro.view.DoctorView;
import com.fasterxml.jackson.annotation.JsonView;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DoctorController {

  @Autowired
  private DoctorService doctorService;

  @JsonView(DoctorView.class)
  @GetMapping("doctors")
  public List<DoctorEntity> getDoctors() {
    return doctorService.getDoctors();
  }

}

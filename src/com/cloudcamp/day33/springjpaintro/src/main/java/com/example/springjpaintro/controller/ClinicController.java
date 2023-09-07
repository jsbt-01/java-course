package com.example.springjpaintro.controller;

import com.example.springjpaintro.dto.ClinicDto;
import com.example.springjpaintro.exception.ClinicNotFoundException;
import com.example.springjpaintro.entity.ClinicEntity;
import com.example.springjpaintro.service.ClinicService;
import com.example.springjpaintro.view.ClinicView;
import com.fasterxml.jackson.annotation.JsonView;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

// MVC => Model view controller -> Coding style
// Controller -> service -> repository (data layer)
@RestController
public class ClinicController {

  @Autowired
  private ClinicService clinicService;

//  @JsonView(ClinicView.class)
  @GetMapping("clinics")
  public List<ClinicDto> getClinics() {
    return clinicService.getClinics();
  }

  @GetMapping("clinics/{id}")
  public ClinicEntity getClinic(@PathVariable int id) {
    return clinicService.getClinic(id);
  }

  @GetMapping("clinics_by_pincode")
  public List<ClinicEntity> getClinicsByPinCode(@RequestParam int pinCode) {
    return clinicService.getClinicsByPinCode(pinCode);
  }

  @PostMapping("clinics")
  public void createClinic(@RequestBody ClinicEntity c) {
    clinicService.createClinic(c);
  }

  @PutMapping("clinics/{id}")
  public ResponseEntity<Void> updateClinic(@PathVariable int id, @RequestBody ClinicEntity c) {
    try {
      clinicService.updateClinic(id, c);
      return ResponseEntity.ok().build(); // 200
    } catch (ClinicNotFoundException e) {
      return ResponseEntity.notFound().build(); // 404
    }
  }

  @DeleteMapping("clinics/{id}")
  public void deleteClinic(@PathVariable int id) {
    clinicService.deleteClinic(id);
  }

  @GetMapping("explore")
  public void explore() {
    clinicService.explore();
  }
}

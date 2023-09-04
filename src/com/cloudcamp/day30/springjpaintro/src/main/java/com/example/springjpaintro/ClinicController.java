package com.example.springjpaintro;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

// MVC => Model view controller -> Coding style
@RestController
public class ClinicController {

  @Autowired
  private ClinicRepository clinicRepository;

  @GetMapping("clinics")
  public List<ClinicEntity> getClinics() {
    List<ClinicEntity> clinicEntities = clinicRepository.findAll();
    return clinicEntities;
  }

  @GetMapping("clinics/{id}")
  public ClinicEntity getClinic(@PathVariable int id) {
    ClinicEntity c = clinicRepository.findById(id);
    return c;
  }

  @GetMapping("clinics_by_pincode")
  public List<ClinicEntity> getClinicsByPinCode(@RequestParam int pinCode) {
    List<ClinicEntity> clinicEntities = clinicRepository.findByPinCode(pinCode);
    return clinicEntities;
  }

  @PostMapping("clinics")
  public void createClinic(@RequestBody ClinicEntity c) {
    clinicRepository.save(c);
  }
}

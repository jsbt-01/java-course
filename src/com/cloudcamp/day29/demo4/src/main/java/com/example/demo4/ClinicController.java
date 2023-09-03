package com.example.demo4;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ClinicController {

  @Autowired
  private ClinicService clinicService;

  @GetMapping("clinics")
  public List<Clinic> getClinics() {
    return clinicService.getClinics();
  }

  @GetMapping("clinics/{id}")
  public ResponseEntity<Clinic> getClinic(@PathVariable int id) {
    Clinic c = clinicService.getClinic(id);
    if (c != null) {
      ResponseEntity<Clinic> responseEntity = ResponseEntity.ok(c);
      return responseEntity;
    } else {
      return ResponseEntity.notFound().build();
    }
  }

  @GetMapping("clinics_by_pincode")
  public List<Clinic> getClinicsByPinCode(@RequestParam int pinCode) {
    return clinicService.getClinicsByPinCode(pinCode);
  }

  @PostMapping("clinics")
  public ResponseEntity<Void> addClinic(@RequestBody Clinic c) {
    if (c.getId() < 0) {
      return ResponseEntity.badRequest().build();
    }

    clinicService.addClinic(c);

    return ResponseEntity.status(HttpStatus.CREATED).build();
  }

  @PutMapping("clinics/{id}")
  public ResponseEntity<Void> updateClinic(@PathVariable int id, @RequestBody Clinic c) {
    try {
      clinicService.updateClinic(id, c);
      return ResponseEntity.ok().build();
    } catch (ClinicNotFoundException e) {
      return ResponseEntity.notFound().build();
    }
  }

  @DeleteMapping("clinics/{id}")
  public void deleteClinic(@PathVariable int id) {
    clinicService.deleteClinic(id);
  }
}

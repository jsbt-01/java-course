package com.example.springjpaintro.controller;

import com.example.springjpaintro.dto.ClinicDto;
import com.example.springjpaintro.exception.ClinicNotFoundException;
import com.example.springjpaintro.entity.ClinicEntity;
import com.example.springjpaintro.service.ClinicService;
import com.example.springjpaintro.view.ClinicView;
import com.fasterxml.jackson.annotation.JsonView;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

// MVC => Model view controller -> Coding style
// Controller -> service -> repository (data layer)
@RestController
public class ClinicController {

  Logger logger = LoggerFactory.getLogger(ClinicController.class);

  @Autowired
  private ClinicService clinicService;

  @JsonView(ClinicView.class)
  @GetMapping("clinics")
  public List<ClinicDto> getClinics() {
    return clinicService.getClinics();
  }

  @JsonView(ClinicView.class)
  @GetMapping("clinics/{id}")
  public ClinicDto getClinic(@PathVariable int id) {
    return clinicService.getClinic(id);
  }

  @JsonView(ClinicView.class)
  @GetMapping("clinics_by_pincode")
  public List<ClinicDto> getClinicsByPinCode(@RequestParam int pinCode) {
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

  // Debugging
  @GetMapping("explore")
  public String explore() {
    logger.debug("User Rama called explore method. entering");

    clinicService.learningTransactions();
    logger.debug("User Rama called explore method. exiting");
    return "";
  }

  @ExceptionHandler({NullPointerException.class})
  public String doExceptionhandling(){
    return "Nullpointer Exception Occurred in our system. Our engineers are looking into it";
  }

}

/**
 * @Service
 * @Controller
 * @repository
 * @Entity
 * @Table
 * @Transactional
 * @Exceptionhandler
 * @JsonView
 * @Column
 * @ControllerAdvice
 */
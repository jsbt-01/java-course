package com.example.springjpaintro.service;

import com.example.springjpaintro.ClinicNotFoundException;
import com.example.springjpaintro.entity.ClinicEntity;
import com.example.springjpaintro.repository.ClinicRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClinicService {

  @Autowired
  private ClinicRepository clinicRepository;

  public void explore() {
    long count = clinicRepository.count();
    System.out.println("All rows count: " + count);

    long countByPinCode = clinicRepository.countByPinCode(200079);
    System.out.println("Clinics count in 200079 pinCode: " + countByPinCode);

    List<ClinicEntity> clinicEntities = clinicRepository.findByName("Care");
    System.out.println("\nClinics by name Care");
    displayClinics(clinicEntities);

    List<ClinicEntity> ceAsc = clinicRepository.findByPinCodeOrderByName(200079);
    System.out.println("\nClinics with pinCode 200079 ordered by name ASC");
    displayClinics(ceAsc);

    List<ClinicEntity> ceDesc = clinicRepository.findByPinCodeOrderByNameDesc(200079);
    System.out.println("\nClinics with pinCode 200079 ordered by name DESC");
    displayClinics(ceDesc);

    List<ClinicEntity> ceGreater = clinicRepository.findByPinCodeGreaterThan(200079);
    System.out.println("\nClinics with pinCode greater than 200079");
    displayClinics(ceGreater);

    List<ClinicEntity> foundClinicsAnd = clinicRepository.findByNameAndPinCode("Care", 200079);
    System.out.println("\nClinics with name Care AND pinCode 200079");
    displayClinics(foundClinicsAnd);

    List<ClinicEntity> foundClinicsOr = clinicRepository.findByNameOrPinCode("Care", 200079);
    System.out.println("\nClinics with name Care OR pinCode 200079");
    displayClinics(foundClinicsOr);
  }

  public List<ClinicEntity> getClinics() {
    List<ClinicEntity> clinicEntities = clinicRepository.findAll();
    return clinicEntities;
  }

  public ClinicEntity getClinic(int id) {
    return clinicRepository.findById(id);
  }

  public List<ClinicEntity> getClinicsByPinCode(int pinCode) {
    return clinicRepository.findByPinCode(pinCode);
  }

  public void createClinic(ClinicEntity c) {
    clinicRepository.save(c);
  }

  public void updateClinic(int id, ClinicEntity clinicEntity) {
    ClinicEntity foundEntity = clinicRepository.findById(id);

    if (foundEntity == null) {
      throw new ClinicNotFoundException();
    }

    foundEntity.setName(clinicEntity.getName());
    foundEntity.setPinCode(clinicEntity.getPinCode());

    clinicRepository.save(foundEntity);
  }

  public void deleteClinic(int id) {
    clinicRepository.deleteById(id);
  }

  private void displayClinics(List<ClinicEntity> clinicEntities) {
    for (ClinicEntity c : clinicEntities) {
      System.out.println("Id: " + c.getId() + ", Name: " + c.getName() + ", PinCode: " + c.getPinCode());
    }
  }
}

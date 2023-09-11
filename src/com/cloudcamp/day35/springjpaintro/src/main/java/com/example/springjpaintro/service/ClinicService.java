package com.example.springjpaintro.service;

import com.example.springjpaintro.dto.ClinicDto;
import com.example.springjpaintro.dto.DoctorDto;
import com.example.springjpaintro.entity.ClinicEntity;
import com.example.springjpaintro.entity.DoctorEntity;
import com.example.springjpaintro.exception.ClinicNotFoundException;
import com.example.springjpaintro.repository.ClinicRepository;
import com.example.springjpaintro.util.DtoMapper;
import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClinicService {

  Logger logger = LoggerFactory.getLogger(ClinicService.class);

  @Autowired
  private ClinicRepository clinicRepository;

  public void explore() {
    logger.info("Executing some logic to find clinics by pincode");

    List<ClinicEntity> foundClinicsOr = clinicRepository.findByPinCode(200079);
    displayClinics(foundClinicsOr);


    logger.info("We are trying to fetch results using MySQL");
    List<ClinicEntity> mySQlResults = clinicRepository.findClinicsByPinCodeButUsingMySQL(200079);
    displayClinics(mySQlResults);

    logger.info("We are trying to fetch results using JPQL");
    List<ClinicEntity> jpqlResults = clinicRepository.findClinicsByPinCodeUsingJPQL(200079);
    displayClinics(jpqlResults);
  }

  public List<ClinicDto> getClinics() {
    List<ClinicEntity> clinicEntities = clinicRepository.findAll();

    List<ClinicDto> clinicDtos = DtoMapper.mapToClinicDtos(clinicEntities, true);

    return clinicDtos;
  }

  public ClinicDto getClinic(int id) {
    ClinicEntity clinicEntity = clinicRepository.findById(id);
    ClinicDto clinicDto = DtoMapper.mapToClinicDto(clinicEntity, true);
    return clinicDto;
  }

  public List<ClinicDto> getClinicsByPinCode(int pinCode) {
    List<ClinicEntity> clinicEntities = clinicRepository.findByPinCode(pinCode);
    List<ClinicDto> clinicDtos = DtoMapper.mapToClinicDtos(clinicEntities, true);
    return clinicDtos;
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
      System.out.println(
          "Id: " + c.getId() + ", Name: " + c.getName() + ", PinCode: " + c.getPinCode());
    }
  }
}

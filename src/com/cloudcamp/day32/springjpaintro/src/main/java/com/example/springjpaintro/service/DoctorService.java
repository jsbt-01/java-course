package com.example.springjpaintro.service;

import com.example.springjpaintro.entity.DoctorEntity;
import com.example.springjpaintro.repository.DoctorRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DoctorService {

  @Autowired
  private DoctorRepository doctorRepository;

  public List<DoctorEntity> getDoctors() {
    return doctorRepository.findAll();
  }

}

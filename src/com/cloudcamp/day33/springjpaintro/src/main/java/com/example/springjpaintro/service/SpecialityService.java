package com.example.springjpaintro.service;

import com.example.springjpaintro.entity.SpecialityEntity;
import com.example.springjpaintro.repository.SpecialityRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SpecialityService {

  @Autowired
  private SpecialityRepository specialityRepository;

  public List<SpecialityEntity> getSpecialities() {
    return specialityRepository.findAll();
  }

  public SpecialityEntity getSpeciality(int id) {
    return specialityRepository.findById(id);
  }

}

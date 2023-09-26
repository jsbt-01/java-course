package com.example.springjpaintro.service;

import com.example.springjpaintro.dto.DoctorDto;
import com.example.springjpaintro.entity.DoctorEntity;
import com.example.springjpaintro.repository.DoctorRepository;
import com.example.springjpaintro.util.DtoMapper;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DoctorService {

  @Autowired
  private DoctorRepository doctorRepository;

  public List<DoctorDto> getDoctors() {
    List<DoctorEntity> doctorEntities = doctorRepository.findAll();

    List<DoctorDto> doctorDtos = DtoMapper.mapToDoctorDtos(doctorEntities, true);

    return doctorDtos;
  }
}

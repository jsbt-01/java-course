package com.example.springjpaintro.service;

import com.example.springjpaintro.dto.SpecialityDto;
import com.example.springjpaintro.entity.SpecialityEntity;
import com.example.springjpaintro.repository.SpecialityRepository;
import com.example.springjpaintro.util.DtoMapper;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SpecialityService {

  @Autowired
  private SpecialityRepository specialityRepository;

  public List<SpecialityDto> getSpecialities() {
    List<SpecialityEntity> specialityEntities = specialityRepository.findAll();
    List<SpecialityDto> specialityDtos = DtoMapper.mapToSpecialityDtos(specialityEntities);
    return specialityDtos;
  }

  public void createSpeciality(SpecialityDto specialityDto) {
    SpecialityEntity specialityEntity = DtoMapper.mapToSpecialityEntity(specialityDto);
    specialityRepository.save(specialityEntity);
  }

  public void deleteSpeciality(int id) {
    specialityRepository.deleteById(id);
  }

  public SpecialityDto getSpeciality(int id) {
    SpecialityEntity specialityEntity = specialityRepository.findById(id);
    SpecialityDto specialityDto = DtoMapper.mapToSpecialityDto(specialityEntity);
    return specialityDto;
  }

}

package com.example.springjpaintro.controller;

import com.example.springjpaintro.dto.SpecialityDto;
import com.example.springjpaintro.entity.SpecialityEntity;
import com.example.springjpaintro.service.SpecialityService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SpecialityController {

  @Autowired
  private SpecialityService specialityService;

  @GetMapping("specialities")
  public List<SpecialityDto> getSpecialities() {
    return specialityService.getSpecialities();
  }

  @GetMapping("specialities/{id}")
  public SpecialityDto getSpeciality(@PathVariable(name = "id") int specialityId) {
    return specialityService.getSpeciality(specialityId);
  }
}

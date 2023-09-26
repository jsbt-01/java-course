package com.example.springjpaintro.controller;

import com.example.springjpaintro.dto.SpecialityDto;
import com.example.springjpaintro.entity.SpecialityEntity;
import com.example.springjpaintro.service.SpecialityService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SpecialityController {

  @Autowired
  private SpecialityService specialityService;

  @CrossOrigin
  @GetMapping("specialities")
  public List<SpecialityDto> getSpecialities() {
    return specialityService.getSpecialities();
  }

  @CrossOrigin
  @PostMapping("specialities")
  public void createSpeciality(@RequestBody SpecialityDto specialityDto) {
    specialityService.createSpeciality(specialityDto);
  }

  @CrossOrigin
  @DeleteMapping("specialities/{id}")
  public void deleteSpeciality(@PathVariable int id) {
    specialityService.deleteSpeciality(id);
  }

  @GetMapping("specialities/{id}")
  public SpecialityDto getSpeciality(@PathVariable(name = "id") int specialityId) {
    return specialityService.getSpeciality(specialityId);
  }
}

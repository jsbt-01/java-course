package com.example.springjpaintro.util;

import com.example.springjpaintro.dto.ClinicDto;
import com.example.springjpaintro.dto.ClinicTimingDto;
import com.example.springjpaintro.dto.DoctorDto;
import com.example.springjpaintro.dto.SpecialityDto;
import com.example.springjpaintro.entity.ClinicEntity;
import com.example.springjpaintro.entity.ClinicTimingEntity;
import com.example.springjpaintro.entity.DoctorEntity;
import com.example.springjpaintro.entity.SpecialityEntity;
import java.util.ArrayList;
import java.util.List;

/*
All mapper methods of various entities like clinics, doctors, specialities etc
 */
public class DtoMapper {

  public static ClinicDto mapToClinicDto(ClinicEntity clinicEntity, boolean includeDoctor) {
    ClinicDto clinicDto = new ClinicDto();
    clinicDto.setId(clinicEntity.getId());
    clinicDto.setName(clinicEntity.getName());
    clinicDto.setPinCode(clinicEntity.getPinCode());

    if (includeDoctor) {
      List<DoctorDto> doctorDtos = mapToDoctorDtos(clinicEntity.getDoctors(), false);
      clinicDto.setDoctors(doctorDtos);
    }

    ClinicTimingEntity clinicTimingEntity = clinicEntity.getClinicTiming();
    ClinicTimingDto clinicTimingDto = mapToClinicTimingDto(clinicTimingEntity);
    clinicDto.setClinicTiming(clinicTimingDto);

    return clinicDto;
  }

  public static ClinicTimingDto mapToClinicTimingDto(ClinicTimingEntity clinicTimingEntity) {
    ClinicTimingDto clinicTimingDto = new ClinicTimingDto();
    clinicTimingDto.setId(clinicTimingEntity.getId());
    clinicTimingDto.setOpenHour(clinicTimingEntity.getOpenHour());
    clinicTimingDto.setCloseHour(clinicTimingEntity.getCloseHour());

    return clinicTimingDto;
  }

  public static List<ClinicDto> mapToClinicDtos(List<ClinicEntity> clinicEntities,
      boolean includeDoctor) {
    List<ClinicDto> clinicDtos = new ArrayList<>();
    for (ClinicEntity clinicEntity : clinicEntities) {
      ClinicDto clinicDto = mapToClinicDto(clinicEntity, includeDoctor);

      clinicDtos.add(clinicDto);
    }

    return clinicDtos;
  }

  public static DoctorDto mapToDoctorDto(DoctorEntity doctorEntity, boolean includeClinic) {
    DoctorDto doctorDto = new DoctorDto();
    doctorDto.setId(doctorEntity.getId());
    doctorDto.setName(doctorEntity.getName());
    doctorDto.setExperience(doctorEntity.getExperience());

    if (includeClinic) {
      ClinicEntity clinicEntity = doctorEntity.getClinic();
      ClinicDto clinicDto = mapToClinicDto(clinicEntity, false);
      doctorDto.setClinic(clinicDto);
    }

    List<SpecialityEntity> specialityEntities = doctorEntity.getSpecialities();
    List<SpecialityDto> specialityDtos = mapToSpecialityDtos(specialityEntities);
    doctorDto.setSpecialities(specialityDtos);

    return doctorDto;
  }

  public static List<DoctorDto> mapToDoctorDtos(List<DoctorEntity> doctorEntities,
      boolean includeClinic) {
    List<DoctorDto> doctorDtos = new ArrayList<>();

    for (DoctorEntity doctorEntity : doctorEntities) {
      DoctorDto doctorDto = mapToDoctorDto(doctorEntity, includeClinic);

      doctorDtos.add(doctorDto);
    }

    return doctorDtos;
  }

  public static SpecialityDto mapToSpecialityDto(SpecialityEntity specialityEntity) {
    SpecialityDto specialityDto = new SpecialityDto();
    specialityDto.setId(specialityEntity.getId());
    specialityDto.setName(specialityEntity.getName());
    specialityDto.setDescription(specialityEntity.getDescription());

    return specialityDto;
  }

  public static List<SpecialityDto> mapToSpecialityDtos(List<SpecialityEntity> specialityEntities) {

    List<SpecialityDto> specialityDtos = new ArrayList<>();
    for (SpecialityEntity specialityEntity : specialityEntities) {
      SpecialityDto specialityDto = mapToSpecialityDto(specialityEntity);

      specialityDtos.add(specialityDto);
    }

    return specialityDtos;
  }
}

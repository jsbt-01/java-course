package com.example.springjpaintro.repository;

import com.example.springjpaintro.entity.SpecialityEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SpecialityRepository extends JpaRepository<SpecialityEntity, Integer> {

  SpecialityEntity findById(int id); // Method signature only

}

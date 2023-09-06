package com.example.springjpaintro.repository;

import com.example.springjpaintro.entity.ClinicEntity;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/*
1. Open connection to DB
2. Form the query
3. Execute the query
4. Convert DB output to our objects
 */
@Repository
public interface ClinicRepository extends JpaRepository<ClinicEntity, Integer> {

  ClinicEntity findById(int id);

  List<ClinicEntity> findByPinCode(int pinCode);

  List<ClinicEntity> findByName(String name);

  List<ClinicEntity> findByPinCodeOrderByName(int pinCode); // findAllOrderByName

  List<ClinicEntity> findByPinCodeOrderByNameDesc(int pinCode);

//  List<ClinicEntity> findAllOrderByNameDesc();

  List<ClinicEntity> findByPinCodeGreaterThan(int value);

  List<ClinicEntity> findByPinCodeGreaterThanEqual(int value);

  List<ClinicEntity> findByPinCodeLessThan(int value);
  List<ClinicEntity> findByPinCodeLessThanEqual(int value);

  long countByPinCode(int pinCode);

  List<ClinicEntity> findByNameAndPinCode(String name, int pinCode);

  List<ClinicEntity> findByNameOrPinCode(String name, int pinCode);
}

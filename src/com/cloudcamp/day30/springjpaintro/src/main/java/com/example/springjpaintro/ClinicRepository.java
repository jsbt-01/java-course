package com.example.springjpaintro;

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
}

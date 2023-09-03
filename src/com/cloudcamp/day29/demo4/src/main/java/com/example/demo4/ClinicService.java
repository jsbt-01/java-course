package com.example.demo4;

import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public class ClinicService {
  private List<Clinic> clinics = new ArrayList<>();

  public List<Clinic> getClinics() {
    return clinics;
  }

  public Clinic getClinic(int id) {
    for (Clinic clinic : clinics) {
      if (clinic.getId() == id) {
        return clinic;
      }
    }
    return null;
  }

  public List<Clinic> getClinicsByPinCode(int pinCode) {
    List<Clinic> foundClinics = new ArrayList<>();
    for (Clinic clinic : clinics) {
      if (clinic.getPinCode() == pinCode) {
        foundClinics.add(clinic);
      }
    }

    return foundClinics;
  }

  public void addClinic(Clinic c) {
    this.clinics.add(c);
  }

  public void updateClinic(int id, Clinic c) {
    for (Clinic clinic : clinics) {
      if (clinic.getId() == id) {
        clinic.setName(c.getName());
        clinic.setPinCode(c.getPinCode());
        return;
      }
    }
    throw new ClinicNotFoundException();
  }

  public void deleteClinic(int id) {
    List<Clinic> newClinics = new ArrayList<>();
    for (Clinic clinic : clinics) {
      if (clinic.getId() != id) {
        newClinics.add(clinic);
      }
    }
    this.clinics = newClinics;
  }
}

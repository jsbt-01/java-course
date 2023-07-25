package com.cloudcamp.day7;

public class EnhancedArrayForClinics {

  int defaultSize = 3;
  int size = 0;
  Clinic[] totalClinics = new Clinic[defaultSize];

  // 0 1 2 = length 3
  // a b c d(error)

  // 0 1 2 = length 3
  // a b c d?

  // 0 1 2 3 4 5 = length 6
  // a b c d

  public void add(Clinic apollo){
    if(size == totalClinics.length){
      increaseCapacity();
    }
    totalClinics[size] = apollo;
    size = size + 1; // 0 1 2 3E
  }

  public void find(int pinCode){
    for (int i=0; i< size; i++){
      if(totalClinics[i].pinCode == pinCode){
        System.out.println("Location Found");
        totalClinics[i].displayClinic();
      }
    }
  }

  public int getSize(){
    return size;
  }

  // TODO Assignment
  // remove
  public boolean remove(int pincode){
    // if found return true
    // not found return false
    return false;
  }

  private void increaseCapacity() {
    // Create new BAG = create new array =? length = length+2
    // Old bag data => copy to new bag
    // delete old bag and use new bag
    int newLength = totalClinics.length + 2;
    Clinic[] newClinicArray = new Clinic[newLength];

    for (int i=0; i<totalClinics.length; i++) {
      newClinicArray[i] = totalClinics[i];
    }
    totalClinics = newClinicArray; // Java does garbage collection for old array

  }


}

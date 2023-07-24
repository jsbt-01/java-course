package com.cloudcamp.weekTwoAssignment;

import java.util.Scanner;

/**
 * 1. Find a Clinic
 * 2. Add a Clinic
 * 3. Exit
 *
 */
public class AddAndFindLocationUsingForEach {

  public static Clinic[] clinics = new Clinic[10];
  public static int size = 0;

  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
    boolean runProgram = true;

    do {
      System.out.println(" Dear User \n Press 1 for Finding a clinic \n Press 2 for Adding a clinic \n Press 3 to quit");
      int inputDecision = scanner.nextInt();

      switch (inputDecision){

        case 1:
          System.out.println("Please enter a pin code");
          int userEnteredPin = scanner.nextInt();
          findAClinic(userEnteredPin);
          break;
        case 2:

          // Take input from the user
          System.out.print ("Enter clinic name: ");
          scanner.nextLine();
          String name = scanner.nextLine();
          System.out.print("Enter clinic pincode: ");
          int pinCode = scanner.nextInt();
          System.out.print("Enter clinic location name: ");
          scanner.nextLine();
          String locationName = scanner.nextLine();

          //Add clinic to our array
          addAClinic(name, pinCode, locationName);
          break;

        case 3:
          System.out.println("Exiting Program");
          runProgram = false; // this will ensure the loop terminates
          break;

        default:
          System.out.println("Invalid choice");
          break;
      }
    }while (runProgram);

  }

  public static void findAClinic(int pinCode){
    boolean clinicFound = false;

    for (Clinic clinic : clinics) {
      if (clinic != null && clinic.pinCode == pinCode) {
        clinicFound = true;
        clinic.displayClinic();
      }
    }

    if(!clinicFound){
        System.out.println("No Clinic Found");
    }
  }

  public static void addAClinic(String name, int pinCode, String locationName) {
    Clinic clinic = new Clinic(name, pinCode, locationName);
    clinics[size] = clinic;
    size = size +1;
  }

}

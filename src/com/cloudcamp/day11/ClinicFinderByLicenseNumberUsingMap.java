package com.cloudcamp.day11;


import java.util.HashMap;
import java.util.Scanner;

/**
 * {name, pin, lice} {name, pin, license} {name, pin,license} === List
 *
 *                                  {name, pin, lice}                     {name, pin, lice}  === Set
 *
 * lice - {name, pin, lice}    lice - {name, pin, license}   lice - {name, pin, license}
 *
 *
 * Map { key - value }
 */
public class ClinicFinderByLicenseNumberUsingMap {

  public static void main(String[] args) {

    HashMap<Integer, Clinic> licenseToClinicHashMap = new HashMap<>();

    Scanner scanner = new Scanner(System.in);
    boolean runProgram = true;

    do {

      String reset = "\u001B[0m";
      String cyan = "\u001B[36m";
      String yellow = "\u001B[33m";
      String green = "\u001B[32m";

      System.out.println(cyan + "Menu Options:" + reset);
      System.out.println(yellow + "  1. " + reset + green + "Enter 1 to add clinic");
      System.out.println(yellow + "  2. " + reset + green +"Enter 2 to find clinic");
      System.out.println(yellow + "  3. " + reset + green +"Enter 3 to remove a clinic");
      System.out.println(yellow + "  4. " + reset + green +"Enter 4 to print all clinics");
      System.out.println(yellow + "  5. " + reset + green +"Enter 5 to exit");
      // Update a clinic by license number
      int userEnteredNumber = scanner.nextInt();

      switch (userEnteredNumber){
        case 1:
          Clinic clinic = readClinicFromUser(scanner);
          licenseToClinicHashMap.put(clinic.getLicenseNumber(), clinic);
          break;

        case 2:
          System.out.println("Enter license: ");
          int license = scanner.nextInt();
          Clinic clinic1 = licenseToClinicHashMap.get(license);
          if(clinic1 != null){
            System.out.println("Clinic Found");
            System.out.println(clinic1.toString());
          }else {
            System.out.println("No clinic found");
          }
          break;

        case 3:
          System.out.println("Enter license: ");
          int license1 = scanner.nextInt();
          Clinic removedCLinic = licenseToClinicHashMap.remove(license1);
          if(removedCLinic != null){
            System.out.println("Yes clinic found, I have removed it");
          }else{
            System.out.println("No clinic is not found.");
          }
          break;

        case 4:
          System.out.println(licenseToClinicHashMap);
          break;

        case 5:
          runProgram = false;
          System.out.println("Thank you ! Visit Again !!");
          break;
        case 6:
          // update a clinic name by using license number
      }


    }while (runProgram);

  }

  private static Clinic readClinicFromUser(Scanner scanner) {
    scanner.nextLine();
    System.out.println("Enter name: ");
    String name = scanner.nextLine();

    System.out.println("Enter pin: ");
    int pin = scanner.nextInt();

    System.out.println("Enter license: ");
    int license = scanner.nextInt();

    Clinic clinic =  new Clinic(name, pin, license);
    return clinic;
  }

}

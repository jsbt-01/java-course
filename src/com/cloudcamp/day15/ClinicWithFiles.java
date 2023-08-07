package com.cloudcamp.day15;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.HashMap;
import java.util.Scanner;

public class ClinicWithFiles {

  public static void main(String[] args) {

    HashMap<Integer, Clinic> licenseToClinicHashMap = new HashMap<>();

    Scanner scanner = new Scanner(System.in);
    boolean runProgram = true;

    Path p1 = Path.of("clinicsData.txt");

    do {

      printMenu();
      int userEnteredNumber = scanner.nextInt();

      switch (userEnteredNumber){
        case 1:
          Clinic clinic = readClinicFromUser(scanner);

          String fileContent = "\n" + clinic.getName() + "," + clinic.getPinCode() + "," + clinic.getLicenseNumber();

          try {
            Files.write(p1, fileContent.getBytes(), StandardOpenOption.APPEND);
            System.out.println("Clinic added");
          } catch (IOException e) {
            System.out.println("Error occurred while writing to file: " + e.getMessage());
            e.printStackTrace();
          }

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
          try {
            String contentInFile = Files.readString(p1);
            String[] contentArray = contentInFile.split("\n");
            for (String contentItem : contentArray) {
              String[] item = contentItem.split(",");
              String name = item[0];
              int pinCode = Integer.parseInt(item[1]);
              int licenseNumber = Integer.parseInt(item[2]);
              System.out.println("Name: " + name + ", Pincode: " + pinCode + ", License number: " + licenseNumber);
            }
//            System.out.println("Below are the clinics");
//            System.out.println(contentInFile);
          } catch (IOException e) {
            System.out.println("Exception ocurred while reading from file: " + e.getMessage());
            e.printStackTrace();
          }
          break;

        case 5:
          System.out.println("Enter license: ");
          int licenseNumber = scanner.nextInt();

          if (licenseToClinicHashMap.containsKey(licenseNumber)) {
            System.out.println("Enter clinic name: ");
            scanner.nextLine();
            String newClinicName = scanner.nextLine();

            Clinic foundClinic = licenseToClinicHashMap.get(licenseNumber);
            foundClinic.setName(newClinicName);
            System.out.println("Clinic name updated!!!");
          } else {
            System.out.println("Invalid license number!!!");
          }
          break;

        case 6:
          runProgram = false;
          System.out.println("Thank you ! Visit Again !!");
          break;
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

  public static void printMenu(){
    String reset = "\u001B[0m";
    String cyan = "\u001B[36m";
    String yellow = "\u001B[33m";

    System.out.println(cyan + "Menu Options:" + reset);
    System.out.println(yellow + "  1. " + reset +  "Enter 1 to add clinic");
    System.out.println(yellow + "  2. " + reset +  "Enter 2 to find clinic");
    System.out.println(yellow + "  3. " + reset +  "Enter 3 to remove a clinic");
    System.out.println(yellow + "  4. " + reset +  "Enter 4 to print all clinics");
    System.out.println(yellow + "  5. " + reset +  "Enter 5 to update clinic name");
    System.out.println(yellow + "  6. " + reset +  "Enter 6 to exit");
  }

}

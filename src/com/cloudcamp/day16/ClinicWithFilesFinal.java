package com.cloudcamp.day16;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.Scanner;

public class ClinicWithFilesFinal {

  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
    boolean runProgram = true;

    Path p1 = Path.of("clinicsData.txt");

    do {

      printMenu();
      int userEnteredNumber = scanner.nextInt();

      switch (userEnteredNumber) {
        case 1:
          Clinic clinic = readClinicFromUser(scanner);

          String fileContent =
              "\n" + clinic.getName() + "," + clinic.getPinCode() + "," + clinic.getLicenseNumber();

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
          int userEnteredLicenseNumber = scanner.nextInt();
          try {
            String contentInFileForFinding = Files.readString(p1);
            String[] contentArray = contentInFileForFinding.split("\n");
            for (String content : contentArray) {
              String[] items = content.split(",");
              String licenseNumberStr = items[2];
              int clinicLicenseNumber = Integer.parseInt(licenseNumberStr);

              if (clinicLicenseNumber == userEnteredLicenseNumber) {
                System.out.println("Found the clinic");
                String name = items[0];
                String pinCode = items[1];
                System.out.println("Name: " + name + ", Pincode: " + pinCode + ", License number: "
                    + licenseNumberStr);
                break;
              }
            }
          } catch (IOException e) {
            System.out.println("Error in reading file for finding");
            e.printStackTrace();
          }
          break;

        case 3:
          System.out.println("Enter license: ");
          int userEnteredLicenseForRemove = scanner.nextInt();
          try {
            String contentInFile = Files.readString(p1);
            String[] contentArray = contentInFile.split("\n");
            String requiredContent = "";
            for (String content : contentArray) {
              String[] items = content.split(",");
              String licenseNumberStr = items[2];
              int clinicLicenseNumber = Integer.parseInt(licenseNumberStr);
              if (clinicLicenseNumber != userEnteredLicenseForRemove) {
                requiredContent = requiredContent + content + "\n";
              }
            }
            Files.writeString(p1, requiredContent);
            System.out.println("Given Clinic removed");
          } catch (Exception e) {
            System.out.println("Error occurred while reading from file");
            e.printStackTrace();
          }
          break;

        case 4:
          try {
            String contentInFile = Files.readString(p1);
            String[] contentArray = contentInFile.split("\n");
            for (String contentItem : contentArray) {
              String[] items = contentItem.split(",");
              String name = items[0];
              String pinCodeStr = items[1];
              String licenseNumberStr = items[2];
              System.out.println("Name: " + name + ", Pincode: " + pinCodeStr + ", License number: "
                  + licenseNumberStr);
            }
          } catch (IOException e) {
            System.out.println("Exception occurred while reading from file: " + e.getMessage());
            e.printStackTrace();
          }
          break;

        case 5:
          System.out.println("Enter license: ");
          int userEnteredLicenseNumberForUpdate = scanner.nextInt();
          try {
            String contentInFile = Files.readString(p1);
            String[] contentArray = contentInFile.split("\n");
            String requiredContent = "";
            for (String content : contentArray) {
              String[] items = content.split(",");
              String licenseNumberStr = items[2];
              int clinicLicenseNumber = Integer.parseInt(licenseNumberStr);
              if (clinicLicenseNumber == userEnteredLicenseNumberForUpdate) {
                System.out.println("Enter new clinic name");
                scanner.nextLine();
                String newClinicName = scanner.nextLine();

                System.out.println("Enter new pinCode");
                int newPinCode = scanner.nextInt();

                String newClinicData = newClinicName + "," + newPinCode + "," + licenseNumberStr;
                requiredContent = requiredContent + newClinicData + "\n";
              } else {
                requiredContent = requiredContent + content + "\n";
              }
            }
            Files.writeString(p1, requiredContent);
            System.out.println("Clinic name, pinCode updated");
          } catch (IOException e) {
            System.out.println("Error in reading file for update");
            e.printStackTrace();
          }

          break;

        case 6:
          runProgram = false;
          System.out.println("Thank you ! Visit Again !!");
          break;
      }


    } while (runProgram);

  }

  private static Clinic readClinicFromUser(Scanner scanner) {
    scanner.nextLine();
    System.out.println("Enter name: ");
    String name = scanner.nextLine();

    System.out.println("Enter pin: ");
    int pin = scanner.nextInt();

    System.out.println("Enter license: ");
    int license = scanner.nextInt();

    Clinic clinic = new Clinic(name, pin, license);
    return clinic;
  }

  public static void printMenu() {
    String reset = "\u001B[0m";
    String cyan = "\u001B[36m";
    String yellow = "\u001B[33m";

    System.out.println(cyan + "Menu Options:" + reset);
    System.out.println(yellow + "  1. " + reset + "Enter 1 to add clinic");
    System.out.println(yellow + "  2. " + reset + "Enter 2 to find clinic");
    System.out.println(yellow + "  3. " + reset + "Enter 3 to remove a clinic");
    System.out.println(yellow + "  4. " + reset + "Enter 4 to print all clinics");
    System.out.println(yellow + "  5. " + reset + "Enter 5 to update clinic name, pincode");
    System.out.println(yellow + "  6. " + reset + "Enter 6 to exit");
  }

}

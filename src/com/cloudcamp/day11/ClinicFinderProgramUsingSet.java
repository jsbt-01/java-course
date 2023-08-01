package com.cloudcamp.day11;

import java.util.HashSet;
import java.util.Scanner;

// {1, 2, 3, 4,5 } // no duplicates

// advantage
// no duplicates

public class ClinicFinderProgramUsingSet {

  public static void main(String[] args) {

    HashSet<Clinic> clinics = new HashSet<>();

    Scanner scanner = new Scanner(System.in);
    boolean runProgram = true;

    do {

      System.out.println("1. Enter 1 to add clinic");
      System.out.println("2. Enter 2 to find clinic");
      System.out.println("3. Enter 3 to remove a clinic");
      System.out.println("4. Enter 4 to print all clinics");
      System.out.println("5. Enter 5 to exit");
      int userEnteredNumber = scanner.nextInt();

      switch (userEnteredNumber){
        case 1:
          Clinic clinic = readClinicFromUser(scanner);
          clinics.add(clinic);
          break;

        case 2:
          Clinic clinic2 = readClinicFromUser(scanner);
          boolean found = clinics.contains(clinic2); // 7 8
          if(found){
            System.out.println("Clinic Found");
            System.out.println(clinic2.toString());
          }else {
            System.out.println("No clinic found");
          }
          break;

        case 3:
          Clinic clinic3 = readClinicFromUser(scanner);
          boolean removedOrNot = clinics.remove(clinic3);
          if(removedOrNot){
            System.out.println("Yes clinic found, I have removed it");
          }else{
            System.out.println("No clinic is not found.");
          }
          break;

        case 4:
          System.out.println(clinics);
          break;

        case 5:
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

}

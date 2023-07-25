package com.cloudcamp.day7;

import java.util.Scanner;

/**
 * 1. Find a Clinic
 * 2. Add a Clinic
 * 3. Exit
 *
 */
public class AddAndFindLocationUsingForEach {

  public static EnhancedArrayForClinics enhancedArrayForClinics = new EnhancedArrayForClinics();

  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
    boolean runProgram = true;

    do {
      System.out.println("\n Dear User \n Press 1 to find a clinic \n Press 2 to add a clinic \n Press 3 to quit \n Press 4 to know size");
      int inputDecision = scanner.nextInt();

      switch (inputDecision){

        case 1:
          System.out.print("Please enter a pin code: ");
          int userEnteredPin = scanner.nextInt();
          enhancedArrayForClinics.find(userEnteredPin);
          break;


        case 2:
          Clinic clinic = readClinicFromUser(scanner);
          enhancedArrayForClinics.add(clinic);
          break;

        case 3:
          System.out.println("Exiting Program");
          runProgram = false; // this will ensure the loop terminates
          break;

        case 4:
          System.out.println("Size of the Bag is "+ enhancedArrayForClinics.size);
          break;
        case 5:
          // remove clinic => enter pin code

        default:
          System.out.println("Invalid choice");
          break;
      }
    }while (runProgram);

  }

  public static Clinic readClinicFromUser(Scanner scanner){
    // Take input from the user
    System.out.print ("Enter clinic name: ");
    scanner.nextLine();
    String name = scanner.nextLine();
    System.out.print("Enter clinic pincode: ");
    int pinCode = scanner.nextInt();
    System.out.print("Enter clinic location name: ");
    scanner.nextLine();
    String locationName = scanner.nextLine();

    Clinic clinic = new Clinic(name, pinCode, locationName);
    return clinic;
  }


}

package com.cloudcamp.day10;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * 1. add a clinic
 * 2. find a clinic
 * 3. remove a clinic
 * 4. print all clinics
 * 5. exit
 *
 * disadvanatages of arrays =>
 *  duplicates
 */
public class ClinicFinderProgramUsingArrayList {

  public static void main(String[] args) {

    ArrayList<Clinic> clinics = new ArrayList<Clinic>();

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
          int index = clinics.indexOf(clinic2); // 7 8
          if(index >= 0){
            System.out.println("Clinic Found");
            System.out.println(clinics.get(index).toString());
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

    Clinic clinic =  new Clinic(name, pin);
    return clinic;
  }

}


////          for(int i=0; i< clinics.size(); i++){
////            clinic[i].displayMethod()
////          }
//
////          for (Clinic clininame: clinics
////          ) {
////            clininame.displaymethod
////          }
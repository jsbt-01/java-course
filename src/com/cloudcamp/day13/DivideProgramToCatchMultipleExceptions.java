package com.cloudcamp.day13;

import java.util.InputMismatchException;
import java.util.Scanner;

public class DivideProgramToCatchMultipleExceptions {

  public static void main(String[] args) {


    Scanner scanner = new Scanner(System.in);

    try{
      System.out.println("Enter first number");
      int number1 = scanner.nextInt();

      System.out.println("Enter second number");
      int number2 = scanner.nextInt();



      Integer n = null;
      System.out.println(n.toString());

      System.out.println("The result is "+ number1/number2);

    } catch (ArithmeticException ex){
      System.out.println("You can not divide a number using zero");
    } catch (InputMismatchException ex){
      System.out.println("Please enter number only");
    } catch (Exception daddy){
      System.out.println("BROO something is wrong . Exception details "+daddy);
    }



  }

}

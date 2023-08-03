package com.cloudcamp.day13;

import java.util.InputMismatchException;
import java.util.Scanner;

public class SumOfTwoNumbersHandleException {

  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);

    try{
      // do something
      System.out.println("Enter first number");
      int number1 = scanner.nextInt();

      System.out.println("Enter second number");
      int number2 = scanner.nextInt();
      System.out.println("Sum of two numbers is "+ (number1 + number2) );

    }catch (InputMismatchException exception){
      //catch exception
      System.out.println(" Please enter number only");
    }

  }
}

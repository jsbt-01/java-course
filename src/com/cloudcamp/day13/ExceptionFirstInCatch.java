package com.cloudcamp.day13;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionFirstInCatch {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    try{
      System.out.println("Enter first number");
      int number1 = scanner.nextInt();

      System.out.println("Enter second number");
      int number2 = scanner.nextInt();

      System.out.println("The result is "+ number1/number2);

      Integer n = null;
      System.out.println(n.toString());


    }
//    catch (Exception e){
//      System.out.println("Something went wrong");
//    }
    catch (InputMismatchException ex){
      System.out.println(" please enter number");
    } catch (ArithmeticException ex){
      System.out.println("Can not devide by zero");
    }
    // Exception class must be used at the end

  }
}

package com.cloudcamp.day4;

import java.util.Scanner;

public class ArrayInput {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int[] numbers = new int[5];

//    System.out.println("Enter 1 number: ");
//    numbers[0] = scanner.nextInt();
//
//    System.out.println("Enter 2 number: ");
//    numbers[1] = scanner.nextInt();
//
//    System.out.println("Enter 3 number: ");
//    numbers[2] = scanner.nextInt();
//
//    System.out.println("Enter 4 number: ");
//    numbers[3] = scanner.nextInt();
//
//    System.out.println("Enter 5 number: ");
//    numbers[4] = scanner.nextInt();

    for (int i = 0; i < numbers.length; i++) {
      System.out.println("Enter " + (i + 1) + " number: ");
      numbers[i] = scanner.nextInt();
    }

    for (int number : numbers) {
      System.out.println(number);
    }
  }
}

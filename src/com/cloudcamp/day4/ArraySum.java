package com.cloudcamp.day4;

public class ArraySum {

  public static void main(String[] args) {
    /*
    1. Loop through all values
    2. Remember the sum so far update it
    3. Display
     */

    int[] numbers = {25, 72, 12, 96, 52, 5};
    int sum = 0;
//    for (int i = 0; i < numbers.length; i++) {
//      int currentNumber = numbers[i];
//      sum = sum + currentNumber;
//    }
    for (int number : numbers) { // Enhanced for loop
      sum = sum + number;
    }
    System.out.println("Sum: " + sum);
  }
}

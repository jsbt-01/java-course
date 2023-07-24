package com.cloudcamp.day4;

public class ArrayLowest {

  public static void main(String[] args) {

    /*
      1. Declare array
      2. Define array (5 values)
      3. Remember the lowest value so far
      4. Compare with current value and update if necessary
      5. Display the lowest number
     */

    int[] numbers = {25, 72, 12, 96, 52, 5};

    int lowestNumber = 999999999;

    for(int i = 0; i < numbers.length; i++) {
      int currentNumber = numbers[i];

      if (currentNumber < lowestNumber) {
        lowestNumber = currentNumber;
      }
    }

    System.out.println("Lowest number: " + lowestNumber);
  }

}

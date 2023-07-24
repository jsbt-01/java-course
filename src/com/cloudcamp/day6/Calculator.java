package com.cloudcamp.day6;

public class Calculator { // Callee
  int sum(int[] numbers) {
    /*
    1. Loop through array
    2. Update and remember sum
    3. return
     */
    int sum = 0;
    for (int number : numbers) { // Enhanced for-loop
      sum = sum + number;
    }
    return sum;
  }

  int subtract(int number1, int number2) {
    int result = number1 - number2;
    return result;
  }

  int multiply(int number1, int number2) {
    int result = number1 * number2;
    return result;
  }
}

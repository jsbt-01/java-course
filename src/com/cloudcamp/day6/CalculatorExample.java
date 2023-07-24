package com.cloudcamp.day6;

public class CalculatorExample { // Caller

  public static void main(String[] args) {
    Calculator c1 = new Calculator();

    int[] numbers = {10, 20, 30, 5};

    int sumValue = c1.sum(numbers);
    System.out.println("Sum: " + sumValue);

    int[] numbers2 = {10, 20};

    int sumValue2 = c1.sum(numbers2);
    System.out.println("Sum2: " + sumValue2);

    int subtractValue = c1.subtract(50, 10);
    System.out.println("Substraction: " + subtractValue);

    int multiplicationValue = c1.multiply(4, 6);
    System.out.println("Multiplication: " + multiplicationValue);
  }
}

// Caller -> Callee : parameters
// Callee -> Caller : return value

package com.cloudcamp.day3;

import java.util.Scanner;

public class Restaurant {
  public static void main(String[] args) {

    Scanner s1 = new Scanner(System.in);

    int burgerPrice = 50;
    int pizzaPrice = 100;

    System.out.println("How many burgers do you want? ");
    int burgerCount = s1.nextInt();

    System.out.println("How many pizzas do you want? ");
    int pizzaCount = s1.nextInt();

    int burgerTotal = burgerCount * burgerPrice;
    int pizzaTotal = pizzaCount * pizzaPrice;
    int total = burgerTotal + pizzaTotal;

    System.out.println("Total: " + total);
  }
}

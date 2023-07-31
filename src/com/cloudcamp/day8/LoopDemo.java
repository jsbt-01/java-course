package com.cloudcamp.day8;

public class LoopDemo {

  public static void main(String[] args) {

//    System.out.println("Hello");
//    System.out.println("Hello");
//    System.out.println("Hello");
//    System.out.println("Hello");
//    System.out.println("Hello");
//    System.out.println("Hello");

    for(int i = 1; i <= 2; i++) {
      System.out.println("hello world");
    }

    System.out.println("\nNormal for loop");
    float[] arr = {25, 35, 45, 55, 65, 75, 85};
    // 0 to arr.length - 1
    for(int i = 0; i < arr.length; i++) {
      System.out.println(arr[i]); // Print the value
    }

    System.out.println("\nEnhanced for loop");
    for (float a : arr) {
      System.out.println(a);
    }
  }
}

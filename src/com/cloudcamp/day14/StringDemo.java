package com.cloudcamp.day14;

public class StringDemo {

  public static void main(String[] args) {

    String s1 = "Hello world how are you";
    System.out.println(s1);
    System.out.println("Length: " + s1.length());

    String[] sarr = s1.split(" ");
    System.out.println("Words: " + sarr.length);
    System.out.println("Value at index 1: " + sarr[1]);
    System.out.println("Value at index 3: " + sarr[3]);
  }
}

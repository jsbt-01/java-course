package com.cloudcamp.day13;

public class Hierarchy {

  public static void main(String[] args) {

    int[] numbers = new int[3];

    numbers[0] = 22;
    numbers[1] = 33;
    numbers[2] = 44;

    try{
      numbers[3] = 55; // length is 3 but we are entering 4 th element
    }catch (Exception e){
      System.out.println("Catching Exception wrong");
    }

    try{
      numbers[3] = 55;
    }catch (RuntimeException ex){
      System.out.println("Catching runtimeexception");
    }

    try{
      numbers[3] = 55;
    }catch (ArrayIndexOutOfBoundsException ex){
      System.out.println("Catching ArrayIndexOutOfBoundsException");
    }

    /**
     * hierarchy
     *
     * Animal -> Cat -> BigCat
     * Animal -> Cat -> SmallCat
     *
     * Exception -> RuntimeException -> ArrayIndexOutOfBoundsException
     *
     */

  }

}

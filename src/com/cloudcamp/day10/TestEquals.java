package com.cloudcamp.day10;

public class TestEquals {

  public static void main(String[] args) {
    System.out.println("test");

    int num1 = 3; // primitives => int char float long
    int num2 = 3;
    int num3 = 4;

    if(num1 == num2){
      System.out.println("num1 and num2 are same");
    }

    if(num2 == num3){
      System.out.println("num2 and num3 are same");
    }else{
      System.out.println("num2 and num3 are not same");
    }

    Integer number1 = new Integer(3); // 1004 {3}
    Integer number2 = new Integer(3); // 1008 {3}

    if(number1 == number2){ // == reference comparision
      System.out.println("number1 and number2 are same");
    }else {
      System.out.println("number1 and number2 are not same");
    }

    // content comparision
    if(number1.equals(number2)){
      System.out.println("Content of number 1 and number 2 are same");
    }

    // Let's compare Clinic

    Clinic clinic1 = new Clinic("medplus", 123);
    Clinic clinic2 = new Clinic("medplus", 123);

    if(clinic1 == clinic2){
      System.out.println("clinic1 and clinic2 are same");
    }else{
      System.out.println("clinic1 and clinic2 are not same");
    }

    // content comparision

    if(clinic1.equals(clinic2)){
      System.out.println("clinic1 and clinic2 content is same");
    }else{
      System.out.println("clinic1 and clinic2 content is not same");
    }

    Clinic clinic3 = new Clinic("medplus", 456);
    if(clinic1.equals(clinic3)){
      System.out.println("clinic1 and clinic3 content is same");
    }else{
      System.out.println("clinic1 and clinic3 content is not same");
    }

  }

}

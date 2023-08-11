package com.cloudcamp.day19;

import java.util.List;

public class MathematicalSumWorker extends Thread { // implements Runnable
  List<Integer> numbers;
  int firstPos;
  int lastPost;
  int sum = 0;
  String name;

  public MathematicalSumWorker(String name, List<Integer> numbers, int firstPos, int lastPost) {
    this.name = name;
    this.numbers = numbers;
    this.firstPos = firstPos;
    this.lastPost = lastPost;
  }

  public void doSumOfNumbers(){
      for(int i=firstPos; i<= lastPost; i++){
        sum = sum + numbers.get(i);
      }

    System.out.println(name+ " calculated Sum is  "+ sum);

  }

  @Override
  public void run() {
    sleepForSomeTime();
    // System.out.println("In Run method");
    // what ever we write here
    doSumOfNumbers();

  }

  public void sleepForSomeTime(){
    try {
      Thread.sleep(1000);
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
  }
}

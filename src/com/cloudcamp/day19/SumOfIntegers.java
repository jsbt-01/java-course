package com.cloudcamp.day19;

import java.util.ArrayList;
import java.util.List;

public class SumOfIntegers {

  public static void main(String[] args) throws InterruptedException {

    List<Integer> numbers = new ArrayList<>();
    for(int i=0; i<100; i++){
      numbers.add(i);
    }

    // worker.doSumOfNumbers();

    MathematicalSumWorker worker = new MathematicalSumWorker("Worker Sailendra", numbers, 0, 49);
    MathematicalSumWorker worker2 = new MathematicalSumWorker("Worker Siva", numbers, 50, 99);

    // to run as a thread
    worker.start();
    worker2.start();

    // Hellow main thread please wait for Sailendra and Siva to complete their jobs

    worker.join(); // hey main thread please wait for worker 1/ Sailendra
    worker2.join();

    System.out.println("Sum of all numbers is "+ (worker.sum + worker2.sum));

    System.out.println("Main thread is completed");



  }

}

package com.cloudcamp.day19;

import java.util.ArrayList;
import java.util.List;

public class MainProgram {

  public static void main(String[] args) throws InterruptedException {

    List<Integer> numbers = new ArrayList<>();

    for(int i=0; i<100; i++){
      numbers.add(i*3);
    }

    for (Integer number: numbers
    ) {

      Thread.sleep(1000);

      System.out.println(number);
    }

  }

}

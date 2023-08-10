package com.cloudcamp.day18.Collections;

import java.util.ArrayList;
import java.util.Iterator;

public class SampleProgramExplainingIterators {

  public static void main(String[] args) {
    ArrayList<Integer> numbers = new ArrayList<>(); // LinkedList
    numbers.add(10);
    numbers.add(20);
    numbers.add(30);

    System.out.println("Print using regular for loop");
    for(int i = 0; i< numbers.size(); i ++){
      if(i==0){
        numbers.add(40);
      }

      System.out.println(numbers.get(i));
    }

    System.out.println("print using advanced for loop");
    for (Integer number: numbers
    ) { // Concurrent modification Exception
         //numbers.add(50);
      System.out.println(number);
    }

    System.out.println("print using iterator");
    Iterator<Integer> numbersIterator = numbers.iterator(); // fail fast iterator
    while (numbersIterator.hasNext()){
       // Concurrent modification Exception
      // numbers.add(60);
      System.out.println(numbersIterator.next());
    }

    // fail safe iterator? ConcurrentHashMap, CopyOnWriteArrayList
  }

}

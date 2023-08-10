package com.cloudcamp.day18.Collections;

import java.util.LinkedList;
import java.util.Queue;

public class SampleProgramForQueue {

  public static void main(String[] args) {

    Queue<String> queue = new LinkedList<>(); // Learn Stack

    // First In First Out - FIFO

    queue.add("Teja");
    queue.add("Bharat");

    System.out.println(queue.poll());

    queue.add("Ram");

    System.out.println(queue.poll());

    System.out.println("next guy in the queue is "+ queue.peek());


  }

}

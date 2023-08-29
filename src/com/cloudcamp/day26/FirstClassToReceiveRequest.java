package com.cloudcamp.day26;

import java.util.ArrayList;
import java.util.List;

public class FirstClassToReceiveRequest {

  public static void main(String[] args) throws InterruptedException {

    List<StudentServiceTesting> list = new ArrayList<>();

    for (int i=0; i<100; i++){
      list.add(new StudentServiceTesting());
    }

    for (int i=0; i<100; i++){
      list.get(i).start();
    }

    Thread.sleep(10000);
  }

}

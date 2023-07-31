package day9;

import java.util.ArrayList;
import java.util.HashSet;

public class HashSetDemo {

  public static void main(String[] args) {

    HashSet<Integer> hs = new HashSet<>();

    hs.add(25);
    hs.add(35);
    hs.add(45);

    System.out.println("Size: " + hs.size());

    for (Integer i : hs) {
      System.out.println(i);
    }
  }
}

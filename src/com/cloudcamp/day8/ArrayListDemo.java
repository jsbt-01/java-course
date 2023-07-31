package com.cloudcamp.day8;

import java.util.ArrayList;

public class ArrayListDemo {

  public static void main(String[] args) {
    ArrayList<Integer> al = new ArrayList<>();

    al.add(25); // 0
    al.add(35); // 1
    al.add(45); // 2
    al.add(55); // 3
    al.add(45); // 4
    al.add(65); // 5
    al.add(45); // 6
    al.add(45); // 7

    System.out.println("Size: " + al.size());

    System.out.println("\nAll values");
    printValues(al);

    int index = al.indexOf(45);
    System.out.println("45 found at first index " + index);

    int lastIndex = al.lastIndexOf(45);
    System.out.println("45 found at last index: " + lastIndex);

    System.out.println("\nAdd new value at index 2");
    al.add(2, 30);
    printValues(al);

    System.out.println("\nRemove value at index 1");
    al.remove(1);
    printValues(al);

    System.out.println("\nFind all indexes of 45");
    for (int i = 0; i < al.size(); i++) {
      if (al.get(i) == 45) {
        System.out.print(i + "    ");
      }
    }
    System.out.println();

    System.out.println("\nClear all values");
    al.clear();
    printValues(al);
  }

  static void printValues(ArrayList<Integer> al) {
    System.out.print("Values: ");
    for (Integer a : al) { // Enhanced for-loop
      System.out.print(a + "     ");
    }
    System.out.println();
  }
}

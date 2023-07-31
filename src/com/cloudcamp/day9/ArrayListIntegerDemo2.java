package day9;

import java.util.ArrayList;

public class ArrayListIntegerDemo2 {

  public static void main(String[] args) {
    ArrayList<Integer> al = new ArrayList<>();
    System.out.println("Size before adding elements: " + al.size());

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

    ArrayList<Integer> otherList = new ArrayList<>();
    otherList.add(5);
    otherList.add(7);
    otherList.add(9);

    al.addAll(otherList);

    System.out.println("\nAfter addAll");
    printValues(al);

    boolean b = al.contains(65);
    System.out.println("\nIs 65 present: " + b);

    boolean b2 = al.contains(100);
    System.out.println("\nIs 100 present: " + b2);
  }

  static void printValues(ArrayList<Integer> al) {
    System.out.print("Values: ");
    for (Integer a : al) { // Enhanced for-loop
      System.out.print(a + "     ");
    }
    System.out.println();
  }
}

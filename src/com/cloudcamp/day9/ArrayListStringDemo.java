package day9;

import java.util.ArrayList;

public class ArrayListStringDemo {

  public static void main(String[] args) {

    ArrayList<String> al = new ArrayList<>();

    al.add("Hello");
    al.add("World");
    al.add("Car");
    al.add("Speaker");
    al.add("Car");
    al.add("Keyboard");

    System.out.println("Size: " + al.size());

    printValues(al);

    int index = al.indexOf("Car");
    System.out.println("Index of Car: " + index);

    int lastIndex = al.lastIndexOf("Car");
    System.out.println("Last index of Car: " + lastIndex);
  }

  static void printValues(ArrayList<String> al) {
    System.out.print("\nValues:  ");
    for (String a : al) { // Enhanced for-loop
      System.out.print(a + "    ");
    }
    System.out.println();
  }
}

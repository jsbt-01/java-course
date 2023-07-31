package day9;

import java.util.ArrayList;

public class ArrayListClinicDemo {

  public static void main(String[] args) {

    ArrayList<Clinic> al = new ArrayList<>();

    Clinic c1 = new Clinic("Appollo", "Abids", 5000);
    Clinic c2 = new Clinic("Yashoda", "Koti", 6000);
    Clinic c3 = new Clinic("Medicare", "Madhapur", 7000);

    al.add(c1);
    al.add(c2);
    al.add(c3);

    System.out.println("Size: " + al.size());
    printValues(al);

    int index = al.indexOf(c2);
    System.out.println("\nIndex of c2: " + index);

    String name = "Yashoda";
    String location = "Koti";
    int pinCode = 6000;
    Clinic sc = new Clinic(name, location, pinCode);

    int index2 = al.indexOf(sc);
    System.out.println("Found clinic of user at : " + index2);


    String name2 = "Yashoda";
    String location2 = "Koti";
    int pinCode2 = 6000;
    Clinic sc2 = new Clinic(name2, location2, pinCode2);

    boolean eq1 = sc2.equals(sc);
    System.out.println("Equals: " + eq1);
  }

  static void printValues(ArrayList<Clinic> al) {
    System.out.println("\nValues");
    for (Clinic c : al) {
      System.out.println("Name: " + c.name + ", Location: " + c.location + ", Pincode: " + c.pinCode);
    }
    System.out.println();
  }
}

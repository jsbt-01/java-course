package day8;

import java.util.Scanner;

public class WrapperDemo {

  public static void main(String[] args) {
    int a = 25;
    System.out.println("Primitive value: " + a);
    System.out.println();

    Scanner s1 = new Scanner(System.in);

    String name = "Sanjay";
    System.out.println("String value: " + name);

    String message = new String("Hello world");
    System.out.println("String new syntax: " + message);
    System.out.println();

    Integer i1 = new Integer(35);
    System.out.println("Wrapper value: " + i1);

    Integer i2 = null;
    System.out.println("Wrapper value 2: " + i2);

    Integer i3 = 55;
    System.out.println("Wrapper integer direct value: " + i3);
    System.out.println();

    float b = 5.8F;
    System.out.println("Float primitive value: " + b);

    Float f1 = new Float(4.9F);
    System.out.println("Float wrapper value: " + f1);

    Float f2 = 5.2F;
    System.out.println("Float wrapper direct value: " + f2);
    System.out.println();

    boolean c = true;
    System.out.println("Boolean primitive value: " + c);

    Boolean b1 = new Boolean(true);
    System.out.println("Boolean wrapper value: " + b1);

    Boolean b2 = false;
    System.out.println("Boolean wrapper direct value: " + b2);
  }
}

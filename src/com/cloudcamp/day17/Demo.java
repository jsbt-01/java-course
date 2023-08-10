package com.cloudcamp.day17;

public class Demo {

  int a = 5;

  public static void main(String[] args) {

//    Demo d = new Demo();
//    System.out.println(d.a);

//    Person p1 = new Person("Sanjay", 20);
//    p1.setName("Sanjay");
//    p1.setAge(-20);
//
//    p1.location = "Hyderabad";
//
//    System.out.println("Name: " + p1.getName() + ", Age: " + p1.getAge());

//    Person.planet = "Jupiter";
    System.out.println("Planet: " + Person.getPlanet());

//    Dog d1 = new Dog();
//    d1.setName("Puppy");
//    d1.setAge(4);
//
//    d1.display();

    final float pi = 3.14F;
    final int a = 5;
//    a = 8; // Error
//    a = 9; // Error
    final int b;
    b = 4;

    final int[] arr = {5, 9, 2, 8};
    arr[1] = 200;

//    arr = new int[]{2, 9};

    final Person p2 = new Person("Sanjay", 22);
    p2.setAge(23);
    // p2 = new Person("Kumar", 26); // Error
  }

}

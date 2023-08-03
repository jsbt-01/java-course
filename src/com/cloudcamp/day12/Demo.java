package com.cloudcamp.day12;

public class Demo {

  public static void main(String[] args) {

    Dog d1 = new Dog();
    d1.name = "Puppy";
    d1.age = 5;
    d1.color = "Black";
    d1.sniff();


    Animal a1 = new Dog();
    a1.makeSound();
    a1.move();



    Animal a2 = new Cat();

//    Dog d2 = new Animal();
//    Cat c2 = new Animal();


//    System.out.println("Name: " + d1.name);
//    d1.makeSound();
//    d1.sniff();
//
//    Cat c1 = new Cat();
//    c1.name = "c1";
//    c1.age = 5;
//    c1.color = "Black";
//
//    System.out.println("Name: " + c1.name);
//    c1.makeSound();

  }
}

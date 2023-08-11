package com.cloudcamp.day19.abstr;

public class TestMain {

  public static void main(String[] args) {
    Shape rectangle = new Rectangle(5, 7);
    Shape circle = new Circle(5);

    rectangle.displayDetails();
    circle.displayDetails();
  }

}

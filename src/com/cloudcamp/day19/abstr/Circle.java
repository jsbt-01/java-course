package com.cloudcamp.day19.abstr;

public class Circle extends Shape {

  int radius;

  public Circle(int radius) {
    super("Circle");
    this.radius = radius;
  }

  @Override
  public int calculateArea() {
    return 3 * radius * radius;
  }
}

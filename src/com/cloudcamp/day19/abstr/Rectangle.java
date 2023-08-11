package com.cloudcamp.day19.abstr;

public class Rectangle extends Shape{

  int length;
  int width;

  public Rectangle(int length, int width) {
    super("rectangle");
    this.length = length;
    this.width = width;

  }

  @Override
  public int calculateArea() {
    return length * width;
  }
}

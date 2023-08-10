package com.cloudcamp.day17;

public class Dog extends Animal {
  
    public void show() {
      this.display();
    }

    //Error: Cannot override because parent method is final
//    public String getName() {
//    return name;
//  }
}

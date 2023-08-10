package com.cloudcamp.day18.Collections;

import java.util.LinkedList;
import java.util.List;

public class SampleProgramForLinkedList {

  public static void main(String[] args) {

    List<String> list = new LinkedList(); // modifcation is frequent operation use libnked list

    list.add("teja"); // 0
    list.add("Sasi"); // 1
    list.add("Jahnavi"); // 2
    list.add("Bharat"); // 3

    System.out.println(list);

    list.remove(1); // sasi In arraylist this operation is very expensive

    // teja(0)  sasi(1) jaha(2)  bhart(3)

    // teja(0) jah(1) bhara (2)  left shifting

    // memory allocation in linked list is not in sequence
    // searching is slow
    // linked list removing in middle is easy

  }

}

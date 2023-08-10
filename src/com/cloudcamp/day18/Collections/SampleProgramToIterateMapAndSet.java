package com.cloudcamp.day18.Collections;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class SampleProgramToIterateMapAndSet {

  public static void main(String[] args) {

    Set<String> names = new HashSet(); // Treeset
    names.add("Teja");
    names.add("Siva");

    for (String name:names
    ) {
      System.out.println(name);
    }

    Iterator itr = names.iterator();
    while (itr.hasNext()){ // Conurrent Mod Exce
      // names.add("")
      System.out.println(itr.next());
    }

    Map<String, Integer> studentMarks = new HashMap();
    studentMarks.put("Teja", 100);


    // Set<Map.Entry<String, Integer>> entrySet = studentMarks.entrySet();
    for (Map.Entry<String, Integer> entry:studentMarks.entrySet()
    ) {
      System.out.println("Key is "+ entry.getKey());
      System.out.println("Value is "+ entry.getValue());
    }


  }

}

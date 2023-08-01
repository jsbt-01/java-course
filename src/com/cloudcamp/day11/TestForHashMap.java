package com.cloudcamp.day11;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class TestForHashMap {

  public static void main(String[] args) {

    HashMap<String, Integer> resultsMap = new HashMap();

    resultsMap.put("Mahendra", 70);
    resultsMap.put("Teja", 60);
    System.out.println("Teja marks "+ resultsMap.get("Teja"));

    resultsMap.remove("Teja");
    System.out.println("Teja marks "+ resultsMap.get("Teja"));

    HashSet<String> names = new HashSet<>();

    names.add("Teja");
    names.add("Teja");
    names.add("Raju");

    System.out.println("names from set "+names);

    ArrayList<String> namesfromList = new ArrayList<>();

    namesfromList.add("Teja");
    namesfromList.add("Teja");
    namesfromList.add("Raju");

    System.out.println("names from list "+namesfromList);


  }

}

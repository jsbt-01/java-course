package com.cloudcamp.day13;

import java.util.ArrayList;

public class LetsCatchErrorNotRecommended {

  public static void main(String[] args) {

    ArrayList<Integer> numbersList = new ArrayList<Integer>();

    try{
      // try something
      do {
        numbersList.add(66);
      }while (true);

    }catch(Error error){
      //catch that problem
      System.out.println("Catch chesam");
    }

  }

}

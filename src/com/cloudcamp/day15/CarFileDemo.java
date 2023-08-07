package com.cloudcamp.day15;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class CarFileDemo {

  public static void main(String[] args) {

    Path p1 = Path.of("carData.txt");

    try {
      String carData = Files.readString(p1);

      String[] carArray = carData.split(",");

      System.out.println("Cars");
      for(int i = 0; i < carArray.length; i++) {
        String carDetail = carArray[i];
        String[] carItems = carDetail.split("-");

        String carName = carItems[0];
        String year = carItems[1];
        String costStr = carItems[2]; // "10"
        int cost = Integer.parseInt(costStr); // 10
        int displayCost = cost * 100000;

        System.out.println((i + 1) + ". " + carName + " is manufactured in " + year + " and cost is INR " + displayCost);
      }

    } catch (IOException e) {
      System.out.println("Error while reading the file");
      e.printStackTrace();
    }

  }

}

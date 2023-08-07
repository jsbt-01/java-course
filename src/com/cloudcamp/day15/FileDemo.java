package com.cloudcamp.day15;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.OpenOption;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;

public class FileDemo {

  public static void main(String[] args) {

    Path p1 = Path.of("sample.txt");

    boolean e = Files.exists(p1);
    System.out.println("sample.txt exist: " + e);

//    try {
//      Files.createFile(p1);
//      System.out.println("File created successfully");
//    } catch (Exception ex) {
//      System.out.println("Error occurred while creating the file");
//      ex.printStackTrace();
//    }

//    String content1 = "Hello, how are you?";
//    try {
//      Files.writeString(p1, content1);
//      System.out.println("Written to file successfully");
//    } catch (IOException ex) {
//      System.out.println("Error occurred while writing to the file");
//      ex.printStackTrace();
//    }

//    String content2 = "Where are you?";
//    try {
//      Files.write(p1, content2.getBytes(), StandardOpenOption.APPEND);
//      System.out.println("Appended to file successfully");
//    } catch (IOException ex) {
//      System.out.println("Error occurred while appending to the file");
//      ex.printStackTrace();
//    }

    try {
      String content3 = Files.readString(p1);
      System.out.println("Below is the content of the file");
      System.out.println(content3);
    } catch (IOException ex) {
      System.out.println("Error occurred while reading the file");
      ex.printStackTrace();
    }

    Path newPath = Path.of("greeting.txt");
    try {
      Files.copy(p1, newPath);
      System.out.println("File copied successfully");
    } catch (IOException ex) {
      System.out.println("Error occurred while copying the file");
      ex.printStackTrace();
    }
  }
}

package com.cloudcamp.day14;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;

public class FileDemo {

  public static void main(String[] args) {

    Path p1 = Path.of("demo.txt");

    boolean exist = Files.exists(p1);
    System.out.println("File exist: " + exist);

//    try {
//      if (!exist) {
//        Files.createFile(p1);
//        System.out.println("File created");
//      } else {
//        System.out.println("File already exist. So not creating the file");
//      }
//    } catch (IOException e) {
//      System.out.println("IOException occurred while creating file " + e.getMessage());
//      e.printStackTrace();
//    }

//    try {
//      if (exist) {
//        Files.delete(p1);
//        System.out.println("File deleted");
//      } else {
//        System.out.println("File not present. So cannot delete");
//      }
//    } catch (IOException e) {
//      System.out.println("IOException occurred while deleting file " + e.getMessage());
//      e.printStackTrace();
//    }

//    try {
//      boolean deleted = Files.deleteIfExists(p1);
//      if (deleted) {
//        System.out.println("File deleted");
//      }
//    } catch (IOException e) {
//      System.out.println("IOException occurred while deleting file " + e.getMessage());
//      e.printStackTrace();
//    }

//    String content = "How are you?";
//    try {
//      Files.writeString(p1, content);
//      System.out.println("Write to file completed");
//    } catch (IOException e) {
//      System.out.println("IOException occurred while writing to file: " + e.getMessage());
//      e.printStackTrace();
//    }

//    String content = "How are you?";
//    try {
//      Files.write(p1, content.getBytes(), StandardOpenOption.APPEND);
//      System.out.println("Append to file completed");
//    } catch (IOException e) {
//      System.out.println("IOException occurred while writing to file: " + e.getMessage());
//      e.printStackTrace();
//    }

    try {
      String fileContent = Files.readString(p1);
      System.out.println("Below is the content of the file");
      System.out.println(fileContent);
    } catch (IOException e) {
      System.out.println("IOException occurred while reading the file: " + e.getMessage());
      e.printStackTrace();
    }
  }
}

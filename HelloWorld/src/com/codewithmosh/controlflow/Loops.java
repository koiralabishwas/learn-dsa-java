package com.codewithmosh.controlflow;

import java.util.Scanner;

public class Loops {
  public static void main(String[] args) {
     Scanner scanner = new Scanner(System.in);
    String input = "";
    while (true) { 
      System.out.print("input : ");
      input = scanner.nextLine();

      if (input.equals("pass")) {
        continue;
      }
      if (input.equals("quit")){
        break;
      }
      System.out.println(input);
    }
    scanner.close();
  }
}

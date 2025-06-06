package com.codewithmosh.controlflow;

import java.util.Scanner;

public class ComparisonOperators {
  public static void main(String[] args) {
    // =が２個でほか　だいたい JS系と一緒
    int x = 1;
    int y = 1;
    System.out.println(x == y);// true // 

    // if else , if else の省略も JS系ににいる
    // switch case も 一緒

    // for loop  , while loop , do while loop も一緒

    // logical operator compares memmory , not values , use equal mehod that helps value compare
    Scanner scanner = new Scanner(System.in);
    String input = "";
    // while  (input != "quit") //compares memmory , not values ,
    while (!input.equals("quit")) { //use equal mehod that helps value compare
      System.out.print("input : ");
      input = scanner.nextLine();
      System.out.println(input);
    }
    scanner.close();
  }
}

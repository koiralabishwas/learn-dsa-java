package basic.controlflow;

import java.util.Scanner;

public class Loops {
  public static void main(String[] args) {
    forEachLoops();
  }

  public static void forEachLoops () {
    String[] fruits = {"apple" , "mango" , "banana"};
    for (String fruit : fruits) {
      System.out.println(fruit);
    } 
  }

  public static void breakContinue() {
    Scanner scanner = new Scanner(System.in);
    String input = "";
    while (true) {
      System.out.print("input : ");
      input = scanner.nextLine();

      if (input.equals("pass")) {
        continue;
      }
      if (input.equals("quit")) {
        break;
      }
      System.out.println(input);
    }
    scanner.close();
  }
}

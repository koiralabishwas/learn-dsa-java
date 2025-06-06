package types;

import java.util.Scanner;

public class ReadingInput {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in); // to work smth in terminal
    System.out.print("Age : ");
    byte age = scanner.nextByte();
    System.out.println("your age is : " + age);

    System.out.print("Name ; ");
    String name = scanner.nextLine().trim();
    System.out.println("your name is" + name);
  }
}

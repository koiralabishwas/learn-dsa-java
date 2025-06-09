package basic.controlflow;

import java.util.Scanner;

public class FizzBuzz {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Input : ");
    int input = scanner.nextInt();
    System.out.println(fizzByzz(input));
    scanner.close();

  }

  public static boolean divisibleBy5(int i) {
    return i % 5 == 0;
  }

  public static boolean divisibleBy3(int i) {
    return i % 3 == 0;
  }

  public static String fizzByzz(int i) {
    boolean threeDivisible = divisibleBy3(i);
    boolean fiveDivisible = divisibleBy5(i);

    if (threeDivisible && fiveDivisible) {
      return "FizzBuzz";
    }

    if (fiveDivisible) {
      return "Fizz";
    }

    if (threeDivisible) {
      return "Buzz";
    }

    return String.valueOf(i);
    
  }
}

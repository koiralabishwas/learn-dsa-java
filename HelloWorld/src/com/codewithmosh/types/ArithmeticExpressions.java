package com.codewithmosh.types;

public class ArithmeticExpressions {

  public static void main(String[] args) {
    int result = 10 + 3;
    double dub = (double) result; // casting in double
    int x = 1;
    System.out.println(x);
    int y = x++; // y will be x i.e 1 then x will be 2 => 
    System.out.println(y); // is 1
    x = 1;
    y = ++x;
    System.out.println(y); // is 2

    // self calculation methods 
    int n = 1;
    n = n + 2;
    n += 2;
    n *= 2;
    n /=2;

    //calculation priority
    // bracket  , multiply or divide , addition or substraction
  }
}

package com.codewithmosh;

import java.text.NumberFormat;

public class MathClass {
  public static void main(String[] args) {
    int roundresult = Math.round(1.1f);
    System.out.println(roundresult);

    double celiResult = Math.ceil(1.1f);
    System.out.println(celiResult);

    // max , random

    NumberFormat currency = NumberFormat.getCurrencyInstance(java.util.Locale.JAPAN); // default is us
    String curRes = currency.format(123456789.098);
    System.out.println(curRes);

    // NumberFormat percent = NumberFormat.getPercentInstance(); // こういうのは直接呼べる
    String perResult = NumberFormat.getPercentInstance().format(0.2);
    System.out.println(perResult);
  }
}

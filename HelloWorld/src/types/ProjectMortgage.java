package types;

import java.util.Scanner;

public class ProjectMortgage {
  public static void main(String[] args) {
    // 間違っているけど、めんどいからいいや  
    Scanner scanner = new Scanner(System.in);

    while(true) {

      System.out.println("Principal Amoutn : ");
      long principal = scanner.nextLong();
      
      System.out.println("Anual Interest Rate : ");
      double interestRate = scanner.nextDouble() / 100 / 12;
  
      System.out.println("Period (Years) :");
      int years = scanner.nextByte() * 12;
  
      double mortgage = principal * (Math.pow((1 + interestRate), years)   / (Math.pow(1 + interestRate, years) - 1));
      System.out.println("mortgage : " + mortgage);
      scanner.close();
    }
    
    
  }
}

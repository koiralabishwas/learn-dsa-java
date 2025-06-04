package com.codewithmosh.types;

public class TypeCastiong {
  public static void main(String[] args) {
    // IMPLICIT (automatic) casting 
    // byte ==> short ==> int ==> long ==> float ==> double
    short x = 1 ; // short is 2 byte
    int y = x + 2 ; // int is 4 byte 
    System.out.println(y); // return 3

    double dx = 1.1;
    double dy = dx + 2 ; // 2 will be casted to 2.0
    System.out.println(dy); // will be 3.1

    // EXPLICT (manual) CASTING .. only in compatible types
    double ex = 1.5; // ポイント切り捨てされる
    int ey = (int) ex + 1;
    System.out.println(ey); // return 2 

    // not compatible casting
    String sx = "1";
    // int sn = (int) sx; // not compatible
    int sn = Integer.parseInt(sx) + 22; // need to use wrapper classes 
    double dn = Double.parseDouble(sx) + 1.22;
    System.out.println(sn);
    System.out.println(dn);


    
  }
  
}

package types;

import java.awt.*;

public class PrimitiveReference {
  public static void main(String[] args) {
    // Primitive type
    byte x = 1;
    byte y = x;
    // these two varible are in different memmory location 
    x = 2;
    System.err.println(y);

    // Reference Type 
    Point point1 = new Point(1, 2);
    Point point2 = point1; // it is pointing memmory address of point1
    point1.x = 5;
    System.err.println(point2); // returns x = 5

    // constants 
    final float pi = 3.14F; // need to add f in float


    
  }
}

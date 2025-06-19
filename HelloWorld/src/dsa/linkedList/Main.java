package dsa.linkedList;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
      LinkedList list = new LinkedList();
      list.addLast(3);
      list.addLast(22);
      list.addLast(10);
      list.addLast(15);
      System.out.println(Arrays.toString(list.toArray()));
      // list.reverse();
      System.out.println(Arrays.toString(list.toArray()));
      System.out.println(list.getKthFromTheEnd(4));

      // System.out.println(list.getKthFromTheEnd(4));
    }
}

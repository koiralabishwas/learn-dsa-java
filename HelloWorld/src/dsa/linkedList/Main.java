package dsa.linkedList;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
      LinkedList list = new LinkedList();
      list.addLast(1);
      list.addLast(22);
      list.addLast(22);

      // list.removeLast();
      int[] arr = list.toArray();
      System.out.println(list.contains(22));
      System.out.println(list.size());
      System.out.println(Arrays.toString(arr));
      
    
    }
}

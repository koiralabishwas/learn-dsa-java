package dsa.linkedList;

public class Main {
    public static void main(String[] args) {
      LinkedList list = new LinkedList();
      list.addLast(1);
      list.addLast(22);

      list.removeLast();
      System.out.println(list.contains(22));
      
    
    }
}

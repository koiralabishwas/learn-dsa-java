package dsa.linkedList;

public class Main {
    public static void main(String[] args) {
      LinkedList list = new LinkedList();
      list.addLast(1);
      list.addLast(5);
      list.addLast(10);
      list.addLast(15);
      System.out.println(list.indexOf(0));
    }
}

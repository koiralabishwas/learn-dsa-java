package dsa.linkedList;

import java.util.Arrays;
import java.util.LinkedList;

public class JavaLinkedList {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<Integer>();
        list.add(10);
        list.add(20);
        list.add(30);
        // list.addFirst(5);
        // list.addLast(55);
        // list.removeLast();
        // list.remove(1);
        System.out.println(list.contains(10));
        System.out.println(list.indexOf(30));
        System.out.println(list);

        var array = list.toArray();
        System.out.println(Arrays.toString(array));
    }
}

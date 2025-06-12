package dsa.array;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayEx {
    public static void main(String[] args) {
        // Array numbers = new Array(3);
        // numbers.insert(1);
        // numbers.insert(2);
        // numbers.insert(2);
        // numbers.insert(4);
        // numbers.removeAt(0);
        // numbers.print();
        // System.err.println();
        // System.out.println("max" + numbers.max());

        // we have dynamic array in java 
        // vector => grows by 100% of it's size - are synchronized
        // arrayList => grows by 50% of it's size - are asynchronized



        /**
         * List ds implemented in java by default
         */
        // ArrayList<Integer> list = new ArrayList<>();
        // list.add(2);
        // list.add(3);
        // list.remove(1);
        // list.indexOf(5);
        // list.lastIndexOf(2);
        // list.size(); 
        // list.toArray(); // convert to regular array;
        // System.out.println(list.contains(2));
        // System.out.println(list);
        // System.out.println(list.max());



        /**
         * Play ground
         */
        Array a = new Array(5);
        a.insert(1);
        a.insert(5);
        a.insert(4);
        a.insert(6);
        a.insert(4);

        Array b = new Array(7);
        b.insert(2);
        b.insert(4);
        b.insert(6);
        b.insert(76);
        b.insert(8);
        b.insert(5);
        b.insert(1);
        a.print();
        System.err.println();
        a.insertAt(3, 1);
        a.print();
        // c.print();
    }
}
 
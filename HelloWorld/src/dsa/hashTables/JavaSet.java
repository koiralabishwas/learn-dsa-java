package dsa.hashTables;

import java.util.HashSet;
import java.util.Set;

public class JavaSet {
    public static void main(String[] args) {
        // only store keys with no duplication
        Set<Integer> set = new HashSet<Integer>();
        int[] numbers = {1,2,3,4,5,6,2,4,1};
        for (var number : numbers) {
            set.add(number);
        }
        System.out.println(set);
        set.add(99);
        set.remove(99);
        set.clear();
        System.out.println(set);
    }
}

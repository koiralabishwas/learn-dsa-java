package dsa.hashTables;

import java.util.HashMap;
import java.util.Map;

public class JavaHashTable {
    public static void main(String[] args) {
        Map<Integer , String> map = new HashMap<>();
        map.put(1, "Mosh");
        map.put(2, "John");
        map.put(3, "Bishwas");

        
        map.put(3, "BPK");
        
        map.put(4, null);
        map.put(null, "can put a null key");
        map.put(null, "ovverrides it ??");
        map.remove(null);


        map.containsKey(2); // o(1)
        map.containsValue("BPK"); // o(n)
        
        System.out.println(map);
        // can also be iterated 
        for(var item : map.keySet()) System.out.println(item); // only keys
        for(var item : map.entrySet()) System.out.println(item); // only values
        
    }
}

package dsa.hashTables;

import java.util.HashMap;
import java.util.Map;

public class FIndNotRepeated {
    // a green apple
    // => should return G as first non repeated character

    public static void main(String[] args) {
        var str = "a green apple";
        Map<Character , Integer> map = new HashMap<>();

        var chars = str.toCharArray();
        for(char s : chars) {
            if (map.containsKey(s)) {
                var value = map.get(s);
                value ++;
                map.put(s, value);
            } else{
                map.put(s,1);
            }
        }

        for(var ch : chars ) {
            if (map.get(ch) == 1) {
                System.out.println(ch);
                return;
            }
        }
        System.out.println(map);
       
    }
}

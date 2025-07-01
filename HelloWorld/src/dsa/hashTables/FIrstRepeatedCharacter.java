package dsa.hashTables;

import java.util.HashSet;
import java.util.Set;

public class FIrstRepeatedCharacter {

    static char getFirstRepeatedChar(String string) {
        Set<Character> set = new HashSet<>();

        for (char ch : string.toCharArray()) {
            if (set.contains(ch)) {
                return ch;
            } 
            set.add(ch);
        }
        throw new IllegalStateException();
    }

    public static void main(String[] args) {
        String string = "green apple";
        var result = getFirstRepeatedChar(string);
        System.out.println(result);
    }
}

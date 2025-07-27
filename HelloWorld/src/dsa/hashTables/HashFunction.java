package dsa.hashTables;

public class HashFunction {
    public static void main(String[] args) {
        System.out.println(hash("hadafad"));
        String str = "vacwaster";
        System.out.println(str.hashCode());
    }

    

    /*
     * a simple hash function example
     */
    public static int hash (String key) {
        // as each char is represented by a num
        int hash = 0;
        for (var ch : key.toCharArray()) {
            hash += ch;
        }
        return hash % 100; // assuming 100 as the size of hash table / internal array

    }
}

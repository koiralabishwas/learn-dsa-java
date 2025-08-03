package dsa.hashTables;

import java.util.LinkedList;

public class HashTable {
    private class Entry {
        public int k;
        public String v;
    }

    private LinkedList<Entry>[] entries = new LinkedList[5];

    private int hash(int k) {
        return Math.abs(k) % entries.length;
    }

    public void put(int k, String v) {
        var index = this.hash(k);
        if (entries[index] == null) {
            entries[index] = new LinkedList<>();
        }

        var bucket = entries[index];


        for(var entry : bucket) {
            if (entry.k == k) {
                entry.v = v;
                return;
            }
        }
        
        var entry = new Entry();
        entry.k = k;
        entry.v = v;
        bucket.addLast(entry);
    }

    public static void main(String[] args) {
        var hashTable = new HashTable();
        System.out.println(hashTable.entries.length);
    }
}

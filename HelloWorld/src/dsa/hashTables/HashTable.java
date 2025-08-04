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
        var entry = getEntry(k);
        if (entry != null) {
            entry.v = v;
            return;
        }
        entry.k = k;
        entry.v = v;
        
        var bucket = getOrCreateBucket(k);
        bucket.addLast(entry);
    }

    public String get(int k) {
        var entry = getEntry(k);

        return (entry == null) ? null : entry.v;
    }

    public Entry remove(int k) {
        var entry = this.getEntry(k);
        if (entry == null) {
            throw new IllegalStateException();
        }
        getBucket(k).remove(entry);
        throw new IllegalStateException();
    }

    private LinkedList<Entry> getBucket(int key) {
        return entries[hash(key)];
    }

    private LinkedList<Entry> getOrCreateBucket(int key) {
        var index = hash(key);
        var bucket = entries[index];
        if (bucket == null) {
            entries[index] = new LinkedList<>();
        }
        return bucket;
    }
    
    private Entry getEntry(int key) {
        var bucket = getBucket(key);
        if (bucket != null) {
            for (var entry : bucket) {
                if (entry.k == key) {
                    return entry;
                }
            }
        }
        return null;
    }

    public static void main(String[] args) {
        var hashTable = new HashTable();
        hashTable.put(3, "three");
        hashTable.remove(3);
        System.out.println("done");
    }
}

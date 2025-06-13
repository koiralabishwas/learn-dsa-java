package dsa.linkedList;

public class LinkedList {
    private Node first;
    private Node last;

    private class Node {
        private int value;
        private Node next; 

        Node(int value) {
            this.value = value;
            // this.next = next;//??
        }
    }

    public void addLast(int item) {
        var node = new Node(item) ;
        
        if (isEmpty()) {
            this.first = node;
            this.last = node;
        } else {
            last.next = node;
            last = node;
        }
    }

    public void addFirst(int item) {
        var node = new Node(item);
        if (isEmpty()) {
            this.first = node;
            this.last = node;
        } else {
            node.next = this.first;
            this.first = node;
        }
    }

    public int indexOf(int item) {
        int index = 0;
        var current = this.first;
        while (current != null) {
            if (current.value == item) {
                return index;
            }
            current = current.next; 
            index ++ ;
        }
        return -1;
    }

    public boolean isEmpty() {
        return this.first == null;
    }
}

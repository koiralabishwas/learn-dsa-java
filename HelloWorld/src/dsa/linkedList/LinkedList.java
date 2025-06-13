package dsa.linkedList;

import java.util.NoSuchElementException;

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
        var node = new Node(item);

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

    public void removeFirst() {
        if (isEmpty()) {
            throw new NoSuchElementException();
        }

        // if it has only one element
        if (first == last) {
            first = last = null;
            // now it will have zero items
        }

        Node second = this.first.next;
        this.first.next = null; // delete the pointer reference to prevent memmory leak.
        this.first = second;


    }

    public int indexOf(int item) {
        int index = 0;
        var current = this.first;
        while (current != null) {
            if (current.value == item) {
                return index;
            }
            current = current.next;
            index++;
        }
        return -1;
    }

    public boolean contains(int item) {
        return indexOf(item) != -1;
    }

    public boolean isEmpty() {
        return this.first == null;
    }
}

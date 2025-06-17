package dsa.linkedList;

import java.util.NoSuchElementException;

public class LinkedList {
    private Node first;
    private Node last;
    private int size;

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
        size++;
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
        size++;
    }

    public void removeFirst() {
        if (isEmpty()) {
            throw new NoSuchElementException();
        }

        // if it has only one element
        if (first == last) {
            first = last = null;
            // now it will have zero items
        } else {
            Node second = this.first.next;
            this.first.next = null; // delete the pointer reference to prevent memmory leak.
            this.first = second;
        }
        size--;
    }

    public int[] toArray() {
        int[] arr = new int[this.size];
        var node = this.first;
        int counter = 0;
        while (node != null) {
            arr[counter] = node.value;
            node = node.next;
            counter ++;
        }
        return arr;
    }


    // public void reverse() {
    //     // TODO: do this again
    //     Node previous = this.first;
    //     Node current = previous.next;

    //     while (current != null) {
    //         Node next = current.next;
    //         current.next = previous;
    //         previous = current;
    //         current = next ;
    //     }
    //     this.last = this.first;
    //     this.last.next = null;
    //     this.first = previous;

    // }

    public void rereverse() {
        Node previous = null;
        Node current = this.first;
        while (current != null) {
            Node next = current.next;
            current.next = previous;
            previous = current;
            current = next;
        }
        this.last = this.first;
        // System.out.println(this.last.next);
        this.first = previous;
    }

    public void reverse() {
        Node previous = null;
        Node current = this.first;
        
        while (current != null) {
            Node next = current.next;
            current.next = previous;
            previous = current;
            current = next;
        }
        this.last = this.first;
        System.err.println(this.last.next);
        this.first = previous;
    }

    public int getKthFromTheEnd(int k) {
        // TODO: do again
        if (isEmpty()) {
            throw new IllegalStateException();
        }

        var a = this.first;
        var b = this.first;
        for (int i = 0 ; i < k -1 ; i ++) {
            b = b.next;
            if (b==null) {
                throw new IllegalArgumentException();
            }
        }
        while (b  != this.last) {
            a = a.next;
            b = b.next;
        }
        return a.value;
    }

    public void removeLast() {
        if (isEmpty()) {
            throw new NoSuchElementException();
        }

        if (first == last) {
            first = last = null;

        } else {
            Node secondLast = getPrevious();
            secondLast.next = null;
            this.last = secondLast;
        }
        size--;
    }

    private Node getPrevious() {
        Node secondLast = this.first;
        while (secondLast.next != this.last) {
            secondLast = secondLast.next;
        }
        return secondLast;
    }

    public int size() {
        return this.size;
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
        if (isEmpty()) {
            throw new NoSuchElementException();
        }
        return indexOf(item) != -1;
    }

    public boolean isEmpty() {
        return this.first == null;
    }
}

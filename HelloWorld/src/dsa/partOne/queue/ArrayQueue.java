package dsa.partOne.queue;

import java.util.Arrays;

public class ArrayQueue {
    // need Circular array to complete
    public int count;
    private int front;
    private int end ;
    private int[] items;

    public ArrayQueue(int length) {
        this.items = new int[length];
    }
     
    public void enqueue(int item) {
        if (count == items.length) {
            throw new IllegalStateException();
        }
        this.items[end] = item;
        end = (end + 1 ) % items.length;
        count ++;
    }

    public int dequeue() {
        var item =  items[front];
        items[front] = 0;
        front = (front + 1 ) % items.length;
        count --;
        return item;
    }

    @Override
    public String toString() {
        return Arrays.toString(this.items);
    }

    public static void main(String[] args) {
        ArrayQueue queue = new ArrayQueue(5);
        queue.enqueue(2);        
        queue.enqueue(3);        
        queue.enqueue(4);        
        queue.enqueue(7);        
        queue.enqueue(9);        
        queue.dequeue();
        queue.dequeue();
        queue.enqueue(6);        
        queue.enqueue(1);        
        System.out.println(queue.toString());
    }

}

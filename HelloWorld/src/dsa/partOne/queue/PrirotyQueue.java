package dsa.partOne.queue;

import java.util.Arrays;

public class PrirotyQueue {
    private int[] items = new int[5];
    private int count;

    public void add(int input) {
        if (isFull()) {
            throw new IllegalStateException();
        }
        int i = shiftItemsToInsert(input);
        items[i] = input;
        count++;

    }

    public String toString() {
        return Arrays.toString(items);
    }

    public boolean isFull() {
        return count == items.length;
    }

    public int remove() {
        if (isEmpty()) {
            throw new IllegalStateException();
        }
        return items[--count];
    }

    public int shiftItemsToInsert(int input) {
        int i;
        for (i = count - 1; i >= 0; i--) {
            if (items[i] > input) {
                items[i + 1] = items[i];
            } else {
                break;
            }
        }
        return i + 1;
    }

    public boolean isEmpty() {
        return this.count == 0;
    }

    public static void main(String[] args) {
        PrirotyQueue queue = new PrirotyQueue();
        queue.add(5);
        queue.add(3);
        queue.add(6);
        queue.add(4);
        queue.add(4);
        System.out.println(queue.remove());
        System.out.println(queue.remove());
        System.out.println(queue.remove());
        System.out.println(queue.remove());
        System.out.println(queue.remove());
    }
}

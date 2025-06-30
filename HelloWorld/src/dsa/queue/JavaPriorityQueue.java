package dsa.queue;

import java.util.PriorityQueue;

public class JavaPriorityQueue {
    public static void main(String[] args) {
        PriorityQueue<Integer> queue  = new PriorityQueue<>();
        queue.add(5);
        queue.add(1);
        queue.add(3);
        queue.add(2);

        while (!queue.isEmpty()) {
            // java default priority integer queues outputs num in accending order 
            System.out.println(queue.remove());
        }
    }
}

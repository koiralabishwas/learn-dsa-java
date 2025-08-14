package dsa.partOne.queue;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Stack;

public class JavaQueue {
    public static void main(String[] args) {
        Queue<Integer> queue = new ArrayDeque<>();
        queue.add(2);
        queue.add(3);
        queue.add(4);

        System.out.println(queue);

        reverse(queue);
        System.out.println(queue);
    }

    public static void reverse(Queue<Integer> queue) {
        Stack<Integer> stack = new Stack<>();
        while (!queue.isEmpty()) {
            stack.push(queue.remove());
        }
        while (!stack.isEmpty()) {
            queue.add(stack.pop());
        }
    }
    
}

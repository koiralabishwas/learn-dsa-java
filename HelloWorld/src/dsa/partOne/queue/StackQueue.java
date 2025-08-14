package dsa.partOne.queue;

import java.util.Stack;

public class StackQueue {
    // building a que using stack
    private Stack<Integer> inputStack = new Stack<Integer>();
    private Stack<Integer> outputStack = new Stack<Integer>();

    // O(1)
    public void enqueue(int item) {
        inputStack.push(item);
    }

    // best => O(1) worst => O(n)
    public int dequeue() {
        moveToOutputStack();
        var item = outputStack.pop();
        return item;
    }

    public int peek() {
        moveToOutputStack();
        var item = outputStack.peek();
        return item;
    }

    public boolean isEmpty() {
        return (inputStack.isEmpty() && outputStack.isEmpty());
    }

    private void moveToOutputStack() {
        if (outputStack.empty()) {
            while (!inputStack.empty()) {
                outputStack.push(inputStack.pop());
            }
        }
    }

    public static void main(String[] args) {
        var stack = new StackQueue();
        stack.enqueue(2);
        stack.enqueue(4);
        System.out.println(stack.isEmpty());
        stack.enqueue(9);
        System.out.println(stack.dequeue());
        System.out.println(stack.dequeue());
        System.out.println(stack.peek());
        System.out.println(stack.dequeue());
        System.out.println(stack.isEmpty());

    }

}

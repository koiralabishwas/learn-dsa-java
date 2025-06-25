package dsa.stacks;

import java.util.Arrays;

public class Stack {
    // is this too dynamic and consumes too much memmory ??

    int[] stack  = new int[0];

    int count = 0;

    void push (int item) {
        int newCount = count + 1;
        int[] newStack = new int[newCount];
        for (int i = 0; i < count; i++) {
            newStack[i] = stack[i];
        }
        newStack[newCount - 1] = item;
        count = newCount;
        stack = newStack;
    }

    int pop() {
        if (isEmpty()) {
            throw new StackOverflowError("stack is empty to pop");
        }
        int top = stack[count - 1]; // 最後に返す

        int newCount = count -1;
        int[] newStack = new int[newCount];
        for (int i = 0; i < newCount; i++) {
            newStack[i] = this.stack[i];
        }
        stack = newStack;
        count = newCount;

        return top;
    }

    int peek() {
        if (isEmpty()) {
            throw new StackOverflowError();
        }
        int top = stack[count -1];
        return top;
    }

    boolean isEmpty() {
        return (this.count == 0);
    }

    @Override
    public String toString() {
        return Arrays.toString(stack);
    }
    public static void main(String[] args) {
        // implement using int[]
        // implement => push , pop , peek , isEmpty
        Stack stack = new Stack();
        stack.push(4);
        stack.push(5);
        stack.push(5);
        stack.push(7);
        System.out.println(stack.toString());
        var top = stack.pop();
        var topPeek = stack.peek();
        
        System.out.println(stack.toString());
        System.out.println((top));
        System.out.println((topPeek));
        System.out.println((stack.isEmpty()));

        stack.pop();
        stack.pop();
        stack.pop();
        // stack.pop();

        System.out.println(stack.isEmpty());

    }
}

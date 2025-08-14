package dsa.partOne.stacks;

import java.util.Arrays;

public class Stack {
    // is this too dynamic and consumes too much memmory ??

    int[] stack  = new int[5];

    int count = 0;

    void push (int item) {
        if ( count == stack.length) {
            throw new StackOverflowError();
        }
        stack[count++] = item;
    }

    int pop() {
        if ( count == 0) {
            throw new IllegalStateException();
        }
        return stack[-- count];
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
        stack.push(30);
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
        stack.pop();

        System.out.println(stack.isEmpty());

    }
}

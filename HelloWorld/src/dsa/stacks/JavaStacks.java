package dsa.stacks;

import java.util.Stack;

public class JavaStacks {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<Integer>();
        // push => add item to the end
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        System.out.println(stack);

        var top = stack.pop(); // takes away the lastly inserted item from the stack
        System.out.println(stack);
        System.out.println(top);

        var peekedTop = stack.peek(); // store the lastly inserted item without deleting it from the stack
        System.out.println(peekedTop);
        System.out.println(stack);

    }
}

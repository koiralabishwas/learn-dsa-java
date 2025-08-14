package dsa.partOne.stacks;

import java.util.Stack;


public class ReversingString {

    public String reverse(String input) {

        if (input == null) {
            throw new IllegalArgumentException();
        }

        Stack<Character> stack = new Stack<>();


        for (char ch : input.toCharArray()) { // can also use for loop 
            stack.push(ch);
        }

        // String reversed = ""; // can use this but not good memmory practice
        StringBuffer reversed = new StringBuffer();
        while (!stack.empty()) {
            reversed.append(stack.pop()); 
        }

        return reversed.toString();
    }
    public static void main(String[] args) {
       String str = "abcd";
       ReversingString reverser = new ReversingString();
       var result = reverser.reverse(str);
       System.out.println(result);

    }

}

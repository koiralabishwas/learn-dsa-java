package dsa.stacks;

import java.util.Stack;

import dsa.ans.StringReverser;

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
       StringReverser reverser = new StringReverser();
       var result = reverser.reverse(str);
       System.out.println(result);

    }

}

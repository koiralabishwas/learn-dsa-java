package dsa.stacks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class SyntaxCheckExpression {

    private List<Character> leftBracket = Arrays.asList('(' , '{' , '[' , '<');
    private List<Character> rightBracket = Arrays.asList(')' , '}' , ']' , '>');

    public boolean isBalanced(String input) {
        Stack<Character> stack = new Stack<Character>();
        for (char  ch : input.toCharArray()) { 
            // add left brackets to stack
            if (isLeftBracket(ch)) {
                stack.push(ch);
            }
            // compare last left brancket with right bracket
            if (isRightBrancket(ch)) {
                if (stack.isEmpty()) {
                    return false;
                }
                Character lastBracket = stack.pop();
                if (!isMatchingPair(lastBracket, ch)) {
                    return false;
                }
                System.out.println(ch);
                System.out.println(lastBracket);
            }
        }

        return stack.isEmpty();
    }

    private boolean isLeftBracket(char ch) {
        return this.leftBracket.contains(ch);
    }

    private boolean isRightBrancket(char ch) {
        return this.rightBracket.contains(ch);
    }

    private boolean isMatchingPair(char left, char right) {
        return leftBracket.indexOf(left) == rightBracket.indexOf(right);
    }

    public static void main(String[] args) {
        String str = "((<1> + <2>))";
        SyntaxCheckExpression exp = new SyntaxCheckExpression();
        var result = exp.isBalanced(str);
        System.out.println(result);
    }
}

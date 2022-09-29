import java.util.Stack;

public class Solution {
    public boolean isValid(String s) {
        // odd number of brackets, return false
        if (s.length() % 2 != 0) {
            return false;
        }
        Stack<Character> stack = new Stack();
        // iterate through char array
        for (char c : s.toCharArray()) {
            // add all opening brackets to the stack
            if (c == '(' || c == '{' || c == '[') {
                stack.push(c);
            }
            // for all closing brackets: make sure stack is not empty & check stack for appropriate opening bracket
            else if (c == ')' && !stack.isEmpty() && stack.peek() == '(') {
                stack.pop();
            } else if (c == '}' && !stack.isEmpty() && stack.peek() == '{') {
                stack.pop();
            } else if (c == ']' && !stack.isEmpty() && stack.peek() == '[') {
                stack.pop();
            }
            // this else statement is needed for examples such as
            // ([}}])
            else {
                stack.push(c);
            }
        }
        return stack.isEmpty();
    }
}

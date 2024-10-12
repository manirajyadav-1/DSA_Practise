package String;

import java.util.Stack;

public class ValidParentheses {
    public static boolean validParantheses(String s){
        Stack<Character> stack = new Stack<>();

        for(char ch : s.toCharArray()){
            if(ch == '(' || ch == '[' || ch == '{'){
                stack.push(ch);
            }
            else{
                if(stack.isEmpty()) return false;
                else if(ch == ')' && stack.peek() != '(') return false;
                else if(ch == '}' && stack.peek() != '{') return false;
                else if(ch == ']' && stack.peek() != '[') return false;
                stack.pop();
            }
        }
        return stack.isEmpty() ? true : false;
    }
    public static void main(String[] args) {
        String s = "()"; // output = true
        System.out.println(validParantheses(s));
    }
}

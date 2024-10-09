package String;

import java.util.Stack;

public class MinimumStringLengthAfterRemovingSubstrings {
    public static int stringLength(String s){
        Stack<Character> s1 = new Stack<>();

        for(int i=0;i<s.length();i++){
            if(s1.isEmpty()){
                s1.push(s.charAt(i));
                continue;
            }

            if(s.charAt(i) == 'B' && s1.peek() == 'A'){
                s1.pop();
            }
            else if(s.charAt(i) == 'D' && s1.peek() == 'C'){
                s1.pop();
            } else{
                s1.push(s.charAt(i));
            }
        }
        return s1.size();
    }
    public static void main(String[] args) {
        String s = "ABFCACDB";
        //output = 2
        System.out.println(stringLength(s));
    }
}

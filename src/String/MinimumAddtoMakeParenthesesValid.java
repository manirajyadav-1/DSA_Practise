package String;

public class MinimumAddtoMakeParenthesesValid {
    public static int validParentheses(String s){
        int open = 0, close = 0;

        for(int i=0;i<s.length();i++){
            if(s.charAt(i) == '('){
                open++;
            } else{
                if(open > 0){
                    open--;
                } else{
                    close++;
                }
            }
        }
        return open+close;
    }
    public static void main(String[] args) {
        String s = "())";
        // output = 1
        System.out.println(validParentheses(s));
    }
}

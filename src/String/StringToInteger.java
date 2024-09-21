package String;

public class StringToInteger {
    public static int myAtoi(String s){
        int i = 0;
        int flag = 1;
        long val = 0;

        // Ignore leading whitespaces
        while(i<s.length() && s.charAt(i)==' '){
            i++;
        }

        // Check for sign
        if(i<s.length() && (s.charAt(i) == '-' || s.charAt(i) == '+')){
            flag = s.charAt(i) == '-' ? -1 : 1;
            i++;
        }

        // Convert String to Integer
        while(i<s.length() && s.charAt(i)>='0' && s.charAt(i)<='9'){
            val = val*10 + (s.charAt(i) - '0');
            i++;

            // Check overflow/underflow
            if(val*flag > Integer.MAX_VALUE){
                return Integer.MAX_VALUE;
            }
            if(val*flag < Integer.MIN_VALUE){
                return Integer.MIN_VALUE;
            }
        }
        return (int) (val*flag);
    }
    public static void main(String[] args) {
        String s = "   -42";
        System.out.println(myAtoi(s));
    }
}

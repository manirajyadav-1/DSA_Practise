package String;

public class MinimumNumberofSwapstoMaketheStringBalanced {
    public static int stringBalanced(String s){
        int count = 0;

        for(int i=0;i<s.length();i++){
            char curr_char = s.charAt(i);

            if(curr_char == '['){
                count++;
            }
            else if(count > 0){
                count--;
            }
        }
        return (count+1)/2;
    }

    public static void main(String[] args) {
        String s = "][][";
        // output = 1
        System.out.println(stringBalanced(s));
    }
}

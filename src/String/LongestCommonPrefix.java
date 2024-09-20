package String;

import java.util.Arrays;

public class LongestCommonPrefix {
    public static String longestCommonPrefix(String[] s){
        StringBuilder ans = new StringBuilder();
        Arrays.sort(s);
        String s1 = s[0];
        String s2 = s[s.length-1];

        for(int i=0;i<Math.min(s1.length(), s2.length());i++){
            if(s1.charAt(i) != s2.charAt(i)){
                return ans.toString();
            }
            ans.append(s1.charAt(i));
        }
        return ans.toString();
    }
    public static void main(String[] args) {
        String[] s = {"flower","flow","flight"};
        System.out.println(longestCommonPrefix(s));
    }
}

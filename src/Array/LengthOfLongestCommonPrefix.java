import java.util.*;

public class LengthOfLongestCommonPrefix {
    public static int longestCommonPrefix(int[] arr1, int[] arr2){
        HashMap<String, Integer> ans = new HashMap<>();

        for(int num : arr1){
            String str = Integer.toString(num);
            String prefix = "";

            for(char ch : str.toCharArray()){
                prefix += ch;
                ans.put(prefix, ans.getOrDefault(prefix, 0)+1);
            }
        }

        int maxLength = 0;

        for(int num : arr2){
            String str = Integer.toString(num);
            String prefix = "";

            for(char ch : str.toCharArray()){
                prefix += ch;
                if(ans.containsKey(prefix)){
                    maxLength = Math.max(maxLength, prefix.length());
                }
            }
        }
        return maxLength;
    }
    public static void main(String[] args) {
        int[] arr1 = {1, 10, 100};
        int[] arr2 = {1000};
        System.out.println(longestCommonPrefix(arr1, arr2));
    }
}

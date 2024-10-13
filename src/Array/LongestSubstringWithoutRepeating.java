public class LongestSubstringWithoutRepeating {
    public static int longestSubstring(String s){
        int n = s.length();
        int maxLength = 0;
        int[] charIndex = new int[128];
        int left = 0;

        for(int right=0;right<n;right++){
            if(charIndex[s.charAt(right)] >= left){
                left = charIndex[s.charAt(right)] + 1;
            }
            charIndex[s.charAt(right)] = right;
            maxLength = Math.max(maxLength, right-left+1);
        }
        return maxLength;
    }
    public static void main(String[] args) {
        String s = "abcabcbb";
        System.out.println(longestSubstring(s));
    }
}

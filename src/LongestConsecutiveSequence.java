import java.util.HashSet;

public class LongestConsecutiveSequence {
    public static int longestConsecutive(int[] nums){
        HashSet<Integer> hs = new HashSet<>();

        for(int num : nums){
            hs.add(num);
        }
        int longest = 0;

        for(int num : nums){
            if(!hs.contains(num-1)){
                int length = 1;
                while(hs.contains(num + length)){
                    length++;
                }
                longest = Math.max(longest, length);
            }
        }
        return longest;
    }
    public static void main(String[] args) {
        int[] nums = {0,3,7,2,5,8,4,6,0,1};
        System.out.println(longestConsecutive(nums));
    }
}

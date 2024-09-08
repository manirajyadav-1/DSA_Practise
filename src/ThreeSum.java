import java.util.*;

public class ThreeSum {
    public static List<List<Integer>> threeSum(int[] nums){
        int target = 0;
        Arrays.sort(nums);

        List<List<Integer>> ans = new ArrayList<>();
        for(int i=0;i<nums.length-2;i++){
            if(i>0 && nums[i] == nums[i-1]) continue;

            int j = i+1;
            int k = nums.length-1;

            while(j < k){
                int sum = nums[i] + nums[j] + nums[k];

                if(sum == target){
                    ans.add(Arrays.asList(nums[i], nums[j], nums[k]));
                    j++;
                    k--;

                    while(j < k && nums[j] == nums[j+1]) j++;
                    while(j < k && nums[k] == nums[k-1]) k--;
                } else if (sum < target) {
                    j++;
                }
                else{
                    k--;
                }
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] nums = {-1,0,1,2,-1,-4};
        System.out.println(threeSum(nums));
    }
}

public class MajorityElement {
    // Majority for n/2
    // Moore Voting Algorithm
    public static int majority(int[] nums){
        int count = 0;
        int candidate = 0;

        for(int num:nums){
            if(count == 0){
                candidate = num;
            }
            else if(num == candidate){
                count++;
            }
            else{
                count--;
            }
        }
        return candidate;
    }
    public static void main(String[] args) {
        int[] nums = {3,2,3};
        System.out.println(majority(nums));
    }
}

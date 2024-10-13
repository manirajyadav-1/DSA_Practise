import java.util.*;
public class MajorityElement2 {
    public static List<Integer> majorityElement(int[] arr){
        int n = arr.length;
        int count1=0,count2=0;
        int candidate1=0,candidate2=0;

        for(int i=0;i<n;i++){
            if(count1==0 && arr[i]!=candidate2){
                count1 = 1;
                candidate1 = arr[i];
            }
            else if(count2==0 && arr[i]!=candidate1){
                count2 = 1;
                candidate2 = arr[i];
            }
            else if(arr[i] == candidate1){
                candidate1 = arr[i];
            } else if (arr[i] == candidate2) {
                candidate2 = arr[i];
            }
            else{
                count1--;
                count2--;
            }
        }

        count1 = 0;
        count2 = 0;
        List<Integer> ans = new ArrayList<>();
        int threshold = n/3;

        for(int i=0;i<n;i++){
            if(candidate1 == arr[i]){
                count1++;
            }
            if(candidate2 == arr[i]){
                count2++;
            }
        }

        if(count1 > threshold){
            ans.add(candidate1);
        }
        if(count2 > threshold){
            ans.add(candidate2);
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] arr = {3,2,3};
        System.out.println(majorityElement(arr));
    }
}

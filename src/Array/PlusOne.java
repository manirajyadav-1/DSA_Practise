package Array;

public class PlusOne {
    public static int[] plusOne(int[] digits){
        for(int i=digits.length-1;i>=0;i--){
            if(digits[i] < 9){
                digits[i]++;
                return digits;
            } else{
                digits[i] = 1;
            }
        }
        digits = new int[digits.length+1];
        digits[0] = 1;
        return digits;
    }
    public static void main(String[] args) {
        int[] digits = {1,2,3};
        int[] ans = plusOne(digits);
        for(int i=0;i<ans.length;i++){
            System.out.println(ans[i]);
        }
    }
}

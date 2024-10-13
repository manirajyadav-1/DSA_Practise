public class MoveZerosToLast {
    public static void main(String[] args) {
        int arr[] = {1,0,0,4,3,10};
        int j = 0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=0){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                j++;
            }
        }

        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }
    }
}

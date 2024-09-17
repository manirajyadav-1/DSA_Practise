package String;

public class ReverseWords {
    public static String reverseWords(String s){
        StringBuilder sb = new StringBuilder();
        String[] arr = s.trim().split(" ");

        for(int i=arr.length-1; i>=0; i--){
            if(arr[i] != ""){
                sb.append(arr[i]+" ");
            }
        }
        return sb.toString().trim();
    }
    public static void main(String[] args) {
        String s = "the sky is blue";
        System.out.println(reverseWords(s));
    }
}

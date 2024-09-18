package String;

public class ReverseWords {
    public static String reverseWords(String s){
        StringBuilder sb = new StringBuilder();
        String[] arr = s.trim().split(" ");

        for(int i=arr.length-1; i>=0; i--){
            if(!arr[i].equals("")){
                sb.append(arr[i] + " ");
            }
        }
        return sb.toString().trim();
    }

    public static void main(String[] args) {
        String s = "the sky is blue";

        // Start time
        long startTime = System.nanoTime();

        // Call the reverseWords method
        System.out.println(reverseWords(s));

        // End time
        long endTime = System.nanoTime();

        // Time taken in seconds
        double timeTaken = (endTime - startTime) / 1e9;
        System.out.println("Time taken: " + timeTaken + " seconds");
    }
}

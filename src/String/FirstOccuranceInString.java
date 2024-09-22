package String;

public class FirstOccuranceInString {
    public static int strStr(String haystack, String needle){
        if(haystack.contains(needle)){
            return haystack.indexOf(needle);
        }
        return -1;
    }
    public static void main(String[] args) {
        String haystack = "sadbutsad";
        String needle = "sad";
        System.out.println(strStr(haystack,needle));
    }
}

package String;

public class ValidAnagram {
    public static boolean anagram(String s, String t){
        int[] count = new int[26];

        // Count the frequency of character in string s
        for(char x : s.toCharArray()){
            count[x - 'a']++;
        }

        // Decrement the frequency of character in string t
        for(char x : t.toCharArray()){
            count[x - 'a']--;
        }

        for(int c : count){
            if(c != 0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        String s = "anagram";
        String t = "nagaram";
        System.out.println(anagram(s, t));
    }
}

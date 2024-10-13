package String;

public class LengthOfLastWord {
    public static int lengthOfLastWord(String s){
        s = s.trim();
        int count = 0;
        for(int i=s.length()-1;i>=0;i--){
            if(s.charAt(i) == ' '){
                break;
            }
            count++;
        }
        return count;
    }
    public static void main(String[] args) {
        String s = "   fly me   to   the moon  "; // output = 4
        System.out.println(lengthOfLastWord(s));
    }
}

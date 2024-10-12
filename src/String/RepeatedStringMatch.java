package String;
// Rabin Carp
public class RepeatedStringMatch {
    public static int repeatedStringMatch(String a, String b){
        StringBuilder s = new StringBuilder(a);
        int count = 1;

        while(s.length() < b.length()){
            s.append(a);
            count++;
        }

        if(s.indexOf(b) != -1){
            return count;
        }

        s.append(a);
        count++;

        if(s.indexOf(b) != -1){
            return count;
        }
        return -1;
    }
    public static void main(String[] args) {
        String a = "abcd", b = "cdabcdab"; //output = 3
        System.out.println(repeatedStringMatch(a,b));
    }
}

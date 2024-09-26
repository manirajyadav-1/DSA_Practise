package String;

public class CountAndSay {
    public static String countAndSay(int n){
        String[] result = new String[n];
        result[0] = "1";
        for(int i=1;i<n;i++){
            result[i] = getNextVal(result[i-1].toCharArray());
        }
        return result[n-1];
    }

    public static String getNextVal(char[] s){
        int count = 1;
        char c = s[0];
        StringBuilder str = new StringBuilder();
        for(int i=1;i<s.length;i++){
            if(s[i] == c){
                count++;
            } else {
                str.append(count).append(c);
                c = s[i];
                count = 1;
            }
        }
        str.append(count).append(c);
        return str.toString();
    }
    public static void main(String[] args) {
        int n = 4;
        System.out.println(countAndSay(n));
    }
}

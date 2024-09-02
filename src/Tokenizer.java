import java.util.StringTokenizer;

public class Tokenizer {
    public static void main(String args[]){
        String str = "java,is a; platform independent";

        StringTokenizer str1 = new StringTokenizer(str," ,;");

        while(str1.hasMoreTokens()){
            System.out.println(str1.nextToken());
        }
    }
}

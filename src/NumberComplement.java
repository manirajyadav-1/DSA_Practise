public class NumberComplement {
    public static int findComplement(int n){
        if(n==0) return 1;

        int bitLength = Integer.toBinaryString(n).length();
        System.out.println(bitLength);

        int mask = (1 << bitLength) - 1;

        return n^mask;
    }
    public static void main(String[] args) {
        int num = 5;
        System.out.println(findComplement(num));
    }
}

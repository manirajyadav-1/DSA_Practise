public class UniquePaths {
    public static int uniquePath(int m, int n){
        int N = m+n-2;
        int r = m-1;
        int res = 1;

        for(int i=1;i<=r;i++){
            res = res * (N-r+i)/i;
        }
        return res;
    }
    public static void main(String[] args) {
        System.out.println(uniquePath(3,7));
    }
}

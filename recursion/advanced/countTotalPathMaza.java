package recursion.advanced;

public class countTotalPathMaza {
    public static int countPaths(int i, int j, int n, int m) {

        if (i == n || j == m) {
            return 0;
        }
        if (i == n - 1 && j == m - 1) {
            return 1;
        }
        // move downwards

        int downPaths = countPaths(i + 1, j, n, m);
        // move right
        int rightPaths = countPaths(i, j + 1, n, m);

        return downPaths + rightPaths;
    }

    public static void main(String[] args) {
        // count total paths in a maze from (0,0) to (n,m)

        //we can do it using DP also
        int n=3 ;
        int m=7;
         int i=0;
         int j=0;

         System.out.println(countPaths(i, j, n, m));

    }
}

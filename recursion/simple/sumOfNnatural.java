package recursion;

public class sumOfNnatural {

    public static int sumOfN(int n) {
        if(n==0)
        {
            return 0;
        }
        int sum = n + sumOfN(n-1);
        return sum;

    }
    public static void main(String[] args) {
        int n = 2;
       System.out.println( sumOfN(n));
    }
}

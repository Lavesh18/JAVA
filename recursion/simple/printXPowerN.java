package recursion;

public class printXPowerN {
    public static int getPower(int n , int x)
    {
        if(n==0)
        {
            return 1;
        }
        if(x==0)
        {
            return 0;
        }

        return x * getPower(n-1 , x);
    }
    public static void main(String[] args) {
        int x = 4;
        int n = 2;

        System.out.println(getPower(n, x));
    }
}

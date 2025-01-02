package leetcode.Math;

public class POWOFXN_52 {
    public static double myPow(double x, int n) {
        if(n==0)
        {
            return 1.0;
        }
        if(n==1)
        {
            return x;
        }
        if(n%2 ==1)
        {
            return x*myPow(x,n-1);
        }
        if(n%2 == 0)
        {
            return myPow(x*x,n/2);
        }

       return 1/myPow(x,-n);
    }
    
    public static void main(String[] args) {
        double x = 2;
        int n = 4; 
        System.out.println(myPow(x, n));
    }
}

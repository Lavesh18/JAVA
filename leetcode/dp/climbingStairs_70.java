package leetcode.dp;

public class climbingStairs_70 {
    public static void main(String[] args) {
        //using DP 

        //for n==1 we need 1 steps
        // for n==2 we need 2 steps 

        //now for n==3 we need steps for n==1 + steps for n==2


        int n = 8;

        if(n==1)
        {
            System.out.println(1);
        }


        int[ ] dp = new int [n+1];

        dp[1] = 1;
        dp[2] = 2;

        for(int i=3;i<=n;i++)
        {
            dp[i] = dp[i-1] + dp[i-2];
        }

        System.out.println(dp[n]);

    }
}

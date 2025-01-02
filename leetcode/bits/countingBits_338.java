package leetcode.bits;

import java.util.Arrays;

public class countingBits_338 {

    public static int getBits(int n)
    {
        int count = 0;
        while(n!=0)
        {
            count +=(n&1);
            n>>=1;
        }
        return count;
    }
    public static void main(String[] args) {
        int n = 5;
        //o/p = [0,1,1]
        int ans[] = new int[n+1];

        for(int i=0;i<=n;i++)
        {
            ans[i] = getBits(i);
        }

        System.out.print(Arrays.toString(ans));


    }
}

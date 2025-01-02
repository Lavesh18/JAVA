package leetcode.Math;

import java.util.Arrays;

public class plusOne_66 {
    public static void main(String[] args) {
        int digits[] = {1,2,3};

        int n = digits.length;
        for(int i=n-1;i>=0;i--)
        {
             if(digits[i]==9)
             {
                digits[i] = 0;
             }
             else
             {
                digits[i]++;
                System.out.println(Arrays.toString(digits));
             }
        }
        digits = new int[n+1];
        digits[0]=1;
        System.out.println(Arrays.toString(digits));
    }
}

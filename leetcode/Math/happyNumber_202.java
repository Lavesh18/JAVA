package leetcode.Math;

import java.util.HashSet;
import java.util.Scanner;

public class happyNumber_202 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        int n = sc.nextInt();
        HashSet<Integer> set = new HashSet<>();
        int sum = 0;
        while(true)
        {
            while(n!=0)
            {
               sum += Math.pow(n%10, 2.0);
               n=n/10;

            }

            if(sum==1)
            {
                System.out.println("true");
            }

            n=sum;
            if(set.contains(n))
            {
                System.out.println("false");
            }
            else
            {
                set.add(n);
            }

        }
        
    }
}

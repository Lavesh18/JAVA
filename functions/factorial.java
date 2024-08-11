package functions;

import java.util.Scanner;

public class factorial {
//using recursion
    public static int fact(int a)
    {
        if(a==0)
        {
            return 1;
        }

        int small = fact(a-1);
        int big = a*small;

        return big;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int result = fact(n);

        System.out.print(result);
    }
}

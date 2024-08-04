package functions;

import java.util.Scanner;

public class multiply {

    public static int multi(int a , int b)
    {
        return a*b;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int a = input.nextInt();
        int b = input.nextInt();


        int res = multi(a, b);
        System.out.print(res);
    }
}

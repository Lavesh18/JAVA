package strings.stringBulider;

import java.util.Scanner;

public class reverseString {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder(sc.nextLine());

        for(int i=0;i<=sb.length()/2;i++)
        {
            int front = i;

            int back = sb.length()-1-i;

            char fronChar = sb.charAt(front);
            char backChar = sb.charAt(back);

            sb.setCharAt(front, backChar);
            sb.setCharAt(back, fronChar);

        }

        System.out.println(sb);
    }
}

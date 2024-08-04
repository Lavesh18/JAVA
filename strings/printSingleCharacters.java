package strings;

import java.util.Scanner;

public class printSingleCharacters {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String name = sc.next();
        String secondName = sc.next();

        String fullName = name+ " " + secondName;

        System.out.println(fullName);


        for(int i=0;i<fullName.length();i++)
        {
            System.out.println(fullName.charAt(i));
        }
    }
}

package strings;

import java.util.Scanner;

public class compareString {
   public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    String a = sc.next();
    String b = sc.next();

//what it does
//s1>s2 : +ve Value
//s1==s2 : 0
//s1<s2 : -ve value

    if(a.compareTo(b)==0)
    {
        System.out.println("String are equal");
    }
    else {
        System.out.println("String are not equal");
    }
   } 
}

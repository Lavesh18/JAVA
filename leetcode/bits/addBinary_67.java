package leetcode.bits;

public class addBinary_67 {
    public static void main(String[] args) {
        String a = "1010";
        String b = "1011";

        //output should be   10101


        StringBuilder res = new StringBuilder();

        int carry = 0;
        int base = 2;

        int n1 = a.length()-1;
        int n2 = b.length()-1;

        while(n1>=0 || n2>=0)
        {
            int t1=0;
            int t2=0;
            int sum = 0;

            if(n1>=0)
            {
                t1 = a.charAt(n1--)-'0';
            }
            if(n2>=0)
            {
                t2 = b.charAt(n2--)-'0';
            }


            sum = t1+t2+carry;

            if(sum>=base)
            {
                carry=1;
                sum = sum-base;
            }
            else
            {
                carry=0;
            }

            res.append(sum);
        }

        if(carry==1)
        {
            res.append(carry);
        }

        System.out.println(res.reverse().toString());

    }
}
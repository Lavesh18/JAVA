package leetcode.bits;

public class reverseBits_190 {
    public static void main(String[] args) {
        
     int n = 0b00000010100101000001111010011100;

     int ans = 0;
     for(int i=0;i<32;i++)
     {  
        ans<<=1;
        ans=ans| (n&1);

        n>>=1;
     }

     System.out.println(ans);


    }
}

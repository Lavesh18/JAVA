package patterns;

public class pallindromicPyramid {
    public static void main(String[] args) {
        //spaces = n-i

        //1st loop backwords for(j=i to 1)

        //2nd loop forward for(j=2 to i)


        int n = 5;

        for(int i=1;i<=n;i++)
        {
            //spaces
            for(int j=1;j<=n-i;j++)
            {
                System.out.print(" ");
            }
            //qst half
            for(int j=i;j>=1 ;j--)
            {
                System.out.print(j);
            }

            //2nd half
            for(int j=2;j<=i;j++)
            {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}

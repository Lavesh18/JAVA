package patterns;

public class zer0OneTriangle {
    public static void main(String[] args) {
        int n = 5 ;
        // check the sum of cells so if even print 1 else print 0

        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=i;j++)
            {
                if((i+j)%2==0)
                {
                    System.out.print("1"+ " ");
                }
                else{
                    System.out.print("0"+" ");
                }
            }
            System.out.println();
        }
    }
}

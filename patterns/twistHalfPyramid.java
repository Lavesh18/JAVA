package patterns;

public class twistHalfPyramid {
    public static void main(String[] args) {
        int n =4 ;

        for(int i=1;i<=n;i++)
        {//this loop for printing space
            for(int j = 1;j<=n-i;j++)
            {
                System.out.print(" ");
            }

            //one more inner loop
            for(int j=1;j<=i;j++)
            {
                System.out.print("*");
            }

            System.out.println();
        }

    }
}

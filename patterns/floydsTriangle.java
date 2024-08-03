package patterns;

public class floydsTriangle {
    public static void main(String[] args) {
        int n = 5 ;
        int number = 1; // so that this should increase by 1

        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print(number+" ");
                number++;
            }
            System.out.println();
        }
    }
}

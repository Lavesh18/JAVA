package patterns;

public class butterfly {
    public static void main(String[] args) {
        //first print first half then reverse the function for lower part 
        //spaces are 2* n-i

int n=4;

//upper wala
        for(int i=1;i<=n;i++)
        {
            //1st part
           
            for(int j=1;j<=i;j++)
            {
              System.out.print("*");
            }
            int spaces = 2*(n-i);

            for(int j=1;j<=spaces;j++)
            {
                System.out.print(" ");
            }

            //2nd part
            for(int j=1;j<=i;j++)
            {
              System.out.print("*");
            }
            System.out.println();

        }

        //lower part

        for(int i=n;i>=0;i--)
        {
            //1st part
           
            for(int j=1;j<=i;j++)
            {
              System.out.print("*");
            }
            int spaces = 2*(n-i);

            for(int j=1;j<=spaces;j++)
            {
                System.out.print(" ");
            }

            //2nd part
            for(int j=1;j<=i;j++)
            {
              System.out.print("*");
            }
            System.out.println();

        }
    }
}

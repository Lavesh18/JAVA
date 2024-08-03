package patterns;

public class hollowPatter {
    public static void main(String[] args) {
        //for outer   // one thing common i or j have common * are on 0 or on n , m 

        for(int i=0;i<4;i++)
        {
            for(int j=0;j<5;j++)
            {
                if(i ==0 || j==0 || i==3 || j==4){ //consider (i,j)
                System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}

package recursion.simple;

public class fibonaciSeries {

    public static int getFib(int n)
    {
        if(n==0)
        {
           return 0;
        }
        if(n==1)
        {
            return 1;
        }

        return getFib(n-1) + getFib(n-2);
    }
    public static void main(String[] args) {
        //print till nth term
        int n = 10;

        for(int i=0;i<=n;i++)
        {
            System.out.print(getFib(i)+ " ");
        }
    }   
}

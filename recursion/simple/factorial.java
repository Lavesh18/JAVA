package recursion.simple;

public class factorial {

    public static int getFact(int n){
        if(n==0)
            {
                return 1;
            }
        if(n==1)
        {
            return 1;
        }

        return n * getFact(n-1);
    }
    public static void main(String[] args) {
        int n = 4;
        System.out.println(getFact(n));
    }
}

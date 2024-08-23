package recursion.advanced;

public class numberOfWaysInvite {

    public static int callWays(int n)
    {
        if(n<=1)
        {
            return 1;
        }

        if(n==0)
        {
            return 0;
        }
        int waysSingle = callWays(n-1);

        int waysPair = (n-1) * callWays(n-2);


        return waysPair+waysSingle;
    }
    public static void main(String[] args) {
        //invite guests in pair or single 
        //we need number of ways 

        //if one with single then next calls using n-1
        // or we can pair now one gues have n-1 choices of partner now left will be call(n-2)

        // we need call(n-1) + n-1 * call(n-2)

        int n = 3;
        System.out.println(callWays(n));
    }
}

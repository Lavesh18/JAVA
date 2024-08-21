package recursion.advanced;

public class allPermutation {
    public static void premutation(String str,String permutation)
    {
        if(str.length() == 0)
        {
            System.out.println(permutation);
            return;
        }
        for(int i=0;i<str.length();i++)
        {
            char curr = str.charAt(i);

            String newStr = str.substring(0, i) + str.substring(i+1); //suppose your curr is b so this will give "ac"
            premutation(newStr, permutation+curr);

        }
    }
    public static void main(String[] args) {
        //all possible combination of letters 
        //we can use n! for this 
        //Time Complexity O(n!)
        String str = "abc";
        premutation(str, "");

    }
}

package recursion;

public class printAllSubsequences {
    public static void printSubs(String str,int idx,String newStr)
    {
        //base case
        if(idx==str.length())
        {
            System.out.println(newStr);
            return;
        }

        //choice if character wants to be in newStr
        char curr = str.charAt(idx);
        printSubs(str, idx+1, newStr+curr);

        //if not to be 
        printSubs(str, idx+1, newStr);
    }
    public static void main(String[] args) {
        //order should be same
        // all character have the choice wether to come or not

        //Time complexity O(2^n)
        String str = "ahbgdc";
        printSubs(str, 0, "");
    }
}

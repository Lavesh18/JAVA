package recursion.medium;

import java.util.HashSet;

public class printAllUniqueSubsequences {
    public static void printUnique(String str,int idx , String newStr,HashSet<String> set)
    {
        if(idx == str.length())
        {
            if(set.contains(newStr))
            {
                return;
            }
            else{
            System.out.println(newStr);
            set.add(newStr);
            return;}
        }

        //choice if yes
        char curr = str.charAt(idx);
        printUnique(str, idx+1, newStr+curr,set);

        //choice if no 
        printUnique(str, idx+1, newStr,set);
    }
    public static void main(String[] args) {
        String str = "aaa";
        HashSet<String> set = new HashSet<>();
        printUnique(str, 0, "",set);
        //we will use HASH SET here 

    }
}

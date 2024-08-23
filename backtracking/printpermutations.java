package backtracking;

public class printpermutations {
    public static void printPerm(String str,String perm,int idx)
    {
        //baee case

        if(str.length() == 0)
        {
            System.out.println(perm);
            return;
        }
        for(int i=0;i<str.length();i++)
        {
            char currChar = str.charAt(i);
            String newStr = str.substring(0, i) + str.substring(i+1); // now we placed the currChar now remove it from the string and work for others

            printPerm(newStr, perm+currChar, idx+1);
        }
    }
    public static void main(String[] args) {
        String str = "ABC";
        //Time Complexity O(n*n!)
        printPerm(str, "", 0);
    }
}

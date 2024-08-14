package recursion.medium;


public class checkIsSusequence {
    public static boolean isSubsequence(String s, String t) {
       
        int tidx = 0;
        int sidx = 0;
 
        while(tidx < t.length() && sidx<s.length())
        {
         if(t.charAt(tidx) == s.charAt(sidx))
         {
             tidx++;
         }
         sidx++;
        }
 
        return tidx == t.length();
         
     }
 
    public static void main(String[] args) {
       System.out.println(isSubsequence("ahbgdc","z"));
    }
}

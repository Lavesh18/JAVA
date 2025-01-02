package leetcode.two_pointers;

public class validPallindrome_125 {
    public static Boolean valid(String s)
    {
        String replacing = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        int left = 0;
        int right = replacing.length()-1;
        // if (replacing.length() == 0 || replacing.length() == 1) {
        //     return true;
        // }

        while(left<right){
    
            if(replacing.charAt(left) != replacing.charAt(right))
            {
               return false;
            }
            left++;
            right--;
        }
        return true;
    }
 public static void main(String[] args) {
    String  s = "A man, a plan, a canal: Panama";

    System.out.println(valid(s));

 }   
}

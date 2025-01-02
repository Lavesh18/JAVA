package leetcode.array;

public class validAnagram_242 {
    public static void main(String[] args) {
        String t = "anagram";
        String s = "nagaram";

        int[] map = new int[26];

        if(s.length() !=t.length())
        {
            System.out.println("false");
        }

        for(int i=0;i<s.length();i++){
            map[s.charAt(i) -'a']++;
            map[t.charAt(i)-'a']--;
        }

        for(int i=0;i<map.length;i++)
        {
            if(map[i] !=0)
            {
                System.out.println("false");
            }
        }
        System.out.println("true");
    }
}

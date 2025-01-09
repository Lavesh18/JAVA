package leetcode.array;

import java.util.HashMap;

public class longestPallindrome_409 {
    public static void main(String[] args) {
        String s = "abccccdd";

        int res = 0;
        int odd = 0;


        HashMap<Character,Integer> freq = new HashMap<>();


        for(char ch : s.toCharArray())
        {
            freq.put(ch, freq.getOrDefault(ch, 0)+1);


            if(freq.get(ch)%2==0)
            {
                res+=2;
                odd--;
            }
            else{
                odd+=1;
            }
        }

        if(odd > 1)
        {
            res = res+1;
        }

        System.out.println(res);
    }
}

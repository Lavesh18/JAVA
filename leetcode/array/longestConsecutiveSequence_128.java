package leetcode.array;

import java.util.HashMap;

public class longestConsecutiveSequence_128 {
    public static void main(String[] args) {
        int nums[] = {100,4,200,1,3,2};

        HashMap<Integer,Boolean> map= new HashMap<>();
        
        int longLength = 0;
        for(int num : nums)
        {
            map.put(num,false);
        }
        for(int num:nums)
        {
            int curr = 1;
            int nextNum = num+1;

            while(map.containsKey(nextNum) && map.get(nextNum) == false)
            {
                curr++;
                map.put(nextNum, true);
                nextNum++;
            }

            int prevNum = num-1;
            while(map.containsKey(prevNum) && map.get(prevNum) == false)
            {
                curr++;
                map.put(prevNum, true);
                prevNum--;
            }

            longLength = Math.max(longLength,curr);
        }
        System.out.println(longLength);
    }
}

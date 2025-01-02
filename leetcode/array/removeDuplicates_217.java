package leetcode.array;

import java.util.HashSet;

public class removeDuplicates_217 {
    public static void main(String[] args) {
        int[] nums = {4,2,3,4,3};
        HashSet<Integer> hs = new HashSet<>();
        for(int i=0;i<nums.length;i++)
        {
            if(hs.contains(nums[i]))
            {
                System.out.println("true");
            }
            hs.add(nums[i]);
        }
        System.out.println("false");
    }
}

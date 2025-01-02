package leetcode.hashmap;

import java.util.Arrays;
import java.util.HashMap;

public class twoSum {
    public static int[] twoSumHelper(int nums[],int target){
        int n = nums.length;
        HashMap<Integer,Integer> hash= new HashMap<>();
        for(int i=0;i<n;i++)
        {
            int remain = target - nums[i];
            if(hash.containsKey(remain))
            {
                return new int[]{hash.get(remain),i};
            }
            else
            {
                hash.put(nums[i], i);
            }

        
        }
        return new int[]{};
    }
    public static void main(String[] args) {
        int nums [] = {2,7,11,15};
        int target = 9;
        
        System.out.println(Arrays.toString(twoSumHelper(nums, target)));

    }
}

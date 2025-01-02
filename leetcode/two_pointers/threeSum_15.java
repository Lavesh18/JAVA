package leetcode.two_pointers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class threeSum_15 {
    public static void main(String[] args) {
        int nums[] = {-1,0,1,2,-1,-4};
        // /Output: [[-1,-1,2],[-1,0,1]]  //sum should be 0

        if(nums.length < 3 || nums.length ==0)
        {
            System.out.println(new ArrayList<>());
        }
        Arrays.sort(nums);

        HashSet<List<Integer>> set = new HashSet<>();

        for(int i=0;i<nums.length-2;i++)
        {
            int left = i+1;
            int right = nums.length-1;

            while(left<right)
            {
                int sum = nums[i]+nums[left]+nums[right];

                if(sum == 0)
                {
                    set.add(Arrays.asList(nums[i],nums[left],nums[right]));
                    left++;
                    right--;
                }
                if(sum<0)
                {
                    left++;
                }
                else
                {
                    right--;
                }
            }
        }
        
        System.out.println((new ArrayList<>(set)));

    }
}

package leetcode.two_pointers;

import java.util.Arrays;

public class twoSumTwoSorter_167 {
    public static void main(String[] args) {
        int nums[] = {2,7,11,15};
        int target = 9;
        int n = nums.length;
        // o/p [1,2]

        // 2 pointer approach

        int left = 0;
        int right = n-1;

        while(left<right)
        {
            if(nums[left]+nums[right] == target)
            {
                System.out.println(Arrays.toString(new int[] {left+1,right+1}));
            }
            if(nums[left]+nums[right]<target)
            {
                left++;
            }
            else{
                right--;
            }
        }
        System.out.println(Arrays.toString(new int[] {}));
    }
}

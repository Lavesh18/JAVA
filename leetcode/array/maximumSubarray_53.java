package leetcode.array;

public class maximumSubarray_53 {
    public static void main(String[] args) {
        int[] nums = {-2,1,-3,4,-1,2,1,-5,4};

        //KADANE's Algorithm

        int currSum = nums[0];
        int maxSum = nums[0];

        for(int i=1;i<nums.length;i++)
        {
            currSum = Math.max(nums[i],currSum+nums[i]);

            maxSum = Math.max(currSum,maxSum);
        }


        System.out.println(maxSum);
    }
}

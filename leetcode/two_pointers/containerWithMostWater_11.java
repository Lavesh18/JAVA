package leetcode.two_pointers;

public class containerWithMostWater_11 {
    public static void main(String[] args) {
        int height[] = {1,8,6,2,5,4,8,3,7};


        int n= height.length;
        int left = 0;
        int right = n-1;
        int maxArea = 0;
        while(left<right)
        {
            int area = Math.min(height[left],height[right]) * (right-left);

            maxArea = Math.max(maxArea,area);

            if(height[left]<height[right])
            {
                left++;
            }
            else
            {
                right--;
            }
        }
        System.out.println(maxArea);
    }
}
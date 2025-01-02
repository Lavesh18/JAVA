package leetcode.two_pointers;

public class trappingRainWater_42 {
    public static void main(String[] args) {
        int h[] = {0,1,0,2,1,0,1,3,2,1,2,1};
        int n = h.length;
        int left[] = new int[n];
        int right[] = new int[n];

        left[0] = h[0];
        right[n-1] = h[n-1];
        // traversing left
        for(int i=1;i<n;i++)
        {
            left[i] = Math.max(left[i-1],h[i]);
        }
        //traversing right

        for(int i=n-2;i>=0;i--)
        {
            right[i] = Math.max(right[i+1],h[i]);
        }

        int ans = 0;
        for(int i=0;i<n;i++)
        {
            ans+= Math.min(left[i],right[i]) - h[i];
        }

       System.out.println(ans);
    }
}

package leetcode.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class insertInterval_57 {
    public static void main(String[] args) {
        int[][] intervals = {{1,2},{3,5},{6,7},{8,10},{12,16}};
        int[] interval = {4,8};
        List<int[]> ans = new ArrayList<>();

        int n = intervals.length;
        int i = 0;

        while(i<n && intervals[i][1] < interval[0])
        {
            ans.add(intervals[i]);
            i++;
        }

        while(i<n && intervals[i][0]<=interval[1])
        {
            interval[0] = Math.min(intervals[i][0], interval[0]);
            interval[1] = Math.max(intervals[i][1], interval[1]);
            i++;
        }
        ans.add(interval);


        while(i<n)
        {
            ans.add(intervals[i]);
            i++;
        }


        System.out.println(Arrays.deepToString(ans.toArray(new int[ans.size()][])));
    }
}

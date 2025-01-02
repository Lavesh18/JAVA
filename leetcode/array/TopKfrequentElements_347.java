package leetcode.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class TopKfrequentElements_347 {
    public static void main(String[] args) {
        // nums = [1,1,1,2,2,3], k = 2

        int nums[] = {1,1,1,2,2,3};
        int k = 2;

        HashMap<Integer,Integer> map = new HashMap<>();
        for(int num:nums)
        {
            if(!map.containsKey(num))
            {
                map.put(num,1);
            }
            else
            {
                map.put(num,map.get(num)+1);
            }
        }

        List<Integer> list = new ArrayList<>(map.keySet());
        list.sort((a,b)->map.get(b)-map.get(a)); // descending sort
        int ans[] = new int[k];
        for(int i=0;i<k;i++)
        {
            ans[i] = list.get(i);
        }

        System.out.println(Arrays.toString(ans));


    }
}

package leetcode.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class groupAnagram_49 {
    public static void main(String[] args) {
        String[] strs = {"eat","tea","tan","ate","nat","bat"};
        HashMap<String,List<String>> map = new HashMap<>();

        for(String c:strs)
        {
            char[] wordArray = c.toCharArray();

            Arrays.sort(wordArray);

            String mapKey = new String(wordArray);

            if(!map.containsKey(mapKey))
            {
                map.put(mapKey, new ArrayList<>());
            }
            map.get(mapKey).add(c);
        }

        System.out.println(new ArrayList<>(map.values()));
    }
}

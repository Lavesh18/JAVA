package leetcode.bits;

public class singleNumber_136 {
    public static void main(String[] args) {
      int nums[] = {2,2,1};

      int xor = 0;

      for(int num : nums)
      {
        xor = xor ^ num;
      }
      System.out.println(xor);
    }
}

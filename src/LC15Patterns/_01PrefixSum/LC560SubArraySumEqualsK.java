package LC15Patterns._01PrefixSum;

import java.util.HashMap;
import java.util.Map;

public class LC560SubArraySumEqualsK {
    public static void main(String[] args) {
        System.out.println(subArraySum(new int[]{1,1,1},2));
        System.out.println(subArraySum(new int[]{3,1,2,4},6));

    }

    public static int subArraySum(int[] nums, int k) {
        Map<Integer,Integer> m = new HashMap<>();
        int sum = 0, count =0;
        m.put(0,1);
        for(int i =0;i< nums.length;i++){
            sum += nums[i];

            count += m.getOrDefault(sum-k,0);
            m.put(sum,m.getOrDefault(sum,0)+1);

        }

        return count;
    }
}

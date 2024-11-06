package Blind75.arrays;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class LC1TwoSum {
    public static void main(String[] args) {
        int[] nums = {2,7,11,15};
        int target = 9;

        System.out.println(Arrays.toString(twoSum(nums,target)));

    }

    public static int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> hm = new HashMap<>();

        for(int i =0;i< nums.length;i++){
            if(hm.containsKey(target-nums[i]))
                return new int[]{hm.get(target-nums[i]),i};
            else
                hm.put(nums[i],i);
        }
        return null;
    }
}

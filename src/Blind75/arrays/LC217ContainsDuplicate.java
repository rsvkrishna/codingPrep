package Blind75.arrays;

import java.util.HashSet;
import java.util.Set;

public class LC217ContainsDuplicate {
    public static void main(String[] args) {
        int[] nums = {1,2,3,1};
        System.out.println(containsDuplicate(nums));

    }

    public static boolean containsDuplicate(int[] nums) {
        Set<Integer> hs = new HashSet<>();
        for(int i =0;i<nums.length;i++){
            if(hs.contains(nums[i]))
                return true;
            else
                hs.add(nums[i]);
        }
        return false;
    }
}

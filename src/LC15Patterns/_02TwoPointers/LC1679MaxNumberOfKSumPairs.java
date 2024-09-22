package LC15Patterns._02TwoPointers;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class LC1679MaxNumberOfKSumPairs {
    public static void main(String[] args) {
        //int[] nums ={1,2,3,4};
        int[] nums ={3,1,3,4,3};
        //int k = 5;
        int k = 6;
        System.out.println(maxOperations(nums,6));
    }

    public static int maxOperations(int[] nums, int k) {
        Map<Integer,Integer> map = new HashMap<>();
        int count =0;

        for(int i =0;i<nums.length;i++){
            int comp = k-nums[i];
            if(map.containsKey(comp)&&map.get(k-nums[i])>0){
                count++;
                map.put(comp,map.get(comp)-1);
            }
            else
                map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }


        return count;
    }
}

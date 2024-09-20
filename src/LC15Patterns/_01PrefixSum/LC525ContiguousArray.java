package LC15Patterns._01PrefixSum;

import java.util.HashMap;
import java.util.Map;

public class LC525ContiguousArray {
    public static void main(String[] args) {
        int[] arr ={0,1,0,0,1};

        System.out.println(findMaxLength(arr));
    }

    public static int findMaxLength(int[] nums) {
        Map<Integer,Integer> sumToIndexMap = new HashMap<>();
        sumToIndexMap.put(0,-1);
        int sum=0,  maxLength = 0;

        for(int i =0;i< nums.length;i++){
            sum += nums[i] == 1 ? 1 : -1;

            if(sumToIndexMap.containsKey(sum))
                maxLength =Math.max(maxLength,i-sumToIndexMap.get(sum));
            else
                sumToIndexMap.put(sum,i);

        }

        return maxLength;
    }
}

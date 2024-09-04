package LC15Patterns.TwoPointers;

import java.util.Arrays;

public class LC167TwoSumII {
    public static void main(String[] args) {
        int[] arr ={2,7,11,15}; int tar = 9;
        System.out.println(Arrays.toString(twoSum(arr,tar)));
    }

    public static int[] twoSum(int[] numbers, int target) {
        int left=0; int right = numbers.length-1;


        while(left<=right) {
            if (numbers[left] + numbers[right] == target)
                return new int[]{left+1, right+1};
            else if (numbers[left] + numbers[right] > target)
                right--;
            else
                left++;
        }

        return new int[0];
    }
}

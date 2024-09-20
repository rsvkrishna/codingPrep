package LC15Patterns._01PrefixSum;

import java.util.Arrays;

public class LC238ProductOfArrayExceptSelf {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4};
        System.out.println("arr "+ Arrays.toString(arr));
        System.out.println(Arrays.toString(productExceptSelf(arr)));

    }

    public static int[] productExceptSelf(int[] nums) {
        int[] preFixArr = new int[nums.length];
        int[] postFixArr = new int[nums.length];

        preFixArr[0] = 1;
        for(int i =1;i< nums.length;i++){
            preFixArr[i] = nums[i-1] * preFixArr[i-1];
        }
        postFixArr[nums.length-1] = 1;

        for(int i = nums.length-2; i>=0;i--){
            postFixArr[i] = nums[i+1] * postFixArr[i+1];
        }

        for(int i =0;i< preFixArr.length;i++){
            nums[i] = preFixArr[i] * postFixArr[i];
        }


        System.out.println("preFixArr "+ Arrays.toString(preFixArr));
        System.out.println("postFixArr "+ Arrays.toString(postFixArr));

        return nums;
    }
}

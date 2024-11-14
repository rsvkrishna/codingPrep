package Blind75.arrays;

public class LC152MaximumProductSubArray {
    public static void main(String[] args) {
        int[] nums = {2,3,-2,4};
        System.out.println(maxProduct(nums));

    }

    public static int maxProduct(int[] nums) {
        int prefixProduct = 1;
        int suffixProduct = 1;
        int n = nums.length;
        int result = Integer.MIN_VALUE;

        for(int i=0;i<n;i++){
            if(prefixProduct == 0)
                prefixProduct = 1;
            if(suffixProduct == 0)
                suffixProduct = 1;

            prefixProduct = prefixProduct * nums[i];
            suffixProduct = suffixProduct * nums[n-i-1];

            result= Math.max(result,Math.max(prefixProduct,suffixProduct));
        }
        return result;
    }
}

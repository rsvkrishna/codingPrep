package LC15Patterns._03SlidingWindow;

public class LC643MaxAvgSubarray {
    public static void main(String[] args) {

        int[] nums = {1,12,-5,-6,50,3};
        int k = 4;
        System.out.println(findMaxAverage(nums,k));
        System.out.println(findMaxAverage(new int[]{-1},1));
        System.out.println(findMaxAverage2(new int[]{-1},1));

    }

    public static double findMaxAverage(int[] nums, int k) {
        int currentSum = 0;

        for (int i = 0; i < k; i++) {
            currentSum += nums[i];
        }

        int maxSum = currentSum;

        for (int i = k; i < nums.length; i++) {
            currentSum = currentSum + (nums[i] - nums[i - k]);

            maxSum = Math.max(maxSum, currentSum);
        }
        return (maxSum + 0.0) / k;
    }

    public static double findMaxAverage2(int[] nums, int k) {
        double maxAvg = Integer.MIN_VALUE;
        int sum = 0;

        int i =0; int j=0;

        while(j< nums.length){
            sum += nums[j];
            if((j-i+1) < k ){
                j++;
            }
            else if((j-i+1) == k ){
                maxAvg = Math.max((double) sum,maxAvg);
                sum = sum - nums[i];
                i++;
                j++;

            }

        }

        return maxAvg/k;
    }
}

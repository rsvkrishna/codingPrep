package LC15Patterns._03SlidingWindow;

public class LC1493LongestSubArray1Delete {
    public static void main(String[] args) {

        int[] nums = {0,1,1,1,0,1,1,0,1};
        int k = 2;
        System.out.println(longestSubarray(nums));

    }

    public static int longestSubarray(int[] nums) {
        int i =0;int j=0;
        int max=0;
        int numOfZeros=0;

        for(j=0;j<nums.length;j++){
            if(nums[j]==0)
                numOfZeros++;
            if(numOfZeros>1){
                if(nums[i]==0)
                    numOfZeros--;
                i++;
            }
            if(numOfZeros<=1){
                max = Math.max(max,j-i+1);
            }
        }

        return max-1;
    }
}

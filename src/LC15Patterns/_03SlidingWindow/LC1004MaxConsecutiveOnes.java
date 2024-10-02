package LC15Patterns._03SlidingWindow;

public class LC1004MaxConsecutiveOnes {
    public static void main(String[] args) {

        int[] nums = {1,1,1,0,0,0,1,1,1,1,0};
        int k = 2;
        System.out.println(longestOnes(nums,k));
    }

    public static int longestOnes(int[] nums, int k) {
        int i =0;int j=0;
        int max=0;
        int numOfZeros=0;

        for(j=0;j<nums.length;j++){
            if(nums[j]==0)
                numOfZeros++;
            if(numOfZeros>k){
                if(nums[i]==0)
                    numOfZeros--;
                i++;
            }
            if(numOfZeros<=k){
                max = Math.max(max,j-i+1);
            }
        }

        return max;
    }
}

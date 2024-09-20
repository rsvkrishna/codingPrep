package LC15Patterns._01PrefixSum;

public class LC724FindPivotIndex {
    public static void main(String[] args) {
        //int[] arr = {1,7,3,6,5,6};
        int[] arr = {2,1,-1};
        System.out.println(pivotIndex(arr));
    }

    public static int pivotIndex(int[] nums) {

        int left =0,right =0;
        for(int i=0;i< nums.length;i++){
            right = right + nums[i];
        }

        System.out.println("prefixSum is right variable "+right);

        for(int i=0;i< nums.length;i++){
            right = right-nums[i];
            if(left == right)
                return i;
            left = left + nums[i];
        }

        return -1;
    }
}

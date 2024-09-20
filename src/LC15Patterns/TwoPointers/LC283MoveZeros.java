package LC15Patterns.TwoPointers;

import java.util.Arrays;

public class LC283MoveZeros {
    public static void main(String[] args) {
        int[] nums ={0,1,0,3,12};
        moveZeroes(nums);
    }

    public static void moveZeroes(int[] nums) {
        int j =-1;
        for(int i =0;i< nums.length;i++){
            if(nums[i]==0){
                j=i;
                break;
            }
        }

        for(int i =j+1;i< nums.length;i++){
            if(nums[i]!=0){
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                j++;
            }
        }
        System.out.println(Arrays.toString(nums));
    }
}

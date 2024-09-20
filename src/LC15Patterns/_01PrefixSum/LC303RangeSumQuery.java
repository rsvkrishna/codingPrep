package LC15Patterns._01PrefixSum;

import java.util.Arrays;

public class LC303RangeSumQuery {
    public static void main(String[] args) {

        int[ ] numArr ={-2, 0, 3, -5, 2, -1};
        int i = 0,j=2;

        NumArray n1 =new NumArray(numArr);

        System.out.println("SumRange is "+n1.sumRange(i,j));
        System.out.println("test case");
        System.out.println("SumRange is "+n1.sumRange(0,2));
        System.out.println("SumRange is "+n1.sumRange(2,5));
        System.out.println("SumRange is "+n1.sumRange(0,5));

    }
}

class NumArray {

    int[] newArr;
    int[] numss;

    public NumArray(int[] nums) {
        System.out.println("Array is "+ Arrays.toString(nums));
        newArr = new int[nums.length];
        numss = nums;
    }

    public int sumRange(int left, int right) {

        int sum =0,count=0;
        for(int i : numss){
            sum += i;
            newArr[count]=sum;
            count++;
        }
        System.out.println("Array is "+ Arrays.toString(newArr));

        int ans =0;
        ans = left >0 ? newArr[right] - newArr[left-1] : newArr[right];
        return ans;
    }
}

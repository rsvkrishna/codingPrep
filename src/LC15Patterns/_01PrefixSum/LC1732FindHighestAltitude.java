package LC15Patterns._01PrefixSum;

import java.util.Arrays;

public class LC1732FindHighestAltitude {
    public static void main(String[] args) {
        int[] arr = {-5,1,5,0,-7};
        System.out.println(largestAltitude(arr));
    }

    public static int largestAltitude(int[] gain) {

        int prefixSum =0;
        int n = gain.length+1;
        int[] result = new int[n];
        result[0]=0;
        int max = 0;
        for(int i=1;i<n;i++){
            result[i] = result[i-1]+gain[i-1];
            max = Math.max(max,result[i]);
        }
        System.out.println(Arrays.toString(result)+ " Max "+max);

        return max;
    }
}

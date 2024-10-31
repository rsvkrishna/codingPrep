package Leetcode75.arraysStrings;

import java.util.Arrays;

public class MergingElementsAlternatively {
    public static void main(String[] args) {
        int[] a = {1,2,3,4,5};
        int[] b = {6,7,8,9,10,11};
        //System.out.println(Arrays.toString(mergeElementsAlternatively(a, b)));

        int[] c = {1,2,3,4,5,6}; // {1, 4, 2, 5, 3, 6}

        mergeElementsAlternatively(c);


    }

    private static void mergeElementsAlternatively(int[] arr) {

        int n = arr.length;
        int mid = n / 2;

        // Iterate over the first half in reverse order
        for (int i = mid - 1; i >= 0; i--) {
            // Store the current element from the first half
            int firstHalfElem = arr[i];

            // Shift the second half elements to the right
            arr[i + mid] = arr[i + mid - 1];

            // Place the first half element into its new position
            arr[i * 2 + 1] = firstHalfElem;
        }

        for (int j : arr) {
            System.out.print(j + " ");
        }
        System.out.println();
    }

    public static void printArray(int[] arr) {
        for (int j : arr) {
            System.out.print(j + " ");
        }
        System.out.println();
    }

    public static int[] mergeElementsAlternatively(int[] arr, int[] brr){
        int n = arr.length;
        int m = brr.length;
        int o = n+m;
        int j =0;

        int[] result = new int[o];

        for(int i =0;i<n || i<m ;i++){
            if(i<n) {
                result[j] = arr[i];
                j++;
            }
            if(i<m) {
                result[j] = brr[i];
                j++;
            }
        }

        return result;
    }
}

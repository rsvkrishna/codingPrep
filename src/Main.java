//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void rearrangeArray(int[] arr) {
        int n = arr.length;
        int mid = n / 2;

        // Rearrange elements in-place
        for (int i = 0; i < mid; i++) {
            int temp = arr[i]; // Store current element from first half
            arr[i] = arr[mid + i]; // Replace with corresponding element from second half
            arr[mid + i] = temp; // Place stored element at correct position
        }

        printArray(arr);

        // Swap adjacent elements to achieve alternating order
        for (int i = 0; i < n - 1; i += 2) {
            int temp = arr[i];
            arr[i] = arr[i + 1];
            arr[i + 1] = temp;
        }
    }

    public static void printArray(int[] arr) {
        for (int j : arr) {
            System.out.print(j + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6}; //{1, 4, 2, 5, 3, 6}
        System.out.println("Original array:");
        printArray(arr);
        rearrangeArray(arr);
        System.out.println("Rearranged array:");
        printArray(arr);
    }
}
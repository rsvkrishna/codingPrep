package LC15Patterns._04FastSlowPointers;

public class LC287DuplicateNumber {
    public static void main(String[] args) {
        int[] nums = {1,3,4,2,2};
        System.out.println(findDuplicate(nums));
    }

    public static int findDuplicate(int[] nums) {
        // Initialize the slow and fast pointers
        int slow = nums[0];
        int fast = nums[nums[0]];

        // Find the intersection point of the two runners
        while (slow != fast) {
            slow = nums[slow];
            fast = nums[nums[fast]];
        }

        // Find the "entrance" to the cycle
        slow = 0;
        while (slow != fast) {
            slow = nums[slow];
            fast = nums[fast];
        }

        return slow;
    }
}

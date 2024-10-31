package LC15Patterns._04FastSlowPointers;

public class LC202HappyNumber {
    public static void main(String[] args) {

        System.out.println(isHappy(12));

    }

    public static boolean isHappy(int n) {
        int slow, fast;
        slow = fast = n;
        do {
            slow = digitSquareSum(slow);
            fast = digitSquareSum(fast);
            fast = digitSquareSum(fast);
        } while(slow != fast);
        if (slow == 1)
            return true;
        else
            return false;
    }

    private static int digitSquareSum(int n) {

        int sum = 0, tmp;
        while (n>0) {
            tmp = n % 10;
            sum += tmp * tmp;
            n /= 10;
        }
        return sum;
    }
}

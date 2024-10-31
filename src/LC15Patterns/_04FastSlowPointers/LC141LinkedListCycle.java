package LC15Patterns._04FastSlowPointers;


class ListNode {
     int val;
     ListNode next;
     ListNode(int x) {
        val = x;
        next = null;
   }
 }

public class LC141LinkedListCycle {
    public static void main(String[] args) {

        // Create a hard-coded linked list:
        // 10 -> 20 -> 30 -> 40 -> 50 -> 60
        ListNode head = new ListNode(10);
        head.next = new ListNode(20);
        head.next.next = new ListNode(30);
        head.next.next.next = new ListNode(40);
        head.next.next.next.next = new ListNode(50);
        head.next.next.next.next.next = new ListNode(60);

        head.next.next.next.next.next = head;

        System.out.println(hasCycle(head));

    }

    public static boolean hasCycle(ListNode head) {

        ListNode slow = head;
        ListNode fast = head;

        while(fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;

            if(slow == fast)
                return true;
        }

        return false;
    }
}

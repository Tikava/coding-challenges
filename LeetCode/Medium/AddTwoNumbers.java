package LeetCode.Medium;

//https://leetcode.com/problems/add-two-numbers/
public class AddTwoNumbers {
    class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        ListNode head = new ListNode();
        ListNode node = head;

        int remainder = 0;
        int value = 0;
        int valueToPush = 0;

        while (true) {

            //Traversal over lists
            if (l1 == null && l2 != null) {
                value = l2.val;
                l2 = l2.next;
            } else if (l2 == null && l1 != null) {
                value = l1.val;
                l1 = l1.next;
            } else {
                value = l1.val + l2.val;
                l1 = l1.next;
                l2 = l2.next;
            }

            value += remainder;

            if (value > 9) {
                valueToPush = Integer.toString(value).charAt(1) - '0' ;
                remainder = 1; 
            } else {
                valueToPush = value;
                remainder = 0;
            }

            node.val = valueToPush;

            if (l1 == null && l2 == null) {
                if (remainder > 0) {
                    node.next = new ListNode(remainder);
                }
                break;
            }

            node.next = new ListNode();
            node = node.next;            
        }
        return head;
    }
}

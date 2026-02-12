/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public boolean isPalindrome(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;

        while(fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }

        // Reverse Linked list

        ListNode prev = null;
        while(slow!=null){
            ListNode node = slow.next;
            slow.next = prev;
            prev = slow;
            slow = node;
        }

        // Boolean flag = false;
        
        ListNode one = head;
        ListNode two = prev;

        while(two!=null){
            if(one.val != two.val){
                return false;
            }
            one = one.next;
            two = two.next;
        }

        return true;
    }
}
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
 import java.util.PriorityQueue;
class Solution {
    public ListNode mergeKLists(ListNode[] lists) {
       PriorityQueue<ListNode> p = new PriorityQueue<>((a,b)->a.val-b.val);
       for(int i=0; i<lists.length; i++){
        if(lists[i]!=null){
            p.add(lists[i]);
        }
       }

        ListNode copy = new ListNode(0);
        ListNode temp = copy;

        while(!p.isEmpty()){
            ListNode node = p.poll();
            temp.next = node;
            temp = temp.next;

            if(node.next!=null){
                p.add(node.next);
            }

       }

       return copy.next;


    }
}
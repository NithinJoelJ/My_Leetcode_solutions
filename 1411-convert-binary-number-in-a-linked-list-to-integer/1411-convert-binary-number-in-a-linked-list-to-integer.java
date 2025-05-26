class Solution {
    public int getDecimalValue(ListNode head) {
        int total = 0;
        ListNode r = head;

        while(r!=null){
            total = (total*2)+r.val;
            r=r.next;
        }
        return total;
        
    }
}
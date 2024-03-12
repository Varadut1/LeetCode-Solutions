class Solution {
    public ListNode removeZeroSumSublists(ListNode head) {
        if(head == null) return null;
        ListNode temp = head;
        int total = 0;
        while(temp != null){
            total += temp.val;
            
            if(total == 0){
                head = temp.next;
                return removeZeroSumSublists(temp.next);
            } 
            temp = temp.next;
        }       
        head.next = removeZeroSumSublists(head.next);
        return head;
    }
}

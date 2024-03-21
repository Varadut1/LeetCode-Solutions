class Solution {
    public ListNode reverseList(ListNode head) {
        ListNode temp = head;
        ListNode temp2 = head;
        ListNode init = null;
        while(temp!=null){
            temp2 = temp;
            System.out.println(temp.val);
            temp = temp.next;
            temp2.next = init;
            init = temp2;
        }
        return init;
    }
}

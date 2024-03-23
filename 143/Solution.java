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
    public void reorderList(ListNode head) {
        if (head == null || head.next == null || head.next.next == null) {
            return;
        }

        ListNode slow = head;
        ListNode fast = head;
        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        
        ListNode prev = null;
        ListNode curr = slow.next;
        while (curr != null) {
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        slow.next = null; 
        
        ListNode first = head;
        ListNode second = prev;
        while (first != null && second != null) {
            ListNode firstNext = first.next;
            ListNode secondNext = second.next;
            first.next = second;
            second.next = firstNext;
            first = firstNext;
            second = secondNext;
        }

        //M2

        // Stack<ListNode> stack = new Stack<>();
        // ListNode temp = head;
        // int n = 0;
        // while(temp!=null){
        //     n++;
        //     temp = temp.next;
        // }

        // if(n%2 == 0){
        //     n = n - ((n/2)-1);
        // }
        // else{
        //     n = n - (n/2);
        // }
        // int counter = 1;
        // temp = head;
        // ListNode mini = temp;

        // while(temp != null){
        //     if(counter > n){
        //         mini = temp.next;
        //         temp.next = null;
        //         stack.push(temp);
        //         temp = mini;
        //     }
        //     else{
        //         counter++;
        //         if(counter > n){
        //             mini = temp.next;
        //             temp.next = null;
        //             temp = mini;
        //         }
        //         else{
        //             temp = temp.next;
        //         }
        //     }
        // }
        // temp = head;
        // while(!stack.isEmpty()){
        //     mini = temp.next;
        //     temp.next = stack.pop();
        //     temp.next.next = mini;
        //     temp = mini;
        //     counter++;
        // }
    }
}

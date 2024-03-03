class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
      int leng = len(head);
      
      int delnum = leng-n;
      if(leng == 1 || delnum == 0){
        return head.next;
      }
      int iter = 0;
      ListNode temp = head;
      ListNode temp2 = temp;
      while(iter!=delnum){
        System.out.println(iter+" "+delnum);
        temp2 = temp;
        temp = temp.next;
        iter++;
      }
      temp2.next = temp.next;
      return head;  
    }
    public int len(ListNode head){
      ListNode temp = head;
      int mylen = 0;
      while(temp != null){
        mylen++;
        temp = temp.next;
      }
      return mylen;
    }
}

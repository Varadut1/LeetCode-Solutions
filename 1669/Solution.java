class Solution {
    public ListNode mergeInBetween(ListNode list1, int a, int b, ListNode list2) {
        int i = 1;
        ListNode temp = list1;
        while(i<a){
            temp = temp.next;
            i++;
        }
        ListNode temp2 = temp.next;
        temp.next = list2;
        ListNode temp3 = list2;
        while(temp3.next!=null){
            temp3 = temp3.next;
        }
        int diff = b-a;
        i = 0;
        while(i<diff){
            temp2 = temp2.next;
            i++;
        }
        temp2 = temp2.next;
        temp3.next = temp2;
        return list1;
    }
}

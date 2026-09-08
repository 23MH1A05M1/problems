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
    public ListNode reverseBetween(ListNode head, int left, int right) {
        if(left == right){
            return head;
        }
        ListNode prev =null;
        ListNode temp=head;
        ListNode dummy=new ListNode(-1);
        dummy.next=head;

        for(int i=1;i<left;i++){
          temp=temp.next;
        }
        ListNode temp2 = dummy;
        for(int i=1;i<left;i++){
            temp2=temp2.next;
        }
        ListNode current=temp;
        ListNode nextnode=current.next;
        for(int i=0;i<(right-left)+1;i++){
           current.next=prev;
           prev=current;
           current=nextnode;
           if(current!=null){
            nextnode=current.next;
           }
        }
        temp.next=current;
       temp2.next=prev;
       return dummy.next;
        
    }
}
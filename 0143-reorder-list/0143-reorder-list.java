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
        Stack<ListNode>stack=new Stack<>();
        ListNode temp = head;
        while(temp!=null){
            stack.add(temp);
            temp=temp.next;
        }
        int n = stack.size();
        ListNode cur = head;
        for(int i=0;i<n/2;i++){
           ListNode last = stack.pop();
           ListNode next = cur.next;
           cur.next=last;
           last.next=next;

           cur = next;


        }
        cur.next = null;
        
    }
}
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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode fast=head;
        ListNode slow=head; 
        // int c=0;
        // for(int i=0;i<n;i++){
        //     fast=fast.next;
        //     // c++;
        // }
        // if(fast==null){
        //     return head.next;
        // }
        // while(fast.next!=null){
        //     fast=fast.next;
        //     slow=slow.next;
        // }
        // slow.next=slow.next.next;
        // return head;
        int length=0;
        ListNode temp=head;
        while(temp!=null){
            length++;
            temp=temp.next;
        }
        int ans=length-n;
        if(ans == 0) return head.next;
          temp=head;
        for(int i=1;i<ans;i++){
            temp=temp.next;
        }
        temp.next=temp.next.next;
        return head;
    }
}
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
    public ListNode rotateRight(ListNode head, int k) {
        if(head == null || head.next == null) return head;
        ListNode tail=head;
        int length=1;
        while(tail.next!=null){
            tail=tail.next;
            length++;

        }
        if(k%length==0) return head;
        k=k%length;
        tail.next = head; 
           ListNode temp=head;
           int ans=length-k-1;
        //    int i=0;
           for(int i=0;i<ans;i++){
                temp=temp.next;
           }
        // while(i<k){ 
        //     temp=temp.next; i++;
        //      }
          head=temp.next;
          temp.next=null;

return head;
        
        
    }
}
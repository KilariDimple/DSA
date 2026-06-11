/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode temp=headA;
        int n1=0;
        int n2=0;
        while(temp!=null){
            n1++;
            temp=temp.next;
        }
         temp=headB;
        while(temp!=null){
            n2++;
            temp=temp.next;
        }
        int diff=Math.abs(n1-n2);
        ListNode high=headA;
        ListNode low=headB;
        if(n2>n1){
            high=headB;
            low=headA;
        }
        // else{
        //     high =n2;
        // }
        for(int i=0;i<diff;i++){
            high=high.next;
        }

        while(high!=null && low!=null){
             if(high==low){
                return high;
             }
             low=low.next;
             high=high.next;
        }
        return null;
    }

}
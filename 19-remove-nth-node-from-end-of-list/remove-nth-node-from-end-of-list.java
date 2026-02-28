class Solution {

    // function to reverse list
    public ListNode reverse(ListNode head) {
        ListNode prev = null;
        ListNode curr = head;

        while(curr != null){
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }

    public ListNode removeNthFromEnd(ListNode head, int n) {

        // reverse list
        head = reverse(head);

        // remove nth node from start
        if(n == 1){
            head = head.next;
        } else {
            ListNode temp = head;
            for(int i = 1; i < n-1; i++){
                temp = temp.next;
            }
            temp.next = temp.next.next;
        }

        // reverse again
        return reverse(head);
    }
}
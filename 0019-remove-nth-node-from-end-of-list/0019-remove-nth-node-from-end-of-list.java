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
        int count = 0;
        ListNode temp = head;
        ListNode prev = null, curr = head;
        while(temp != null){
            temp = temp.next;
            count++;
        }

        int pos = count - n;
        if(pos == 0)
            return head.next;

        while( pos-- > 0){
            prev = curr;
            curr = curr.next;
        }
        if(prev != null)
            prev.next = curr.next;
        return head;
    }
}
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
    public ListNode oddEvenList(ListNode head) {
        List<Integer> odd = new ArrayList<>();
        List<Integer> even = new ArrayList<>();

        ListNode temp = head;
        int pos = 1;
        while(temp != null){
            if(pos % 2 == 1)
                odd.add(temp.val);
            else
                even.add(temp.val);
            temp = temp.next;
            pos++;
        }

        temp = head;
        for(int oddnum : odd){
            temp.val = oddnum;
            temp = temp.next;
        }

        for(int evennum : even){
            temp.val = evennum;
            temp = temp.next;
        }
        return head;
    }
}
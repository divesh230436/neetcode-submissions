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
        ListNode rs=head;
        ListNode re=head;
        for(int i=1;i<n;i++){
            re=re.next;
        }
        ListNode dummy=new ListNode();
        dummy.next=head;
        ListNode prev=dummy;
        while(re.next!=null){
            re=re.next;
            rs=rs.next;
            prev=prev.next;
        }
        prev.next=rs.next;
        return dummy.next;


    }
}

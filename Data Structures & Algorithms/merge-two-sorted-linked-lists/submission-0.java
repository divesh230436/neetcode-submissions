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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if(list1==null)return list2;
        if(list2==null)return list1;
        ListNode dummy=new ListNode();
        
        ListNode l1=list1;ListNode l2=list2;
        if(l1.val<l2.val)dummy.next=l1;else dummy.next=l2;
        ListNode curr=new ListNode();


        while(l1!=null&&l2!=null){
            if(l1.val<l2.val){
                curr.next=l1;
                curr=curr.next;
                l1=l1.next;
            }
            else {
                curr.next=l2;
                l2=l2.next;
                curr=curr.next;
            }

        }
        curr.next=(l1==null)?l2:l1;
        return dummy.next;       


        
    }
}
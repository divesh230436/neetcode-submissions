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
        ListNode start=head;
        ListNode end=mid(head);
        ListNode tem=end;
       
        end=end.next; tem.next=null;


        ListNode prev=null;
        ListNode temp=end;
        
        while(temp!=null){
            ListNode next=temp.next;
            temp.next=prev;
            prev=temp;
            temp=next;

        }
        end=prev;
        ListNode newhead=new ListNode();


        while(end!=null){
            newhead.next=start;
            start=start.next;
            newhead=newhead.next;
            
            newhead.next=end;
            end=end.next;
            newhead=newhead.next;
        }
        newhead.next=start;
        

        
    }public ListNode reverse(ListNode head){
        ListNode prev=null;
        ListNode temp=head;
        
        while(temp!=null&&temp.next!=null){
            ListNode next=temp.next;
            temp.next=prev;
            prev=temp;
            temp=next;

        }
        head=prev;
        return head;
    }
    public ListNode mid(ListNode head){
        ListNode slow=head;

        ListNode fast=head;
        while(fast!=null&&fast.next!=null){
            slow=slow.next;fast=fast.next.next;

        }
        return slow;
    }
}

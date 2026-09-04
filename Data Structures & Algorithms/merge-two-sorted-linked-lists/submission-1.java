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
        ListNode t1= list1,t2=list2;
       
        ListNode head=new ListNode(0);
        
        if(t1==null){
            return t2;
        }
         if(t2==null){
            return t1;
        }
        if(t1.val<t2.val){
            head.next=t1;
            t1=t1.next;
        }
        else{
            head.next=t2;
            t2=t2.next;
        }
        ListNode curr=head.next;
            while(t1!=null &&t2!=null){
            if(t1.val>t2.val){
               curr.next=t2;
               t2=t2.next;
               curr=curr.next;
            }
            else{
              
                curr.next=t1;
              
                t1=t1.next;
                curr=curr.next;
            }
        }

        
        while(t1!=null){
            curr.next=t1;
            t1=t1.next;curr=curr.next;
        }
        while(t2!=null){
            curr.next=t2;
            t2=t2.next;curr=curr.next;
        }
        return head.next;
    }
}
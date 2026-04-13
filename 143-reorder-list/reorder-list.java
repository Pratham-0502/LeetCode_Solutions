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
        ListNode slow = head;
        ListNode fast = head;
        while(fast!=null&&fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }
        ListNode mid = slow;
        ListNode prev = null;
        ListNode it = slow;
        while(mid!=null){
            it = mid.next;
            mid.next = prev;
            prev = mid;
            mid = it;
        }

        ListNode temphead= new ListNode(0);
        ListNode temp =temphead;
        ListNode midhead = prev;

        while (midhead!=null){
            if (head.next!=null){
                temp.next=head;
                temp=temp.next;
                head=head.next;
            }
            temp.next=midhead;
            temp=temp.next;
            midhead=midhead.next;
        }
        head=temphead.next;
    
    }
}
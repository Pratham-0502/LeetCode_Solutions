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
    public boolean isPalindrome(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        ListNode temp = head;
        while(fast.next!=null&&fast.next.next!=null){
            slow=slow.next;
            fast = fast.next.next;
        }
        ListNode prev = null;
        slow = slow.next;
        
        while(slow!=null){
            ListNode it = slow.next;
            slow.next = prev;
            prev = slow;
            slow = it;
        }
        
        while(prev!=null){
            if(temp.val!=prev.val){
                return false;
            }
    temp = temp.next;
    prev = prev.next;

        }
        return true;
    }
}
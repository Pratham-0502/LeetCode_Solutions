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
        int count1=0;
        int count2 =0;
        ListNode temp1 = headA;
        ListNode temp2 = headB;
        while(temp1!=null){
            temp1=temp1.next;
            count1++;
        }
        while(temp2!=null){
            temp2=temp2.next;
            count2++;
        }
        temp1 = headA;
        temp2 = headB;
        if(count2>count1){
            int sub1 = count2-count1;
            for(int i=0;i<sub1;i++){
                temp2=temp2.next;
            }
        }else{
            int sub2 = count1-count2;
            for(int j=0;j<sub2;j++){
                temp1=temp1.next;
            }}
            while(temp2!=null){
                if(temp1==temp2){
                    return temp1;
                }
                temp1=temp1.next;
                temp2=temp2.next;
            
        }
        return null;
    }
}
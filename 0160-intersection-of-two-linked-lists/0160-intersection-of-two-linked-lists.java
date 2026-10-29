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
        int length1 = 0;
        int length2 = 0;

        ListNode temp1 = headA;
        ListNode temp2 = headB;

        while(temp1 != null){
            length1++;
            temp1 = temp1.next;
        }

        while(temp2 != null){
            length2++;
            temp2 = temp2.next;
        }

        temp1 = headA;
        temp2 = headB;

        if(length1 == length2){
            if(temp1 == temp2){
                return temp1;
            }else{
                temp1 = temp1.next;
                temp2 = temp2.next;
            }
        }
        

        if(length1 > length2){
            for(int i = 0; i<length1 - length2; i++){
                temp1 = temp1.next;
            }
        }else{
            for(int j = 0; j<length2 - length1; j++){
                temp2 = temp2.next;
            }
        }


        while(temp1 != temp2){
            temp1 = temp1.next;
            temp2 = temp2.next;
        }
        return temp1;



    }
}
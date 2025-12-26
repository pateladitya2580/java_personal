package LinkedList.Questions;
//leetcode
public class MergeTwoSortedLL07 {
}
/* ye extra space use kar raha hai
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }

class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode temp1 = list1;
        ListNode temp2 = list2;
        ListNode head = new ListNode(100);
        ListNode temp3 = head;

        while(temp1!= null && temp2!=null)
        {
            if(temp1.val<temp2.val)
            {
                ListNode a = new ListNode(temp1.val);
                temp3.next = a;// is se link ho raha hai
                temp3 = a;
                // or
                // temp3 =temp3.next;
                temp1 = temp1.next;// is se pointer move ho raha hai
            }
            else
            {
                ListNode a = new ListNode(temp2.val);
                temp3.next = a;
                temp3 = a;
                temp2 = temp2.next;
            }
        }
        if(temp1==null)
        {
            temp3.next =temp2;
        }
        if(temp2==null)
        {
            temp3.next = temp1;
        }
        return head.next;

    }
}
 */
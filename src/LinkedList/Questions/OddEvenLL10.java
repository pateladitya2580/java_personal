package LinkedList.Questions;
/*
#LEETCODE PE SOLUTION HAI
class Solution {
    public ListNode oddEvenList(ListNode head) {
       ListNode odd = new ListNode (0);
       ListNode even = new ListNode(0);
       ListNode tempO = odd;
       ListNode tempN = even;
       ListNode temp = head;

       while(temp!=null)
       {
        tempO.next = temp;
        temp = temp.next;
        tempO = tempO.next;



        tempN.next = temp;
        if(temp==null) break;
        temp = temp.next;
        tempN = tempN.next;
       }

       odd = odd.next;
       even = even.next;

       tempO.next = even;
       return odd;
    }
}
 */
public class OddEvenLL10 {
}

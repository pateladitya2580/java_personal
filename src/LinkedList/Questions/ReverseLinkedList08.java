package LinkedList.Questions;
/*
Leetcode
yaha nodes of reverse karke print kar rahe hai na ki value ko
Agar variable class ke andar static hai, tab wo sabhi static methods me bina error access hoga.
Agar variable static nahi hai, to static method use karega → ERROR.
 */
public class ReverseLinkedList08{
    public static class Node{
        int data ;
        Node next;

        Node(int data){
            this.data = data;
        }
    }
    public static Node reverse(Node head)
    {
        if(head.next==null) return head;
        Node newHead = reverse(head.next);
        head.next.next = head;
        head.next = null;
        return newHead;
    }
    static void display(Node head)
    {
        Node temp = head;
        while(temp!=null)
        {
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
    }
    static void main(String[] args) {
        Node a = new Node(3);
        Node b = new Node(5);
        Node c = new Node(1);
        Node d = new Node(2);
        Node e = new Node(4);

        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;

        display(a);
        System.out.println();

        Node r = reverse(a);
        display(r);
    }
}

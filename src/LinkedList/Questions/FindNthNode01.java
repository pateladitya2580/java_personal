package LinkedList.Questions;
/*
finding Nth Node from the end of linked list
m = total nodes
nth from las  = (m-n+1)th node from start
 */
public class FindNthNode01 {
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data  = data;
        }
    }
    // rabit turtile method
    public static Node nthNode(Node head,int n)
    {
        Node slow = head;
        Node fast = head;
        for(int i = 1; i<=n;i++)
        {
            fast = fast.next;
        }
        while(fast!=null)
        {
            slow = slow.next;
            fast = fast.next;
        }
        return slow;
    }
    static void main(String[] args) {
        Node a = new Node(100);
        Node b = new Node(13);
        Node c = new Node(4);
        Node d = new Node(5);
        Node e = new Node(12);
        Node f = new Node(10);
        a.next= b;
        b.next = c;
        c.next = d;
        d.next= e;
        e.next = f;

        Node q = nthNode(a,4);
        System.out.println(q.data);

    }
}

package LinkedList;

public class Basic01 {
    static int lengthMethod(Node head)
    {
        Node temp = head;
        int count = 0;
        while (temp!=null){
            count++;
            temp = temp.next;
        }
        return count;
    }
    static void display(Node head)
    {
        Node temp = head;
        while (temp!=null)
        {
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
    }
    static void displayRecursion(Node head)
    {
        Node temp = head;
        if(temp==null) return;
        System.out.print(temp.data+" ");
        display(temp.next);
    }

    public static class Node{
        int data ;
        Node next;

        Node(int data){
            this.data = data;
        }
    }
    static void main(String[] args) {
        Node a = new Node(5);
        Node b = new Node(3);
        Node c = new Node(9);
        Node d = new Node(8);

        a.next = b;
        b.next = c;
        c.next = d;
        display(a);
        System.out.println();
        displayRecursion(a);
        System.out.println();
        System.out.println("The length of the list is "+lengthMethod(a));
    }
}

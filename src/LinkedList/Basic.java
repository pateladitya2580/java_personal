package LinkedList;
/*
Linked List hoti kya hai?

Linked List = nodes ka chain
Har node ke 2 parts hote hain:

Data

Reference (address) to next node

Memory contiguous nahi hoti (array se yahi main difference).

[data | next] -> [data | next] -> [data | null]

Types (ye yaad nahi, samjho)
1️⃣ Singly Linked List

Sirf next pointer

Backward nahi ja sakte

Simple but limited

2️⃣ Doubly Linked List

prev + next

Backward + forward traversal

Extra memory waste hoti hai (prev ke liye)

3️⃣ Circular Linked List

Last node ka next → head

Infinite loop ka risk agar dimag nahi lagaya
 */
public class Basic {
    static void display(Node head)
    {
        Node temp = head;
        while (temp!=null)
        {
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
    }
    public static class Node{
        int data;//value
        Node next;//address of next node
        Node(int data)
        {
            this.data= data;
        }
    }
    static void main(String[] args) {
        Node a = new Node(5);
        Node b = new Node(3);
        Node c = new Node(9);
        Node d = new Node(8);
        Node e = new Node(16);
        // 5 3 9 8 16
        // ham abb ek node me second node ka address store kar rahe hai
        a.next = b;// matlab a node me b ka address store ho gaya hai//5->3
        System.out.println(a.data);//5
        System.out.println(a.next.data);//3

        b.next = c;//5->3->9
        c.next = d;//5->3->9->8
        d.next = e;//5->3->9->8->16 // last node ke next me null hota hai
        //head ki help se print
//        System.out.println(a.data);
//        System.out.println(a.next.data);
//        System.out.println(a.next.next.data);
//        System.out.println(a.next.next.next.data);
//        System.out.println(a.next.next.next.next.data);

        // loop ki help se
        // for loop jab size pata ho
//        Node temp = a;// is line ka matlab ye nahi hai ki me new node bana raha hu ,actually me temp ko a pe point kar raha hu
//        for(int i = 1 ; i<=5;i++)
//        {
//            System.out.print(temp.data+" ");
//            temp = temp.next;
//        }
        // jab size nahi pata to while loop,Mainly yahi use hoga

        Node temp = a;
        while (temp!=null)
        {
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
        System.out.println();
        display(a);
    }
}

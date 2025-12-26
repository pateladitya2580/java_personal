package LinkedList.DoublyLinkedLIst;
/*
DLL hoti kya hai?

Har node ke paas 3 cheeze hoti hain:

prev | data | next


prev → pichhle node ka address

data → actual value

next → agle node ka address

👉 Isliye naam DOUBLY linked list.
 */
public class Basic {
    public static class Node{
        int val;
        Node next;
        Node prev;

        Node(int val)
        {
            this.val = val;
        }
    }
    public static void display(Node head)
    {
        Node temp = head;
        while (temp!=null)
        {
            System.out.print(temp.val+" ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static void displayRev(Node tail)
    {
        Node temp = tail;
        while (temp!=null)
        {
            System.out.print(temp.val+" ");
            temp = temp.prev;
        }
        System.out.println();
    }

    public static void displayRandom(Node random)
    {
        // move backward to find head
        Node temp = random;
        while (temp.prev!=null)
        {
            temp = temp.prev;
        }
        // aap temp head pe a gaya hi
        while (temp!=null)
        {
            System.out.print(temp.val+" ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static Node insertAtHead(Node head,int x)
    {
        Node t = new Node(x);
        t.next = head;
        head.prev = t;
        head = head.prev;

        return head;
    }

    public static void insertAtTail(Node head,int x)
    {
        Node temp = head;
        while (temp.next!=null)
        {
            temp = temp.next;
        }
        // temp me tail a gaya hai
        Node t = new Node(x);
        temp.next = t;
        t.prev = temp;
        temp = t;
    }

    public static void insertAtIdx(Node head,int idx,int x)
    {
        Node s = head;
        for(int i = 1 ; i<=idx-1;i++)
        {
            s = s.next;
        }
        // aab s idx-1 index pe a gaya hai
        Node r = s.next ; // idx
        Node t = new Node(x);
        // s t r
        s.next = t;
        t.prev = s;
        t.next = r;
        r.prev = t;
    }

    static void main(String[] args) {
        // 4 10 2 99 13
        Node a = new Node(4);
        Node b = new Node(10);
        Node c = new Node(2);
        Node d = new Node(99);
        Node e = new Node(13);

        a.prev = null;
        a.next = b;
        b.prev = a;
        b.next = c;
        c.prev = b;
        c.next = d;
        d.prev = c;
        d.next = e;
        e.prev = d;
        e.next = null;

        display(a);
        displayRev(e);
        displayRandom(d);
        // insert at head
        Node newHead = insertAtHead(a,30);
        display(newHead);

         // insert at end
        insertAtTail(a,44);
        display(a);
        // insert at index
        insertAtIdx(a,2,65);
        display(a);

    }
}
/*
delete at Head
head = head.next
head.prev = null

delete at Tail
when head is given
tamp ko tail tak le jai {while(temp.next!=null)}

temp = temp.prev
temp.next = null isme ham previous ko matter nahi karte

delete at Index
delete (head,2)
temp at idx 1
temp.next = temp.next.next
temp.next.prev = temp
 */
package LinkedList;
public class CreateLLJustLikeArraylist {
    public static class Node{
        int data ;
        Node next;

        Node(int data)
        {
            this.data= data;
        }
    }
    public static class linkedlist{
        Node head = null;
        Node tail = null;
        int size = 0;

         void insertAtEnd(int val)
        {
            Node temp = new Node(val);
            if(head == null)
            {
                head = temp;
                tail = temp;
            }
            else {
                tail.next = temp;
                tail = temp;
            }
            size++;
        }

        void insertAtHead(int val)
        {
            Node temp = new Node(val);
            if(head == null)
            {
                head = temp;
                tail = temp;
            }
            else
            {
                temp.next = head;
                head = temp;
            }
            size++;
        }

        void inssetAt(int idx,int val)
        {
            Node t = new Node(val);
            Node temp = head;
            if(idx == lengthMethod()){
                insertAtEnd(val);
                return;
            } else if (idx==0) {
                insertAtHead(val);
                return;
            } else if (idx<0 || idx>lengthMethod()) {
                System.out.println("not a valid index");
            }
            for(int i = 1 ; i<=idx-1;i++)
            {
                temp = temp.next;
            }
            t.next = temp.next;
            temp.next = t;
            size++;
        }
        int getAt(int idx){
             Node temp = head;
             for(int i = 1 ; i<=idx;i++)
             {
                 temp = temp.next;
             }
             return temp.data;
        }
        void deleteAt(int idx)
        {
            if(idx ==0){
                head = head.next;
                size--;
                return;
            }
            Node temp = head;
            for(int i = 1; i<=idx-1;i++)
            {
                temp = temp.next;
            }
            temp.next = temp.next.next;
            size--;
        }
        void display(){// yaha ham head isliye pass nahi kar rahe hai kyo ki ham ek data structure bana rahe hai
             Node temp = head; // jis ke ander phele se head hoga
            while (temp!= null){
                System.out.print(temp.data+" ");
                temp = temp.next;
            }
            System.out.println();
        }

        int lengthMethod()
        {
            return size;
        }

    }

    static void main(String[] args) {
        linkedlist L1 = new linkedlist();
        //insertAtEnd
        L1.insertAtEnd(1);
        L1.insertAtEnd(2);
        //insertAtHead
        L1.insertAtHead(6);
        L1.insertAtHead(4);
        //insertAt
        L1.inssetAt(2,7);
        //value at index
        System.out.println(L1.getAt(2));//7

        L1.display();

        System.out.println("The length is "+L1.lengthMethod());

        //get at
        System.out.println(L1.getAt(3));
        //delete
        L1.deleteAt(2);
        L1.display();
    }
}

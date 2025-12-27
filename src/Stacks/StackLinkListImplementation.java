package Stacks;

public class StackLinkListImplementation {
    public static class Node{
        int val;
        Node next;
        Node(int val ){
            this.val = val;
        }
    }
    public static class LLStack{
        Node head = null;
        int size = 0;

        void push (int x)
        {
            Node temp = new Node(x);
            temp.next = head;
            head = temp;
            size++;
        }

        int pop(){
            if(head == null){
                System.out.println("Stack is Empty!");
                return -1;
            }
            int x = head.val;
            head = head.next;
            size--;
            return x;
        }

        int peek()
        {
            if(head== null){
                System.out.println("Stack is empty! ");
                return -1;
            }
            return head.val;
        }
        void displayrRecursion(Node h){
            if(h == null)return;
            displayrRecursion(h.next);
            System.out.println(h.val+" ");
        }

        void display(){
            displayrRecursion(head);
            System.out.println();
        }
        void displayReverse(){
            Node temp = head;
            while (temp!=null)
            {
                System.out.println(temp.val+" ");
                temp = temp.next;
            }
            System.out.println();
        }

        int size(){
            return size;
        }


    }
    static void main(String[] args) {

        LLStack st = new LLStack();
        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);

        st.display();

        st.pop();
        st.display();
    }
}

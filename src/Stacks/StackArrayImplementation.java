package Stacks;

import java.util.Stack;

public class StackArrayImplementation {
    public static class Stacks{
        int []arr = new int[5];
        int idx = 0;

        void push(int x )
        {
            if(isFull()){
                System.out.println("Stack is full");
                return;
            }
            arr[idx] = x;
            idx++;
        }

        int peek(){
            if(idx==0)
            {
                System.out.println("Stack is empty");
                return -1;
            }
            return arr[idx-1] ;
        }

        int pop(){
            if(idx==0)
            {
                System.out.println("Stack is empty");
                return -1;
            }
            int top = arr[idx-1];
            arr[idx-1] = 0;
            idx--;
            return top;
        }

        void display(){
            for(int i = 0 ; i<=idx-1;i++)
            {
                System.out.print(arr[i]+" ");
            }
            System.out.println();
        }

        int size(){
            return idx;
        }

        boolean isEmpty(){
            if(idx == 0 ) return true;
            else return false;
        }

        boolean isFull(){
            if(idx == arr.length) return true;
            else return false;
        }


    }
    static void main(String[] args) {
        Stacks st = new Stacks();
        st.push(5);
        st.push(3);
        st.push(6);

        st.display();//5 3 6

        // peek
        System.out.println(st.peek());//6

        //pop
        st.pop();
        st.display();

        //size
        System.out.println("Size is "+st.size());
    }
}

package Stacks;
import java.util.Stack;
public class ReverseStack {
    static void pushAtBottom(Stack<Integer> st,int x)
    {
        if (st.isEmpty()) {
            st.push(x);
            return;
        }
        int top = st.pop();
        pushAtBottom(st, x);
        st.push(top);
    }
    static void reverseRecur(Stack<Integer> st)
    {
        if(st.size()==1) return;
        int top = st.pop();
        reverseRecur(st);
        pushAtBottom(st,top);
    }

    static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);

        System.out.println(st);

        //reverse without recursion
//        Stack<Integer> rt = new Stack<>();
//        while (st.size()>0)
//        {
//            rt.push(st.pop());
//        }
//        System.out.println(rt);
//
//        Stack<Integer> qt = new Stack<>();
//        while (rt.size()>0)
//        {
//            qt.push(rt.pop());
//
//        }
//        System.out.println(qt);
//        while (qt.size()>0)
//        {
//            st.push(qt.pop());
//        }
//        System.out.println(st);


        //reverse with recursion
        reverseRecur(st);
        System.out.println(st);
    }


}

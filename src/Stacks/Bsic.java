package Stacks;
import java.util.Stack;
public class Bsic {
    static void main(String[] args) {
        Stack<Integer> st = new Stack<>();

        st.push(1);
        st.push(23);
        st.push(90);
        st.push(5);
        st.push(34);

        // peak matlab first element milega
        System.out.println(st.peek()); //  34

        // pura stack print karna hai
        System.out.println(st); // 1 22 90 5 34

        // sab se uper ya top ka element delete karna hai to pop
        st.pop();
        System.out.println(st); // 1 24 90 5

        //size = 4
        System.out.println("size is "+st.size());

        //empty false
        System.out.println(st.isEmpty());

    }
}

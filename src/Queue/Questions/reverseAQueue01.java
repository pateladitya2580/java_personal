package Queue.Questions;
import java.util.ArrayDeque;
import java.util.Stack;
import java.util.Queue;
public class reverseAQueue01 {
    static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        Queue<Integer> q = new ArrayDeque<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        while (q.size()>0)
        {
            st.push(q.remove());
        }

        while (st.size()>0)
        {
            q.add(st.pop());
        }
        System.out.println(q);
    }
}

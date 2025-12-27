package Stacks;
/*
copy contents of one stack to another in same order
 */
import java.util.Scanner;
import java.util.Stack;
public class CopyStack {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<Integer> st = new Stack<>();

//        int n ;
//        System.out.println("Enter the no. of elements : ");
//        n = sc.nextInt();
//
//        System.out.println("Enter the element");
//        for(int i = 1 ; i<=n;i++)
//        {
//            int x = sc.nextInt();
//            st.push(x);
//        }
//        System.out.println(st);

        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);
        System.out.println(st);
        // reversse
        Stack<Integer>st1 = new Stack<>();
        while (st.size()>0){
            int x = st.peek();
            st1.push(x);// or st1.push(st.pop) pop phele value lata phie delete karta hai
            st.pop();
        }
        Stack<Integer>st2 = new Stack<>();
        while (st1.size()>0)
        {
            st2.push(st1.pop());
        }
        System.out.println(st2);
    }
}

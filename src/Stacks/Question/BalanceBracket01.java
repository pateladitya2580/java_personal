package Stacks.Question;
import java.util.*;
public class BalanceBracket01{
    static boolean isBalance(String str)
    {
        Stack<Character> st = new Stack<>();
        int n = str.length();
        for(int i = 0; i<=n-1;i++ )
        {
            char ch = str.charAt(i);
            if(ch == '(')
            {
                st.push('(');
            }
            else {
                if(st.size()==0) return false;
                if(st.peek() == '(') st.pop();
            }
        }
        if(st.size() > 0 ) return false;
        else return true;
    }
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(isBalance(str));
    }
}

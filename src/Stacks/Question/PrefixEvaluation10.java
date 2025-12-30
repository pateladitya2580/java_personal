package Stacks.Question;
import java.util.*;
public class PrefixEvaluation10 {
    static void main(String[] args) {
        String str = "-9/*+5346";
        Stack<Integer> val = new Stack<>();
        for(int i = str.length()-1;i>=0;i--)
        {
            char ch = str.charAt(i);
            int asci = (int)ch;
            if(asci>=48 && asci<=57) val.push(asci-48);
            else{
                int v1 = val.pop();
                int v2 = val.pop();
                if(ch == '-') val.push(v1-v2);
                if(ch == '+') val.push(v1+v2);
                if(ch == '*') val.push(v1*v2);
                if(ch == '/') val.push(v1/v2);
            }
        }
        System.out.println(val.peek());
    }
}
// post or pre fix me  brackets nahi aate
// isme ulti loop
// first pop ko v1, or second pop ko v2 bolte hai
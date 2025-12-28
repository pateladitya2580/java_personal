package Stacks.Question;
import java.util.Stack;
public class Infix06 {
    static void main(String[] args) {
        String str = "9-(5+3)*4/6";//4
        Stack<Integer> val = new Stack<>();
        Stack<Character> op = new Stack<>();
        for(int i = 0;i<str.length();i++)
        {
            char ch = str.charAt(i);
            int asci = (int)ch;
            if(asci>=48 && asci <=57) val.push(asci-48);
            else if(op.size() == 0 || ch =='(' || op.peek()=='(') op.push(ch);
            else if(ch == ')'){
                while(op.peek()!='(')
                {
                    //work
                    int v2 = val.pop();
                    int v1 = val.pop();
                    if(op.peek()=='-') val.push(v1-v2);
                    if(op.peek()=='+') val.push(v1+v2);
                    if(op.peek()=='*') val.push(v1*v2);
                    if(op.peek()=='/') val.push(v1/v2);
                    op.pop();
                }
                op.pop();// '(' hata diya
            }
            else {
                if(ch == '+'||ch == '-')
                {
                    //work
                    int v2 = val.pop();
                    int v1 = val.pop();
                    if(op.peek()=='-') val.push(v1-v2);
                    if(op.peek()=='+') val.push(v1+v2);
                    if(op.peek()=='*') val.push(v1*v2);
                    if(op.peek()=='/') val.push(v1/v2);
                    op.pop();
                    //push
                    op.push(ch);
                }
                if(ch == '*'||ch =='/')
                {
                    if(op.peek()=='*'||op.peek()=='/')
                    {
                        //work
                        int v2 = val.pop();
                        int v1 = val.pop();
                        if(op.peek()=='*') val.push(v1*v2);
                        if(op.peek()=='/') val.push(v1/v2);
                        op.pop();
                        //push
                        op.push(ch);
                    }
                    else op.push(ch);
                }
            }
        }
        //val stack size -> 1
        while (val.size()>1)
        {
            int v2 = val.pop();
            int v1 = val.pop();
            if(op.peek()=='-') val.push(v1-v2);
            if(op.peek()=='+') val.push(v1+v2);
            if(op.peek()=='*') val.push(v1*v2);
            if(op.peek()=='/') val.push(v1/v2);
            op.pop();
        }
        System.out.println(val.peek());
    }
}
/*
Theek, **same rule ko thoda describe karke, par simple Hinglish me** samjho 👇

👉 **Infix expression solve karte time** jab **number** mile to usse *value stack* me daal dete hain, jab **`(`** mile to usse *operator stack* me daal dete hain, jab **operator (`+ - * /`)** mile to pehle check karte hain ki operator stack ke top par jo operator hai uski **precedence zyada ya equal** hai ya nahi—agar hai to pehle usse calculate karte hain, phir current operator push karte hain; jab **`)`** mile to tab tak calculation karte rehte hain jab tak matching **`(`** na mil jaaye, aur poori expression khatam hone ke baad operator stack me bache hue sab operators se final calculation kar dete hain.

Agar chaahe to main isko **ek real example ke flow** ke saath bhi dikha deta hoon (step-by-step).

 */
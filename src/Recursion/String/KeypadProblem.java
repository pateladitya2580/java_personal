package Recursion.String;
/*
Given a string containing digits from 2-9 inclusive, return all possible letter combination that the
number could represent . Return the answer in any order.
input: digits = "23"
output : [ ad,ae,af,bd,be,bf,cd,ce,cf]
 */
public class KeypadProblem {
    static void keyPadPrint(String s,String[] kp,String ans)//253
    {
        if(s.length()== 0)
        {
            System.out.print(ans+" ");
            return;
        }
        int num = s.charAt(0) - '0';//2
        String kpString = kp[num];//abc
        for(int i = 0 ;i<kpString.length();i++)
        {
            keyPadPrint(s.substring(1),kp,ans + kpString.charAt(i));
        }
    }
    static void main(String[] args) {
        String s = "253";
        String []kp ={"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
        keyPadPrint(s,kp," ");
    }
}

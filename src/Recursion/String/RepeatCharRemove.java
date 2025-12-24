package Recursion.String;

import java.util.Scanner;

public class RepeatCharRemove {
    static String print(String a , int idx)
    {
        if(idx == a.length()) return " ";
        String smallAns = print(a,idx+1);
        if(a.charAt(idx)!='a')
        {
            return a.charAt(idx) + smallAns;
        }
        else
        {
            return smallAns;
        }
    }
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        System.out.println(print(a,0));
    }
}
// aditya input
// dity output
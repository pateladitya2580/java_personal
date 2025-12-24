package Recursion.Practice;

import java.util.Scanner;

public class Fibonacci {
    static int fibo(int n)
    {
        if(n== 0 || n== 1)
        {
            return n  ;
        }
        int a = fibo(n-1)+fibo(n-2);
        return a;
    }
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the index no of fibonacci series ");
        int  n = sc.nextInt();
        System.out.println("Value is "+fibo(n));
    }
}

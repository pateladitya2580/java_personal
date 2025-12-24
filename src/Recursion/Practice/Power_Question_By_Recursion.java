package Recursion.Practice;

import java.util.Scanner;

public class Power_Question_By_Recursion {
    static int power(int p,int q)
    {
        if(q == 0)return 1;
        return power(p,q-1) *p;
    }
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the base and raise to power ");
        int n = sc.nextInt();
        int m = sc.nextInt();
        System.out.println("Ans "+power(n,m));
    }
}
/*
if (q= 0 ) return 1;
int smallpow = power(p,q/2);
if(q%2==0)
{
 return smallpow*smallpow;
}
else
{
  retuen smallpow * smallpow * p;
}
*/
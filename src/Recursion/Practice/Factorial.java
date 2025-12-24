package Recursion.Practice;
import java.util.Scanner;
public class Factorial {
    static int fact(int n )
    {
        if ( n == 0)
        {
            return 1;
        }
        int a = n * fact(n-1);// fact(n-1) small problem , int a = n *fact(n-1) self work
        return a;
    }
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" Enter the no. that you want factorial");
        int  n = sc.nextInt();
        System.out.println("The factorial is "+fact(n));
    }
}
// time complexity = no. of recursive calls * time taken in 1 call
// (n+1)~ n * c
// nc ~ O(n)
/*
is me n == 0 , return 1,* multiplication,return a constent time operation hai
or jo fact(n-1) function call hai ye bhi constent call hai
*/
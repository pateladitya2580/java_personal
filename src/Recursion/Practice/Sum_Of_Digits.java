package Recursion.Practice;

public class Sum_Of_Digits {
    static int SOD(int n )
    {
//        if(n == 0 )return 0;
//        return SOD(n/10)+1;  ( count of digits
        if(n>=0 && n <=9)return n;
        return SOD(n/10) + n%10;
    }
    static void main() {
        int n = 12345;
        System.out.println("The sum is "+SOD(n));
    }
}
// sod(n/10) is small problem
// n%10 is self work

package Recursion.Practice;
import java.util.Scanner;
public class Print_N_Number_Using_Recursion {
    static void PrintIncreasing(int n )
    {
        // base case
        if(n == 1)
        {
            System.out.println(1);
            return;
        }
        //sub problem
        PrintIncreasing(n-1);
        // self work
        System.out.println(n);
    }
    static void main() {
        Scanner sc = new Scanner(System .in );
        System.out.println("Enter the no. ");
        int n = sc.nextInt();
        PrintIncreasing(n);
    }
}

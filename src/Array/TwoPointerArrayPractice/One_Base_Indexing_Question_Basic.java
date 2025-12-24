package Array.TwoPointerArrayPractice;
/*
given an array of integers of size n.Answer q queries where you need to print the sum
of values in a given range of indices from 1 to r (both included).
Note:The values of l and r in queries follow 1-based indexing
 */
import java.util.Scanner;
public class One_Base_Indexing_Question_Basic {
    static int sum(int []arr,int l ,int r)
    {
        int sum = 0;
        for(int i = l-1; i <=r-1 ;i++) // -1 isliye kia  hai kro ki java 0 base index follow karta hai
        {                               // isliye -1 kar ke 1 base indexing se 0 base me kiye hai
            sum += arr[i];
        }
        return sum;
    }
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array ");
        int size = sc.nextInt();
        int []arr = new int[size];
        System.out.println("Enter the value of array ");
        for(int i = 0 ; i< arr.length;i++)
        {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the value of queries ");
        int x = sc.nextInt();
        while (x>0)
        {
            System.out.println("Enter the value of l ans r ");
            int l =sc.nextInt();
            int r = sc.nextInt();
            System.out.println("The sum is "+sum(arr,l,r));
            x--;
        }
    }
}

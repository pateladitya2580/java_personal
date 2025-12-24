package Array.TwoPointerArrayPractice;
/*
given an array of integers of size n.Answer q queries where you need to print the sum
of values in a given range of indices from 1 to r (both included).
Note:The values of l and r in queries follow 1-based indexing
 */
import java.util.Scanner;
public class One_Base_Indexing_Question_Advance_by_Prefix_Array {
    static int[] prefix(int []arr)
    {
        for(int i = 1 ; i<arr.length;i++)
        {
            arr[i] = arr[i-1] + arr[i];
        }
        return arr;
    }
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int size = sc.nextInt();
        int []brr = new int[size];
        System.out.println("Enter the value of array ");
        for(int i = 0; i < brr.length;i++ )
        {
            brr[i] = sc.nextInt();
        }
        int []crr = prefix(brr);
        System.out.println("Enter the value of queries ");
        int q = sc.nextInt();
        while (q-->0)
        {
            System.out.println("Enter the value of l");
            int l = sc.nextInt();
            System.out.println("Enter the value of r");
            int r = sc.nextInt();
            int x = 0 ;
            if(l==1) // matlab starting se sum nikal na hai
            {
                x = crr[r-1];    // r- 1 se total sum aata hai
            } else if (l>1) {//l-2 se agge ka extra sum remove hota hai
                x = crr[r-1] - crr[l-2];
            }
            System.out.println("The sum is "+x);
        }
    }
}

package Array.practice;
/*find the unique number in a given array where all elements are being
 repeated twice with one value being unique*/
// array manipulatio wo chiz hoti ha jab ek algo banate hai array ko change kar ke
import java.util.Scanner;
public class ArrayManipulation {
    static int a ;  // static variable is liye banya kyo ki static method me use karna hai
    static int unique (int []arr)
    {
        for(int i = 0 ; i < arr.length;i++)
        {
            for(int j = i+1; j<arr.length;j++)
            {
                if(arr[i]== arr[j])
                {
                    arr[i] = -1;
                    arr[j] = -1;
                }
            }
        }
        for(int i = 0 ;i<arr.length;i++)
        {
            if(arr[i]>0)
            {
                a = arr[i];
            }
        }
        return a;
    }
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the  size of array");
        int size = sc.nextInt();
        int []brr = new int[size];
        System.out.println("Enter the array ");
        for (int i = 0;i <brr.length;i++ )
        {
            brr[i] = sc.nextInt();
        }
        System.out.println("Unque element of array is "+unique(brr));
    }
}

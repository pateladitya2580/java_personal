package Array.practice;
/*
rotate the given 'a' by steps,where k is non negative.
k can be greater than n as well
ex
k = 0
1 2 3 4 5
k =1
2 3 4 5 1
 */
import java.util.Scanner;
public class Rotate_Array_Ksteps {
    static int[] rotate (int []arr,int k)
    {
        int n = arr.length;
        k = k%n;
        for(int i = n-k;i<n;i++)
        {
            System.out.print(arr[i] +" ");
        }
        for(int i = 0;i<n-k;i++)
        {
            System.out.print(arr[i] +" ");
        }
        return arr;
    }
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int size = sc.nextInt();
        int []brr = new int[size];
        System.out.println("Enter the element of array");
        for(int j = 0; j < brr.length;j++)
        {
            brr[j] = sc.nextInt();
        }
        System.out.println("Enter the vlaue of k ");
        int k = sc.nextInt();
        rotate(brr,k);
    }
}

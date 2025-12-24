package Array.TwoPointerArrayPractice;
import java.util.Scanner;
public class ShortBy2Pointer {
    static int[]sort(int []arr)
    {
        int n = arr.length;
        int i = 0;
        int j  = n-1;
        while (j>i)
        {
            if(arr[i]== 1 && arr[j]==0)
            {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
                j--;
            }
            if(arr[i]==0)
            {
                i++;
            }
            if(arr[j]==1)
            {
                j--;
            }
        }
        return arr;
    }
    static void print(int[]arr)
    {
     for(int i = 0 ; i<arr.length;i++)
     {
         System.out.print(arr[i]+" ");
     }
    }
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int size = sc.nextInt();
        int []arr = new int[size];
        System.out.println("Enter the elements of array");
        for(int i = 0 ; i<arr.length;i++)
        {
            arr[i] = sc.nextInt();
        }
        int []brr = sort(arr);
        print(brr);
    }
}

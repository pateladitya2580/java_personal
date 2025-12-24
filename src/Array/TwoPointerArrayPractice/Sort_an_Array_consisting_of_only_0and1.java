package Array.TwoPointerArrayPractice;
import java.util.Scanner;
public class Sort_an_Array_consisting_of_only_0and1 {
    static int[]sort(int []arr)
    {
        int countOfZero = 0;
        for(int i = 0 ; i<arr.length;i++)
        {
            if(arr[i]==0)
            {
                countOfZero++;
            }
        }
        for(int i = 0 ; i< arr.length;i++)
        {
            if(i < countOfZero)
            {
                arr[i] = 0;
            }
            else {
                arr[i] = 1;
            }
        }
        return arr;
    }
    static void print(int []arr)
    {
        for(int i = 0 ;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array ");
        int size = sc.nextInt();
        int []arr = new int[size];
        System.out.println("Enter the element of array ");
        for(int i = 0 ; i < arr.length;i++)
        {
            arr[i] = sc.nextInt();
        }
        int []brr = sort(arr);
        print(brr);
    }
}

package Array.practice;
/*
give an array 'a' consisting of integers.Return the first value that is repeating in this array.if
no value is repeated return -1.
 */
import java.util.Scanner;
public class ArrayManipulation3 {
    static int repeating(int []arr)
    {
        for(int i = 0 ; i < arr.length;i++)
        {
            for(int j = i +1 ; j < arr.length;j++)
            {
                if(arr[i]==arr[j])
                {
                    return arr[i];
                }
            }
        }
        return -1;
    }
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int size = sc.nextInt();
        System.out.println("Enter the array ");
        int []brr  = new int[size];
        for(int i = 0;i < brr.length;i++)
        {
            brr[i] = sc.nextInt();
        }
        System.out.println("The repeated element of array "+repeating(brr));

    }
}

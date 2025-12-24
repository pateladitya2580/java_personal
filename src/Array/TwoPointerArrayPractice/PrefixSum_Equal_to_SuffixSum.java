package Array.TwoPointerArrayPractice;/*
check if we can partition the array into two subarrays with equal sum . More
formally ,check that the prefic sum of a part of the array is equal
to the suffix sum of rest of the array */
import java.util.Scanner;
public class PrefixSum_Equal_to_SuffixSum {
    static int find_total_Sum(int []arr)
    {
        int totalSum = 0;
        for(int i =0 ;i<arr.length;i++)
        {
            totalSum += arr[i];
        }
        return totalSum;
    }
    static boolean prefix(int []arr)
    {
        int suffixSum = 0;
        int prfixSum = 0;
        for(int i = 0 ; i < arr.length;i++)
        {
            prfixSum += arr[i];
            suffixSum = find_total_Sum(arr) - prfixSum;
            if(prfixSum == suffixSum)
            {
                return true;
            }
        }
        return false;
    }
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int size = sc.nextInt();
        int []arr = new int[size];
        System.out.println("Enter the value of array ");
        for(int i = 0 ; i < arr.length;i++)
        {
            arr[i] = sc.nextInt();
        }
        boolean can_partion = prefix(arr);
        System.out.println("Enter array can we make two sub array of equal sum "+can_partion);
    }
}

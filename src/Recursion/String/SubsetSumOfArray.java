package Recursion.String;
/*
Given an array of integers ,print sums of all subsets in it .Output
sums can be printed in any order.
input : arr[] = {1,2,3}
output :
 */
public class SubsetSumOfArray {
    static void subsum(int []arr,int idx,int currentSum)
    {
     //base case
     if(idx == arr.length)
     {
         System.out.print(currentSum + " ");
         return;
     }
      int a = arr[idx];
      subsum(arr,idx+1,currentSum + a);
      subsum(arr,idx+1,currentSum);
    }
    static void main(String[] args) {
        int arr[] = { 1,2,3 };
        subsum(arr,0,0);
    }
}

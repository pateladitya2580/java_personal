package Array.TwoPointerArrayPractice;
/*
given an integer array "a" . return the prefix sum/running sum in the same
array without creating a new array.
int[]arr = {1,2,3,4,5}
ans array
int[]ans = 1 3 6 10 15
 */
public class Prefix_Sum_Array {
    static int[] PrefixSum(int[]arr)
    {
        int n = arr.length;
        for(int i = 1; i<n;i++)
        {
            arr[i] = arr[i-1] + arr[i];
        }
        return arr;
    }
    static void print(int []arr)
    {
        for ( int i = 0; i < arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
    static void main(String[] args) {
        int []brr = {1,2,3,4,5,6};
        int []crr = PrefixSum(brr);
        print(crr);
    }
}

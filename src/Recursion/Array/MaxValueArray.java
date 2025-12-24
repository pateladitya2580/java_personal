package Recursion.Array;

public class MaxValueArray {
    static int max(int []arr,int idx)
    {
        if(idx==arr.length -1)
        {
            return arr[idx];
        }
        int smallAns = max(arr,idx+1);
        return Math.max(smallAns,arr[idx]);
    }
    static void main(String[] args) {
        int []arr = {12,32,1,2,33,43,5};
        System.out.println("Ans "+max(arr,0));

    }
}

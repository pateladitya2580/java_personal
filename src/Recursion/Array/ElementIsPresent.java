package Recursion.Array;
public class ElementIsPresent {
    static int findIndex(int []arr,int n, int target,int idx)
    {
        if(idx >= n )
        {
            return -1;
        }
        if(arr[idx] == target)
        {
            return idx;
        }
        return findIndex(arr, n, target, idx+1);
    }
    static void main(String[] args) {
        int []arr = {1,2,3,4,5,6,7};
        int n = arr.length;
        int target = 6;
        System.out.println("Ans "+findIndex(arr,n,target,0));
    }
}


package Recursion.Array;
public class SumOfElementsOfArray {
    static int Sum1(int []arr,int idx)
    {
        if(idx==arr.length -1)
        {
            return arr[idx];
        }
        int smallAns = Sum1(arr,idx+1);
        int sum = arr[idx]+smallAns;
        return sum;
    }
    static void main(String[] args) {
        int []arr = {12,32,1,2,33,43,5};
        System.out.println("Ans "+Sum1(arr,0));
    }
}

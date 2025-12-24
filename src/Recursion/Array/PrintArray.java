package Recursion.Array;

public class PrintArray {
    static void print(int[]arr,int index)
    {
        if(index == arr.length ) {
            return;
        }
        System.out.print(arr[index] + " ");
        print(arr,index + 1);
    }
    static void main(String[] args) {
        int arr[] = { 5,4,2,3};
        print(arr,0);

    }
}

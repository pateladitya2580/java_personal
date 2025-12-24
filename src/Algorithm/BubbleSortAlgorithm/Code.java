package Algorithm.BubbleSortAlgorithm;

public class Code {
    static void bubbleSort(int []arr)
    {
     int n = arr.length;
     //n-1 iterations/passes
     for (int i = 0 ; i<n-1;i++)
     {
         for(int j = 0 ; j< n-i-1;j++)
         {
             if(arr[j]>arr[j+1])
             {
                 //swap
                 int temp = arr[j];
                 arr[j] = arr[j+1];
                 arr[j+1] = temp;
             }
         }
     }
    }
    static void main(String[] args) {
        int a [] = { 8,7,9,5,6,1};
        bubbleSort(a);
        for(int i :a)
        {
            System.out.print(i+" ");
        }
    }
}
//Space complexity = O(1)
//Time complexity = O(n^2)
//stable
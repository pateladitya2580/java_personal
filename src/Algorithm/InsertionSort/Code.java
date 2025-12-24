package Algorithm.InsertionSort;

public class Code {
    static void insertionSort(int []a)
    {
        int n = a.length;
        for(int i = 1; i<n;i++)
        {
            int j = i;
            while (j>0 && a[j]<a[j-1])
            {
                int temp = a[j];
                a[j] = a[j-1];
                a[j-1] = temp;
                j--;
            }
        }
    }
    static void main(String[] args) {
        int a[] = {9,8,2,3,5,7,3};
        insertionSort(a);
        for(int i : a)
        {
            System.out.print(i+" ");
        }
    }
}
//Time complexity
//Best case :O(n)
//worst case: O(n^2)
//space complexity O(1)
//stable algorithm
package Algorithm.SelectionSort;

public class code {
    static void selectionSort(int[]a)
    {
        int n = a.length;
        for(int i = 0 ; i< n-1;i++)
        {
            int min_index = i;
            //find minimum value in remaining array
            for(int j = i+1;j<n;j++)
            {
                if(a[j]<a[min_index])
                {
                    min_index = j;
                }
            }
            //swap current element and minimum element,
            //a[min_index],a[i]
            int temp = a[i];
            a[i] = a[min_index];
            a[min_index] = temp;
        }
    }
    static void main(String[] args) {
        int a[] = {1,5,2,9,3};
        selectionSort(a);
        for(int i :a)
        {
            System.out.print(i+" ");
        }
    }
}
// space complexity = O(1)
// time compelxity = O(n^2)
// selection sort stable nahi hai
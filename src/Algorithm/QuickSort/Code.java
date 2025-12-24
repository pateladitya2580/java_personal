package Algorithm.QuickSort;
public class Code {
    static void print(int []a)
    {
        for(int i : a)
        {
            System.out.print(i+" ");
        }
    }
    static void swap(int []a,int str, int ptIndex)
    {
        int temp = a[str];
        a[str] = a[ptIndex];
        a[ptIndex] = temp;
    }
    static  int findPtIndex(int []a,int str,int end)
    {
        int pivot = a[str];
        int count = 0;
        for(int i = str+1;i<=end;i++)
        {
            if(a[i]<=pivot) count++;
        }
        int ptIndex = str + count;// simple formula hai
        swap(a,str,ptIndex);
        int i = str, j = end;
        while (i<=ptIndex && j>ptIndex)
        {
            while (a[i]<pivot) i++;
            while (a[j]>pivot) j--;
            if(i<=ptIndex && j>ptIndex)
            {
                swap(a,i,j);
                i++;
                j--;
            }
        }
        return ptIndex;
    }
    static void quickSort(int a[], int str,int end)
    {
        if(str >= end) return;
        int pi = findPtIndex(a,str,end);
        quickSort(a,str,pi-1);
        quickSort(a,pi+1,end);
    }
    static void main(String[] args) {
        int[]a = {6,6,3,1,5,5,4};
        int n = a.length;
        System.out.println("Array before sorting");
        print(a);
        System.out.println();
        System.out.println("Array after sorting");
        quickSort(a,0,n-1);
        print(a);
    }
}

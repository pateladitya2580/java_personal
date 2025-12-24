package Algorithm.MergeSort;
public class Code {
    static void print(int []a)
    {
        int n = a.length;
        for(int i:a)
        {
            System.out.print(i+" ");
        }
        System.out.println();
    }
    static void merge(int []a,int l ,int mid ,int r)
    {
        int n1 = mid-l+1;// formula hai
        int n2 = r-mid;
        int []left = new int[n1];
        int []right = new int [n2];
        int i , j ,k;
        for( i = 0 ; i< n1; i++) left[i] = a[l+i];
        for( j = 0;j< n2; j++) right[j]= a[mid+1+j];
        i = 0;
        j = 0;
        k = l;
        while(i<n1&&j<n2)
        {
            if(left[i]<right[j])
            {
                a[k++] = left[i++];
            }
            else
            {
                a[k++] = right[j++];
            }
        }
        while (i<n1)
        {
            a[k++] = left[i++];
        }
        while(j<n2)
        {
            a[k++] = right[j++];
        }

    }
    static void mergeSort(int []a,int l ,int r)
    {
        if(l>=r) return;

        int mid = (l+r)/2;
        mergeSort(a,l,mid);
        mergeSort(a,mid+1,r);
        merge(a,l,mid,r);
    }
    static void main(String[] args) {
        int []a = { 8,3,5,1,9,4};
        int n = a.length;
        System.out.println("Array before sorting ");
        print(a);
        mergeSort(a,0,n-1);
        System.out.println("Array after sorting");
        print(a);
    }
}

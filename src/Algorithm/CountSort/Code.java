package Algorithm.CountSort;
public class Code {
    static void print(int []a)
    {
        for(int i : a)
        {
            System.out.print(i+" ");
        }
        System.out.println();
    }
    static int max(int []a)
    {
        int n = a.length;
        int b = Integer.MIN_VALUE;
        for(int i = 0 ; i<n;i++)
        {
            if(b<a[i])
            {
                b = a[i];
            }
        }
        return b;
    }
    static void countSort(int a[])
    {
        int output[] = new  int[a.length];
        int max = max(a);
        int []freArray = new int[max +1];
        for(int i = 0 ; i < a.length;i++)
        {
            freArray[a[i]]++;
        }
        // ham prefix sum array banaye ge kyo usse position milti hai
        // index = position -1
        for (int i = 1 ; i< freArray.length;i++)
        {
            freArray[i] += freArray[i-1];
        }
        int k = 0;
        for(int i = a.length-1; i>=0; i--)
        {
            int index = freArray[a[i]] - 1;
            output[index] = a[i];
            freArray[a[i]]--;
        }
        for(int i = 0 ; i  < a.length;i++)
        {
            a[i] = output[i];
        }

    }
    static void main(String[] args) {
        int[] arr = {1,4,5,2,2,5};
        System.out.println("Array before");
        print(arr);
        countSort(arr);
        System.out.println("Array after ");
        print(arr);
    }
}

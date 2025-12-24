package Algorithm.RadixSort;

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
    static void countSort(int a[],int place)
    {
        int output[] = new  int[a.length];
        int []freArray = new int[10];
        for(int i = 0 ; i < a.length;i++)
        {
            freArray[(a[i]/place)%10]++;
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
            int index = freArray[(a[i]/place)%10] - 1;
            output[index] = a[i];
            freArray[(a[i]/place)%10]--;
        }
        for(int i = 0 ; i  < a.length;i++)
        {
            a[i] = output[i];
        }
    }
    static void radixSort(int []a)
    {
        int max = max(a);
        for(int place = 1;max/place>0;place *=10)
        {
            countSort(a,place);
        }
    }
    static void main(String[] args) {
        int []arr = {43,453,626,894,8,3};
        radixSort(arr);
        print(arr);
    }
}

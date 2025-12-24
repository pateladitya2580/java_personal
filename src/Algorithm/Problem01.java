package Algorithm;
/*
Given an array where all its elements are sorted in increasing order except
two swapped elements , sort it in linear time.Assume there are no duplicate in
the array;
input ~ a[] = [3,8,6,7,5,9,10]
output ~ a[] = [3,5,6,7,8,9,10]
*/
public class Problem01 {
    static void print(int []arr)
    {
         for(int i: arr)
         {
             System.out.print(i+" ");
         }
        System.out.println();
    }
    static void sort(int a[])
    {
        int n = a.length;
        int x = -1,y = -1;

        if(n<=1) return;// corner case,edge case

        for(int i = 1 ; i<n;i++)
        {
            if(a[i-1]>a[i])
            {
                if(x == -1)
                {
                    x = i-1;
                    y = i;
                }
                else
                {
                    y = i;
                }
            }
        }
        int temp = a[x];
        a[x] = a[y];
        a[y]  = temp;
    }
    static void main(String[] args) {
        int []a = {3,8,6,7,5,9,10};
        sort(a);
        print(a);
    }
}

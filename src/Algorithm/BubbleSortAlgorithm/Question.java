package Algorithm.BubbleSortAlgorithm;

public class Question {
    static void sort(int []a)
    {
        int n = a.length;
        for(int i = 0 ; i< n-1; i ++)
        {
            for(int j = 0  ; j < n - i-1; j++)
            {
                if(a[j]==0 && a[j+1] != 0)
                {
                    int temp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = temp;
                }
            }
        }
    }
    static void main(String[] args) {
        int a [] = {0,5,0,3,4,2};
        sort(a);
        for(int i : a)
        {
            System.out.print(i+" ");
        }
    }
}

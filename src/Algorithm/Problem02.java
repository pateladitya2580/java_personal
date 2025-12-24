package Algorithm;
/*
Given an array of positive and negative integers, segregate them in linear
time and constant space.The output should print all negative number,followed
by all positive numbers.

input ~ [19,-20,7,-4,-13,11,-5,3]
output ~ [-20,-4,-13,-5,7,11,19,3]
 */
public class Problem02 {
    static void print(int []a)
    {
        for(int i = 0 ; i<a.length;i++)
        {
            System.out.print(a[i]+" ");
        }
        System.out.println();
    }
    static void sort(int []a , int str,int end)
    {
        int n = a.length;
        while(str<end)
        {
            while (a[str]<0) str++;
            while (a[end]>=0) end--;
            if (str<end)
            {
                int temp = a[str];
                a[str] = a[end];
                a[end] = temp;
                str++;
                end--;
            }
        }
    }
    static void main(String[] args) {
        int a[] = {19,-20,7,-4,-13,11,-5,3};
        sort(a,0,a.length-1);
        print(a);
    }
}

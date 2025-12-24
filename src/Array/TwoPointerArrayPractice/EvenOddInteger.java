package Array.TwoPointerArrayPractice;
/*
given an array of integers "a" , move all the even integers at the
beginning of the array followed by all the odd integers . The releative
order of odd even integers does not matter.Return
any array that satisfies the condition.
 */
public class EvenOddInteger {
    static int []evenodd(int[]arr)
    {
       int n = arr.length;
       int i = 0,j = n-1;
       while (j>i)
       {
           if (arr[i]%2==1 && arr[j]%2==0)
           {
               int temp = arr[i];
               arr[i] = arr[j];
               arr[j] = temp;
               i++;
               j--;
           }
           if(arr[i]%2==0)
           {
               i++;
           }
           if(arr[j]%2==1)
           {
               j--;
           }
       }
        return arr;
    }
    static void print(int []arr)
    {
     for(int i = 0 ; i < arr.length;i++)
     {
         System.out.print(arr[i]+" ");
     }
    }
    static void main(String[] args) {
        int []brr = {1,3,4,5,6,8};
        evenodd(brr);
        print(brr);
    }
}

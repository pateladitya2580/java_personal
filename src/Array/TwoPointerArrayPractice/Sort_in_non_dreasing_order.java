package Array.TwoPointerArrayPractice;
/*
given an integer array "a" sorted in non-decreasing
order return an array of the squares of each
number sorted in non dereasing order;
int []arr = {-10,-3,-2,1,4,5}
 */
public class Sort_in_non_dreasing_order {
    static int []sort (int []arr)
    {
        int []ans = new int[arr.length];
        int i = 0;
        int n = arr.length;
        int j = n- 1;
        int k = 0;
        while(j>i)
        {
            if(arr[i]*arr[i]>arr[j]*arr[j])
            {
                ans[k] = arr[i]*arr[i];
                k++;
                i++;
            }
            if(arr[i]*arr[i]<arr[j]*arr[j])
            {
                ans[k] = arr[j]*arr[j];
                k++;
                j--;
            }
        }
        return ans;
    }
    static int [] revese (int []arr)
    {
        int n = arr.length;
        int []brr = new int[n];
        int l = 0;
        for(int i = n-1 ; i >=0;i--)
        {
            brr[l] = arr[i];
            l++;
        }
        return brr;
    }
    static void print(int[]brr)
    {
     for (int i = 0 ; i < brr.length;i++)
     {
         System.out.print(brr[i]+" ");
     }
    }
    static void main(String[] args) {
        int []crr = {-10,-3,-2,1,4,5};
        int []drr = sort(crr);
         int []err =revese(drr);
        print(err);
    }
}

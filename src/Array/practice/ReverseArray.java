package Array.practice;
import java.util.Scanner;
public class ReverseArray {
    static int[] reverse(int []arr)
    {
     int n = arr.length;
     int j = 0;
     int []ans = new int[n];
     for(int i = arr.length-1;i>=0;i--)
     {
             ans[j] = arr[i];
             j++;
     }
     return ans;
    }
    static void main(String[] args) {
        int []brr = {1,2,3,4,5,6,7};
        int []crr = reverse(brr);
        for(int i = 0 ;i<crr.length;i++)
        {
            System.out.print(crr[i]+" ");
        }

    }
}

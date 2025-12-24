package Array.practice;

public class ReverseArray_with_Swap {
    static int [] reverse(int []arr)
    {
        for(int i = 0,j = arr.length-1;i<j;j--,i++)
        {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
        return arr;
    }
    static void main(String[] args) {
        int []brr = {1,2,3,4,5,6,7};
        int []crr = reverse(brr);
        for(int i = 0 ; i < crr.length;i++)
        {
            System.out.print(crr[i]+" ");
        }
    }
}

package Array.practice;
import java.util.Scanner;//second maximum
public class ArrayManipulation2 {
    static int maximum(int[]arr){
        int  p = arr[0];
        for(int i = 0;i < arr.length;i++)
        {
            if( p < arr[i])
            {
                p = arr[i];
            }
        }
        return p;
    }
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in );
        System.out.println("Enter the size of array ");
        int size = sc.nextInt();
        int []brr = new int[size];
        System.out.println("Enter the element of array");
        for(int i = 0 ; i < brr.length;i++)
        {
            brr[i] = sc.nextInt();
        }
        int max = maximum(brr);
        for(int i = 0 ; i < brr.length;i++)
        {
            if(brr[i] == max)
            {
                brr[i] = Integer.MIN_VALUE;
            }
        }
        System.out.println("The second maximum is "+maximum(brr));
    }
}

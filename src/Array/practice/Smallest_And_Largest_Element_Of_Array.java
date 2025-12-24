package Array.practice;
import java.util.Arrays;
import java.util.Scanner;
public class Smallest_And_Largest_Element_Of_Array {
    static int[] smallestLargest(int []arr)
    {
        Arrays.sort(arr);
        int []ans = { arr[0],arr[arr.length-1]};
        return ans;
    }
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int size = sc.nextInt();
        int []brr = new int[size];
        for(int i = 0 ; i < brr.length;i++)
        {
            brr[i] = sc.nextInt();
        }
        int[]crr = smallestLargest(brr);
        System.out.println("smallest element "+crr[0]);
        System.out.println("Largest element "+crr[1]);

    }
}

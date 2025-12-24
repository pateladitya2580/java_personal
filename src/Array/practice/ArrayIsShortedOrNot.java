package Array.practice;
import java.util.Scanner;
public class ArrayIsShortedOrNot {
    static boolean isShorted(int[]arr)
    {
        boolean check = true;
        for (int i = 1; i < arr.length;i++)
        {
            if (arr[i] < arr[i-1]) {
                check = false;
                break;
            }
        }
        return check;
    }
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int size = sc.nextInt();
        int []arr = new int[size];
        for(int i = 0 ; i < arr.length;i++)
        {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter array is shorted "+isShorted(arr));

    }
}

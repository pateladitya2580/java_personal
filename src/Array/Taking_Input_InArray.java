package Array;
import java.util.Scanner;
public class Taking_Input_InArray {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array ");
        int n = sc.nextInt();
        int [] arr = new int[n];
        System.out.println("Enter the elements of array ");
        for(int i = 0 ; i < arr.length;i++)
        {
            arr[i] = sc.nextInt();
        }
        System.out.println("The size is "+n+" The elements are");
        for(int i = 0 ; i < arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }

    }
}

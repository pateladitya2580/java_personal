package Array.TwoDimensional_Array;
import java.util.Scanner;  // []arr ya arr[] dono tarah se declare kar sakte hai
public class AdditionOfTwoMatrix {
    static void printArray(int [][]arr)
    {
        for(int i = 0 ; i<arr.length;i++)
        {
            for(int j = 0 ; j<arr[i].length;j++)
            {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
    static void add(int [][]arr, int r1,int c1,int [][]brr,int r2 ,int c2)
    {
        if(r1 != r2 || c1 != c2)
        {
            System.out.println("Invalid input");
        }
        else
        {
            int [][]sum = new int[r1][c1];
            for(int i = 0 ; i< r1;i++)
            {
                for(int j = 0 ; j < c1;j++)
                {
                    sum[i][j] = arr[i][j] + brr[i][j];
                }
            }
            printArray(sum);
        }
    }
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the first row");
        int r1 = sc.nextInt();
        System.out.println("enter the second colum ");
        int c1 = sc.nextInt();
        System.out.println("enter the first matrix");
        int a[][] = new int[r1][c1];
        for(int i = 0 ; i < a.length;i++)
        {
            for(int j = 0 ; j < a[i].length;j++)
            {
                a[i][j] =sc.nextInt();
            }
        }
        System.out.println("Second matrix");
        System.out.println("enter the first row");
        int r2 = sc.nextInt();
        System.out.println("enter the second colum ");
        int c2 = sc.nextInt();
        System.out.println("enter the second matrix");
        int b[][] = new int[r2][c2];
        for(int i = 0 ; i < b.length;i++)
        {
            for(int j = 0 ; j < b[i].length;j++)
            {
                b[i][j] =sc.nextInt();
            }
        }
        add(a,r1,c1,b,r2,c2);
    }
}

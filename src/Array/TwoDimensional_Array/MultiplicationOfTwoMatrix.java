package Array.TwoDimensional_Array;
import java.util.Scanner;
public class MultiplicationOfTwoMatrix {
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
    static void product(int [][]arr,int r1,int c1,int[][]brr,int r2,int c2)
    {
        if(c1 != r2)
        {
            System.out.println("These matrix can not multiply");
        }
        int [][]product = new int[r1][c2];
        for(int i = 0 ; i < r1;i++)
        {
            for(int j = 0 ;j<c2;j++)
            {
                for(int k = 0 ; k< r2;k++)
                {
                    product[i][j] += arr[i][k]*brr[k][j];
                }
            }
        }
        printArray(product);
    }
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the first row index no.");
        int r1 = sc.nextInt();
        System.out.println("enter the second colum index no. ");
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
        System.out.println("enter the first row index no.");
        int r2 = sc.nextInt();
        System.out.println("enter the second colum index no.");
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
        product(a,r1,c1,b,r2,c2);
    }
}

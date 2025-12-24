package Array.TwoDimensional_Array;

import java.util.Scanner;

public class TransposeBySwap {
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
    static void transPoseBySwap(int [][]arr,int r1,int c1)
    {
        for(int i = 0 ; i < r1;i++)
        {
            for(int j = i+1 ; j <c1 ;j++)
            {
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }
        printArray(arr);
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
        System.out.println("The transpose of given matrix is ");
        transPoseBySwap(a,r1,c1);
    }
}

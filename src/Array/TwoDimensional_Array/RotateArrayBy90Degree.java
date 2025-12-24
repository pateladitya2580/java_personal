package Array.TwoDimensional_Array;
import java.util.Scanner;
/*
give a square matrix, turn it by 90 degree in a clockwise direction without
using any extra space.
1 2 3   7 4 1
4 5 6 = 8 5 2
7 8 9   9 6 3
 */
public class RotateArrayBy90Degree {
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
    static void reverse(int []arr)
    {
        int n = arr.length;
        int i = 0;
        int j = n-1;
        while(j>i)
        {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }
    static void rotationBy90Degree(int [][]arr,int r1,int c1)
    {
        if (r1 != c1) {
            System.out.println("Cannot rotate in-place: matrix is not square.");
            return;
        }
        int n = r1;
        for(int i = 0 ; i < n;i++)
        {
            for(int j = i+1 ; j <n ;j++)
            {
                int temp = arr[i][j];     //1 4 7
                arr[i][j] = arr[j][i];    //2 5 8
                arr[j][i] = temp;         //3 6 9
            }
        }
        // yaha tak transpose ho gaya
        // phir har row ko reverse kar diya
        for(int i = 0 ; i < n;i++)
        {
            reverse(arr[i]);
        }
        printArray(arr);
    }
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter rows and cols (square matrix):");
        int r1 = sc.nextInt();
        int c1 = sc.nextInt();
        System.out.println("Enter matrix elements row-wise:");
        int [][]a = new int[r1][c1];
        for(int i = 0 ; i < a.length;i++)
        {
            for(int j = 0 ; j < a[i].length;j++)
            {
                a[i][j] =sc.nextInt();
            }
        }
        System.out.println("Matrix after 90-degree clockwise rotation: ");
        rotationBy90Degree(a,r1,c1);
    }
}

package Array.TwoDimensional_Array;

import java.util.Scanner;

/*
given a positive integer n, generate an n x n matrix filled with elements from
1 to n^2 in spiral order
input 3
output
1 2 3
8 9 4
7 6 5

 */
public class SpiralQuestion2 {
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
    static int[][] sprilPrint( int n)
    {
        int toprow = 0, bottomrow = n-1, leftcoloum =0,rightcolum = n-1;
        int count = 1;
        int [][]arr = new int[n][n];
        int totalCount = 0;
        while (totalCount<n*n)
        {
            // toprow = lc to rc
            for(int j = leftcoloum; j<=rightcolum &&  totalCount< n*n;j++)
            {
                arr[toprow][j] = count;//1
                count++;
                totalCount++;
            }
            toprow++;
            //right coloum = tr to br
            for(int i = toprow;i<=bottomrow && totalCount < n*n;i++ )
            {
                arr[i][rightcolum]= count;
                count++;
                totalCount++;
            }
            rightcolum--;
            //bottom row = rc to lc
            for(int j = rightcolum;j>=leftcoloum && totalCount < n*n ; j--)
            {
                arr[bottomrow][j] = count;
                count++;
                totalCount++;
            }
            bottomrow--;
            //left coloum = br to tr
            for(int i = bottomrow;i>=toprow && totalCount < n*n ; i--)
            {
                arr[i][leftcoloum] = count;
                count++;
                totalCount++;
            }
            leftcoloum++;
        }
        return arr;
    }
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of  n ");
        int n = sc.nextInt();
        System.out.println("Output matrix is ");
         int [][]a =sprilPrint(n);
         printArray(a);
    }
}

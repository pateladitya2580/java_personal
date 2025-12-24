package Array.TwoDimensional_Array;
import java.util.Scanner;
public class TransposeOfMatrix {
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
    static int[][]findTranspose(int [][]arr,int r,int c)
    {
        int ans[][] = new int[c][r];
        for(int i = 0 ; i<arr.length;i++)
        {
            for(int j = 0 ; j < arr[i].length;j++)
            {
                ans[i][j] = arr[j][i];
            }
        }
        return ans;
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
        int ans[][] = findTranspose(a,r1,c1);
        printArray(ans);
    }
}

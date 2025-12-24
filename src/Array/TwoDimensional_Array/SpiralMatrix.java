package Array.TwoDimensional_Array;
import java.util.Scanner;
/*
given an n x m matrix "a" . return all elements of the mateix in  spiral order;
1 2 3
4 5 6
7 8 9
ans =  1 2 3 6 9 8 7 4 5
 */
public class SpiralMatrix {
    static void spiralMatrix(int[][]arr, int r , int c )
    {
        int toprow = 0, bottomrow = r-1, leftcoloum =0,rightcolum = c-1;
        int totalElement = 0;
        while (totalElement < r*c )
        {
            //top row = lc to rc
            for(int j = leftcoloum ; j <= rightcolum && totalElement < r*c;j++)
            {
                System.out.print(arr[toprow][j]+" ");
                totalElement++;
            }
            toprow++;
            //right coloum  = tr to br
            for(int i = toprow ; i <= bottomrow && totalElement < r*c;i++)
            {
                System.out.print(arr[i][rightcolum]+" ");
                totalElement++;
            }
            rightcolum--;
            //bottom row = rc to lc
            for (int j =rightcolum ; j >=leftcoloum && totalElement < r*c; j--)
            {
                System.out.print(arr[bottomrow][j]+" ");
                totalElement++;
            }
            bottomrow--;
            //left coloum = br to tr
            for(int i = bottomrow;i>=toprow && totalElement < r*c;i--)
            {
                System.out.print(arr[i][leftcoloum]+" ");
                totalElement++;
            }
            leftcoloum++;
        }
    }
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" Enter the row and coloum of matrix");
        int r = sc.nextInt();
        int c = sc.nextInt();
        System.out.println("Enter the element of matrix ");
        int [][]arr = new int[r][c];
        for(int i = 0 ; i < r; i ++)
        {
            for(int j = 0 ;j< c; j++)
            {
                arr[i][j] = sc.nextInt();
            }
        }
        spiralMatrix(arr,r,c);
    }
}

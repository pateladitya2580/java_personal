package Array.TwoDimensional_Array;
import java.util.Scanner;
/*
given a matrix "a" of dimension n x m and 2 coordinates (l1,r1)and (l2,r2)
.Return the sum of the rectangle from (l1,r1)to(l2,r2)
Hint
yadi aap array ka prefix sum nikalte fo row wise phir uska coloum wise then phir j0 bhi rectangle ka sum chaiye for
Example
cordinate (1,1) se wo cordinate ka sum jaha tak chaiye (l2,r2)
 */
public class PrefixSum2DArray {
    static void prefixSum(int[][]arr)
    {
        int row = arr.length;
        int colum = arr[0].length;
        //Row wise
        for(int i = 0 ; i< row;i++)
        {
            for(int j = 1 ; j< colum;j++)
            {
                arr[i][j] = arr[i][j-1] + arr[i][j];
            }
        }
        //Coloum wise
        for(int j = 0 ;j<colum;j++)
        {
            for(int i = 1; i<row;i++)
            {
                arr[i][j] = arr[i-1][j]+arr[i][j];
            }
        }
    }
    static int printSum(int [][]arr,int l1,int r1,int l2,int r2)
    {
        int sum = 0 ,ans = 0 ,up = 0, left = 0,leftup = 0;
        prefixSum(arr);
        sum = arr[l2][r2];
        if(r1 >= 1)
        {
            left = arr[l2][r1-1];
        }
        if(l1 >= 1)
        {
            up = arr[l1-1][r2];
        }
        if(l1>=1&&r1>=1)
        {
            leftup = arr[l1-1][r1-1];
        }
        ans = sum - up -left+ leftup;
        return ans;
    }
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the row and coloum");
        int r = sc.nextInt();
        int c = sc.nextInt();
        int a[][] = new int[r][c];
        System.out.println("Enter the elements of array");
        for(int i = 0;i<r;i++)
        {
            for(int j = 0 ; j<c;j++)
            {
                a[i][j] = sc.nextInt();
            }
        }
        System.out.println("Ente the cordinates l1,r1,l2,r2");
        int l1 = sc.nextInt();
        int r1 = sc.nextInt();
        int l2 = sc.nextInt();
        int r2 = sc.nextInt();
        System.out.println("The rectangle sum is "+printSum(a,l1,r1,l2,r2));
    }
}
/*
arr.length → total rows

arr[0].length → total columns

arr[i].length → i-th row ke columns (changes with i)

Prefix sum logic needs consistent fixed number of columns →
Therefore: arr[0].length is correct.
 */
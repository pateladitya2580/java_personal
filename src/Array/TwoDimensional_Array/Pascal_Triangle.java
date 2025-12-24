package Array.TwoDimensional_Array;
/*
guven an integer n,  return the first n rows of Pascals trianglr
.IN Pascal triangle, each number is the sum of the two numbers derectly above it
as shown;
1
1 1
1 2 1
1 3 3 1
1 4 6 4 1
 */
import java.util.Scanner;
public class Pascal_Triangle {
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
    static int[][] pascal(int n)
    {
        int [][]ans = new int[n][];
        // Jagged array = 2D array jisme rows ka size alag-alag hota hai. matlab row define hai par colum nahi hai
        for(int i = 0 ; i < n;i++)
        {
            // ans[i] array me i+1 colum bana rahe hai
            ans[i] = new int[i+1];
            ans[i][0] = 1;
            ans[i][i] = 1;
            for(int j = 1;j < i ; j++)
            {
                ans[i][j] = ans[i-1][j]+ans[i-1][j-1];
            }
        }
        return ans;
    }
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n ");
        int n = sc.nextInt();
        int ans[][] = pascal(n);
        printArray(ans);
    }
}

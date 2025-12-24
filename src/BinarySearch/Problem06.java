package BinarySearch;
/*
search the target value in a 2d integer matrix of dimension n x m and return
true if found ,else return false.
This matrix has the following properties;
1. Integers in each row are sorted from left to right
2. The first integer of each row is greater than the last integer of the previous row.
input
matrix = [[13,5,7],[10,11,16,20],[23,30,34,60]],target = 16
output
true

yaha ham mid index ko two D index me convert kar rahe hai , phle divide phir remainder ,no
of coloums se yani m.
is me ham 2d matrix ko ek 1d array me likh rahe hai to sorted array mil raha hai
 */
import java.util.Scanner;
public class Problem06 {
    static boolean search(int[][]a,int target)
    {
        //n is no of row , m is no of coloum
        int n = a.length;
        int m = a[0].length;
        int str = 0 , end = n*m-1;
        while (str<=end)
        {
            int mid = str + (end -str)/2;
            int midValue = a[mid/m][mid%m];
            if(midValue == target) return true;
            else if (target >midValue) str = mid+1;
            else end = mid-1;
        }
        return false;
    }
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [][]a = new int[3][4];
        for(int i = 0; i < 3;i++)
        {
            for (int j = 0;j<4;j++)
            {
                a[i][j] = sc.nextInt();
            }
        }
        System.out.println("Ans is "+search(a,16));
    }
}

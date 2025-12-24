package Array.practice;
import java.util.Scanner;
public class Total_No_Of_Triplet_That_Sum_Equal_To_X {
    static int totalPair(int[]arr,int x)
    {
        int p = 0 ;
        for(int i =0 ; i < arr.length;i++)
        {
            for(int j = i+1; j < arr.length;j++)
            {
                for(int k = j+1;k< arr.length;k++)
                {
                    if(arr[i]+arr[j]+arr[k] == x)
                    {
                        p++;
                    }
                }
            }
        }
        return p;
    }
    static void main(String[] args) {
        Scanner sc = new Scanner(System .in);
        System.out.println("Enter the size of array");
        int n = sc.nextInt();
        int []brr = new int[n];
        System.out.println("Enter the array");
        for(int i = 0 ; i<brr.length;i++)
        {
            brr[i] = sc.nextInt();
        }
        System.out.println("Enter the no. that you want sum of to element ");
        int num = sc.nextInt();
        int a = totalPair(brr,num);
        System.out.println("Total no. of triplet "+a+" that's sum equal to "+num);
    }
}

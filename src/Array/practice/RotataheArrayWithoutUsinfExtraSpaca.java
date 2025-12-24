package Array.practice;

import java.util.Scanner;

public class RotataheArrayWithoutUsinfExtraSpaca {
    static int[] reverse(int []arr,int i,int j) {
        while ( j>i ) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            j--;
            i++;
        }
        return arr;
    }
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int size = sc.nextInt();
        int []brr = new int[size];
        System.out.println("Enter the element of array");
        for(int j = 0; j < brr.length;j++)
        {
            brr[j] = sc.nextInt();
        }
        System.out.println("Enter the vlaue of k ");
        int k = sc.nextInt();
        int n = brr.length;
        reverse(brr,0,n-k-1);
        reverse(brr,n-k,n-1);
        int []crr=reverse(brr,0,n-1);

        for(int i =0 ;i < brr.length;i++)
        {
            System.out.print(crr[i]+" ");
        }

    }
}
/*
rotate the given 'a' by steps,where k is non negative.
k can be greater than n as well
ex
k = 0
1 2 3 4 5
k =1
2 3 4 5 1
 */
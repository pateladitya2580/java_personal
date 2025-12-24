package Array.practice;
import java.util.Scanner;
public class FrequenyArrayConcept {
    static int[] makeFrequencyArray(int []arr)
    {
        int n = arr.length;
        int []frequency = new int[100005];
        for (int i = 0 ;i<arr.length;i++)
        {
            frequency[arr[i]]++;
        }
        return frequency;
    }
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int size = sc.nextInt();
        int []brr = new int[size];
        System.out.println("Enter the element of array");
        for(int i = 0 ; i< brr.length;i++)
        {
            brr[i] = sc.nextInt();
        }
        System.out.println("Enter the no. of queries");
        int q = sc.nextInt();
        int []freq = makeFrequencyArray(brr);
        while (q>0)
        {
            System.out.println("Enter the no. that you search ");
            int p = sc.nextInt();
            if(freq[p]>0)
            {
                System.out.println("No. is present");
            }
            else
            {
                System.out.println("NO . is not present");
            }
            q--;
        }
    }
}

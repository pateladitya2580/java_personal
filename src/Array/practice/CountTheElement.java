package Array.practice;
import java.util.Scanner;
public class CountTheElement {
    static void lastOccurance (int []arr,int x)
    {
        int p = -1;
        for(int i = 0 ; i<arr.length;i++)
        {
            if ( arr[i]== x)
            {
                p = i;
            }
        }
        System.out.println("The last occurance index no." +x+ "is" +p);
    }
    static void count (int[]arr,int x)
    {
        int y = 0;
        for (int i = 0 ; i < arr.length;i++)
        {
            if(arr[i]==x)
            {
                y++;
            }
        }
        System.out.println("The occurance of the element" +x+ " are " + y);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int []arr = new int[5];
        System.out.println("Enter the 5 elements of array ");
        for (int i = 0 ; i < arr.length;i++)
        {
            arr[i] = sc . nextInt();
        }
        System.out.println("Enter the element the you count");
        int a = sc.nextInt();
        count(arr,a);
        lastOccurance(arr,a);

    }
}
// void se method me return nahi hota kuch
// static se fum direct method ko use kar sakte hai bina object ke
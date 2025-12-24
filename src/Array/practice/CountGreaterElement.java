package Array.practice;

import java.util.Scanner;

public class CountGreaterElement {
    static void strightlyGreaterNoCount(int[] arr, int x) {
        int p = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > x) {
                p++;
            }
        }
        System.out.println("Tota no that is  greater than  "+x+" is "+p);
    }

    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter the element of array ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("enter the element that you cont ,greater element ");
        int y = sc.nextInt();
        strightlyGreaterNoCount(arr, y);

    }
}

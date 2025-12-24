package Starting_Program;

import java.util.Scanner;
public class SumOfTwo {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first no.");
        int num1 = sc.nextInt();

        System.out.println("Enter the second no.");
        int num2 = sc.nextInt();

        int sum = num1 + num2;
        System.out.println("The sum is "+sum);



    }
}

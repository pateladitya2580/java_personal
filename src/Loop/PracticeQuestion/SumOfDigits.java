package Loop.PracticeQuestion;

import java.util.Scanner;
public class SumOfDigits {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int sum = 0;
        while(num != 0)
        {
            int x = num%10;
            num = num/10;
            sum += x;
        }
        System.out.println(sum);

    }
}

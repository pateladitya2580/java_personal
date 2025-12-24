package Loop.PracticeQuestion;

import java.util.Scanner;

public class ReverseDigits {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        while(num != 0)
        {
            int x = num%10;
            num = num/10;
            System.out.print(x);
        }

    }
}

package Loop.PracticeQuestion;
import java.util.Scanner;
public class PowerFuntion {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the base");
        int base = sc.nextInt();
        System.out.println("The power is ");
        int power = sc.nextInt();
        int product = 1;
        for(int i = 1; i <= power;i++)
        {
            product *= base;
        }
        System.out.println("The power is "+product);

    }
}

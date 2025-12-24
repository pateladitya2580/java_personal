package Loop;
import java.util.Scanner;
public class While_Loop_Print_Number {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int num1 = 1;
        while(num1<=num)
        {
            System.out.println(num1);
            num1++;
        }

    }
}

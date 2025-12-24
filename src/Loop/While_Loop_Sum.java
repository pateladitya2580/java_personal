package Loop;
import java.util.Scanner;
public class While_Loop_Sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int sum = 0;
        int num1 = 1;
        while (num1 <= num) {
            sum = sum + num1;
            num1++;
        }
        System.out.println(sum);
    }
}

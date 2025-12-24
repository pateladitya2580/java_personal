package Loop.PracticeQuestion;
import java.util.Scanner;
public class CountNumDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int cout = 0;
        while(num != 0)
        {
            num = num/10;
            cout++;

        }
        System.out.println(cout);

    }
}

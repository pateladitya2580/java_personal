package Loop.PracticeQuestion;
import java.util.Scanner;
public class Factorial {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int factorial = 1;
        for(int i = 1 ;i<=num;i++)
        {
            factorial *= i;
        }
        System.out.println("The factorial is " +factorial);
    }

    public static class Pattern {
        static void main(String[] args) {
            for(int i = 1;i<=4;i++)
            {
                for(int j = 1;j<=6;j++)
                {
                    if((i+j)%2==0)
                    {
                        System.out.print(1);
                    } else if ((i+j)%3==0) {
                        System.out.print(2);
                    }
                }
                System.out.println();
            }
        }
    }
}

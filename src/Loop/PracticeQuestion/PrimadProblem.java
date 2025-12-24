package Loop.PracticeQuestion;
import java.util.Scanner;
public class PrimadProblem {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the row");
        int row = sc.nextInt();
        System.out.println("enter the colum");
        int coloum = sc.nextInt();
        for(int i = 1;i<= row ;i++)
        {
            for(int j = 1;j<=row-i;j++)
            {
                System.out.print(" ");
            }
            for(int j = 1;j<=(2*i-1);j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
//enter the row
//4
//enter the colum
//7
//        *
//       ***
//      *****
//     *******

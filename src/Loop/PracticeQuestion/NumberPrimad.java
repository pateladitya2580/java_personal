package Loop.PracticeQuestion;

public class NumberPrimad {
    static void main(String[] args) {
        for(int i = 1; i <= 4;i++)
        {
            for(int l = 1;l <=4-i;l++)
            {
                System.out.print(" ");
            }
            for(int j = 1 ;j<=i;j++)
            {
                System.out.print(j);
            }
            for(int k = (i-1);k >= 1;k--)
            {
                System.out.print(k);
            }
            System.out.println();
        }
    }
}
//   1
//  121
// 12321
//1234321

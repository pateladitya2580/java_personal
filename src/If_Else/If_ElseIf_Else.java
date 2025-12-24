package If_Else;

import java.util.Scanner;
public class If_ElseIf_Else {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if(num>18)
        {
            System.out.println("Adult");
        } else if (num < 18 && num >=12)
        {
            System.out.println("Teeneger");
        }
        else
        {
            System.out.println("Child");
        }

    }
}

package If_Else;

import java . util.Scanner;
public class Conditonal_If_Else {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
//        if(num % 2 == 0)
//        {
//            System.out.println("Even no.");
//        }
//        else
//        {
//            System.out.println("Odd no.");
//        }
        String ans ;
        ans = (num % 2 == 0)?"even":"odd";
        System.out.println(ans);

    }
}

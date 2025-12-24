package Starting_Program;

import java.util.Scanner;
public class TakingInput {
    static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        System.out.println("Enter you name");
        String name = sc.nextLine();
        System.out.println("The name is "+name);
        System.out.println(" enter your no.");
        int num = sc.nextInt();
        System.out.println("enter no . is "+num);

    }
}

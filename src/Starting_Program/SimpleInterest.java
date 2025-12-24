package Starting_Program;

import java.util.Scanner;
public class SimpleInterest {
    static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        System.out.println("Enter the principle ");
        float p = sc.nextFloat();
        System.out.println("Enter the rate");
        float r =sc.nextFloat();
        System.out.println("Enter the time");
        float t = sc.nextFloat();

        float si = (p*r*t)/100;
        System.out.println("The SI is "+si);

    }
}

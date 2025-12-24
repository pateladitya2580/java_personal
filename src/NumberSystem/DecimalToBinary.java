package NumberSystem;
import java.util.Scanner;
public class DecimalToBinary {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the decimal no.");
        int decimal = sc.nextInt();
        int ans = 0;
        int power = 1; //power of 10
        while (decimal > 0)
        {
            int parity = decimal%2;
            ans +=  parity * power;
            decimal = decimal/2;
            power *= 10;
        }
        System.out.println("The binary no. is "+ans);

    }
}

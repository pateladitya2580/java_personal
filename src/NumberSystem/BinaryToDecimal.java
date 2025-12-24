package NumberSystem;
import java.util.Scanner;
public class BinaryToDecimal {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the binary no.");
        int binary = sc.nextInt();
        int ans = 0;
        int power = 1; //power of 2
        while(binary > 0)
        {
            int unitDigit = binary%10 ;
            ans +=  unitDigit * power ;
            binary = binary/10;
            power *= 2;
        }
        System.out.println("Decimal value = "+ans);
    }
}

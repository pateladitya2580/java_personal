package Starting_Program;

import java.util.Scanner;
public class ReadChar {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the character ");
        char p = sc.next().charAt(0);
        System.out.println(p);
    }
}

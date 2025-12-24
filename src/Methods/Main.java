package Methods;
import java.util.Scanner;
class Algebra{
    int sum (int a,int b)
    {
     int ans = a + b;
     return ans;
    }

    int fact(int x)
    {
        int factorial = 1;
        int y = 1;
        for(int i = 1;i<=x;i++)
        {
             factorial *= i;
              y = factorial;
        }
        return y;
    }
}
public class Main {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the 1 no.");
        int num1 = sc.nextInt();
        System.out.println("enter the 2 no.");
        int num2 = sc.nextInt();
        Algebra object = new Algebra();
         int ans = object.sum(num1,num2);
        System.out.println("The sum is "+ans);
        int l = object.fact(num2);
        System.out.println("The factorial is "+l);
    }
}

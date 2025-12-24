package Loop;

public class BreakStatement {
    static void main(String[] args) {
     int num = 1;
     while(true)
     {
         if(num %5 ==0 && num %7 ==0)
         {
             System.out.println("The first multiple is "+num);
             break;
         }
         num++;
     }
    }
}
//break statement us loop ko wahi rok deta hai

package Loop;

public class ContinueStatement {
    static void main(String[] args) {
        for(int num = 1;num<= 50;num++)
        {
            if(num % 3 == 0)
            {
                continue;
            }
            System.out.println(num);
        }
    }
}
//contune us line of code ko skip kar deta hai
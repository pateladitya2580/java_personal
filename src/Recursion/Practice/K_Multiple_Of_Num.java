package Recursion.Practice;
public class K_Multiple_Of_Num {
    static void print(int num , int k)
    {
        if(k == 1)//k == 0 return;
        {
            System.out.println(num);
            return ;
        }
        print(num,k-1);
        System.out.println(num*k);
    }
    static void main(String[] args) {
        print(5,5);

    }
}

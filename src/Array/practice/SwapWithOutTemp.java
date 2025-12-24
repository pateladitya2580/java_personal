package Array.practice;

public class SwapWithOutTemp {
    static void swapwithTemp(int a , int b)
    {
        a = a+b;
        b = a-b;
        a = a-b;
        System.out.println("a :"+a);
        System.out.println("b :"+b);
    }

    static void main(String[] args) {
        int a = 9;
        int b = 3;
        swapwithTemp(a,b);
    }
}

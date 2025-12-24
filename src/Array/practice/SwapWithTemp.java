package Array.practice;

public class SwapWithTemp {
    static void swap(int a, int b)
    {
     int temp = a;
     a = b;
     b = temp;
     System.out.println("a :"+a);
     System.out.println("b :"+b);
    }
    static void main(String[] args) {
        int a = 9;
        int b = 3;
        swap(a,b);
    }
}

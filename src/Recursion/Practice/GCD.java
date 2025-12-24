package Recursion.Practice;

public class GCD {
    static int rGCD (int x,int y)
    {
        if(y==0) return x;
        return rGCD(y,x%y);
    }
    static void main(String[] args) {
        System.out.println("Ans "+rGCD(24,15));
    }
}
/*
Euclid's algo
GCD(x,y) = GCD(y,x%y)
GCD(x,0) = x
Agar tumhe GCD(x, y) nikalna hai:

Jab tak bada number chhote number se divide nahi hota,
bade number ko chhote number se replace karo,
aur chhote number ko remainder se replace karo.

🔁 Yeh process repeat hota rehta hai

Jab remainder 0 ho jaye →
Us time jo divisor bachta hai, wahi GCD hota hai.
 */
package Recursion.String;

import java.util.Scanner;

public class PallinByDifferentAproch {
    static boolean pallin (String a , int l ,int r)
    {
        if(l>=r) return true;
        return (a.charAt(l)==a.charAt(r) && pallin(a,l+1,r-1));
    }
    static void main(String[] args) {
        Scanner sc = new Scanner(System .in);
        System.out.println("Enter the string");
        String a = sc.nextLine();
        System.out.println(pallin(a,0,a.length()-1));
    }
}

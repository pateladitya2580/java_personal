package Recursion.String;

public class Pallindrome {
    static String reverse(String a , int idx)
    {
        if(idx == a.length()) return "";
        String smallAns = reverse(a,idx+1);
        String b = smallAns + a.charAt(idx);
        return b;
    }
    static String pallin(String a, String b )
    {
        if(a.equals(b)) return " yes it is pallindrome ";
        else return " not a pallindrome";
    }
    static void main(String[] args) {
        String a = "level";
        System.out.print(pallin(a,reverse(a,0)));
    }
}

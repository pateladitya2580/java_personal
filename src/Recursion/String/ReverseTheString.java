package Recursion.String;

public class ReverseTheString {
    static String reverse(String a , int idx)
    {
        if(idx == a.length()) return "";
        String smallAns = reverse(a,idx+1);
        return smallAns + a.charAt(idx);
    }
    static void main(String[] args) {
        String a = " aditya";
        System.out.println("Ans "+reverse(a,0));
    }
}
// input aditya
// output aytida
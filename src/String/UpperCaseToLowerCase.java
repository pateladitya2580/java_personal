package String;

import java.util.Scanner;

/*
Given a string, the task is to toggle all the characters of the string i.e
to convert upper case to lower case ans vice versa.
 */
public class UpperCaseToLowerCase {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder str = new StringBuilder(sc.nextLine());
        System.out.println(str);
        // toggle
        // PHysiCs -> phYSIcS
        for( int i = 0 ;i<= str.length()-1;i++)
        {
            char ch = str.charAt(i);
            int asci = (int)ch;
            if(asci<97)
            {
                asci += 32;
            }
            else
            {
                asci -= 32;
            }
            char a = (char) asci;
            str.setCharAt(i,a);
        }
        System.out.println(str);
    }
}

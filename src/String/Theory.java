package String;
/*
#Declaration and Initialisation
String str = "Hello";
String  abc = "World";
#Taking Input
next() se jab tak space nahi hai waha tak ka print karega
nextLine() me puri line

#Functions
1.str.length() se puri length milti hai

2.str.charAt(index no.) se particualr index ka character

3.str.indexof() se hame index milta hai particular character ka ,str.charAt() ka ulta hai

4.compareTo()
  2 string ko compare karta hai yadi equal hai to 0, first string greater hai to +Ve,yadi second hai to -Ve
  str.compareTo(abc)
5.contains
  str.contains("Hel") ; ans is true
  str.startsWith("Hel"); ans is true
  str.endsWith("llo"); ans is true
  in sab me string input hi hoga

6. toLowerCase(),toUpperCase()
   in done function me string input nahi hoti
   str.toLowerCase // sab kuch lower case me ho jaye ga
   str.toUpperCase // sab kuch upper case me ho jaye ga
7. concat()
   String s3 = str.concat(abc);// ans = HelloWorld

8. substring(i,j) ,substring(i)
   String str = "abcde";
   str.substring(0,3) // o index include hoga par 3 nahi hoga , ans abc
   str.substring(1) // ans bcde

9. equals()
   str.equals(abc) // false
 */
public class Theory {
    static void main(String[] args) {
        String str = "abcd";
        for(int i = 0 ; i<=str.length()-1;i++)
        {
            for(int j = i+1 ; j <=str.length();j++)
                System.out.print(str.substring(i,j)+" ");
        }
    }
}

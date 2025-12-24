package String;
import java.util.*;
/*
#Declaration
 StringBuilder name = new StringBuilder();
 or
 StringBuilder name = new StringBuilder("direct string likh do");

 #Functions
  1 name.append() // iske ander wo chiz dalo jo app karni hai

  2 name.setCharAt(index,ch) // jis index pe add karna hai uska index likho or jo char add karna hai vo
    example = //hello -> mello yadi index 0,ch 'm'

  3 name.insert(index,ch) // isme jis index pe insert karna hai wo index likho or wo character

  4 name.deleteCharAt(index)

  5 name.reverse();

  6 name.delete(i,j) is me i include hota hai pr j nhi




 */
public class JavaStringBuilderClass {
    static void main(String[] args) {
        StringBuilder str = new StringBuilder("Hello");
        System.out.println(str);

        str.append("World");
        System.out.println(str);

        str.setCharAt(0,'m');
        System.out.println(str);

        str.insert(0,'N');
        System.out.println(str);

        str.deleteCharAt(0);
        System.out.println(str);

        StringBuilder sb = new StringBuilder("Aditya");
        sb.reverse();
        System.out.println(sb);
        sb.reverse();

        sb.delete(1,2);
        System.out.println(sb);

    }
}

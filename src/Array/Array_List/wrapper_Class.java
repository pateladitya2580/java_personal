package Array.Array_List;
import java.util.ArrayList;// ye ek array hi hai but size variable hai
public class wrapper_Class {
    static void main(String[] args) {
        //wrapper classes
//        Integer i = Integer.valueOf(4);
//        System.out.println(i);
//        Float  f = Float.valueOf(4.2f);
//        System.out.println(f);

        //Declare aese karna hai ,Arraylist class me ek object ko
        ArrayList<Integer> l1 = new ArrayList<>();

        // add new element
        l1.add(5);//5
        l1.add(6);//5 6
        l1.add(7);//5 6 7
        l1.add(8);//5 6 7 8

        //get an element at index i
        System.out.println(l1.get(1));//6

        //print with for loop
        for(int i = 0; i< l1.size();i++)
        {
            System.out.println(l1.get(i));//5,6,7,8
        }

        //printing the array list directly
        System.out.println(l1);//[5,6,7,8]

        //adding element at some index i//[5 100 6 7 8]
        l1.add(1,100);
        System.out.println(l1);

        //modifying element at index i
        l1.set(1,10);
        System.out.println(l1);//[5,10,6,7,8]

        //removing an element at index i
        l1.remove(1);
        System.out.println(l1);//[5,6,7,8]

        //removing an element e
        l1.remove(Integer.valueOf(7));
        System.out.println(l1);//[5,6,8]

        //checking if an element exists
        boolean ans = l1.contains(Integer.valueOf(6));
        System.out.println(ans);//true

        // if you don't specify class ,you can put anything inside l
        ArrayList l = new ArrayList();
        l.add("Aditya");
        l.add(1);
        l.add(true);
        System.out.println(l);
    }
}
// wrapper class kyo
/*
wrapper class isliye kyo ki java me bhut jagah primative data type use nahi
hota hai , objects use hote hai jese ki jab ham Arraylist class ko import
karte hai to ham usme object use karte hai na ki primative data type
 */
package OOPS;

public class Theory {
    // creating a new data type
    public static  class student{
        public String name;
        private int rollNo ;
        double percentage;
    }
    static void main(String[] args) {
        student x = new student();//declaration
        x.name = "Aditya";// remaining these are intialition
        x.rollNo = 1013;
        x.percentage  = 98.5;
        System.out.println(x.name);

        student y = new student();
        y.name = "Parag";
        y.rollNo = 1012;
        y.percentage = 99;
        System.out.println(y.name);
    }
}
// We have to declare the class outside main
// classes are passed by reference(user defined data type
// same pakege me ek file me class banai second me usko direct use kia ja sakta hai
// but lekin yadi wo class jo different pakage me bani hai usko different pakage me use karna hai to import karna padega
/*
  Access Modifiers
  1 .Public - all packages
  2 .Private - same class
  3 .Default - same package
  jab ham class ke attributes ko access modifiers nahi dete to wo by default ho jate hai
 */
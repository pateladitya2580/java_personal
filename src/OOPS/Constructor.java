package OOPS;

public class Constructor {
    public static class Student{
        String name;
        int rno;
        double percentage;
        final String schoolName = "SNPS";// ye ek final variable hai isko koi change nahi kar sakta
        //default constructor
        public Student(){

        }
        //constructor declaration
         public Student(String name,int rno ,double percentage)
        {
            this.name = name;
            this.rno = rno;
            this.percentage = percentage;
        }
    }
    static void main(String[] args) {
        Student s1 = new Student("Aditya",1013,98);
        System.out.println(s1.name);
        System.out.println(s1.rno);
        System.out.println(s1.percentage);
        System.out.println(s1.schoolName);

        Student s2 = new Student();
        s2.name = "Parag";
        s2.rno = 1012;
        s2.percentage = 99;
        System.out.println(s2.name);
        System.out.println(s2.rno);
        System.out.println(s2.percentage);
        System.out.println(s2.schoolName);

    }
}
// default constructor bhi bana do error se bachne ke liye

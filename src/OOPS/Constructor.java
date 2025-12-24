package OOPS;

public class Constructor {
    public static class Student{
        String name;
        int rno;
        double percentage;
        //constructor declaration
        public Student(String naam,int roll ,double per)
        {
            name = naam;
            rno = roll;
            percentage = per;
        }
    }
    static void main(String[] args) {
        Student s1 = new Student("Aditya",1013,98);
        System.out.println(s1.name);
        System.out.println(s1.rno);
        System.out.println(s1.percentage);
    }
}

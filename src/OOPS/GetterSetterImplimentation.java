package OOPS;

public class GetterSetterImplimentation {
    static void main(String[] args) {
        GettersAndSetters.Student s1 = new GettersAndSetters.Student();
        s1.name = "Aditya";
//        s1.rno = 76; isko direct use nahi kar sakte kyo ki private hai
        System.out.println(s1.getRno());
        s1.setRno(76);

    }
}

package OOPS;

public class GettersAndSetters {
    public static class Student{
        public String name;
        private int rno;
        double parcent;

        public int getRno(){// getter
            return rno;
        }
        public void setRno(int roll){
            rno = roll;
        }
        //alternative code
//          public void setRno(int rno){
//           this.rno = rno;
//          }
    }

}
/*
Getter aur Setter kya hote hain?

Getter → variable ki value read karne ke liye

Setter → variable ki value modify/update karne ke liye

Aur ye tab use hote hain jab variables private hote hain.
 */
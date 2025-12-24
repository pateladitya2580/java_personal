package Operator;

public class AssignmentOperator {
    static void main(String[] args) {
        int p = 10;
        int q;
        // =
        q =p ;
        System.out.println(q);//10

        // +=
        p += q;//20
        System.out.println(p);
        // -=
        p -= q;//10
        System.out.println(p);
        // *=
        p *= q; //100
        System.out.println(p);
        //%
        p %=q;// 0
        System.out.println(p);
        //
        p /=q; //10
        System.out.println(p);

    }
}

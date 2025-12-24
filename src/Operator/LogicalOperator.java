package Operator;

public class LogicalOperator {
    static void main(String[] args) {
        int p = 15, q = 10, r = 5;
        //&
        System.out.println((p > q) && (p > r));// true
        System.out.println((p > q) && (p < r));//false

        //||
        System.out.println(((r < q) || (p < q)));//true
        System.out.println(((p > q) || (q > r)));//true
        System.out.println(((p < q) || (q < r)));//false

        // !
        System.out.println(!(p == q));//true


    }
}
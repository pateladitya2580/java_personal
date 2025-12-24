package Recursion.Practice;
public class Alter_Native_Sum {
    static int alterSumSeries(int n )
    {
        if(n ==0)return 0;
        if(n%2==0)
        {
            return alterSumSeries(n-1) -n;
        }
        else
        {
            return alterSumSeries(n-1)+n;
        }
    }
    static void main(String[] args) {
        System.out.printf("Ans "+alterSumSeries(4) );
    }
}

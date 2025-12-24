package Recursion;
/*
There are N stones , numbered 0,1,2,...N.for each i(0<=i<N), the height of Stone i is hi. There is a
frog who is initially on Stone 0.He will repeat the following action some numbr of times to reach
Stone N-1:
if the frog is currently on Stone i,jump to Stone i+1 or Stone i+2.
Here , a cost of |hi-hj| is incurred , where j is the stone to land on.

find the minimum possible total cost incurred before the frog reaches Stone N.
Input n = 4
arr[] = 10 30 40 20
output = 30
 */
public class FrogProblem {
    static int best(int []h , int n ,int idx)
    {
      if(idx == n-1) return 0;
      int opt1= Math.abs(h[idx+1] - h[idx])  + best(h,n,idx+1);
      if(idx == n-2) return opt1;
      int opt2= Math.abs(h[idx+2]-h[idx]) + best(h,n,idx+2);
      return Math.min(opt1,opt2);
    }
    static void main(String[] args) {
        int []h = {10,30,40,20};
        int n = h.length;
        System.out.println("Ans "+best(h,n,0));
    }
}

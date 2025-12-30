package Queue.Questions;

import java.util.LinkedList;
import java.util.Queue;

// quwstion gfg pe hai
public class FirstNegativeNumberInSlidingwindow04 {
    public int[] PrintFirstNegativeInteger(int []a,int n,int  k)
    {
     int []ans = new int[n-k+1]; // n = lenght of array , k = size of window
        Queue<Integer> q = new LinkedList<>();
        for(int i = 0 ;i < n;i++)
        {
            if(a[i]<0){
                q.add(i);
            }
        }
        for(int i = 0 ; i<n-k+1;i++){
            if(q.size()>0 && q.peek()<i) q.remove();
            if(q.size()>0 && q.peek()<=i+k-1){
                ans[i] = a[q.peek()];
            }
            else{
                ans[i] = 0;
            }
        }
        return ans;
    }
    static void main(String[] args) {

    }
}

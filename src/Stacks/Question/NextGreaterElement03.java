package Stacks.Question;

import java.util.Stack;

public class NextGreaterElement03 {
    static int[] nextGreaterEle(int []arr)
    {
        int []ans = new int[arr.length];
        Stack<Integer>st = new Stack<>();
        ans[arr.length-1] = -1;
        st.push(arr[arr.length-1]);
        for(int i = arr.length-2; i>=0;i--)
        {
            while ( st.size()>0 && st.peek()<arr[i])
            {
                st.pop();
            }
            if(st.size()==0) ans [i] = -1;
            else ans[i] = st.peek();
            st.push(arr[i]);
        }
        return ans;
    }
    static void main(String[] args) {
        int arr[] = {1,5,3,2,1,6,3,4};// ans 5 6 6 6 6 -1 4 -1
        int ans[] = nextGreaterEle(arr);
        for(int i= 0 ; i<=ans.length-1;i++)
        {
            System.out.print(ans[i]+" ");
        }
    }
}
// next greater element ke liye piche se start karna hai
// previous greater element ke liye start se start karna hai
// algo same rahega

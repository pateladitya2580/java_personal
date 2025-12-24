package Recursion.Array;
import java.util.ArrayList;
public class ArrLIist {
    static ArrayList<Integer>allIndices(int []a,int n ,int target,int idx)
    {
        ArrayList<Integer>ans = new ArrayList<>();
        //base case
        if(idx >=n)
        {
            return ans;
        }
        if(a[idx]==target)
        {
            ans.add(idx);
        }
        ArrayList<Integer>smallAns = allIndices(a,n,target,idx+1);
        ans.addAll(smallAns);
        return ans;
    }
    static void main(String[] args) {
        int []a = {4,2,3,3,4,5,4};
        int taget = 4;
        int n = a.length;
        System.out.println("Ans "+allIndices(a,n,taget,0));
    }
}

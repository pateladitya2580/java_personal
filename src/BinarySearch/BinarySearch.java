package BinarySearch;

public class BinarySearch {
    static boolean search(int []a,int target)
    {
        int n = a.length;
        int str = 0;
        int end = n-1;
        while(str<=end)
        {
            int mid = (str+end)/2;
            if(a[mid]==target) return true;
            else if (target > a[mid]) str = mid+1;
            else end = mid-1;
        }
        return false;
    }
    static void main(String[] args) {
        int []a = {1,2,3,4,5,6,7,8};
        System.out.println("The target is present "+search(a,8));
    }
}

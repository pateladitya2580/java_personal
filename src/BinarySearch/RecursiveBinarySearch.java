package BinarySearch;

public class RecursiveBinarySearch {
    static boolean recursiveBinarySearch(int a[],int str,int end,int target)
    {
        if(str>=end) return false;
        int mid = ( str + end)/2;
        if(target == a[mid]) return true;
        else if (target>a[mid]) return recursiveBinarySearch(a,str = mid+1,end,target);
        else return recursiveBinarySearch(a,str,end = mid-1,target);
    }
    static void main(String[] args) {
        int []a = {1,2,3,4,5,6,7,8};
        System.out.println("The no is present "+recursiveBinarySearch(a,0,a.length-1,6));
    }
}
// mid second formula mid = str + (end-str)/2
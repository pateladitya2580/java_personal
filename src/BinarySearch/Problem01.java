package BinarySearch;
/*
Find the first occurrence of a given element x,given that the given array
is sorted. If no occrrence of x is found then return -1;
input
a[] = {2,5,5,6,6,8,9,9,9}
x = 5

output
1
*/
public class Problem01 {
    static int binarySearch(int a[],int target)
    {
        int str = 0;
        int end = a.length -1;
        int ans = -1;
        while (str<=end)
        {
            int mid = str + (str+end)/2;
            if(target == a[mid])
            {
                ans = mid;
                end = mid-1;
            }
            else if (target > a[mid])
            {
                str = mid+1;
            }
            else
            {
                end = mid-1;
            }
        }
        return ans;
    }
    static void main(String[] args) {
        int a[] = {2,5,5,6,6,8,9,9,9};
        int target = 5;
        System.out.println("The index "+binarySearch(a,target));
    }
}

package BinarySearch;
/*
Given the rotated sorted array of integers,which contains distinct
elements,and an integer target,return the index of target if it is in
the array.Otherwise return -1.

input:
a[] = {3,4,5,1,2}
int target = 4

output:
1
 */
public class Problem04 {
    static int search(int[]a,int target)
    {
        int n = a.length;
        int str = 0;
        int end = n-1;
        while (str<=end)
        {
            int mid = str + (end-str)/2;
            if(a[mid]== target)
            {
                return mid;
            }
            else if (a[mid]<a[end])
            {
                if(target>a[mid] && target<=a[end]) str = mid+1;
                else end = mid-1;
            }
            else
            {
                if(target>=a[str]&& target<a[mid]) end = mid-1;
                else str = mid+1;
            }
        }
        return -1;
    }
    static void main(String[] args) {
        int a[] = {3,4,5,1,2};
        int target = 4;
        System.out.println("Ans "+search(a,target));
    }
}

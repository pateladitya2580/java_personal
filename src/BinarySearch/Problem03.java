package BinarySearch;
/*
A rotated sorted array is a sorted array on which rotation operation has been
performed some number of times. Given a rotated sorted array.find the index of the
minimum element in the array.

input
a[] = {3,4,5,1,2}
output
3
 */
public class Problem03 {
    static int binaryShort(int []a)
    {
        int str = 0;
        int end = a.length-1;
        int ans = -1;
        while (str<=end)
        {
            int mid = str+(end-str)/2;
            if(a[mid]>a[a.length-1])
            {
                str = mid + 1;
            }
            else if (a[mid]<=a[a.length-1])
            {
                ans = mid;
                end = mid -1;
            }
        }
        return ans;
    }
    static void main(String[] args) {
        int a[] = {3,4,5,1,2};
        System.out.println("The ams is "+binaryShort(a ));
    }
}

package BinarySearch;
/*
Search element in rotated sorted array with duplicate elements.Return index
if the element is found,else return -1.

Input:
[0,0,0,1,1,1,2,0,0,0],target =2

output:
6
 */
public class Problem05 {
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
            else if (a[str] == a[mid] && a[mid] == a[end])
            {
                str++;
                end--;
            }
            else if (a[mid]<=a[end])
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
        int a[] = {0,0,0,1,1,1,2,0,0,0};
        int target = 2;
        System.out.println("Ans is "+search(a,target));
    }
}
/*
Sorted ka matlab strict increase nahi

Sorted = non-decreasing

Non-decreasing me equality allowed hoti hai
 */
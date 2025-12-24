package BinarySearch;
/*
find the square root of the given non negative value x.Round it off to the
nearest floor integer value.
input x = 4
output 2
input x = 11
output 3
 */
public class Problem02 {
    static int binarySearch(int a)
    {
        int str = 1 ;
        int end = a;
        int ans = 1;
        while (str<=end)
        {
            int mid = str + (end -str)/2;
            long value = (long)mid*mid;
            if(value == a) return mid;
            else if (value<= a)
            {
                ans  = mid;
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
        System.out.println("The ans is "+binarySearch(11));
    }
}

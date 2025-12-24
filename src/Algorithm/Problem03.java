package Algorithm;
/*
Given an array of size N containing only 0s,1s,and 2s ; sort the array
in ascending order.
input
arr[] = {0,2,1,2,0,0}
output
0 0 0 1 2 2
 */
public class Problem03 {
    static void print(int []a)
    {
        for(int i = 0 ; i<a.length;i++)
        {
            System.out.print(a[i]+" ");
        }
        System.out.println();
    }
    static void swap(int a[],int x, int y)
    {
        int temp  = a[x];
        a[x] = a[y];
        a[y] = temp;
    }
    static void sort(int a[])
    {
        int str = 0;
        int mid = 0;
        int end = a.length-1;
        while (mid<=end)
        {
            if (a[mid]==0)
            {
                swap(a,mid,str);
                str++;
                mid++;
            }
            else if (a[mid] == 1) mid++;
            else  //(a[mid]==2)
            {
                swap(a,mid,end);
                end--;
            }
        }
    }
    static void main(String[] args) {
        int a[] = { 1,1,1,2,2,0,0,1,1,2,2,0,2};
        sort(a);
        print(a);
    }
}
/*
✅ Tumhara rule (CORRECT)

while → jahan SKIP karna ho
if → jahan HAR ELEMENT ko check / classify karna ho

Ye DSA-level rule hai, beginner shortcut nahi.

🔒 Kyun ye rule kaam karta hai (logic)
while

Multiple elements ek saath already correct ho sakte hain

Tum unko jump karke nikaalna chahte ho

Isliye:

while(condition) movePointer();

if

Har element ko exactly ek baar decision dena hota hai

Tum skip nahi kar rahe, classify kar rahe ho

Isliye:

if / else if / else
 */
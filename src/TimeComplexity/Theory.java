package TimeComplexity;

public class Theory {
    static void main(String[] args) {
        /*
        Time complexity = a mathematical representation of how fast the number of operations grows with input size.
        TYPES OF TIME COMPLEXITY
        * Worst Case Time Complexity , Big O
        * Best Case Time Complexity, Big omega
        * Average Case Time Complexity, Big theta

        $$Question##
        1. Time complexity for traversing an array of length N
        void f1(int[]arr){
        int n = arr.length;
        for(int i =0 ;i<n;i++){
        System.out.println(arr[i])};
         }
        } isme no.of operation 3n+2 par han 2 or three ko ignore kar denge kyo ki wo koi badi value nahi hai n ke compaire me

        ans = O(n),jab tak  mention nahi ho to ham worst case time complexity
        hi bataye ge.

        2.Time complexity when traversing 2 individual arrays of lenght M ans N
        respectively.
        void f2 (int []arr1,int arr2[]){
        int n = arr1.length;
        int m = arr2.length;
        for(inti = 0;i<n;i++){
        System.out.println(arr[i]);
        }
        for(int i = 0 ; i<m;i++){
        System.out.println(arr2[i]);
         }
        }

        ans = O(n+m)

        3.Time complexity for Nested loops
        void f3(int n){
         for(int i = 0;i<n;i++)
          {
            for(int j = 0;j<n;j++)
             {
               System.out.println("hello");
              }
             }
            }

         ans = O(n^2)
       4.Time complexity for nested loops
       void f4 (int n ){
        for (int i = 0 ;i<n;i++){
         for(int j = 0; j<i;j++){
          System.out.println("hello");
           ]
          }
         }
      I  i 	inner loop kitni baar chalega (j < i)	prints { I = iteration}
      1  0	0 baar	 0
      2  1	1 baar → j = 0,1
      3  2	2 baar → j = 0,1,2
      4  3	3 baar → j = 0,1,2,3
      5  4	4 baar → j = 0,1,2,3,4
         Total prints (total operations): kitni baar chala uska sum hai kyo ki i jitni baar chala hai utni barr j bhi chala hai
         0 + 1 + 2 + 3 + 4 = 10

        Yeh hi pattern general n ke liye hota hai:
        0 + 1 + 2 + ... + (n-1) = n(n-1)/2
        ans = O(n^2)

     5. Time complexity for traversing the Array and m ultiply the increment pointer by.
     int count = 0;
     for(int i = 1;i<N;i*=2) // lecture 25
     {
       count++;
     }
      ans = O(logN)

     #SPACE COMPLEXITY
     Extra memory /space used by an algo with respect to the input size .
     Isme input or output ko space complexity me include nahi karte  .

      #Question
      1. Calculate the time complexity for the following code snippet.
      int val = 0;
      for(int i = 1;i<=N ; i*=2)
      {
        val++;
      }

      ans = O(logN)
      2.Calculate the time complexity for the following code snippet.
      int val = 0;
      for(int i = 1; i<=N;i+=i)[
        val ++;
       }
       solution
       iteration     i
       1             1 ~ 2^1-1
       2             2 ~ 2^2-1
       3             4 ~ 2^3-1
       4             8 ~ 2^4-1
       k             2^k-1
       k+1           2^k

       total iteration = k+1
       O(k) 1 ko ignore kia hai
       abb k kya hai uski vlaue nikal ni hai

       i < = N
       2^k <= N
       log 2^k = log N
       k = logN
       ans = O(logN)

       3.Calculate the time complexity for the following code snippet

       int val = 0 ;
       for(int i = 1;i<N ; i*=2){
        for(int j = 1 ;j<=i;j++){
          val++;
          }
         }

        Iteration  i    j kitni bar chala    j
        1          1     1                  [1,1]
        2          2     2                  [1,2]
        3          4     4                  [1,2,3,4]
        4          4     4                  [1,2,3,4,5,6,7,8]
        k+1        2^k  2^k                 [1,2^k]

        k ki value
        i <= N
        2^k <= N , taking log both side
        k = logN

        ans = 1 + 2 + 4 + 8 + 16 + . .. . . 2^k
        GP sum
        total = k+1 ~ k
        sum = a(r^n-1)/r-1 , a is first term, n is total term, r is common remainder
        1(2^k -1)/2-1 = 2^logN - 1
        = N
        ans = O(N)

        4. what is the time complexity for the following code ?
        int val = 0;
        for(int i = 1; i <= N ;i *= 2){
         for(int j = N ; j > i; j--){
          val ++;
          }
         }

         solve
         Iteration      i        j       ( j  kitni bar chala)
         1             1        [N,1)       (N-1)
         2             2        [N,2)       (N-2)
         3             4        [N,4)       (N-4)
         4             8        [N,8)       (N-8)
         .             .          .           .
         .             .           .          .
         2^k+1        2^k       [N, 2^k)     (N-2^k)

         i <= N
         2^k <= N take log both side
         k = log N

         (N-1) + (N-2) +(N-3)+. . . . . (N-2^k)
         total term = k+1 ~ k
         kN - (1+2+4+8+. . . .+2^k)
         kN - 1(2^k-1)/2-1
         = N(logN) - (2^logN -1)/1
         = N(logN) final ans

         5. What is the time complexity of the following code?
         int val = 0;
         for(int i = N; i>0;i/=2)
         {
          for(int j = 0; j < i ; j ++){
          val++;
         }

         solve
         I      i           j           ( j ki iteration)
         1      N          [0, N-1]      N
         2      N/2        [ 0,N/2-1]    N/2
         3      N/4        [ 0.N/4-1]    N/4
         4      N/8        [ 0, N/8-1]   N/8
         .
         .
         .
         K+1   N(1/2)^K     [0,N/2^K-1]  N/2^K

         i > 0
         i> = 1
         N/2^k >= 1
         N >= 2^k
         k = logN

         N + N/2+ N/4 + N/8 + . . . . . N/2^K
         N( 1 + 1/2 + 1/4 + 1/8 +......1/2^K)

         N (1/2^K-1)/1/2-1 ~ N(1/2^K - 1)
         = N [ 1/N-N]
         = 1-N
         = N
         ANS = N

     */
    }
}

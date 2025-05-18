 /*
There are some Special Numbers between 0 to 10^N.
A number is called special, if all the digits in that number should be different.
i.e., No two digits are same.

You are given an integer N,
Your task is to find the count of special numbers (X) between 0<= X < 10^N.

NOTE: Leading 0's are allowed.

Input Format:
-------------
An integer N

Output Format:
--------------
Print an integer, Count of special numbers.

Sample Input-1:
---------------
1

Sample Output-1:
----------------
10


Sample Input-1:
---------------
2

Sample Output-1:
----------------
91

Explanation:
--------------
Special Number between 0<= X < 10^2.
Exclude 11, 22, 33, 44, 55, 66, 77, 88, 99, => count is 9
Total Count is 100=> Special Numbers count is 100-9 = 91.
*/
 import java.util.*;
 class test{
     public static void main(String args[]){
         Scanner sc =new Scanner(System.in);
         int n = sc.nextInt();
         test obj = new test();
         int result = obj.countSpecialNumbers(n);
         System.out.println(result);
     }
     int countSpecialNumbers(int n) {
         int limit = (int)Math.pow(10, n);
         int count = 0;
         for (int i = 0; i < limit; i++) {
             if (isSpecial(i)) {
                 count++;
             }
         }
         return count;
     }
     boolean isSpecial(int num){
         boolean[] seen = new boolean[10];
         while (num > 0){
             int digit = num % 10;
             if (seen[digit])
                 return false;
             seen[digit] = true;
             num = num/ 10;
         }
         return true;
     }
 }

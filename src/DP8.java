/*

Given an array of positive integers, find the maximum sum of non-adjacent elements.
You are not allowed to pick two consecutive elements.

Input:
--------------------
First line: Integer n — number of elements
Second line: n space-separated positive integers

Output:
----------------------
Maximum sum with no two adjacent elements chosen

Sample Testcase:1
-------------------------------
6
3 2 5 10 7 8
output:22
Explanation:
-----------------------------------
Pick 3 + 10 + 8 = 21 OR 2 + 10 + 8 = 22 (max)
 */

import java.util.*;
class DP8{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int  a[]=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        int dp[]=new int[n];
        dp[0]=a[0];
        dp[1]=Math.max(a[0],a[1]);
        for(int i=2;i<a.length;i++){
            dp[i]=Math.max(dp[i-1],dp[i-2]+a[i]);
        }
        System.out.println(dp[n-1]);
    }
}
/*
Given an array of integers, find the length of the Longest Increasing Subsequence (LIS)
— a subsequence in which the elements are in increasing order (not necessarily contiguous).

Input:
-----------------
First line: number of elements n
Second line: n space-separated integers

Output:
------------------
Length of the LIS

Sample Testcase:1
-----------------------------
input=8
10 9 2 5 3 7 101 18
output=4
 */

import java.util.*;

class  DP9{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];

        for(int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        int dp[] = new int[n];
       // Arrays.fill(dp, 1);  // Every element has LIS of at least 1
        for(int i=0;i<n;i++){
            dp[i]=1;
        }
        for(int i = 1; i < n; i++) {
            for(int j = 0; j < i; j++) {
                if(a[i] > a[j]) {
                    dp[i] = Math.max(dp[i], dp[j] + 1);
                }
            }
        }

        int lis = 0;
        for(int i = 0; i < n; i++) {
            lis = Math.max(lis, dp[i]);
        }

        System.out.println(lis);
    }
}
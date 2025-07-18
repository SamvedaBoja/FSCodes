/*
Given an integer n, return the number of unique BSTs (binary search trees)
that can be constructed with distinct values from 1 to n.

Sample Testcase:1
----------------------------
input=3
output=5
 */

import java.util.*;
class DP4 {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int dp[]=new int[n+1];
        dp[0]=1;
        dp[1]=1;
        for(int i=2;i<=n;i++){
            for(int j=1;j<=i;j++){
                dp[i] += dp[j-1]*dp[i-j];
            }
        }
        System.out.println(dp[n]);
    }
}
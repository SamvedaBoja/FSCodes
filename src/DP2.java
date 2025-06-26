/*
An ugly number is a positive integer whose prime factors are limited to 2, 3, and 5.

Given an integer n, return the nth ugly number.

Sample Testcase:1
----------------------------------------
input=10
output=12
Explanation:
-----------------------------
[1, 2, 3, 4, 5, 6, 8, 9, 10, 12] is the sequence of the first 10 ugly numbers.


 */

import java.util.*;
class DP2{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int dp[]=new int[n];
        dp[0]=1;
        int i=0,j=0,k=0;
        int n2=2,n3=3,n5=5;
        for(int p=1;p<n;p++){
            int num = Math.min(n2,Math.min(n3,n5));
            dp[p]=num;
            if(num == n2){
                i++;
                n2=dp[i]*2;
            }
            if(num == n3){
                j++;
                n3=dp[j]*3;
            }
            if(num == n5){
                k++;
                n5=dp[k]*5;
            }
        }
        System.out.println(dp[n-1]);
    }
}
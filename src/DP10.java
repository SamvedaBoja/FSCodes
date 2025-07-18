/*
Given two strings word1 and word2, find the minimum number of operations
required to convert word1 into word2.
Allowed operations:

Insert a character
Delete a character
Replace a character

Sample Testcase:1
----------------------------------
input=horse
ros
output=3
 */

import java.util.*;
class DP10{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        String s1=sc.next();
        int n=s1.length();
        String s2=sc.next();
        int m=s2.length();
        int dp[][]=new int[n+1][m+1];
        for(int i=1;i<=n;i++){
            dp[i][0]=i;
        }
        for(int j=1;j<=m;j++){
            dp[0][j]=j;
        }
        for(int i=1;i<=n;i++){
            for(int j=1;j<=m;j++){
                if(s1.charAt(i-1) != s2.charAt(j-1)){
                    dp[i][j]=Math.min(dp[i-1][j],Math.min(dp[i-1][j-1],dp[i][j-1]))+1;
                }
                else{
                    dp[i][j]=dp[i-1][j-1];
                }
            }
        }
        System.out.print(dp[n][m]);
    }
}
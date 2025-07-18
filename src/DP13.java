/*
There is a robot on an m x n grid. The robot is initially located at the top-left
corner (i.e., grid[0][0]). The robot tries to move to the bottom-right corner
(i.e., grid[m - 1][n - 1]). The robot can only move either down or right at any
point in time.
Given the two integers m and n, return the number of possible unique paths
that the robot can take to reach the bottom-right corner using dp
approach.

Sample Testcase:1
---------------------------------
Input=3 7
Output=28

Sample Testcase:2
---------------------------------
Input=3 2
Output=3
Explanation: From the top-left corner, there are a total of 3 ways to
reach the bottom-right corner:
1. Right -> Down -> Down
2. Down -> Down -> Right
3. Down -> Right -> Down
 */


import java.util.*;
class DP13{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int dp[][]=new int[n][m];
        for(int i=0;i<n;i++){
            dp[i][m-1]=1;
        }
        for(int j=0;j<m;j++){
            dp[n-1][j]=1;
        }
        for(int i=n-2;i>=0;i--){
            for(int j=m-2;j>=0;j--){
                dp[i][j]=dp[i+1][j]+dp[i][j+1];
            }
        }
        System.out.println(dp[0][0]);
    }
}

/*
import java.util.*;
class Test{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int dp[][]=new int[n][m];
        for(int i=0;i<n;i++){
            dp[i][0]=1;
        }
        for(int j=0;j<m;j++){
            dp[0][j]=1;
        }
        for(int i=1;i<n;i++){
            for(int j=1;j<m;j++){
                dp[i][j]=dp[i-1][j]+dp[i][j-1];
            }
        }
        System.out.println(dp[n-1][m-1]);
    }
}
*/
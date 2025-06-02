/*There is a robot on an m x n grid. The robot is initially located at the
top-left corner (i.e., grid[0][0]). The robot tries to move to the
bottom-right corner (i.e., grid[m - 1][n - 1]).
The robot can only move either down or right at any point in time.

Given the two integers m and n, return the number of possible unique paths
that the robot can take to reach the bottom-right corner.

Sample Testcase:1
-----------------------------
input=3 2
output=3
Explanation:
-------------------------------
From the top-left corner, there are a total of 3 ways to reach
the bottom-right corner:
1. Right -> Down -> Down
2. Down -> Down -> Right
3. Down -> Right -> Down

 */
/*
import java.util.*;
class Test{
    static int count;
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int m=sc.nextInt();
        int n=sc.nextInt();
        count=0;
        traverse(0,0,m,n);
        System.out.println(count);
    }
    public static void traverse(int i,int j,int m,int n){
        if(i==m-1 && j==n-1){
            count++;
            return;
        }
        if(j+1 < n){
            traverse(i,j+1,m,n);
        }
        if(i+1 < m){
            traverse(i+1,j,m,n);
        }
    }
}
 */
import java.util.*;
class Uniquepath{
    static int count;
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int m=sc.nextInt();
        int n=sc.nextInt();
        countPaths(m,n);
    }
    public static void countPaths(int m,int n){
        count=0;
        traverse(0,0,m,n);
        System.out.println(count);
    }
    private static void traverse(int i,int j,int m,int n){
        if(i==m-1 && j==n-1){
            count++;
            return;
        }
        if(j+1 < n){
            traverse(i,j+1,m,n);
        }
        if(i+1 < m){
            traverse(i+1,j,m,n);
        }
    }
}
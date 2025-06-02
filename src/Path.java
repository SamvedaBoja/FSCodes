/*
Given a m x n grid filled with non-negative numbers, find a path from
top left to bottom right, which minimizes the sum of all numbers along its path.

Note: You can only move either down or right at any point in time.

Sample Testcase:1
-------------------------------
input=3 3
1 3 1
1 5 1
4 2 1
output=7
Explanation: Because the path 1 → 3 → 1 → 1 → 1 minimizes the sum
 */
/*
import java.util.*;
public class Path {
    static int m,n;
    static int a[][];
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        m=sc.nextInt();
        n=sc.nextInt();
        a=new int[m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                a[i][j]=sc.nextInt();
            }
        }
        int sum = dfs(0,0);
        System.out.println(sum);
    }
    public static int dfs(int i,int j){
        if(i<0 || j<0 || i>=m || j>=n){
            return Integer.MAX_VALUE;
        }
        if(i==m-1 && j==n-1){
            return a[i][j];
        }
        return a[i][j]+Math.min(dfs(i,j+1),dfs(i+1,j));
    }
}

 */

import java.util.*;

public class Path {
    static int m, n;
    static int[][] a;
    static boolean[][] visited;
    static int minSum = Integer.MAX_VALUE;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        m = sc.nextInt();
        n = sc.nextInt();
        a = new int[m][n];
        visited = new boolean[m][n];

        for (int i = 0; i < m; i++)
            for (int j = 0; j < n; j++)
                a[i][j] = sc.nextInt();

        dfs(0, 0, 0);
        System.out.println(minSum);
    }

    public static void dfs(int i, int j, int sum) {
        if (i < 0 || j < 0 || i >= m || j >= n || visited[i][j])
            return;

        sum += a[i][j];

        if (i == m - 1 && j == n - 1) {
            minSum = Math.min(minSum, sum);
            return;
        }

        visited[i][j] = true;

        // 4 directions
        dfs(i + 1, j, sum); // down
        dfs(i - 1, j, sum); // up
        dfs(i, j + 1, sum); // right
        dfs(i, j - 1, sum); // left

        visited[i][j] = false; // backtrack
    }
}

/*
Given an m x n integers matrix, return the length of the longest increasing
path in matrix.

From each cell, you can either move in four directions: left, right, up, or down.
You may not move diagonally or move outside the boundary

Sample Testcase:1
----------------------------
input=2 2
3 4
2 1
output=4
Explanation:
-----------------------------------
Longest path is [1 → 2 → 3 → 4]

 */

/*
import java.util.*;

class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        int[][] matrix = new int[m][n];

        for (int i = 0; i < m; i++)
            for (int j = 0; j < n; j++)
                matrix[i][j] = sc.nextInt();

        System.out.println(longestIncreasingPath(matrix));
    }

    public static int longestIncreasingPath(int[][] matrix) {
        int m = matrix.length, n = matrix[0].length;
        int[][] dp = new int[m][n]; // memoization
        int maxLen = 0;

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                maxLen = Math.max(maxLen, dfs(matrix, dp, i, j, m, n, -1));
            }
        }

        return maxLen;
    }

    public static int dfs(int[][] matrix, int[][] dp, int i, int j, int m, int n, int prevVal) {
        if (i < 0 || i >= m || j < 0 || j >= n || matrix[i][j] <= prevVal)
            return 0;

        if (dp[i][j] != 0)
            return dp[i][j];

        int currVal = matrix[i][j];

        int up = dfs(matrix, dp, i - 1, j, m, n, currVal);
        int down = dfs(matrix, dp, i + 1, j, m, n, currVal);
        int left = dfs(matrix, dp, i, j - 1, m, n, currVal);
        int right = dfs(matrix, dp, i, j + 1, m, n, currVal);

        dp[i][j] = 1 + Math.max(Math.max(up, down), Math.max(left, right));
        return dp[i][j];
    }
}
 */
/*
import java.util.*;

class DFS4 {
    static int[][] dirs = {{0,1}, {1,0}, {0,-1}, {-1,0}}; // right, down, left, up

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt(), n = sc.nextInt();
        int[][] mat = new int[m][n];
        for (int i = 0; i < m; i++)
            for (int j = 0; j < n; j++)
                mat[i][j] = sc.nextInt();

        System.out.println(longestPath(mat));
    }

    public static int longestPath(int[][] mat) {
        int m = mat.length, n = mat[0].length;
        int[][] dp = new int[m][n];
        int max = 0;

        for (int i = 0; i < m; i++)
            for (int j = 0; j < n; j++)
                max = Math.max(max, dfs(mat, dp, i, j));

        return max;
    }

    static int dfs(int[][] mat, int[][] dp, int i, int j) {
        if (dp[i][j] != 0) return dp[i][j];

        int maxLen = 1;

        for (int[] dir : dirs) {
            int x = i + dir[0], y = j + dir[1];
            if (x >= 0 && y >= 0 && x < mat.length && y < mat[0].length && mat[x][y] > mat[i][j]) {
                maxLen = Math.max(maxLen, 1 + dfs(mat, dp, x, y));
            }
        }

        dp[i][j] = maxLen;
        return maxLen;
    }
}
*/
import java.util.*;
class DFS4{
    static int[][] dirs = {{0,1},{1,0},{0,-1},{-1,0}};
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int m=sc.nextInt();
        int n=sc.nextInt();
        int mat[][]=new int[m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                mat[i][j]=sc.nextInt();
            }
        }
        int max=0;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                max=Math.max(max,dfs(m,n,i,j,mat));
            }
        }
        System.out.println(max);
    }
    public static int dfs(int m,int n,int i,int j,int mat[][]){
        if(i<0 || i>=m || j<0 || j>=n || mat[i][j] == -1){
            return 0;
        }
        int maxLen=1;
        for(int []dir:dirs){
            int x=i+dir[0];
            int y=j+dir[1];
            if(x >= 0 && y >= 0 && x<mat.length && y<mat[0].length && mat[x][y]>mat[i][j]){
                maxLen = Math.max(maxLen,1+dfs(m,n,x,y,mat));
            }
        }
        return maxLen;
    }
}
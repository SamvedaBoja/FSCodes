/*

You are given a 2D grid (map) made of **'1'**s and **'0'**s.
'1' represents land
'0' represents water
An island is formed by connecting adjacent land cells ('1') horizontally or vertically (not diagonally).
Your task is to count how many separate islands are present in the grid.

You must solve this using DFS (Depth-First Search).

Input Format:
----------------------------
Two integers n and m — number of rows and columns in the grid.

n lines, each with m space-separated characters — either '1' (land) or '0' (water).

Output Format:
------------------------------
Print a single integer — the number of islands in the grid.

Sample Testcase:1
----------------------------
4 5
1 1 0 0 0
1 1 0 0 0
0 0 1 0 0
0 0 0 1 1
Output=3
Explanation:
------------------------------
There are 3 islands:
Top-left 2×2 block of 1s
A single 1 in the middle
Two 1s at the bottom-right

 */
import java.util.*;
public class DFS3
{
    static int n, m;
    static int[][] grid;
    static boolean[][] visited;
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        grid = new int[n][m];
        visited = new boolean[n][m];
        for (int i = 0; i < n; i++)
        {
            for (int j = 0; j < m; j++)
            {
                grid[i][j] = sc.nextInt();
            }
        }
        int count = 0;
        for (int i = 0; i < n; i++)
        {
            for (int j = 0; j < m; j++)
            {
                if (grid[i][j] == 1 && !visited[i][j])
                {
                    dfs(i, j);
                    count++;
                }
            }
        }
        System.out.println(count);
    }
    static void dfs(int i, int j)
    {
        if (i < 0 || i >= n || j < 0 || j >= m || visited[i][j] || grid[i][j] == 0)
            return;
        visited[i][j] = true;
        dfs(i + 1, j);
        dfs(i - 1, j);
        dfs(i, j + 1);
        dfs(i, j - 1);
    }
}
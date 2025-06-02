
/*
The Kolar Gold Fields (KGF) is in the form of a m*n grid,
Each field, contains some amount of Gold in it.

You can mine the gold in the KGF in the following way.
	- You can start at any position in the grid, never visit a cell with no gold.
	- each time you visit a cell, you will grab all the gold in it.
	- You can move one step to the left, right, up or down.
	- You can't visit the same cell more than once.
	- You can stop at any cell.

Your task is to find the maximum amount of gold you can collect.

Input Format:
-------------
Line-1: Two integers M and N size of the KGF grid.
Next M lines: N space separated integers, gold in each row of the grid.

Output Format:
--------------
Print an integer, maximum amount of gold.


Sample Input-1:
---------------
3 3
0 6 0
5 8 7
0 9 0

Sample Output-1:
----------------
24

Explanation:
-------------
You can grab the gold in KGF grid as follows:
You can obtain like as follows: 9 -> 8 -> 7.

Sample Input-2:
---------------
5 3
1 0 7
2 0 6
3 4 5
0 3 0
9 0 20

Sample Output-2:
----------------
28

Explanation:
-------------
You can grab the gold in KGF grid as follows:
You can obtain like as follows: 1 -> 2 -> 3 -> 4 -> 5 -> 6 -> 7
 */
import java.util.*;

public class GoldFields {
    static int m, n;
    static int[][] a;
    static boolean[][] visited;
    static int maxGold = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        m = sc.nextInt();
        n = sc.nextInt();
        a = new int[m][n];
        visited = new boolean[m][n];

        for (int i = 0; i < m; i++)
            for (int j = 0; j < n; j++)
                a[i][j] = sc.nextInt();

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (a[i][j] != 0) {
                    dfs(i, j, 0);
                }
            }
        }

        System.out.println(maxGold);
    }

    public static void dfs(int i, int j, int sum) {
        if (i < 0 || j < 0 || i >= m || j >= n || visited[i][j] || a[i][j] == 0)
            return;

        sum += a[i][j];
        maxGold = Math.max(maxGold, sum);

        visited[i][j] = true;

        dfs(i + 1, j, sum); // down
        dfs(i - 1, j, sum); // up
        dfs(i, j + 1, sum); // right
        dfs(i, j - 1, sum); // left

        visited[i][j] = false; // backtrack
    }
}
/*
import java.util.*;

public class GoldFields {
    static int[][] directions = {{1, 0}, {-1, 0}, {0, 1}, {0, -1}}; // down, up, right, left

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt(), n = sc.nextInt();
        int[][] grid = new int[m][n];

        for (int i = 0; i < m; i++)
            for (int j = 0; j < n; j++)
                grid[i][j] = sc.nextInt();

        System.out.println(getMaximumGold(grid));
    }

    public static int getMaximumGold(int[][] grid) {
        int maxGold = 0;
        for (int i = 0; i < grid.length; i++)
            for (int j = 0; j < grid[0].length; j++)
                if (grid[i][j] != 0)
                    maxGold = Math.max(maxGold, dfs(grid, i, j));
        return maxGold;
    }

    private static int dfs(int[][] grid, int i, int j) {
        if (i < 0 || i >= grid.length || j < 0 || j >= grid[0].length || grid[i][j] == 0)
            return 0;

        int originalGold = grid[i][j];
        grid[i][j] = 0; // mark as visited

        int maxPath = 0;
        for (int[] dir : directions)
            maxPath = Math.max(maxPath, dfs(grid, i + dir[0], j + dir[1]));

        grid[i][j] = originalGold; // backtrack
        return originalGold + maxPath;
    }
}

 */
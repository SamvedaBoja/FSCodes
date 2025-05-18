
/*
In a large factory, there is an automated robot placed on a floor grid.
The grid consists of free tiles (represented as 0) and obstacles (represented as 1).
The robot can move in straight lines (up, down, left, or right) but it cannot stop
until it hits an obstacle or the edge of the factory.

Once it stops, it can choose a new direction and continue.
Your task is to determine whether the robot can stop exactly on a target tile.

Input Format:
--------------------
A 2D binary matrix factoryFloor representing the layout (0 = free tile, 1 = obstacle).
A starting position [startRow, startCol].
A target position [targetRow, targetCol].

Sample Testcase:1
-------------------------
input=3 3
0 0 1
1 0 1
1 0 0
0 0
2 2
output=true

Explanation:
----------------------------------
Robot can reach at the target tile

 */
import java.util.*;

public class Tiles {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Reading matrix dimensions
        int m = sc.nextInt();
        int n = sc.nextInt();

        int[][] factoryFloor = new int[m][n];

        // Reading the grid
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                factoryFloor[i][j] = sc.nextInt();
            }
        }

        // Reading start position
        int startRow = sc.nextInt();
        int startCol = sc.nextInt();

        // Reading target position
        int targetRow = sc.nextInt();
        int targetCol = sc.nextInt();

        boolean result = canReach(factoryFloor, startRow, startCol, targetRow, targetCol);
        System.out.println(result);
    }

    public static boolean canReach(int[][] grid, int sr, int sc, int tr, int tc) {
        int m = grid.length;
        int n = grid[0].length;
        boolean[][] visited = new boolean[m][n];

        return dfs(grid, sr, sc, tr, tc, visited);
    }

    public static boolean dfs(int[][] grid, int x, int y, int targetX, int targetY, boolean[][] visited) {
        // Already visited
        if (visited[x][y]) return false;

        // If we reach the target
        if (x == targetX && y == targetY) return true;

        visited[x][y] = true;

        int m = grid.length;
        int n = grid[0].length;

        // Four directions: up, down, left, right
        int[][] dirs = {{-1, 0}, {1, 0}, {0, -1}, {0, 1}};

        for (int[] dir : dirs) {
            int newX = x;
            int newY = y;

            // Keep rolling in the direction until hitting wall or obstacle
            while (newX + dir[0] >= 0 && newX + dir[0] < m &&
                    newY + dir[1] >= 0 && newY + dir[1] < n &&
                    grid[newX + dir[0]][newY + dir[1]] == 0) {
                newX += dir[0];
                newY += dir[1];
            }

            // Explore from new position
            if (dfs(grid, newX, newY, targetX, targetY, visited)) {
                return true;
            }
        }

        return false;
    }
}
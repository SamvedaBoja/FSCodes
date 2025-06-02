
/*

You are given a 2D grid (image) made up of numbers where each number represents a color
of a pixel. The image has n rows and m columns.

You are also given a starting pixel located at (sr, sc) (row and column) and a new color.

Your task is to fill the entire region connected to the starting pixel with the new color.
A region is a group of connected pixels that have the same original color as the starting pixel.
You can only move in 4 directions: up, down, left, and right.

You must perform this using DFS (Depth-First Search).

Input Format:
-----------------------------
Two integers n and m — number of rows and columns.
n lines each with m integers — representing the grid (colors of pixels).
Three integers: sr, sc, and newColor — starting row, column, and the color to apply.

Output Format:
--------------------------
Print the updated grid after performing flood fill.


Sample Testcase:1
-------------------------------
input=4 4
1 1 1 2
1 1 0 2
1 0 1 2
0 0 0 2
1 1 5
Output=
5 5 5 2
5 5 0 2
5 0 1 2
0 0 0 2
Explanation:
----------------------
The original color at position (1, 1) is 1.
All connected 1s around (1, 1) should be changed to 5.


 */
import java.util.Scanner;
public class ColorDFS
{
    static int m, n;
    static int[][] mat;
    static int newColor;
    static int originalColor;
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        m = sc.nextInt();
        n = sc.nextInt();
        sc.nextLine();
        mat = new int[m][n];
        for (int i = 0; i < m; i++)
        {
            for(int j =0;j<n;j++)
            {
                mat[i][j] = sc.nextInt();
            }
        }
        int sr = sc.nextInt();
        int scl = sc.nextInt();
        newColor = sc.nextInt();
        originalColor = mat[sr][scl];
        dfs(sr,scl);
        for (int i = 0; i < m; i++)
        {
            for(int j =0;j<n;j++)
            {
                System.out.print(mat[i][j]+ " ");
            }
            System.out.println();
        }
    }
    static void dfs(int i, int j)
    {
        if (i < 0 || j < 0 || i >= m || j >= n || mat[i][j] != originalColor)
        {
            return;
        }
        mat[i][j] = newColor;
        dfs(i - 1, j);
        dfs(i + 1, j);
        dfs(i, j - 1);
        dfs(i, j + 1);
    }
}

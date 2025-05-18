
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
    static int n, m;
    static int[][] forest;
    static int count = 0;
    static int p1;
    static int scolor;
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        sc.nextLine();
        forest = new int[n][m];
        for (int i = 0; i < n; i++)
        {
            for(int j =0;j<m;j++)
            {
                forest[i][j] = sc.nextInt();
            }
        }
        int rst = sc.nextInt();
        int rct = sc.nextInt();
        p1 = sc.nextInt();
        scolor = forest[rst][rct];
        dfs(rst,rct);
        for (int i = 0; i < n; i++)
        {
            for(int j =0;j<m;j++)
            {
                System.out.print(forest[i][j]+ " ");
            }
            System.out.println("");
        }
    }
    static void dfs(int row, int col)
    {
        if (row < 0 || col < 0 || row >= n || col >= m || forest[row][col] != scolor)
        {
            return;
        }
        forest[row][col] = p1;
        dfs(row - 1, col);
        dfs(row + 1, col);
        dfs(row, col - 1);
        dfs(row, col + 1);
    }
}

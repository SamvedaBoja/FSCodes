
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

public class GoldFields

{


    public static void main(String[] args)

    {


        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt(); // rows
        int n = sc.nextInt(); // columns

        int[][] grid = new int[m][n];

        for (int i = 0; i < m; i++)
            for (int j = 0; j < n; j++)
                grid[i][j] = sc.nextInt();

        int maxGold = getMaximumGold(grid);
        System.out.println(maxGold);


    }

    public static int getMaximumGold(int[][] grid)

    {


        int maxGold = 0;

        for (int i = 0; i < grid.length; i++)

        {


            for (int j = 0; j < grid[0].length; j++)

            {


                if (grid[i][j] != 0)

                {


                    maxGold = Math.max(maxGold, dfs(grid, i, j));


                }


            }


        }

        return maxGold;


    }

    private static int dfs(int[][] grid, int i, int j)

    {


        if (i < 0 || i >= grid.length || j < 0 || j >= grid[0].length || grid[i][j] == 0)

        {


            return 0;


        }

        int currentGold = grid[i][j];
        grid[i][j] = 0; // mark as visited

        int maxGoldFromHere = Math.max(
                Math.max(dfs(grid, i + 1, j), dfs(grid, i - 1, j)),
                Math.max(dfs(grid, i, j + 1), dfs(grid, i, j - 1))
        );

        grid[i][j] = currentGold; // backtrack (unmark)
        return currentGold + maxGoldFromHere;


    }

}
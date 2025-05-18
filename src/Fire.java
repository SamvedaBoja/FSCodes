/*

You are given a map of a forest represented as a grid. Each cell in the grid can either be:

1 → A tree (flammable area)

0 → Water or rock (non-flammable area)

A fire starts at a specific location in the forest. Your task is to mark all the trees that
 the fire can reach directly or indirectly, moving only up, down, left, or right. Once a
tree is on fire, it cannot be revisited.

Your program should mark all visited trees by changing them to 0 (to show they are already
burned and cannot catch fire again). The final grid should be printed after the fire has spread.

Sample Input:
---------------------------
First line: Two integers n and m representing the number of rows and columns.
Next n lines: Each line has m characters (either 1 or 0) with no spaces.
Next line: Two integers r and c representing the starting row and column (0-indexed) where the fire begins.

Sample Output:
---------------------------
Print the updated grid after fire spread, where all burned trees are marked as 0.

Sample Testcase:1
------------------------------
input=5 5
11000
11011
00010
11001
00000
1 1
output=00000
00011
00010
11001
00000

Explanation:
-----------------------
The fire starts at cell (1, 1) which is a tree (1). It spreads to all connected trees (1s)
in up/down/left/right directions until no more connected trees are left.
 */
public class Fire {
}

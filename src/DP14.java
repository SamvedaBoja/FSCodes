/*
There is a row of n houses, where each house can be painted one of three
colors: red, blue, or green. The cost of painting each house with a certain
color is different. You have to paint all the houses such that no two adjacent
houses have the same color.

The cost of painting each house with a certain color is represented by an
n x 3 cost matrix costs.

For example, costs[0][0] is the cost of painting house 0 with the color red;
costs[1][2] is the cost of painting house 1 with color green, and so on...
Return the minimum cost to paint all houses.

Sample Testcase:1
----------------------------------------
input=
3  //number of houses
17 2 17
16 16 5
14 3 19
output=10
Explanation:
--------------------------------------
Paint house 0 into blue, paint house 1 into green,
paint house 2 into blue.
Minimum cost: 2 + 5 + 3 = 10.

 */
public class DP14 {
}
/*
Given a triangle array, return the minimum path sum from top to bottom.
For each step, you may move to an adjacent number of the row below.
More formally, if you are on index i on the current row, you may move to
either index i or index i + 1 on the next row.

Sample Testcase:1
------------------------------------
Input:
4  //number of rows
2
3 4
6 5 7
4 1 8 3
Output: 11
Explanation: The triangle looks like:
   2
  3 4
 6 5 7
4 1 8 3
The minimum path sum from top to bottom is 2 + 3 + 5 + 1 = 11

 */
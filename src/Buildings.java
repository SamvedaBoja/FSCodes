/*
There is a row of buildings constructed by Raj Group Ltd.

The civil engineer planned to construct the buildings in ascending order
of their heights, but there is a group of contiguous buildings not constructed
according to the plan, remove such group of buildings from that row of buildings
(can be empty), so the buildings in the row are in sorted order of their heights.

Your task is to find and return the number of buildings in such group.

Input Format:
-------------
Line-1: An integer N, length of array.
Line-2: N space separated integers, heights of the buildings.

Output Format:
--------------
Print an integer, the minimum of group of buildings.


Sample Input-1:
---------------
8
2 3 5 12 2 4 5 7

Sample Output-1:
----------------
3

Explanation:
------------
The minimum group of builings in a row, you can remove is [5, 12, 2] or
[12, 2, 4]  of length 3.
 - the remaining buildings with the heights after removal will be [2, 3, 4, 5, 7],
 OR [2, 3, 5, 5, 7], which are in ascending order.


Sample Input-2:
---------------
6
9 7 5 4 2 1

Sample Output-2:
----------------
5

Explanation:
------------
The minimum group of buildings in a row, you can remove is [7, 5, 4, 2, 1] or
[9, 7, 5, 4, 2]  of length 5.

 */

import java.util.*;
public class Buildings{
    public static int minBuildingsToRemove(int[] heights) {
        int n = heights.length;

        // Step 1: Find longest non-decreasing prefix
        int left = 0;
        while (left + 1 < n && heights[left] <= heights[left + 1]) {
            left++;
        }

        // If the entire array is already sorted
        if (left == n - 1) {
            return 0;
        }

        // Step 2: Find longest non-decreasing suffix
        int right = n - 1;
        while (right > 0 && heights[right - 1] <= heights[right]) {
            right--;
        }

        // Initial answer: remove the entire middle part
        int minRemove = Math.min(n - left - 1, right);

        // Step 3: Try to merge prefix and suffix
        int i = 0;
        int j = right;
        while (i <= left && j < n) {
            if (heights[i] <= heights[j]) {
                minRemove = Math.min(minRemove, j - i - 1);
                i++;
            } else {
                j++;
            }
        }

        return minRemove;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] heights = new int[n];
        for (int i = 0; i < n; i++) {
            heights[i] = sc.nextInt();
        }

        int result = minBuildingsToRemove(heights);
        System.out.println(result);
    }
}
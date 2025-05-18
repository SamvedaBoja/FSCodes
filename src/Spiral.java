/*
You will be given the matrix of size R*C,

You have to return the matrix in special order as shown in the sample tescases.


Input Format:
-------------
Line-1 -> Two integers R and C, size of matrix.
Next R-Lines -> C space separated integers

Output Format:
--------------
Print R-Lines -> C space separated integers, in special order.


Sample Input-1:
---------------
3 3
1 2 3
4 5 6
7 8 9

Sample Output-1:
----------------
1 2 3
6 9 8
7 4 5

Sample Input-2:
---------------
3 4
1 2 3 4
5 6 7 8
9 10 11 12

Sample Output-2:
----------------
1 2 3 4
8 12 11 10
9 5 6 7


 */
import java.util.*;

class Spiral{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        int c = sc.nextInt();
        int[][] matrix = new int[r][c];

        // Input
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        // Get elements in spiral order
        List<Integer> spiral = new ArrayList<>();
        int top = 0, bottom = r - 1, left = 0, right = c - 1;
    //rs,re,cs,ce
        while (top <= bottom && left <= right) {
            for (int i = left; i <= right; i++) spiral.add(matrix[top][i]);
            top++;
            for (int i = top; i <= bottom; i++) spiral.add(matrix[i][right]);
            right--;
            if (top <= bottom) {
                for (int i = right; i >= left; i--) spiral.add(matrix[bottom][i]);
                bottom--;
            }
            if (left <= right) {
                for (int i = bottom; i >= top; i--) spiral.add(matrix[i][left]);
                left++;
            }
        }

        // Refill matrix row-wise using spiral order
        int[][] result = new int[r][c];
        int idx = 0;
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                result[i][j] = spiral.get(idx++);
            }
        }

        // Output
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }
    }
}
/*
import java.util.*;

class Spiral{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        int c = sc.nextInt();
        int[][] a = new int[r][c];

        // Reading input
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                a[i][j] = sc.nextInt();
            }
        }

        // Printing in special order
        for (int i = 0; i < r; i++) {
            if (i % 2 == 0) {
                // Even-indexed row: left to right
                for (int j = 0; j < c; j++) {
                    System.out.print(a[i][j] + " ");
                }
            } else {
                // Odd-indexed row: right to left
                for (int j = c - 1; j >= 0; j--) {
                    System.out.print(a[i][j] + " ");
                }
            }
            System.out.println();
        }
    }
}
*/

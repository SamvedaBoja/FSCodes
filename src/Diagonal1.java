
/*
The main diagonal of a grid is the diagonal from the top left corner to
the bottom right corner.

You've given a m*n grid of boxes, each filled with a number.
Your task is to determine whether or not each of the main diagonal's boxes
is filled with the same number.

If filled with the same, print true; otherwise, false.


Input Format:
-------------
Line-1: Two integers M and N, size of the grid..
Next M lines: N space separated integers, numbers filled in thr grid of boxes.

Output Format:
--------------
Print a boolean value.


Sample Input-1:
---------------
3 4
1 2 3 4
5 1 2 3
9 5 1 2

Sample Output-1:
----------------
true

Explanation:
------------
In the above grid, the diagonals are:
[9], [5, 5], [1, 1, 1], [2, 2, 2], [3, 3], [4].
In each diagonal all the boxes are filled with the same number,
so the answer is True.
*/
import java.util.*;
class Diagonal1{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int m=sc.nextInt();
        int n=sc.nextInt();
        int mat[][]=new int[m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                mat[i][j]=sc.nextInt();
            }
        }
        for(int i=0;i<m-1;i++){
            for(int j=0;j<n-1;j++){
                if(mat[i][j]!=mat[i+1][j+1]){
                    System.out.println(false);
                    return;
                }
            }
        }
        System.out.println(true);
    }
}
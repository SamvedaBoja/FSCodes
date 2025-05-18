
/*
Given a board of size n*n, filled with numbers.

Your task is to find the total sum of the the diagonal-1 numbers and diagonal-2 numbers in the board.
consider the intersection value of the two diagonals(if any) only once in total sum.

Input Format:
-------------
Line-1 -> An integer N, size of square board.
Next N lines -> N space separated integers

Output Format:
--------------
Print the diagonal sum.


Sample Input-1:
---------------
3
1 2 3
4 5 6
7 8 9

Sample Output-1:
----------------
25

Explanation: diagonal-1 + diagonal-2 (exclude intersection-5) = (1+5+9) + (3+7) = 25

Sample Input-2:
---------------
4
1 2 3 4
1 2 3 4
1 2 3 4
1 2 3 4

Sample Output-2:
----------------
20

Explanation: diagonal-1 + diagonal-2 (exclude intersection) = (1+2+3+4) + (4+3+2+1) = 20

*/
import java.util.*;
class Diagonal{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int m=sc.nextInt();
        int mat[][]=new int[m][m];
        for(int i=0;i<m;i++){
            for(int j=0;j<m;j++){
                mat[i][j]=sc.nextInt();
            }
        }
        int sum=0;
        for(int i=0;i<m;i++){
            for(int j=0;j<m;j++){
                if(i==j){
                    sum += mat[i][j];
                }

                if(i+j==m-1){
                    sum += mat[i][j];
                }

            }
        }
        if( m % 2 == 0)
            System.out.println(sum);
        else
            System.out.println(sum-mat[m/2][m/2]);
    }
}
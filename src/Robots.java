/*
Chitti(ROBO) is busy in turning the people into chittis(ROBOS) by surrounding them.
In a room there are n*n boxes occupied by ROBOS and people.
   1.A person will be turned into ROBO if he is surrounded by all ROBOs.
   2.A person will not be turned into ROBO if he is on the edge of the room
     and all the connected people to him (directly or indirectly) are also not to be turned.
 Return the n*n boxes after conversion.

Input Format
-------------
Line-1:integer n represent the n*n boxes of the room..
Next n lines:Each line of string consists of combination of 'X'(represents ROBO) and 'O'(represents a person)

Output Format:
--------------
Print n*n space seperated values after conversion.


Sample Input-1:
---------------
4
XXXX
XOOX
XXOX
OXXX

Sample Output-1:
----------------
X X X X
X X X X
X X X X
O X X X

Explanation:
------------
The people at second row and third row are converted to ROBOs as they are surrounded by ROBOs.
But the person at fourth row is safe as he is on edge.


Sample Input-2:
---------------
 5
XOOOX
XXXXX
XOXXX
XXXOX
OXXXX

Sample Output-2:
----------------
X O O O X
X X X X X
X X X X X
X X X X X
O X X X X
 */

import java.util.*;
class Robots{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        char mat[][]=new char[n][n];
        boolean visited[][] = new boolean[n][n];

        for(int i=0;i<n;i++){
            String row=sc.next();
            for(int j=0;j<n;j++){
                mat[i][j]=row.charAt(j);
            }
        }

        for(int i=0;i<n;i++){
            if(mat[i][0] == 'O')
                dfs(n,mat,i,0,visited);
            if(mat[i][n-1] == 'O')
                dfs(n,mat,i,n-1,visited);
        }
        for(int j=0;j<n;j++){
            if(mat[0][j] == 'O')
                dfs(n,mat,0,j,visited);
            if(mat[n-1][j] == 'O')
                dfs(n,mat,n-1,j,visited);
        }

        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(mat[i][j] == 'O'){
                    System.out.print("X ");
                }
                else if(mat[i][j] == 'S'){
                    System.out.print("O ");
                }
                else{
                    System.out.print(mat[i][j] + " ");
                }
            }
            System.out.println();
        }
    }
    public static void dfs(int n,char mat[][],int i,int j,boolean visited[][]){
        if(i<0 || i>=n || j<0 || j>= n || mat[i][j] != 'O' || visited[i][j])
            return ;
        visited[i][j]=true;
        mat[i][j] = 'S';

        dfs(n,mat,i+1,j,visited);
        dfs(n,mat,i-1,j,visited);
        dfs(n,mat,i,j+1,visited);
        dfs(n,mat,i,j-1,visited);

    }
}

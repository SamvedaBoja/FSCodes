/*
You are given a 2D grid of size m x n. Each cell in the grid contains a value 0.
Your task is to start at a given cell (startRow, startCol) and use Depth-First Search
(DFS) to traverse the entire grid. During the traversal, you need to display the coordinates
of every cell visited in the grid.

Instructions:
--------------------------------
You must use DFS to traverse the grid.
Print the coordinates of every visited cell.
The traversal should cover all cells in the grid.

Sample Testcase:1
-----------------------------
input=4 4
0 0  //starting
0 0 0 0
0 0 0 0
0 0 0 0
0 0 0 0
output=(0, 0)
(0, 1)
(0, 2)
(0, 3)
(1, 3)
(2, 3)
(3, 3)
(3, 2)
(3, 1)
(3, 0)
(2, 0)
(1, 0)
(1, 1)
(2, 1)
(2, 2)
(1, 2)
 */

import java.util.*;
class DFS{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int m=sc.nextInt();
        int n=sc.nextInt();
        int a[][]=new int[m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                a[i][j]=sc.nextInt();
            }
        }
        dfs(a,m,n,0,0);
    }
    public static void dfs(int a[][],int m,int n,int i,int j){
        if(i<0 || i>=m || j<0 || j>=n || a[i][j] == -1)
            return;
        else{
            System.out.print("("+i+","+j+")");
            a[i][j]=-1;

        }
        dfs(a,m,n,i-1,j);
        dfs(a,m,n,i+1,j);
        dfs(a,m,n,i,j-1);
        dfs(a,m,n,i,j+1);
    }
}
/*
import java.util.*;
public class Test
{
        static int m;
        static int n;
        static   int ar[][];
        static  boolean visited[][];
        static  int [][] directions=
        {{-1,0},{1,0},{0,-1},{0,1}};
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        m=sc.nextInt();
        n=sc.nextInt();
        int startr=sc.nextInt();
        int startc=sc.nextInt();
        ar=new int[m][n];
        visited=new boolean[m][n];
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                ar[i][j]=sc.nextInt();
            }
        }
        dfs(startr,startc);
    }
 static void dfs(int i,int j)
 {
        if(i<0  || j<0 || i>=m || j>=n || visited[i][j])
        {
            return;
        }
        else
        {
            visited[i][j]=true;
            System.out.println(i+" "+j);
            for(int []d:directions)
            {
                int newr=i+d[0];
                int newy=j+d[1];
                dfs(newr,newy);
            }
        }
    }
}
 */
/*

A parking lot is represented as a grid:
1 means a parked car
0 means an empty space
A cluster of parked cars is counted when cars are connected 4-directionally.
Return the size of the largest cluster of parked cars.

Sample Testcase:1
-----------------------------

case=1
input=5 6
5 6
0 0 1 0 0 0
1 1 1 0 1 1
0 0 0 0 1 1
1 0 1 1 1 0
1 0 0 0 0 0
output=6


 */
import java.util.*;
class DFS1{
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
        int max=0,size=0;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(a[i][j]==1){
                    size=dfs(a,m,n,i,j);
                    max=Math.max(max,size);
                }
            }
        }
        System.out.println(max);
    }
    public static int dfs(int a[][],int m,int n,int i,int j){
        if(i<0 || i>=m || j<0 || j>=n || a[i][j] != 1)
            return 0;

        a[i][j] = -1;
        int size = 1;

        size += dfs(a,m,n,i-1,j);
        size += dfs(a,m,n,i+1,j);
        size += dfs(a,m,n,i,j-1);
        size += dfs(a,m,n,i,j+1);

        return size;
    }
}

/*
There is a board with M*N size.
The board contains M*N blocks of 1*1 size.
Each block is printed a number on it.

You will be given a number, you need to find whether the number is printed on any of the blocks or not.
If found print true, otherwise print false.

NOTE:
This numbers on the board in each row and each column are in increasing order.
And all the numbers are unique.

Input Format:
-------------
Line-1 -> Two integers M and N, board size.
Next M lines -> N space separated integers.
Last Line -> An integer T, number to search.

Output Format:
--------------
Print a boolean value, 'true' if number found.
otherwise, 'false'.


Sample Input-1:
---------------
4 4
1 3 6 10
2 5 9 13
4 8 12 16
7 11 14 17
5

Sample Output-1:
----------------
true


Sample Input-2:
---------------
4 4
1 3 6 10
2 5 9 13
4 8 12 16
7 11 14 17
15

Sample Output-2:
----------------
false



 */
/*
import java.util.*;
class Test{
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
        int target=sc.nextInt();
        int flag=0;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(a[i][j]==target){
                    flag=1;
                    break;
                }
            }
        }
        if(flag==1){
            System.out.println("true");
        }
        else
        System.out.println("false");

    }
}*/
import java.util.*;
class Find{
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
        int target=sc.nextInt();
        boolean visited[][]=new boolean[m][n];
        boolean res=dfs(a,target,m,n,0,0,visited);
        System.out.println(res);
    }
    public static boolean dfs(int a[][],int target,int m,int n, int i,int j,boolean visited[][]){
        if(i<0 || i>= m || j<0||j>=n|| visited[i][j])
            return false;
        if(a[i][j]==target)
            return true;
        visited[i][j]=true;
        return  dfs(a,target,m,n,i-1,j,visited)||
                dfs(a,target,m,n,i+1,j,visited)||
                dfs(a,target,m,n,i,j+1,visited)||
                dfs(a,target,m,n,i,j-1,visited);

    }
}
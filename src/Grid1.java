
/*
Given an N x M grid where each cell contains a number, find the sum of
the path from (0,0) to (N-1,M-1).
 Allowed moves: Right (→) and Down (↓).
Choose the path with the maximum sum.

Sample Testcase:1
--------------------------------
Input=3 3
1 2 3
4 5 6
7 8 9
Output=29
*/
import java.util.*;
class Grid1{
    public static int maxSum(int grid[][],int n,int m,int i,int j){
        if(i==n-1 && j==m-1){
            return grid[i][j];
        }
        if(i>=n || j>=m){
             return 0;
        }
        return grid[i][j] + Math.max(maxSum(grid,n,m,i,j+1),maxSum(grid,n,m,i+1,j));
    }
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int mat[][] = new int[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                mat[i][j]=sc.nextInt();
            }
        }
        if(n==1 && m==1){
            System.out.println(1);
        }
        int res = maxSum(mat,n,m,0,0);
        System.out.println(res);
    }
}
 /*
sum using recursion
import java.util.*;
class Test{
    public static int findSum(int[] a,int n){
        if(n==0){
            return 0;
        }
        return a[n-1]+findSum(a,n-1);
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String line=sc.nextLine();
        String[] in=line.split(" ");
        int size=in.length;
        int a[]=new int[size];
        for(int i=0;i<size;i++){
            a[i]=Integer.parseInt(in[i]);
        }
        int sum=findSum(a,size);
        System.out.println(sum);
}
}
 */
/*
import java.util.*;
class Test{
    public static int findMax(int[] a,int n){
        if(n==1){
            return a[0];
        }
        return Math.max(a[n-1],findMax(a,n-1));
}
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String line=sc.nextLine();
        String[] in=line.split(" ");
        int size=in.length;
        int a[]=new int[size];
        for(int i=0;i<size;i++){
            a[i]=Integer.parseInt(in[i]);
        }
        int max=findMax(a,size);
        System.out.println(max);
}
}

 */
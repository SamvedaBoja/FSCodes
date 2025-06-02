
/*
Given an m x n binary matrix filled with 0's and 1's, find the largest square
containing only 1's and return its area.

case=1
input=4 5
1 0 1 0 0
1 0 1 1 1
1 1 1 1 1
1 0 0 1 0
output=4
 */
import java.util.*;
public class BackTrack3 {
    static int m,n;
    static int mat[][];
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        m=sc.nextInt();
        n=sc.nextInt();
        mat=new int[m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                mat[i][j]=sc.nextInt();
            }
        }
        int max=0;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(mat[i][j]==1){
                    int size=findMaxSquare(i,j);
                    max=Math.max(max,size);
                }
            }
        }
        System.out.println(max*max);
    }
    public static int findMaxSquare(int i,int j){
        int size=0;
        boolean flag=true;
        while(i + size < m && j+size < n && flag){
            for(int x=i;x<=i +size ;x++){
                if(mat[x][j + size] == 0){
                    flag = false;
                    break;
                }
            }
            for(int y=j;y<=j+size;y++){
                if(mat[i+size][y] == 0){
                    flag = false;
                    break;
                }
            }
            if(flag)
                size++;
        }
        return size;
    }
}
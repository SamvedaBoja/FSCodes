/*
Search for a value target in
an m x n integer matrix using divide and conquer approach.
This matrix has the following properties:
-Integers in each row are sorted in ascending from left to right.
-Integers in each column are sorted in ascending from top to bottom.

Sample Testcase:1
--------------------------
input=3 3
1 4 7
2 5 8
3 6 9
5
output=true

 */

import java.util.*;
class DAC4{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int mat[][]=new int[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                mat[i][j]=sc.nextInt();
            }
        }
        int target=sc.nextInt();
        for(int i=0;i<n;i++){
            boolean ans = DAC(0,n-1,mat[i],target);
            if(ans==true){
                System.out.println("true");
                return;
            }
        }
        System.out.println("false");
    }
    public static boolean DAC(int l,int r,int mat[],int target){
        if(l==r){
            return mat[l] == target ? true:false;
        }
        int mid = l+(r-l)/2;
        boolean left = DAC(l,mid,mat,target);
        boolean right = DAC(mid+1,r,mat,target);
        return left||right;
    }
}

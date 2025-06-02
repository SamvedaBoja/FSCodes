
/*
Given an m x n matrix grid where each row is sorted in non-decreasing order,
you need to find the number of negative numbers in the matrix.

Complete in O(log n) time.

Sample Testcase:1
---------------------------

input=4 4
4 3 2 -1
3 2 1 -1
1 1 -1 -2
-1 -1 -2 -3
output=8

 */

import java.util.*;
class BinSearch2{
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
        int count=0;
        for(int i=0;i<m;i++){
            List<Integer> l = new ArrayList<>();
            for(int j=0;j<n;j++){
                l.add(mat[i][j]);
            }
            count += bsearch(l,count);
        }
        System.out.println(count);
    }
    public static int bsearch(List<Integer> l,int count){
        int left=0;
        int r=l.size()-1;
        while(left<=r){
            int mid = (left)+(r-left)/2;
            if(l.get(mid)<0)
                r=mid-1;
            else
                left=mid+1;

        }
        return l.size()-left;
    }
}
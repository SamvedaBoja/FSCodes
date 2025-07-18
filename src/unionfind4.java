/*
Given a matrix M where M[i][j] = 1 means i and j are friends,
find the number of friend groups using union and find.

Sample Testcase:1
------------------------------------
input=7
1 1 1 0 0 0 0
1 1 1 0 0 0 0
1 1 1 0 0 0 0
0 0 0 1 1 1 1
0 0 0 1 1 1 1
0 0 0 1 1 1 1
0 0 0 1 1 1 1
output=2

Explanation:
---------------------------------------------------------
Treat each person as a node. Apply Union-Find on every M[i][j] == 1.
 */
import java.util.*;
class unionfind4{
    static int parent[];
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int mat[][]=new int[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                mat[i][j]=sc.nextInt();
            }
        }
        parent = new int[n];
        for(int i=0;i<n;i++){
            parent[i]=i;
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(mat[i][j] == 1)
                    union(i,j);
            }
        }
        int count=0;
        for(int i=0;i<n;i++){
            if(find(i)==i){
                count++;
            }
        }
        System.out.println(count);
    }
    static int find(int x){
        if(x!= parent[x]){
            parent[x]=find(parent[x]);
        }
        return parent[x];
    }
    static void union(int x,int y){
        int px=find(x);
        int py=find(y);
        if(px != py){
            parent[py]=px;
        }
    }
}



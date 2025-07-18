/*
You are given n elements, numbered from 0 to n-1.
Perform a few union operations to connect elements into groups.

Then answer whether two elements belong to the same group or not
using the find operation.

Input Format:
---------------------------------
First line: integer n → number of elements
Second line: integer m → number of union operations
Next m lines: each contains two integers a and b representing a union between elements a and b
Next line: integer q → number of queries
Next q lines: each contains two integers x and y asking if x and y are connected

Output Format:
---------------------------------------
For each query, print:
"Connected" if they belong to the same group
"Not Connected" otherwise

Sample Testcase:1
-----------------------------
5 3
0 1
1 2
3 4
3
0 2
0 3
3 4
output=
Connected
Not Connected
Connected


 */
import java.util.*;
class unionfind1{
    static int parent[];
    static int find(int x){
        if(parent[x]!=x){
            parent[x]=find(parent[x]);
        }
        return parent[x];
    }
    static void union(int x,int y){
        int px=find(x);
        int py=find(y);
        if(px!=py)
            parent[py]=px;
    }
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int a[][]=new int[m][2];
        for(int i=0;i<m;i++){
            a[i][0]=sc.nextInt();
            a[i][1]=sc.nextInt();
        }
        int q=sc.nextInt();
        int b[][]=new int[q][2];
        for(int i=0;i<q;i++){
            b[i][0]=sc.nextInt();
            b[i][1]=sc.nextInt();
        }
        parent=new int[n];
        for(int i=0;i<n;i++){
            parent[i]=i;
        }
        for(int i=0;i<m;i++){
            union(a[i][0],a[i][1]);
        }
        for(int i=0;i<q;i++){
            if(find(b[i][0]) == find(b[i][1])){
                System.out.println("Connected");
            }
            else{
                System.out.println("Not Connected");
            }
        }
    }
}

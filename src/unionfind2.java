
/*
You are given n cities (0-indexed) and a list of bidirectional roads.
Determine if there is a path between city A and city B.

Sample Testcase:1
----------------------------------------
input=
6 4
0 1
1 2
3 4
4 5
2 3
output=false

 */
import java.util.*;
class unionfind2{
    static int parent[];
    static int find(int x){
        if(x != parent[x]){
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
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int a[][]=new int[n][2];
        for(int i=0;i<m;i++){
            a[i][0]=sc.nextInt();
            a[i][1]=sc.nextInt();
        }
        parent = new int[n];
        for(int i=0;i<n;i++){
            parent[i]=i;
        }
        for(int i=0;i<m;i++){
            union(a[i][0],a[i][1]);
        }
        int p=sc.nextInt();
        int q=sc.nextInt();
        if(find(p) != find(q)){
            System.out.print("false");
            return;
        }
        else{
            System.out.print("true");
        }
    }
}
/*

You are given an undirected, weighted, and connected graph with V vertices
numbered from 0 to V-1, and E edges. Your task is to compute the
Minimum Spanning Tree (MST) of the graph using Kruskal's Algorithm.

Input Format:
---------------------------------
The first line contains two integers: vertices and edges
The next  lines each contain three integers:u, v, and w
— representing an edge between vertices u and v with weight w

Output Format:
-----------------------------------
Print the list of edges included in the MST, in the format:

[[u1, v1, w1], [u2, v2, w2], ..., [uV-1, vV-1, wV-1]]
where each triple represents an edge in the MST.
On the next line, print the total weight of the MST.

If there are multiple valid MSTs, you may print any one of them.

Sample Testcase:1
----------------------------------
input=4 5
0 1 10
0 2 6
0 3 5
1 3 15
2 3 4
output=19
 */

import java.util.*;
import java.util.Arrays;
class unionfind5{
    static int parent[];
    static int rank[];
    static class Edge implements Comparable<Edge>{
        int u,v,w;
        Edge(int u,int v,int w){
            this.u=u;
            this.v=v;
            this.w=w;
        }
        public int compareTo(Edge other){
            return this.w - other.w;
        }
    }
    static int find(int x){
        if( x != parent[x]){
            parent[x]=find(parent[x]);
        }
        return parent[x];
    }
    static void union(int x,int y){
        int px=find(x);
        int py=find(y);
        if(px==py)
            return;
        if(rank[px]<rank[py]){
            parent[px]=py;
        }
        else if(rank[py]<rank[px]){
            parent[py]=px;
        }
        else{
            parent[py]=px;
            rank[px]++;
        }
    }
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int e=sc.nextInt();

        Edge edges[]=new Edge[e];
        for(int i=0;i<e;i++){
            int u=sc.nextInt();
            int v=sc.nextInt();
            int w=sc.nextInt();
            edges[i]=new Edge(u,v,w);
        }
        Arrays.sort(edges);
        parent = new int[n];
        rank = new int[n];
        for(int i=0;i<n;i++){
            parent[i]=i;
            rank[i]=1;
        }
        int cost=0;
        for(Edge edge: edges){
            if(find(edge.u) != find(edge.v)){
                cost += edge.w;
                union(edge.u,edge.v);
            }
        }
        System.out.println(cost);
    }
}
/*
There are n cities labeled from 1 to n. You are given the integer n and an
array connections where connections[i] = [xi, yi, costi] indicates that the
cost of connecting city xi and city yi (bidirectional connection) is costi.

Return the minimum cost to connect all the n cities such that there is at
least one path between each pair of cities. If it is impossible to connect
all the n cities, return -1,

The cost is the sum of the connections' costs used.

Sample Testcase:1
------------------------------------------
input=3 3
1 2 5
1 3 6
2 3 1
output=6

Explanation:
------------------------------------------------
 */
import java.util.*;
import java.util.Arrays;
class unionfind6{
    static int[]parent;
    static int find(int x){
        if(x != parent[x]){
            parent[x]=find(parent[x]);
        }
        return parent[x];
    }
    static boolean union(int x,int y){
        int px=find(x);
        int py=find(y);
        if(px==py)
            return false;
        parent[py]=px;
        return true;
    }
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int mat[][]=new int[m][3];
        for(int i=0;i<m;i++){
            mat[i][0]=sc.nextInt();
            mat[i][1]=sc.nextInt();
            mat[i][2]=sc.nextInt();
        }
        parent = new int[n+1];
        for(int i=1;i<=n;i++){
            parent[i]=i;
        }
        Arrays.sort(mat,Comparator.comparingInt(a -> a[2]));
        int tcost=0;
        int edgesUsed=0;
        for(int []con:mat){
            int u=con[0];
            int v=con[1];
            int cost = con[2];
            if(union(u,v)){
                tcost += cost;
                edgesUsed++;
            }
        }
        if(edgesUsed == n-1){
            System.out.println(tcost);
        }
        else
            System.out.println("-1");
    }
}
/*
import java.util.*;
import java.util.Arrays;

public class unionfind6 {
    static class UnionFind {
        int[] parent;

        UnionFind(int n) {
            parent = new int[n + 1];
            for (int i = 1; i <= n; i++) {
                parent[i] = i;
            }
        }

        int find(int x) {
            if (parent[x] != x) {
                parent[x] = find(parent[x]); // Path compression
            }
            return parent[x];
        }

        boolean union(int x, int y) {
            int rootX = find(x);
            int rootY = find(y);
            if (rootX == rootY) return false; // already connected
            parent[rootY] = rootX;
            return true;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // number of cities
        int m = sc.nextInt(); // number of connections

        int[][] connections = new int[m][3];
        for (int i = 0; i < m; i++) {
            connections[i][0] = sc.nextInt(); // x
            connections[i][1] = sc.nextInt(); // y
            connections[i][2] = sc.nextInt(); // cost
        }

        // Step 1: Sort edges by cost
        Arrays.sort(connections, Comparator.comparingInt(a -> a[2]));

        UnionFind uf = new UnionFind(n);
        int totalCost = 0;
        int edgesUsed = 0;

        // Step 2: Kruskal’s algorithm
        for (int[] conn : connections) {
            int u = conn[0];
            int v = conn[1];
            int cost = conn[2];
            if (uf.union(u, v)) {
                totalCost += cost;
                edgesUsed++;
            }
        }

        // Step 3: Check if all cities are connected
        if (edgesUsed == n - 1) {
            System.out.println(totalCost);
        } else {
            System.out.println(-1);
        }
    }
}

 */
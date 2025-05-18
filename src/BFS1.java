
/*
There are N cities, and M routes[], each route is a path between two cities.
routes[i] = [city1, city2], there is a travel route between city1 and city2.
Each city is numbered from 1 to N.

There are one or more Regions formed among N cities.
A Region is formed in such way that you can travel between any two cities
in the region that are connected directly and indirectly.

Your task is to findout the number of regions formed between N cities.

Input Format:
-------------
Line-1: number of cities N
Next M lines: adjacency matrix of size N*N.

Output Format:
--------------
Print an integer, number of regions formed.


Sample Input-1:
---------------
5
0 1 1 0 0
0 0 1 0 0
0 0 0 1 0
0 0 0 0 0
0 0 0 1 0

Sample Output-1:
----------------
2
 */

import java.util.*;

public class BFS1 {  //solved using dfs 

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.nextLine()); // number of cities
        int[][] graph = new int[n][n];

        // Read the adjacency matrix
        for (int i = 0; i < n; i++) {
            String[] line = sc.nextLine().split(" ");
            for (int j = 0; j < n; j++) {
                graph[i][j] = Integer.parseInt(line[j]);
            }
        }

        boolean[] visited = new boolean[n];
        int regions = 0;

        // Perform DFS for each unvisited node
        for (int i = 0; i < n; i++) {
            if (!visited[i]) {
                dfs(i, graph, visited, n);
                regions++;
            }
        }

        System.out.println(regions);
    }

    private static void dfs(int city, int[][] graph, boolean[] visited, int n) {
        visited[city] = true;

        for (int i = 0; i < n; i++) {
            // Check for both directions to treat the graph as undirected
            if (!visited[i] && (graph[city][i] == 1 || graph[i][city] == 1)) {
                dfs(i, graph, visited, n);
            }
        }
    }
}
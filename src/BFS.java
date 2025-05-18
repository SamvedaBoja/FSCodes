
/*
You are given an undirected graph with n nodes (labeled from 0 to n-1) and m edges.
Each edge connects two nodes and is given in the form of a pair [a, b], which
indicates that there is an edge between node a and node b.

Your task is to write a program to find the number of connected components in
the graph using Breadth-First Search (BFS) traversal.

A connected component is a group of nodes such that there is a path between
any two nodes in that group.

Input Format:
-------------------
Line 1: Two integers `n` and `m` — the number of nodes and number of edges.
Next `m` lines: Each line contains two integers `a` and `b` — an edge between nodes `a` and `b`.
Output Format:
------------------
Print a single integer — the number of connected components in the graph.


Sample testcase:1
----------------------------
input=4 2
0 1
2 3
output=2

Explanation:
----------------------
First component having nodes 0, 1 and second component having
nodes 2, 3

 */
/*
import java.util.*;
class BFS
{
    int countConnectedComponents(Graph graph)
    {
        HashSet<Integer> met = new HashSet<>();
        int c = 0;
        for(int i = 0; i < graph.V; i++)
        {
            if(!met.contains(i))
            {
                bfs(graph, i, met);
                c++;
            }
        }
        return c;
    }
    void bfs(Graph graph, int st, HashSet met)
    {
        Queue<Integer> q = new LinkedList<>();
        q.add(st);
        met.add(st);
        while(!q.isEmpty())
        {
            int u = q.poll();
            for(int v : graph.adjList[u])
            {
                if(!met.contains(v))
                {
                    met.add(v);
                    q.add(v);
                }
            }
        }
    }
}



 */
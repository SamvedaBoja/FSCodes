public class Graph{
}

/*
Given the graph, perform a DFS traversal of the
graph.


Input Format:
--------------------------------
Number of vertices
Number of edges
source and destination
starting node

Output Format:
--------------------------------
Nodes traversed in DFS order

case=1
input=5 7
0 1
0 4
1 2
1 3
1 4
2 3
3 4
0
output=[0, 4, 3, 2, 1]

 */
/*
import java.util.*;
class Graph
{
    void dfs(Graph graph, int start, List<Integer> result)
    {
        Stack<Integer> st=new Stack<>();
        boolean[] visited = new boolean[graph.V];
        st.push(start);
        while(!st.isEmpty()){
            int i=st.pop();
            if(visited[i]!= true){
                visited[i]=true;
                result.add(i);
                for(int j:graph.adjList[i]){
                    if(!visited[j])
                        st.push(j);
                }
            }
        }

    }
}
*/
/*
Given the graph, perform a BFS traversal of the graph.


Input Format:
--------------------------------
Number of vertices
Number of edges
source and destination
starting node

Output Format:
--------------------------------
Nodes traversed in BFS order

Sample Testcase:1
--------------------------
input=5 7
0 1
0 4
1 2
1 3
1 4
2 3
3 4
0
output=[0, 1, 4, 2, 3]
*/
/*
import java.util.*;
class Solution
{
    public void bfs(Graph graph, int start, List<Integer> result)
    {
    Queue<Integer> q = new LinkedList<>();
    boolean visited[] = new boolean[graph.V];
    q.add(start);
    while(!q.isEmpty()){
        int i=q.remove();
        if(visited[i] != true){
            visited[i]=true;
            result.add(i);
            for(int j:graph.adjList[i]){
                if(!visited[j])
                q.add(j);
            }
        }

    }
}
}
 */
/*
/*
Given an undirected graph and a number m, determine if the graph can be
colored with at most m colors such that no two adjacent vertices of the
graph are colored with same color. Here coloring of a graph means assignment
of colors to all vertices.

An adjacency list representation of the graph having N nodes and M edges
is provided as input, You only have to implement the graphColoring() method.
Print true if the graph can be colored with m colors, else return false.

Sample test case

     0----1
    |      |    \
    |      |      \
    |      |       4
    |      |      /
    |      |    /
     2----3

case=1
input=5 6
0 1
0 2
1 3
1 4
2 3
3 4
3
output=true

Explanation:
-----------------------------
Input: First input line is the number of nodes, followed by number edges,
followed by values for the edges, followed by m colors for coloring.
Output: true,
One way is Node ->Color: 0->1, 1->2, 3->1, 4->1 and 2->2
All nodes can be colored using m colors where no two adjacent nodes have the
same color.

Sample Testcase:1
-----------------------------------
input=5 6
0 1
0 2
1 3
1 4
2 3
3 4
2
output=false
 */
/*
class Graph
{
    int V;
    LinkedList<Integer>[] adjList;
}

import java.util.*;
class Solution
{
    boolean canColorGraph(Graph graph, int m)
    {
        int a[] = new int[graph.V];
        return solve(0,graph,m,a);
    }
    public boolean solve(int node,Graph graph,int m,int a[]){
        if(node == graph.V)
            return true;
        for(int i=1;i<=m;i++){
            if(isSafe(node,graph,a,i)){
                a[node]=i;
                if(solve(node+1,graph,m,a)) return true;
                a[node]=0;
            }
        }
        return false;
    }
    public boolean isSafe(int node,Graph graph,int a[],int color){
        for(int n:graph.adjList[node]){
            if(a[n]==color)
                return false;
        }
        return true;
    }
}
*/
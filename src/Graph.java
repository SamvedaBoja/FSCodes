
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
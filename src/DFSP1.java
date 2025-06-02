/*
There are n rooms labeled from 0 to n - 1 and all the rooms are locked except for room 0.
Your goal is to visit all the rooms. However, you cannot enter a locked room without having its key.

When you visit a room, you may find a set of distinct keys in it. Each key has a number on
it, denoting which room it unlocks, and you can take all of them with you to unlock the other rooms.

Given an array rooms where rooms[i] is the set of keys that you can obtain if you visited
 room i, return true if you can visit all the rooms, or false otherwise.

Sample Testcase:1
--------------------------------------------
input=[[1],[2],[3],[]]
output: true

Explanation:
-------------------------------
We visit room 0 and pick up key 1.
We then visit room 1 and pick up key 2.
We then visit room 2 and pick up key 3.
We then visit room 3.
Since we were able to visit every room, we return true.

Sample Testcase:2
--------------------------------------------
input=[[1,3],[3,0,1],[2],[0]]
output=false
Explanation:
--------------------------------------
We can not enter room number 2 since the only key that unlocks it is in that room.


 */

import java.util.*;
class DFSP1{
    public static boolean canVisitAllRooms(List<List<Integer>> rooms) {
        Set<Integer> visited = new HashSet<>();
        dfs(0,visited,rooms);
        if(visited.size()==rooms.size())
            return true;
        return false;
    }
    public static void dfs(int i,Set<Integer> visited,List<List<Integer>> rooms){
        if(visited.contains(i))
            return;
        visited.add(i);
        for(int key : rooms.get(i)){
            dfs(key,visited,rooms);
        }
    }
}


/*
import java.util.*;
class Solution
{
  public static boolean canVisitAllRooms(List<List<Integer>> rooms) {
        boolean visited[]=new boolean[rooms.size()];
        dfs(0,visited,rooms);
        for(boolean i:visited){
            if(i==false)
            return false;
        }
        return true;

  }
  public static void dfs(int i,boolean[] visited,List<List<Integer>> rooms){
      visited[i]=true;
      for(int j:rooms.get(i)){
          if(!visited[j]){
              dfs(j,visited,rooms);
          }
      }
  }
 }
 */
/*
There is a directed graph of n nodes with each node labeled from 0 to n - 1.
The graph is represented by a 0-indexed 2D integer array graph where graph[i]
is an integer array of nodes adjacent to node i, meaning there is an edge from
 node i to each node in graph[i].

A node is a terminal node if there are no outgoing edges. A node is a safe node
if every possible path starting from that node leads to a terminal node (or another safe node).

Return an array containing all the safe nodes of the graph.
The answer should be sorted in ascending order.

Note: If a node has no outgoing edges, enter an empty line

Sample Testcase:1
------------------------------------------------------
input=7
1 2
2 3
5
0
5

Output=[2,4,5,6]
Explanation:
--------------------------------
The given graph is shown above.
Nodes 5 and 6 are terminal nodes as there are no outgoing edges from either of them.
Every path starting at nodes 2, 4, 5, and 6 all lead to either node 5 or 6.

import java.util.*;
class Solution{
    public List<Integer> eventualSafeNodes(int[][] graph) {
        int n=graph.length;
        int color[]=new int[n];
        List<Integer> safe = new ArrayList<>();
        for(int i=0;i<n;i++){
            if(dfs(i,graph,color)){
                safe.add(i);
            }
        }
        return safe;
    }
    public boolean dfs(int node,int [][]graph,int []color){
        if(color[node] != 0){
            return color[node] == 2;
        }
        color[node] = 1;
        for(int k:graph[node]){
            if(!dfs(k,graph,color))
                return false;
        }
        color[node]=2;
        return true;
    }
}
 */


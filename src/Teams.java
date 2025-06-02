/*
In a school, there are N students in a class numbered from 1,2,3..N.
During the play time in school, drill master wants to split them into
two teams based on their interest.

If the pair of students want to play opposite each other, drill master should
put them in different teams, e.g. pair[i] = (A,B), it is not allowed to
put A and B in same team.

You need to find out wether is it possible to put everyone into two teams or not
return true if it is possible, otherwise false.

Input Format:
----------------
Line-1 -> Two Integers, N and P, number of students N, number of pairs P.
Next P lines -> Two integers, one pair[i], where 'i' is from 0 to P-1

Output Format:
------------------
Print a boolean result.


Sample Input-1:
-------------------
 5 4
 1 2
 1 3
 2 4
 3 5

Sample Output-1:
---------------------
 true

Explanation:
----------------
 team1 [1,4,5], team2 [2,3]


Sample Input-2:
-------------------
 5 5
 1 2
 2 3
 3 4
 4 5
 1 5

 Sample Output-2:
 ---------------------
  false
 */

//Bipartite graph
/*
import java.util.*;
class Teams{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int p=sc.nextInt();
        int pairs[][]=new int[p][2];
        for(int i=0;i<p;i++){
            pairs[i][0]=sc.nextInt();
            pairs[i][1]=sc.nextInt();
        }
        List<List<Integer>> l = new ArrayList<>();
        for(int i=0;i<=n;i++){
            l.add(new ArrayList<>());
        }
        for(int k[]:pairs){
            l.get(k[0]).add(k[1]);
            l.get(k[1]).add(k[0]);
        }
        int color[] = new int[n+1];

        for(int i=0;i<=n;i++){
            if(color[i] != 0){
                continue;
            }
            Queue<Integer> q=new LinkedList<>();
            q.add(i);
            color[i]=1;
            while(!q.isEmpty()){
                int u=q.poll();
                for(int v:l.get(u)){
                    if(color[v]==0){
                        color[v]= -color[u];
                        q.add(v);
                    }
                    else if(color[v]==color[u]){
                        System.out.println(false);
                        return;
                    }
                }

            }
        }
        System.out.println(true);
    }
}

 */
/*
import java.util.*;
public class Teams {
    public static boolean possibleTeams(int N, int[][] pairs) {
        // Build adjacency list
        List<List<Integer>> graph = new ArrayList<>();
        for (int i = 0; i <= N; i++) graph.add(new ArrayList<>());
        for (int[] p : pairs) {
            graph.get(p[0]).add(p[1]);
            graph.get(p[1]).add(p[0]);
        }

        int[] color = new int[N+1];       // 0 = unvisited, 1 & -1 are two colors
        Arrays.fill(color, 0);

        // Check each component
        for (int i = 1; i <= N; i++) {
            if (color[i] != 0) continue;  // already colored
            Queue<Integer> q = new LinkedList<>();
            q.add(i);
            color[i] = 1;

            while (!q.isEmpty()) {
                int u = q.poll();
                for (int v : graph.get(u)) {
                    if (color[v] == 0) {
                        color[v] = -color[u];
                        q.add(v);
                    } else if (color[v] == color[u]) {
                        return false;  // conflict
                    }
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(), P = sc.nextInt();
        int[][] pairs = new int[P][2];
        for (int i = 0; i < P; i++) {
            pairs[i][0] = sc.nextInt();
            pairs[i][1] = sc.nextInt();
        }
        System.out.println(possibleTeams(N, pairs));
    }
}

 */
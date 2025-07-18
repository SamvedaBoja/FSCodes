/*
You are given n people, and some "friend" pairs. Some pairs are also
marked as enemies. Determine if all constraints are valid
(i.e., no one ends up in both friend and enemy group). If a friend is in
enemy group return false otherwise return true.

Sample Testcase:1
---------------------------
input=4
0 1
1 2
2 3
3 4
1
0 4
output=false

input=4
0 1
2 3
4 5
6 7
4
0 2
1 3
4 6
5 7
output=true
 */
import java.util.*;
public class unionfind3 {
    static int parent[];
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[][]=new int[n][2];

        int max=0;
        for(int i=0;i<n;i++){
            a[i][0]=sc.nextInt();
            a[i][1]=sc.nextInt();
            max=Math.max(max,Math.max(a[i][0],a[i][1]));
        }
        parent=new int[max+1];
        for(int i=0;i<=max;i++){
            parent[i]=i;
        }
        for(int i=0;i<n;i++){
            union(a[i][0],a[i][1]);
        }
        int m=sc.nextInt();
        int q[][]=new int[m][2];
        for(int i=0;i<m;i++){
            q[i][0]=sc.nextInt();
            q[i][1]=sc.nextInt();
            if(find(q[i][0]) == find(q[i][1])){
                System.out.println("false");
                return;
            }
        }
        System.out.println("true");
    }
    static int find(int x){
        if(x!=parent[x]){
            parent[x]=find(parent[x]);
        }
        return parent[x];
    }
    static void union(int x,int y){
        int px=find(x);
        int py=find(y);
        if(px!=py){
            parent[py]=px;
        }
    }
}

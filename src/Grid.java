
/*
 Given an N x M grid, count the number of ways to reach (N-1, M-1) from (0,0).
 Allowed moves: Right (→) and Down (↓). Use only recursion

Sample Testcase:1
---------------------------
input=3 3
output=6
*/
import java.util.*;
class Grid{
    public static int pathCount(int n,int m){
        if(n==1 && m==1){
            return 1;
        }
        if(n<1 || m<1){
            return 0;
        }
        return pathCount(n-1,m)+pathCount(n,m-1);
    }
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int path = pathCount(n,m);
        System.out.print(path);
    }
}


/*
/*
You are given a list of positive integers List[].
You need to findout the product P as (List[i]-1)*(List[j]-1).
Where P should be the largest possible value,
and i, j are the postions of the two different elements in the List.

Input Format:
-------------
Line-1: An integer N, number of elemenets of the list.
Line-2: N space separated integers, List[].

Output Format:
--------------
Print an integer, P


Sample Input-1:
---------------
4
3 4 5 2

Sample Output-1:
----------------
12


Sample Input-2:
---------------
4
2 5 4 5

Sample Output-2:
----------------
16

==== HINT ====
1.You have to pick top two numbers which are maximum from the list as m and n.
2.And return the given product (m-1)(n-1)

*/

import java.util.*;
import java.util.Arrays;
class Multiply{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int p=sc.nextInt();
        int a[]=new int[p];
        for(int i=0;i<p;i++){
            a[i]=sc.nextInt();
        }
        Arrays.sort(a);
        int m=a[a.length-1];
        int n=a[a.length-2];
        System.out.print((m-1)*(n-1));
    }
}
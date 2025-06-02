/*
Given n activities defined by its start time and end time, the maximum number
of activities such that no two activities overlap.

Sample Testcase:1
------------------------
input=5
5 7
1 4
0 6
8 9
3 5
output=
[1, 4]
[5, 7]
[8, 9]

 */
import java.util.*;
class Greedy5{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[][]=new int[n][2];
        for(int i=0;i<a.length;i++){
            a[i][0]=sc.nextInt();
            a[i][1]=sc.nextInt();
        }
        Arrays.sort(a,Comparator.comparingInt(res -> res[1]));
        List<int []> l=new ArrayList<>();
        int end = a[0][1];
        l.add(a[0]);
        for(int i=1;i<n;i++){
            if(a[i][0] >= end){
                end = a[i][1];
                l.add(a[i]);
            }
        }
        for(int res[]: l){
            System.out.println(Arrays.toString(res));
        }
    }
}

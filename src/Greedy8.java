/*
Given an array of intervals intervals where intervals[i] = [starti, endi],
return the minimum number of intervals you need to remove to make the rest of
the intervals non-overlapping.

Note that intervals which only touch at a point are non-overlapping. For
example, [1, 2] and [2, 3] are non-overlapping.

Sample Testcase:1
----------------------------------
input=4
1 2
2 3
3 4
1 3
output=1

Explanation:
-----------------------
[1,3] can be removed and the rest of the intervals are
non-overlapping.




 */

import java.util.*;
class Greedy8{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[][]=new int[n][2];
        for(int i=0;i<a.length;i++){
            a[i][0]=sc.nextInt();
            a[i][1]=sc.nextInt();
        }
        Arrays.sort(a,Comparator.comparingInt(res -> res[1]));
        int count=1;
        int end = a[0][1];
        for(int i=1;i<n;i++){
            if(a[i][0] >= end){
                count++;
                end = a[i][1];
            }
        }
        int result=n-count;
        System.out.println(result);

    }
}
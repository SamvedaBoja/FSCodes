/*
Given an array arr of positive integers sorted in a strictly increasing order,
and an integer k.
Return the kth positive integer that is missing from this array.

Sample Testcase:1
--------------------------------------------
input=5
2 3 4 7 11
5
output=9
Explanation: The missing positive integers are [1,5,6,8,9,10,12,13,...].
The 5th missing positive integer is 9.

 */

import java.util.*;
class MissingNum{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        HashSet<Integer> hs= new HashSet<>();
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
            hs.add(a[i]);
        }
        ArrayList<Integer> l=new ArrayList<>();
        int limit=a[n-1];
        for(int i=1;i<2*limit;i++){
            if(!hs.contains(i))
                l.add(i);
        }
        int k=sc.nextInt();
        int res = l.get(k-1);
        System.out.println(res);
    }
}
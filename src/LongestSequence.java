/*
Given an unsorted array of integers nums, return the length of the longest
consecutive elements sequence.

You must write an algorithm that runs in O(n) time.

Sample Testcase:1
---------------------------------
input=6
100 4 200 1 3 2
output=4


 */

import java.util.*;
class LongestSequence{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int n =sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        HashSet<Integer> hs = new HashSet<>();
        for(int num:a){
            hs.add(num);
        }
        int size=0;
        for(int num:hs){
            if(!hs.contains(num-1)){
                int x=num;
                int streak=1;
                while(hs.contains(x+1)){
                    x++;
                    streak++;
                }
                size=Math.max(size,streak);
            }
        }
        System.out.println(size);
    }
}

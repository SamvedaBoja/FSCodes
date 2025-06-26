/*
An integer array is called arithmetic if it consists of at least three elements
and if the difference between any two consecutive elements is the same.

For example, [1,3,5,7,9], [7,7,7,7], and [3,-1,-5,-9] are arithmetic sequences.
Given an integer array nums, return the number of arithmetic subarrays of nums.

A subarray is a contiguous subsequence of the array.

Sample Testcase:1
----------------------------
input=4
1 2 3 4
output=3

Explanation:
-------------------------------
We have 3 arithmetic slices in nums: [1, 2, 3], [2, 3, 4] and [1,2,3,4] itself.

Sample Testcase:2
----------------------------
input=1
1
output=0


 */

import java.util.*;
class DP1{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        int dp[]=new int[n];
        int total=0;
        for(int i=2;i<n;i++){
            if(a[i] - a[i-1] == a[i-1]-a[i-2]){
                dp[i] = dp[i-1]+1;
                total = total+dp[i];
            }
        }
        System.out.println(total);
    }
}
